import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.sueldos.ToDoItem;

public class ToDoItemTest {

	
	private ToDoItem item;
	
	
	@BeforeEach
	public void setUp() {
		item = new ToDoItem("Mi nuevo item para Testear");
	}
	
	
	@Test
	public void testCreacion() {
		assertEquals("Mi nuevo item para Testear", item.getNombre());
	}
	
	@Test
	public void testEstadoPendiente() {
		assertThrows(RuntimeException.class, () -> item.togglePause());
	}
	
	@Test
	public void testPaseEnProgreso() {
		item.start();
		assertDoesNotThrow(() -> item.togglePause());
	}
	
	@Test
	public void testPasePausado() {
		item.start();
		item.togglePause();
		assertDoesNotThrow(() -> item.togglePause());
	}
	
	@Test
	public void testPaseFinalizado() {
		item.start();
		item.finish();
		assertThrows(RuntimeException.class, () -> item.togglePause());
	}
	
	@Test
	public void testAgregarComentarioEnProgreso() {
		item.start();
		item.addComment("Mi Primer Comentario");
		assertEquals(1, item.getComments().size());
	}
	
	@Test
	public void testAgregarComentarioFinalizado() {
		item.start();
		item.finish();
		item.addComment("Mi Primer Comentario");
		assertEquals(0, item.getComments().size());
	}
	
	@Test
	public void testDuracionSinIniciar() {
		assertThrows(RuntimeException.class, () -> item.workedTime());
	}
	
	@Test
	public void testDuracionSinFinalizar() throws InterruptedException {
	    item.start();
	    
	    Thread.sleep(1000); // Dormimos 1 segundo aprox
	    
	    Duration dur = item.workedTime();
	    assertTrue(dur.getSeconds() >= 1 && dur.getSeconds() <= 2);
	}
	
	@Test
	public void testDuracionFinalizado() throws InterruptedException {
	    item.start();
	    item.finish();
	    Duration dur = item.workedTime();
	    
	    
	    Thread.sleep(1000); // Dormimos 1 segundo aprox
	    
	    Duration dur2 = item.workedTime();
	    
	    assertEquals(dur.getSeconds(), dur2.getSeconds());
	}
	
	

}

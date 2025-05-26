package ar.edu.unlp.info.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TweetTest {
	
	String body;
	Tweet tw, tw2, tw3;
	Retweet rt, rt2, rt3;
	
	@BeforeEach
	void setUp() throws Exception {
		body = "Listen to Kayow Beats";
		tw = new Tweet(body);
	}
	
	@Test
	public void exceptionBodyCorto() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        tw2 = new Tweet("");
	    });

	    String expectedMessage = "El cuerpo del tweet debe tener entre 1 y 280 caracteres.";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void exceptionBodyLargo() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        tw2 = new Tweet("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
	    });

	    String expectedMessage = "El cuerpo del tweet debe tener entre 1 y 280 caracteres.";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testAddRetweet() throws Exception {
		body = "Listen to Kayow Beats";
		tw = new Tweet(body);
		
		rt = new Retweet(tw);
		
		
	}
	
    
}

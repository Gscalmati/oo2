package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private DatabaseVirtualAccess proxy;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxy = new DatabaseVirtualAccess(database, "sarasa");
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    
    @Test
    void testSesionSinIniciar() {
    	assertThrows(RuntimeException.class, () -> this.proxy.getSearchResults("select * from comics where id=10"));
    }
    
    @Test
    void testSesionIniciada() {
    	this.proxy.login("sarasa");
    	assertDoesNotThrow(() -> this.proxy.getSearchResults("select * from comics where id=10"));
    }
    
    @Test
    void testPassErronea() {
    	assertThrows(RuntimeException.class, () -> this.proxy.login("123"));
    }
    
    @Test
    void testSesionCerrada() {
    	this.proxy.login("sarasa");
    	this.proxy.logout();
    	assertThrows(RuntimeException.class, () -> this.proxy.getSearchResults("select * from comics where id=10"));
    }
    
    @Test
    void testGetSearchResults2() {
    	this.proxy.login("sarasa");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow2() {
    	this.proxy.login("sarasa");
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
    }
}
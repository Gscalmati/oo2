package ar.edu.unlp.info.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class UserTest {
	
	User usuario;
	Tweet tw, tw2;
	Retweet rt;
	
	@BeforeEach
	void setUp() throws Exception {
		usuario = new User("Duko");
	}
	
    @Test
    public void testScreeName() {
        assertEquals("Duko", usuario.getScreenName());
    }
    
    @Test
    public void addTweet() {
    	assertEquals(0, usuario.getPosts().size());
    	usuario.tweet("1er tweet");
        assertEquals(1, usuario.getPosts().size());
    }
    
    @Test
    public void addRetweet() {
    	assertEquals(0, usuario.getPosts().size());
    	tw = usuario.tweet("1er tweet");
    	assertEquals(1, usuario.getPosts().size());
    	usuario.retweet(tw);
        assertEquals(2, usuario.getPosts().size());
    }
    
    @Test
    public void deletePost() {
    	assertEquals(0, usuario.getPosts().size());
    	tw = usuario.tweet("1er tweet");
    	assertEquals(1, usuario.getPosts().size());
    	usuario.deletePost(tw);
        assertEquals(0, usuario.getPosts().size());
    }
    
    @Test
    public void deleteAllPosts() {
    	assertEquals(0, usuario.getPosts().size());
    	tw = usuario.tweet("1er tweet");
    	usuario.retweet(tw);
    	assertEquals(2, usuario.getPosts().size());
    	usuario.deleteAllPosts();
        assertEquals(0, usuario.getPosts().size());
    }
}

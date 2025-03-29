package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Twitter {

	private Integer id;
	private List<User> users;
	
	public Twitter () {
		this.users = new ArrayList<User>();
	}
	
	public List<User> getUsers () {
		return this.users;
	}
	
	public User findUserByScreenName (String name) {
		return this.users.stream().filter(u -> u.getScreenName().equals(name)).findFirst()
				.orElse(null);	
	}
	
	public boolean createUser (String name) {
		
		if (this.findUserByScreenName(name) != null) {	
	        System.out.println("Error al crear el usuario, no puede haber usuarios con nombres iguales, intente otro.");
			return false;
		}
		
		User newUser = new User(name);
		
		this.users.add(newUser);
		return true;
	}
	
	public boolean deleteUser (String name) {
		
	
		
		User u = this.findUserByScreenName(name);
				
		if (u == null) {
	        System.out.println("Error al eliminar el usuario, inexistente.");
			return false;
		}
		
		u.deleteAllPosts();
		this.users.remove(u);
		return true;
	}

}

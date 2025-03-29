package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class User {
	
	private Integer id;
	private String screenName;
	private List<Post> posts;
	
	public User(String name) {
		this.screenName = name;
		this.posts = new ArrayList<Post>();
	}

	public String getScreenName() {
		// TODO Auto-generated method stub
		return this.screenName;
	}
	
	public List<Post> getPosts() {
		return this.posts;
	}
	
	public Tweet tweet (String body) {
		try {
			Tweet newTw = new Tweet(body);
			this.posts.add(newTw);
			return newTw;
		  } catch (Exception e) {
	            System.out.println("Error al crear el tweet: " + e.getMessage());
	        }
		return null;
	}
	
	public Retweet retweet (Tweet tw) {
		Retweet rt = new Retweet(tw);
		this.posts.add(rt);
		
		tw.addRetweet(rt);
		
		return rt;
	}
	
	public boolean deleteAllPosts () {
		
		this.posts.stream().forEach(p -> p.deleteProcess());
		this.posts.clear();
		
		return true;
	}
	
	protected boolean deletePost (Post p) {
		
		if (this.posts.contains(p)) {
			p.deleteProcess();
			this.posts.remove(p);
			return true;
		}
		
		return false;
	}

}

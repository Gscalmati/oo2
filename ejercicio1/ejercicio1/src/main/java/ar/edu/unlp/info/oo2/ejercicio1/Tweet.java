package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Tweet implements Post {
	
	public static final Integer MAX_LENGTH = 280;
	public static final Integer MIN_LENGTH = 1;
	
	private String body;
	private List<Retweet> retweets;

	public Tweet(String body) {
		// TODO Auto-generated constructor stub
		if (body.length() < Tweet.MIN_LENGTH || body.length() > Tweet.MAX_LENGTH) {
			throw new IllegalArgumentException("El cuerpo del tweet debe tener entre 1 y 280 caracteres.");
		}
		
		this.retweets = new ArrayList<Retweet>();
		this.body = body;
		
	}

	@Override
	public String getBody() {
		// TODO Auto-generated method stub
		return this.body;
	}
	
	public void deleteProcess() {
		this.retweets.clear();
	}

	public void deleteRetweet(Retweet rt) {
		// TODO Auto-generated method stub
		this.retweets.remove(rt);
		
	}

	public void addRetweet(Retweet rt) {
		// TODO Auto-generated method stub
		
		this.retweets.add(rt);
		
	}

}

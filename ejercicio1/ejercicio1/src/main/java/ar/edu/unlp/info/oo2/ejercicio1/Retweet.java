package ar.edu.unlp.info.oo2.ejercicio1;

public class Retweet implements Post {
	
	private Tweet original;

	public Retweet(Tweet tw) {
		// TODO Auto-generated constructor stub
		this.original = tw;
	}

	@Override
	public String getBody() {
		// TODO Auto-generated method stub
		return this.original.getBody();
	}

	@Override
	public void deleteProcess() {
		// TODO Auto-generated method stub
		this.original.deleteRetweet(this);
		
	}

}

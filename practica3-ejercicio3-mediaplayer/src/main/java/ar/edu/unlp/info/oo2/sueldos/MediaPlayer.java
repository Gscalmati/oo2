package ar.edu.unlp.info.oo2.sueldos;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	
	private List<Media> media;
	
	public MediaPlayer () {
		this.media = new ArrayList<Media>();
	}
	
	public List<Media> getMedia() {
		return this.media;
	}
	
	public void play() {
		this.media.forEach(e -> e.play());
	}
	
	
}

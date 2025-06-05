package ar.edu.unlp.info.oo2.sueldos;

public class VideoStreamAdapter extends Media {

	private VideoStream stream;
	
	public VideoStreamAdapter() {}
	public VideoStreamAdapter (VideoStream vs) {
		this.stream = vs;
	}
	
	public void setVideoStream(VideoStream vs) {
		this.stream = vs;
	}
	
	public void play() {
		this.stream.reproduce();
	}
}

package ar.edu.unlp.info.oo2.sueldos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class MediaPlayerTest {

	MediaPlayer mediaPlayer;
	Media mAudio, mVideo, mAdapterVS;
	VideoStream vs;
	
	@BeforeEach
	public void setUp() throws Exception {
		mediaPlayer = new MediaPlayer();
		mAudio = new Audio();
		mVideo = new VideoFile(); 
		vs = new VideoStream();
		mAdapterVS = new VideoStreamAdapter(vs);
	}
	
	@Test
	public void testAddMedia() {
		mediaPlayer.getMedia().add(mAudio);
		mediaPlayer.getMedia().add(mVideo);
		mediaPlayer.getMedia().add(mAdapterVS);
		
		assertEquals(3, mediaPlayer.getMedia().size());
	}
	
	@Test
	public void testPlay() {
		mediaPlayer.getMedia().add(mAudio);
		mediaPlayer.getMedia().add(mVideo);
		mediaPlayer.getMedia().add(mAdapterVS);
		
		mediaPlayer.play();
	}
}

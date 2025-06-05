package ar.edu.unlp.info.oo2.sueldos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class VideoStreamAdapterTest {

	VideoStreamAdapter vsa;
	VideoStream vs;
	
	@BeforeEach
	public void setUp() throws Exception {
		vs = new VideoStream();
		vsa = new VideoStreamAdapter();
		vsa.setVideoStream(vs);
	}
	
	@Test
	public void testearPlay() {
		vsa.play();
	}
}

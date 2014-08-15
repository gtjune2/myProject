package autoDI;

import java.util.ArrayList;

public class Musicians {
	ArrayList<String> musicians;
	Song song;
	
	public Musicians (ArrayList<String> musicians) {
		this.musicians = musicians;
	}
	
	public void setSong(Song song) {
		this.song = song;
	}
}

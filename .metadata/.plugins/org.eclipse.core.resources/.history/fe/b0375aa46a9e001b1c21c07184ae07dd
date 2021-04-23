package hust.soict.talentedprogram.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks;
	
	public String getArtist() {
		return artist;
	}
	public CompactDisc(String title, String category, String artist, ArrayList<Track> tracks) {
		super(title, category);
		this.artist = artist;
		this.tracks = tracks;
	}
	public CompactDisc(String title) {
		super(title);
	}
	public void addTrack(Track track) {
		if (tracks.contains(track))
			System.out.println("Track already in list");
		else tracks.add(track);
	}
	public void removeTrack(Track track) {
		if (!tracks.contains(track))
			System.out.println("Track is not in list");
		else tracks.remove(track);
	}
	public int getLength() {
		int length=0;
		for (Track track : tracks) {
			length+=track.getLength();
		}
		return length;
	}
	@Override
	public void play() {
		System.out.println("Number of tracks in the disc: "+tracks.size());
		System.out.println("Total length: "+this.getLength());
		for (Track track : tracks) {
			track.play();
		}
		
	}

}

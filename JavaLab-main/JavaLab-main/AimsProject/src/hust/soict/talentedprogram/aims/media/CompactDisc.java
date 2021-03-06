package hust.soict.talentedprogram.aims.media;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import hust.soict.talentedprogram.aims.PlayerException;

@SuppressWarnings("rawtypes")
public class CompactDisc extends Disc implements Playable, Comparable {
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
	public CompactDisc(String title,float cost) {
		super(title,cost);
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
	public int getNumberOfTracks() {
		return tracks.size();
	}
	@Override
	public void play() throws PlayerException {
		if (this.getLength()>0) {
			System.out.println("Number of tracks in the disc: "+tracks.size());
			System.out.println("Total length: "+this.getLength());
			for (Track track : tracks) {
				try {
					track.play();
				}
				catch(PlayerException e){
					throw e;
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR: CD length is non-positive!", "CD Error", JOptionPane.ERROR_MESSAGE, null);
			throw new PlayerException("ERROR: CD length is non-positive!");
			
		}
	}
	public int compareTo (Object obj) {
		if (obj instanceof CompactDisc) {
			if (this.getNumberOfTracks()>((CompactDisc) obj).getNumberOfTracks())
				return 1;
			else if (this.getNumberOfTracks()<((CompactDisc) obj).getNumberOfTracks())
				return -1;
			else {
				if (this.getLength()>((CompactDisc) obj).getLength())
					return 1;
				else return -1;
			}
		}
		else {
			System.out.println("Error!");
			return -1;
		}
	}

}

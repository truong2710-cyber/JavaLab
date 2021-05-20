package hust.soict.talentedprogram.aims.media;

import javax.swing.JOptionPane;

import hust.soict.talentedprogram.aims.PlayerException;

public class Track implements Playable {
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	@Override
	public void play() throws PlayerException {
		if (this.getLength()>0) {
			System.out.println("Playing track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR: Track length is non-positive!", "Track Error", JOptionPane.ERROR_MESSAGE, null);
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Track) {
			if (((Track) o).length==this.length && ((Track) o).title.equals(this.title))
				return true;
			else return false;
		}
		return false;
	}
	
}

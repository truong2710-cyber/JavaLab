package hust.soict.talentedprogram.aims.media;

import javax.swing.JOptionPane;

import hust.soict.talentedprogram.aims.PlayerException;

@SuppressWarnings("rawtypes")
public class DigitalVideoDisc extends Disc implements Playable, Comparable
{
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
		
	}
	public DigitalVideoDisc(String title, float cost) {
		super(title);
		this.cost=cost;
	}
	public DigitalVideoDisc(String title, String category) {
		super(title,category);
		
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category);
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super(title,category);
		this.director = director;
	}
	public boolean compare(DigitalVideoDisc disc) {
		if (title.equals(disc.getTitle()) && category.equals(disc.getCategory()) &&  director.equals(disc.getDirector()) && length==disc.getLength() &&  cost==disc.getCost())
			return true;
		return false;
	}
	public boolean search(String title) {
		String a[]=title.split(" ");
		for (int i=0;i<a.length;i++) {
			if (!this.title.contains(a[i]))
				return false;
		}
		return true;
	}
	@Override
	public void play() throws PlayerException {
		if (this.getLength()>0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR: DVD length is non-positive!", "DVD Error", JOptionPane.ERROR_MESSAGE, null);
			throw new PlayerException("ERROR: DVD length is non-positive!");
		}
	}
	public int compareTo (Object obj) {
		if (obj instanceof DigitalVideoDisc) {
			return ((Float)this.getCost()).compareTo((Float)((DigitalVideoDisc) obj).getCost());
		}
		else {
			System.out.println("Error!");
			return -1;
		}
	}
}

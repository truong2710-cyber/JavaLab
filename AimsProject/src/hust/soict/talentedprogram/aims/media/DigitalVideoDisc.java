package hust.soict.talentedprogram.aims.media;

public class DigitalVideoDisc extends Media{
	
	private String director;
	private int length;
	
	
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
}

package hust.soict.talentedprogram.aims.media;

public class Disc extends Media{
	protected int length;
	protected String director;
	
	public Disc(String title, String category) {
		super(title,category);
		
	}
	public Disc(String title) {
		super(title);
		
	}
	public Disc(String title, float cost) {
		super(title);
		this.cost=cost;
		
	}
	public Disc(int length) {
		super();
		this.length = length;
	}

	public Disc(int length, String director) {
		super();
		this.length = length;
		this.director = director;
	}

	public int getLength() {
		return length;
	}
	
	public String getDirector() {
		return director;
	}
	
	
}

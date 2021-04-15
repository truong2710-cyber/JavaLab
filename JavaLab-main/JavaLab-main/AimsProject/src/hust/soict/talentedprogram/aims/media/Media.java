package hust.soict.talentedprogram.aims.media;

public abstract class Media {
	protected String title;
	protected String category;
	protected int id;
	protected float cost;
	public Media() {
		
	}
	
	public Media(String title) {
		this.title = title;
	}
	
	public Media(String title, String category) {
		this(title);
		this.category = category;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public float getCost() {
		return cost;
	}
	
	
}
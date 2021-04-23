package hust.soict.talentedprogram.aims.media;


@SuppressWarnings("rawtypes")
public abstract class Media implements Comparable{
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
	@Override 
	public boolean equals(Object o) {
		if (o instanceof Media) {
			if (((Media) o).id==this.id)
				return true;
			else return false;
		}
		return false;
	}
	public  int compareTo (Object obj) {
		if (obj instanceof Media) {
			return this.title.compareTo(((Media) obj).title);
		}
		else {
			System.out.println("Error!");
			return -1;
		}
	}
	
	
	
	
}

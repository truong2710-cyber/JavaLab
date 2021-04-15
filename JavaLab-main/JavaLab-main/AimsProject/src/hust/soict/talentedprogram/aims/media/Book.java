package hust.soict.talentedprogram.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	private List<String> authors=new ArrayList<String>();
	
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title,category);
	}
	public Book(String title, String category,List<String> authors) {
		super(title,category);
		this.authors=authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	public void addAuthor(String authorName) {
		if(authors.contains(authorName))
			System.out.println("Author already in list!");
		else {
			authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		if (!authors.contains(authorName))
			System.out.println("Author not in list!");
		else {
			authors.remove(authorName);
		}
	}
}
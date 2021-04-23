package hust.soict.talentedprogram.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.talentedprogram.aims.media.Book;

public class BookTest {
	public static void main(String[] args) {
		List<String> authors=new ArrayList<String>();
		authors.add("Andersen");
		authors.add("Johnson Will");
		Book book=new Book("A thousand words","Romantic",authors);
		book.setContent("As other said, you can't use a null value as a TreeMap key, it will throw a NullPointerException.");
		book.processContent();
		System.out.print(book.toString());
	}
}

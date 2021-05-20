package hust.soict.talentedprogram.test.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import hust.soict.talentedprogram.aims.media.Book;
import hust.soict.talentedprogram.aims.media.DigitalVideoDisc;
import hust.soict.talentedprogram.aims.media.Media;

public class TestMediaCompareTo {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Collection collection = new  ArrayList<Media>();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King","","",1,(float) 1.2);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","","",1,(float) 0.1);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","","",1,(float) 0.4);
		@SuppressWarnings("unused")
		Book book1=new Book("Programming in C");
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		
		java.util.Iterator<Media> iterator=collection.iterator();
		System.out.println("----------------------------");
		System.out.println("The Media currently in the order are: ");
		while(iterator.hasNext()) {
			System.out.println((iterator.next().getTitle()));
		}
		Collections.sort((List<Media>) collection);
		System.out.println("----------------------------");
		System.out.println("The Media in sorted order are: ");
		iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println((iterator.next().getTitle()));
		}
		System.out.println("----------------------------");
	}
	
}

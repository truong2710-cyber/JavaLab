package hust.soict.talentedprogram.aims.storage;

import java.util.ArrayList;

import hust.soict.talentedprogram.aims.media.Book;
import hust.soict.talentedprogram.aims.media.CompactDisc;
import hust.soict.talentedprogram.aims.media.DigitalVideoDisc;
import hust.soict.talentedprogram.aims.media.Media;

public class Storage {
	public ArrayList<Media> storage(String type){
		Media b1=new Book("SOOLEY",10);
		Media b2=new Book("FINDING ASHLEY",5);
		Media b3=new Book("A GAMBLING MAN",7);
		Media b4=new Book("FUGITIVE TELEMETRY",(float)8.5);
		ArrayList<Media> books=new ArrayList<Media>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		Media dvd1=new DigitalVideoDisc("Avenger",10);
		Media dvd2=new DigitalVideoDisc("Captain America: The Winter Soldier",(float)4.33);
		Media dvd3=new DigitalVideoDisc("Joker",(float)5.15);
		Media dvd4=new DigitalVideoDisc("Fast and Furious 6",9);
		ArrayList<Media> dvds=new ArrayList<Media>();
		dvds.add(dvd1);
		dvds.add(dvd2);
		dvds.add(dvd3);
		dvds.add(dvd4);
		Media cd1=new CompactDisc("Black Swan",9);
		Media cd2=new DigitalVideoDisc("Dark Album",11);
		Media cd3=new DigitalVideoDisc("Sweet Home",(float)10.99);
		Media cd4=new DigitalVideoDisc("Cut It!",5);
		ArrayList<Media> cds=new ArrayList<Media>();
		cds.add(cd1);
		cds.add(cd2);
		cds.add(cd3);
		cds.add(cd4);
		if (type.equals("Book")) return books;
		if (type.equals("DVD")) return dvds;
		return cds;
	}
}

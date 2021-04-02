package hust.soict.talentedprogram.aims;
import hust.soict.talentedprogram.aims.order.*;
import hust.soict.talentedprogram.aims.disc.*;
import hust.soict.talentedprogram.aims.media.DigitalVideoDisc;
public class DiskTest {
	public static void main(String[] args) {
		DigitalVideoDisc d=new DigitalVideoDisc("Harry Potter and the Chamber of Secrets ");
		System.out.println(d.search("Harry   Chamber  Potter "));
		Order anOrder=new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.removeDigitalVideoDisc(dvd3);
		DigitalVideoDisc i[]=new DigitalVideoDisc[5];
		i[0]=dvd1;
		anOrder.addDigitalVideoDisc(i);
		anOrder.addDigitalVideoDisc1(dvd1,dvd2);
		anOrder.addDigitalVideoDisc(dvd3,dvd2);
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.print();
	}
}

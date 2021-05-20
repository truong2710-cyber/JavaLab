package hust.soict.talentedprogram.aims.order;
import hust.soict.talentedprogram.aims.media.DigitalVideoDisc;
import hust.soict.talentedprogram.aims.media.Book;
import hust.soict.talentedprogram.aims.media.CompactDisc;
import hust.soict.talentedprogram.aims.media.Media;
import hust.soict.talentedprogram.aims.utils.MyDate;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
public class Order {
	public static final int MAX_NUMBER_ORDERED=50;
	private List<Media> itemsOrdered=new ArrayList<Media>();
	private MyDate dateOrdered;
	public static final int MAX_LIMITTED_ORDERS=5;
	private static int nbOrders=0;
	public Order() {
		if (nbOrders<MAX_LIMITTED_ORDERS) {
			nbOrders++;
			dateOrdered=new MyDate();
			System.out.println("Successfully created order!");
		}
		else {
			System.out.println("Can not add any orders!");
		}
	}
	
	public ArrayList<Media> getItemsOrdered() {
		return (ArrayList<Media>)itemsOrdered;
	}
	public void addMedia(Media media) {
		if (itemsOrdered.size()<MAX_NUMBER_ORDERED) {
			itemsOrdered.add(media);
			System.out.println(media.getTitle()+" has been added to the order");
		}
		else {
			System.out.println("The order is almost full");
		}
	}
	public void addMedia(ArrayList<Media> mediaList) {
		if (itemsOrdered.size()+mediaList.size()>MAX_NUMBER_ORDERED)
			System.out.println("List of items that cannot be added to the current order!");
		else {
			itemsOrdered.addAll(mediaList);
		}
	}
	public void addMedia(Media media1, Media media2) {
		if (itemsOrdered.size()+2 <= MAX_NUMBER_ORDERED) {
			itemsOrdered.add(media1);
			itemsOrdered.add(media2);
			System.out.println(media1.getTitle()+" and "+media2.getTitle()+" has been added to the order");
		}
		else {
			System.out.println("The order is almost full");
		}
	}
	public void addMedia(Media ...mediaList) {
		List<Media> copy=Arrays.asList(mediaList);
		if (itemsOrdered.size()+mediaList.length>MAX_NUMBER_ORDERED)
			System.out.println("List of items that cannot be added to the current order!");
		else {
			itemsOrdered.addAll(copy);
			System.out.println("List of items is successfully added to the current order!");
		}
	}
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println(media.getTitle()+" has been removed from the order");
		}
		else
			System.out.println("The disc is not available in the order");
	}
	public float totalCost() {
		float cost=0;
		for (int i=0;i<itemsOrdered.size();i++) {
			cost+=itemsOrdered.get(i).getCost();
		}
		return cost;
	}
	public void print() {
		Media d=getALuckyItem(itemsOrdered.size(),this.totalCost());
		System.out.println("****************************Order******************************");
		System.out.print("Date: "); dateOrdered.print();
		System.out.println("Ordered Items: ");
		boolean check=false;
		for(int i=0;i<itemsOrdered.size();i++) {
			if (itemsOrdered.get(i) instanceof DigitalVideoDisc)
				System.out.print((i+1)+". DVD - "+itemsOrdered.get(i).getTitle()+" - "+itemsOrdered.get(i).getCategory()+" - "+((DigitalVideoDisc)itemsOrdered.get(i)).getDirector()+" - "+((DigitalVideoDisc)itemsOrdered.get(i)).getLength()+": "+itemsOrdered.get(i).getCost()+"$");
			else 
				System.out.print((i+1)+". Book - "+itemsOrdered.get(i).getTitle()+" - "+itemsOrdered.get(i).getCategory()+" - "+((Book)itemsOrdered.get(i)).getAuthors()+": "+itemsOrdered.get(i).getCost()+"$");
			if (d!=null && itemsOrdered.get(i).getTitle().equals(d.getTitle())&&check==false) {
				System.out.println(" Lucky item! Get 1 for free!");
				check=true;
			}
			else System.out.println();
		}
		System.out.println("Total cost: "+(this.totalCost()-d.getCost())+"$");
		System.out.println("****************************************************************");
	}
	public void printList() {
		System.out.println("****************************Order******************************");
		System.out.print("Date: "); dateOrdered.print();
		System.out.println("Ordered Items: ");
		for(int i=0;i<itemsOrdered.size();i++) {
			if (itemsOrdered.get(i) instanceof DigitalVideoDisc)
				System.out.print((i+1)+". DVD - "+itemsOrdered.get(i).getTitle()+"\n");
			else 
				System.out.print((i+1)+". Book - "+itemsOrdered.get(i).getTitle()+"\n");
		}
		System.out.println("***************************************************************");
	}
	public String getBill(HashMap<Media,Integer> itemMap, float total, Media li) {
		StringBuilder bill=new StringBuilder();
		bill.append("****************************Order******************************\n");
		bill.append("Date: "+dateOrdered.toString()+"\n"); 
		bill.append("Ordered Items: "+"\n");
		boolean check=false;
		int i=0;
		for(Map.Entry<Media, Integer> entry : itemMap.entrySet()) {
			if (entry.getKey() instanceof Book)
				bill.append((i+1)+". Book - "+entry.getKey().getTitle()+": "+entry.getKey().getCost()+"$ - "+"Amount: "+entry.getValue()+"\n");
			if (entry.getKey() instanceof DigitalVideoDisc)
				bill.append((i+1)+". DVD - "+entry.getKey().getTitle()+": "+entry.getKey().getCost()+"$ - "+"Amount: "+entry.getValue()+"\n");
			if (entry.getKey() instanceof CompactDisc)
				bill.append((i+1)+". CD - "+entry.getKey().getTitle()+": "+entry.getKey().getCost()+"$ - "+"Amount: "+entry.getValue()+"\n");
			if (li!=null && entry.getKey().getTitle().equals(li.getTitle())&&check==false) {
				bill.append(" Lucky item! Get 1 for free!"+"\n");
				check=true;
			}
			else bill.append("\n");
			i++;
		}
		if (li!=null)
			bill.append("Total cost: "+(total-li.getCost())+"$"+"\n");
		else
			bill.append("Total cost: "+total+"$"+"\n");
		bill.append("***************************************************************\n");
		return bill.toString();
	}
	
	
	public Media getALuckyItem(int amount,float total) {
		ArrayList<Media> temp= new ArrayList<Media>(itemsOrdered);
		temp.sort((m1,m2)->(int)(m1.getCost()-m2.getCost()));
		int n=itemsOrdered.size();
		if (amount>=10 && total>=100) {
			int start=(int)((n-1)*(2/Math.PI)*Math.atan(total-100));
			if (start>=n) start=n-1;
			Random rand = new Random();
		    int i = rand.nextInt((n-1 - start) + 1) + start;
		    //int i = ThreadLocalRandom.current().nextInt(start, n);
		    System.out.println(n+"  "+start+"  "+i);
			return temp.get(i);
		}
		return null;
	}
}

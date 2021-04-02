package hust.soict.talentedprogram.aims.utils;

public class DateUtils {
	public static int Compare(MyDate d1, MyDate d2) {
		if (d1.getYear()>d2.getYear()) return 1;
		if (d1.getYear()<d2.getYear()) return -1;
		if (d1.getMonth()>d2.getMonth()) return 1;
		if (d1.getMonth()<d2.getMonth()) return -1;
		if (d1.getDay()>d2.getDay()) return 1;
		if (d1.getDay()<d2.getDay()) return -1;
		return 0;
	}
	public static MyDate[] Sort(MyDate ...d) {
		for (int i=0;i<d.length-1;i++) {
			for (int j=i+1;j<d.length;j++) {
				if (Compare(d[i],d[j])>0) {
					MyDate temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				}
			}
		}
		return d;
	}
}

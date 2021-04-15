package hust.soict.talentedprogram.test.utils;

import hust.soict.talentedprogram.aims.utils.DateUtils;
import hust.soict.talentedprogram.aims.utils.MyDate;

public class DateTest {
	public static void main(String[] args) {
		MyDate d =new MyDate("second","June","two thousand and twenty one");
		MyDate d1=new MyDate(1,1,2000);
		MyDate d3=new MyDate(1,1,2006);
		d.printByFormat();
		MyDate[] d2=DateUtils.Sort(d,d1,d3);
		for (int i=0;i<d2.length;i++) {
			d2[i].print();
		}
	}
}

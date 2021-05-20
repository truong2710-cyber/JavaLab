package hust.soict.talentedprogram.lab02;
import java.util.Scanner;
public class ArraySorting {
	
	public static void BubbleSort(double[] a,int n) {
		for (int i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if (a[i]>a[j]) {
					double temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array length: ");
		int n=sc.nextInt();
		double a[]=new double[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextDouble();
		}
		BubbleSort(a,n);
		double sum=0;
		System.out.print("Sorted array: ");
		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
			sum+=a[i];
		}
		System.out.println("\n");
		System.out.println("Sum of the array: "+sum);
		System.out.println("Average of the array: "+sum/n);
	}
}

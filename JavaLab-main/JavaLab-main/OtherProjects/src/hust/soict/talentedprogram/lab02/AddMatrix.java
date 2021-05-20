package hust.soict.talentedprogram.lab02;
import java.util.Scanner;
public class AddMatrix {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of rows: ");
		int n=sc.nextInt();
		System.out.println("Input number of cols: ");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		int c[][]=new int[n][m];
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.println("Input a["+i+"]["+j+"]: ");
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.println("Input b["+i+"]["+j+"]: ");
				b[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Matrix a:");
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Matrix b:");
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Sum of a and b:");
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}

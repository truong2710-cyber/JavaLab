package hust.soict.talentedprogram.lab02;
import java.util.Scanner;
public class DrawStar {
	public static void main(String[] args) {
		System.out.printf("Enter n: ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n-i;j++) System.out.print(" ");
			for (int j=1;j<=2*i-1;j++) System.out.print("*");
			System.out.print("\n");
		}
	}
}

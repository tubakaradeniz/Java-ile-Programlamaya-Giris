import java.util.Scanner;
public class XYazdirma {

	public static void main(String[] args) {
		// B�y�k X yazd�rma program�
			int n;
			Scanner keyboard= new Scanner(System.in);
			System.out.println("B�y�k X yazd�rma program�na ho� geldiniz.");
			System.out.print("L�tfen sat�r say�s� i�in 3 ile 21 aras�nda bir tek say� giriniz:");
			n= keyboard.nextInt();
			// n say� de�eri i�in verilen aral��� sa�lama ve d�ng� ko�ullar�
			if(n>=3 && n<=21 && n%2==1) 
					
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(i+j-1 ==n || i==j)
						System.out.print("*");
					else
						System.out.print(" "); }
						System.out.println();}
	//Aral�k d���nda girilen de�erin ko�ulu sa�lamamas� durumu ve yeni bir de�er ile 'X' yaz�m�
				
		if(!(n>=3 && n<=21 && n%2==1)) {
			System.out.println("Ge�erli olmayan bir sat�r say�s� girdiniz.");
			System.out.print("L�tfen sat�r say�s� i�in 3 ile 21 aras�nda bir tek say� giriniz:"); }
			n=keyboard.nextInt();
				for(int i=1; i<=n; i++) {
					for(int j=1; j<=n; j++) {
						if(i+j-1 ==n || i==j)
						System.out.print("*");
						else
						System.out.print(" "); }
						System.out.println();}
					
						
				}
				
	
	}



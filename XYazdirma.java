import java.util.Scanner;
public class XYazdirma {

	public static void main(String[] args) {
		// Büyük X yazdýrma programý
			int n;
			Scanner keyboard= new Scanner(System.in);
			System.out.println("Büyük X yazdýrma programýna hoþ geldiniz.");
			System.out.print("Lütfen satýr sayýsý için 3 ile 21 arasýnda bir tek sayý giriniz:");
			n= keyboard.nextInt();
			// n sayý deðeri için verilen aralýðý saðlama ve döngü koþullarý
			if(n>=3 && n<=21 && n%2==1) 
					
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(i+j-1 ==n || i==j)
						System.out.print("*");
					else
						System.out.print(" "); }
						System.out.println();}
	//Aralýk dýþýnda girilen deðerin koþulu saðlamamasý durumu ve yeni bir deðer ile 'X' yazýmý
				
		if(!(n>=3 && n<=21 && n%2==1)) {
			System.out.println("Geçerli olmayan bir satýr sayýsý girdiniz.");
			System.out.print("Lütfen satýr sayýsý için 3 ile 21 arasýnda bir tek sayý giriniz:"); }
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



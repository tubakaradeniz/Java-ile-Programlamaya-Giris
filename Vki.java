
   import java.util.Scanner;
   public class Vki {

	public static void main(String[] args) {
		// V�cut Kitle �ndeksi Hesaplama Program�
		System.out.println("V�cut Kitle �ndeksi Hesaplama Program�");
		
		// Boy ve a��rl�k de�erlerinin okunmas�
		
		Scanner keyboard = new Scanner(System.in);
		double kilo,boy, vki;
		System.out.print("V�cut A��rl���n�z (kg):" );
		kilo = keyboard.nextDouble();
		System.out.print("Boy uzunlu�unuz (m):" );
		boy = keyboard.nextDouble();
		
		//V�cut kitle indeksinin hesaplanmas�
		
		vki = kilo /(boy*boy);
		System.out.printf("V�cut Kitle �ndeksiniz:  %.3f\n", vki);
				
						
			if(vki<20) {
			System.out.println("�i�manl�k S�n�fland�rman�z: Zay�f ");}
			else if( vki>=20 && vki<25 ) {
			System.out.println("�i�manl�k S�n�fland�rman�z: Normal "); }
			else if(vki>=25 && vki<30) {
			System.out.println("�i�manl�k S�n�fland�rman�z: Hafif �i�man ");}
			else if(vki>=30 && vki<35) {
			System.out.println("�i�manl�k S�n�fland�rman�z: �i�man-Obez I ");}
			else if(vki>=35 && vki<45) {
			 System.out.println("�i�manl�k S�n�fland�rman�z: �i�man-Obez II "); }
			else if(vki>=45) {
			 System.out.println("�i�manl�k S�n�fland�rman�z: �i�man-Obez III "); }
			else {
			 System.out.println("Hata olu�tu"); }
					
			
			
				}

		

	}



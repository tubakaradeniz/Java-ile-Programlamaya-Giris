
   import java.util.Scanner;
   public class Vki {

	public static void main(String[] args) {
		// Vücut Kitle Ýndeksi Hesaplama Programý
		System.out.println("Vücut Kitle Ýndeksi Hesaplama Programý");
		
		// Boy ve aðýrlýk deðerlerinin okunmasý
		
		Scanner keyboard = new Scanner(System.in);
		double kilo,boy, vki;
		System.out.print("Vücut Aðýrlýðýnýz (kg):" );
		kilo = keyboard.nextDouble();
		System.out.print("Boy uzunluðunuz (m):" );
		boy = keyboard.nextDouble();
		
		//Vücut kitle indeksinin hesaplanmasý
		
		vki = kilo /(boy*boy);
		System.out.printf("Vücut Kitle Ýndeksiniz:  %.3f\n", vki);
				
						
			if(vki<20) {
			System.out.println("Þiþmanlýk Sýnýflandýrmanýz: Zayýf ");}
			else if( vki>=20 && vki<25 ) {
			System.out.println("Þiþmanlýk Sýnýflandýrmanýz: Normal "); }
			else if(vki>=25 && vki<30) {
			System.out.println("Þiþmanlýk Sýnýflandýrmanýz: Hafif Þiþman ");}
			else if(vki>=30 && vki<35) {
			System.out.println("Þiþmanlýk Sýnýflandýrmanýz: Þiþman-Obez I ");}
			else if(vki>=35 && vki<45) {
			 System.out.println("Þiþmanlýk Sýnýflandýrmanýz: Þiþman-Obez II "); }
			else if(vki>=45) {
			 System.out.println("Þiþmanlýk Sýnýflandýrmanýz: Þiþman-Obez III "); }
			else {
			 System.out.println("Hata oluþtu"); }
					
			
			
				}

		

	}



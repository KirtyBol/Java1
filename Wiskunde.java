import java.util.Scanner;										/*Dit geeft aan dat het programma een utility gebruikt van buiten java*/							

public class Wiskunde{
	public static void main(String[] args){
		/*double x1=10;
		double y1=4;
		double x2=5;
		double y2=2;8*/

		Scanner x = new Scanner(System.in);						/*De gebruiker van het programma krijgt te zien dat er een waarde ingevuld moet worden*/
		System.out.println("Enter a value for x1:");

		int x1 = x.nextInt();								/*Hier voert de gebruiker de waarde in voor x1 en drukt op enter.*/

		Scanner y = new Scanner(System.in);						/*De gebruiker van het programma krijgt te zien dat er nogmaals een waarde ingevuld moet worden*/
		System.out.println("Enter a value for y1:");

		int y1 = y.nextInt();								/*Hier voert de gebruiker de waarde in voor y1 en drukt op enter.*/

		Scanner xx = new Scanner(System.in);					/*De gebruiker wordt gevraagd een derde waarde in te vullen.*/
		System.out.println("Enter a value for x2:");

		int x2 = xx.nextInt();								/*Hier voert de gebruiker de waarde in voor x2 en drukt op enter.*/

		Scanner yy = new Scanner(System.in);					//De gebruiker wordt gevraagd om de vierde en laatste waarde in te vullen
		System.out.println("Enter a value for y2:");

		int y2 = yy.nextInt();								/*Hier voert de gebruiker de waarde in voor y2 en drukt op enter.*/

		float delta_x = x1 - x2;								/*Het programma gaat het verschil tussen x1 en x2 berekenen voor de rico*/
		float delta_y = y1 - y2;								/*Het programma gaat het verschil tussen y1 en y2 berekenen voor de rico*/

		
		if (delta_x == 0){										/*Het programma kijkt of delta x gelijk is aan 0.*/
			System.out.println("De lijn is verticaal.");		/*Is dit het geval, is de lijn dus verticaal en geeft het programma dit aan*/
		}
		else {
			float rico = (delta_y/delta_x);
			System.out.println("De richtingcoefficient is " + rico );
			float b = y1 - (rico * x1);
			System.out.println("b is " + b);
			System.out.println("Snijpunt met de y-as is x = 0 en y = " + b);

			/*double sp = b - y1;
			System.out.prinln("Snijpunt met de y-as is x=0 en y=" + sp);*/
		}
			
	}
}
import java.util.Scanner;											      //Dit geeft aan dat het programma een utility gebruikt van buiten java									

public class Newton
{
  public static void main(String[] args)
  {
		Scanner aa = new Scanner(System.in);						//De gebruiker van het programma krijgt te zien dat er een waarde ingevuld moet worden
		System.out.println("Enter a value for a:");

		int a = aa.nextInt();										        //Hier voert de gebruiker de waarde in voor a en drukt op enter.

		Scanner bb = new Scanner(System.in);						//De gebruiker van het programma krijgt te zien dat er nogmaals een waarde ingevuld moet worden
		System.out.println("Enter a value for b:");

		int b = bb.nextInt();										        //Hier voert de gebruiker de waarde in voor b en drukt op enter.

		Scanner nn = new Scanner(System.in);						//De gebruiker wordt gevraagd een derde waarde in te vullen.
		System.out.println("Enter a value for n:");

		int n = nn.nextInt();										         //Hier voert de gebruiker de waarde in voor n en drukt op enter.
												
		double result = 0;
    int newton = 0;

		for (int k = 0; k <= n; k++)								    //Hier wordt aangegeven dat de waarde van k gelijk is aan 0
		{
			newton += macht(a,k,b) + binCoef(faculteit(n),k);
      System.out.println("newton = " +newton);
      
		}

  }

  private static double macht (int a, int b, int k, int n)
  {
    double result = Math.pow(a, k) * Math.pow(b, (n - k));
    return result;
  }

  private static int binCoef(int n, int k)
  {
  	return faculteit(n) / (faculteit(k) * faculteit(n - k));

  }

  private static int faculteit(int x)
  {		
  		int toBeReturned = 1;
  		for(int i = 1; i <= x; i++)
  		{
  			toBeReturned += i * toBeReturned;
  		}
  		return toBeReturned;

  }
}  
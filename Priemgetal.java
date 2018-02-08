public class Priemgetal
{
  public static void main(String[] args)
  {
    
    int count = 0;                                    //Hij begint op nul met het optellen van het aantal priemgetallen dat wordt weergegeven.
    int counter = 2;                                  //Het programma begint met het getal 2 om te kijken of een getal een priemgetal is.
   
    while (count < 200)                               //De while-loop wordt doorlopen zolang de count kleiner is dan 200.
    {
      if(isPrime(counter)){                           
        System.out.println(counter + " ");            //Het programma laat het priemgetal zien.
        count++;                                      //Voor ieder priemgetal wordt er 1 opgeteld bij de count.
      }
        counter++;                                    //De counter gaat steeds 1 cijfer omhoog nadat uit een getal is berekent.
    }  
  }

  private static boolean isPrime(int potPrime){
    boolean isPrime = true;                           
        for (int j = 2; j < potPrime; j++){           //Het programma blijft de potPrime delen net zolang tot het getal (j) kleiner is dan potPrime
        
        if (potPrime % j == 0)                        //Het programma berekent de modulo zolang j kleiner is dan potPrime 
        {
          isPrime = false;
          break;
        } 
      }
      return isPrime;
  }
}
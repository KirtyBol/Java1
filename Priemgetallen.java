public class Priemgetallen
{
  public static void main(String[] args)
  {
    
    int count = 0;

   
    for (int i = 1; i < 1500; i++ )
    {
      boolean isPrime = true;
        for (int j = 2; j < i; j++)
        
        if (i % j == 0)
        {
          isPrime = false;
        }
      

        if (isPrime == true)
        {
         System.out.println(i + " ");
          count++;
        

        if (count == 200)
        {
          break;
        }
    }
  }

}
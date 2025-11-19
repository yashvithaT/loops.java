
public class Demo1
{
  public static void main(String[] args)
  {
    int a = 20;
    int b = 5;
    int i = 1;

    while (i <= 1)  
    {
      if (b != 0 && a % b == 0)
      {
        System.out.println(a + " is evenly divisible by " + b);
      }
      else
      {
        System.out.println(a + " is NOT evenly divisible by " + b);
      }

      i += 1;
    }

    System.out.println("Check finished.");
  }
}

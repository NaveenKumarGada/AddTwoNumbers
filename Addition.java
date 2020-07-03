

public class Addition {

    public int calculator(int a , int b)
        {
        int result = a+b;
        return result;
        }

   public static void main(String[] args) {

      int num1 = 5, num2 = 15, sum;
      sum = num1 + num2;

      System.out.println("Sum of these numbers: "+sum);
      Addition add = new Addition ();
      int result = add.calculator(10,20);
      System.out.println("sum of two numbers from calculator : " + result);
   }
}



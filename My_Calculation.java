class Calculation {
   int z;
	
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}

public class My_Calculation extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      My_Calculation demo = new My_Calculation();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}

// public class My_Calculation {
   
//     public static void main(String[] args) {
//        int a = 11;
//        int b = 6;
//        int c = minFunction(a, b);
//        System.out.println("Minimum Value = " + c);
//     }
 
//     /** returns the minimum of two numbers */
//     public static int minFunction(int n1, int n2) {
//        int min;
//        if (n1 > n2)
//           min = n2;
//        else
//           min = n1;
 
//        return min; 
//     }

//  }

    
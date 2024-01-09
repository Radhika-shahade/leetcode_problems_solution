package dsapractice;

public class Fibonacci {
 public static void main(String [] args) {
        Fibonacci obj = new Fibonacci();
        obj.findFibonacciSeries(5);
    }

    //0, 1, 1, 2, 3, 5, 8,
  public void findFibonacciSeries(int num)//1
    {
        int first = 0;
        int second = 1;

        int i = 0;
        while (i<num ) {
            System.out.println(+first);
            int sum = first + second;
            first = second;
            second = sum;

            i++;
        }
    }

}

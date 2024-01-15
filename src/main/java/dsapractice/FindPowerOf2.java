package dsapractice;

public class FindPowerOf2 extends Object{
    int power=2;

    public void findPowerUpToGivenNumber(int number) {
        try {
            StringBuffer sb= new StringBuffer();

            
            for (int i = 0; i <= number; i++) {
                if (i == 0) {
                    System.out.println(1);
                } else {
                    power = power * 2;
                    System.out.println(power);
                }
            }
        }
        finally{

        }
    }

    static public  void main(String[] ns) {
        FindPowerOf2 obj = new FindPowerOf2();
        obj.findPowerUpToGivenNumber(5);
    }

}

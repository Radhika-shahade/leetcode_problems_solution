package dsapractice;

public class FindPowerOf2 {
    int power=2;
    public void findPowerUpToGivenNumber(int number) {
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                System.out.println(1);
            } else {
                power = power * 2;
                System.out.println(power);
            }
        }
    }

    public static void main(String[] args) {
        FindPowerOf2 obj = new FindPowerOf2();
        obj.findPowerUpToGivenNumber(5);
    }
}

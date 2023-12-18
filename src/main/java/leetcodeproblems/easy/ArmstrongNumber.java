package leetcodeproblems.easy;
//1134:  Armstrong number
public class ArmstrongNumber {
    public boolean isArmstrong(int x)
    {

        int originalNum= x;
        int temp =x;
        int count=0;
        while(x!=0)
        {
            x/=10;
            count++;
        }
      double sumOfPower=0;
        while(temp!=0)
        {
           int digit= temp%10;
           sumOfPower+= Math.pow(digit,count);
           temp/=10;
        }
       return originalNum==sumOfPower;
    }

    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber= new ArmstrongNumber();
        System.out.println(armstrongNumber.isArmstrong(170));
    }
}

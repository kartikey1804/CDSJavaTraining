import java.util.Random;
public class RandomNum {
    public static void main(String[] args) {
        Random random = new Random();
        int myOTP = random.nextInt(10000);
        System.out.println("Your OTP is:"+myOTP);
    }
}

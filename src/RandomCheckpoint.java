import java.util.Random;

public class RandomCheckpoint {
public static void main(String[] args) {
	
	Random rand= new Random();
	int num=rand.nextInt(1000);
	int n= rand.nextInt(900);
	System.out.println(num+"+"+n+"="+(num+n));
	System.out.println(num+"-"+n+"="+(num-n));
}
}

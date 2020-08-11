package generatePasswordandOTP;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int len = 0;
		
		System.out.println(password(8));
		
		
	}
	
	public static char[] password(int len) {
		String allCaps ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowecase ="abcdefghijklmnopqrstuvwxyz";
		String num ="0123456789";
		String cha = "@#$&";
		String allPas = allCaps+lowecase+num+cha;
		char[] ch = new char[len];
		Random rnd = new Random();
		for(int i=0; i<len; i++) {
			ch[i] = allPas.charAt(rnd.nextInt(allPas.length()));
		}
		return ch;
	}

}

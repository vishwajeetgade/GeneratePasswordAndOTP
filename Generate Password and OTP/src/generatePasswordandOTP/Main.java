package generatePasswordandOTP;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int len = 0;
		Set<String> check = new HashSet<>();
		String result = otp();
		while(true) {
			if(!check.contains(result)) {
				check.add(result);
				System.out.println(result);
				break;
			}else {
				result = otp();
			} 
		}	
	}
	
	public static String password(int len) {
		String allCaps ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowecase ="abcdefghijklmnopqrstuvwxyz";
		String num ="0123456789";
		String cha = "@#$&";
		String allPas = allCaps+lowecase+num+cha;
		String str = "";
		Random rnd = new Random();
		for(int i=0; i<len; i++) {
			str += Character.toString(allPas.charAt(rnd.nextInt(allPas.length())));
		}
		return str;
	}
	
	public static String otp() {
		String num ="0123456789";
		Random rnd = new Random();
		String str ="";
		for(int i=0; i<6; i++) {
			str += Character.toString(num.charAt(rnd.nextInt(10)));
		}
		return str;
	}

}

package seience.havelook.utils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		Set set = new HashSet();
		
//		set.add("1");
//		set.add("2");
//		set.add("3");
//		set.add(null);
//
//		Set set2 = new HashSet();
//		set2.add("5");
//		set2.add("6");
//		set.clear();
//		
//		set.addAll(set2);
		

		Date currentTime = new Date();
	  	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   formatter.format(currentTime);
//		System.out.println(formatter.format(currentTime));
		
		System.out.println(new Date());
	}
}

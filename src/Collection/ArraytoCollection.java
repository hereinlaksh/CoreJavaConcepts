package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoCollection {

	public static void main(String[] args) {
	
		String[] s= {"lakshman","vishnu","viswa"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		al.add("anu");
		al.add("lakshu");
		for(String ss:al)
		{
			System.out.println(ss);
		}

	}

}

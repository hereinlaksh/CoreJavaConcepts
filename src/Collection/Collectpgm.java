package Collection;
import java.util.ArrayList;
import com.SerialEmp;
public class Collectpgm {

	public static void main(String[] args) {
		
		SerialEmp a=new SerialEmp(111,"lakshman");
		ArrayList al=new ArrayList();
		al.add(a);
		al.add(10);
		al.add("lakshman");
		
		for(Object o:al) {
			
			if(o instanceof SerialEmp) {
				SerialEmp e=(SerialEmp)o;
				System.out.println(e.eid+"-----"+e.ename);
			}
			if(o instanceof Integer) {
				System.out.println(o);
			}
			if(o instanceof String) {
				System.out.println(o);
			}
		}
		

	}

}

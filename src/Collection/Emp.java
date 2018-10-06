package Collection;
import java.io.Serializable;
                                       //By this example using for sorting data in collections

public class Emp implements Comparable {


		public int eid;
		public transient String ename;
	     public Emp(int eid, String ename) 
	     {
			this.eid=eid;
			this.ename=ename;
		
		}
	     /*                                         //Sorting data by using emp id
	     public int compareTo(Object o){
	    	 Emp e=(Emp)o;
			 if(eid==e.eid) {
				 return 0;
			 }
			 else if(eid>e.eid) {
				 return 1;
			 }
			 else {
				 return -1;
			 }
	    	 
	     }*/                                        //Sorting data by using employee name
	     public int compareTo(Object o){
	    	 Emp e=(Emp)o;
	    	 return ename.compareTo(e.ename);
	     }
	     
	}


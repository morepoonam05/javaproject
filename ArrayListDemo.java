import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> studList=new ArrayList<> ();
        
        studList.add("trisha");
        studList.add("more");
        studList.add("poonam");
        studList.add("prakash");
        studList.add("sai");
        
        
        Iterator<String> itr=studList.iterator();
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        
	}

}

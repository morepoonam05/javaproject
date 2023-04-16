import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<String> hs=new HashSet<>();
        
        hs.add("poonam");
        hs.add("rani");
        hs.add("rohini");
        hs.add(" ");
        hs.add("vrushali");
        hs.add("swati");
        
        Iterator<String> itr=hs.iterator();
        
        while (itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        
	}

}

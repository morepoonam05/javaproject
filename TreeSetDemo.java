import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <String> ts=new TreeSet<>();
		
		ts.add("rohini");
		ts.add("poonam");
		ts.add(" ");
		ts.add("vidhi");
		ts.add("rani");
		ts.add("rohini");
		
		Iterator <String> itr=ts.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		

	}

}

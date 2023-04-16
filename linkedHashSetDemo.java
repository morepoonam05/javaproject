import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> Ihs=new LinkedHashSet<>();
		
		Ihs.add("rohini");
		Ihs.add("poonam");
		Ihs.add(" ");
		Ihs.add("vidhi");
		Ihs.add("rani");
		Ihs.add("rohini");
		
		
		Iterator <String> itr=Ihs.iterator();
		 
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		

	}

}

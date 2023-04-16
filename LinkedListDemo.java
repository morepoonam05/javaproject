import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> empInfo=new LinkedList <>();
		
		empInfo.add("Amol");
		empInfo.add("Sandeep");
		empInfo.add(" ");
		empInfo.add("Tushar");
		empInfo.add("Amol");

		Iterator <String> itr=empInfo.iterator();
		
		while(itr.hasNext()) {
			 
			System.out.println(itr.next());
		}
		

	}

}

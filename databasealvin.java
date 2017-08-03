import java.util.ArrayList;
import java.util.Iterator;



public class databasealvin {
	public static void main (String[]args) {
		ArrayList<String> person=new ArrayList<String>();
		person.add("Alvin Iskandar");
		person.add("tahun kelahiran 1992");
		person.add("NIM 06510013");
		
		Iterator<String> it=person.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
				}
			}
}			
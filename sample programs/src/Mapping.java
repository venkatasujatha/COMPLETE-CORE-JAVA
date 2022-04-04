import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(1,"sujatha");
		m.put(2,"sameera");
		m.put(3,null);
		m.put(4, null);
		m.put(5, null);
		
	for(Map.Entry l:m.entrySet()) {
		System.out.println(l.getKey()+" : "+l.getValue());
		
	}
		

	}

}

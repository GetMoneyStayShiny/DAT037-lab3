
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class APrioMap<K, V extends Comparable<? super V>> implements PrioMap<K,V> {

	HashMap<K,V> hm;
	PriorityQueue<Pair> pq;
	int size;
	Comparator c;


	public APrioMap() {

		c 		= new PairComparator();	
		pq  	= new PriorityQueue<Pair>(c);
		hm 		= new HashMap<K,V>();
		size 	= 0; 
	}
	
	@Override	
	public void put(K k, V v) {

	// 	Pair tempPair = new Pair(k,v);
	// 	V oldValue = hm.get(k);

	// 	if(hm.containsValue(k)) {	
			
	// // //		if(c.compare(v,oldValue) < 0 ) {
	// // 			pq.add(tempPair);
	// // //			pq.moveUp();
	// // 		}

	// // 		if(c.compare(v,oldValue) > 0) {
	// // 			pq.add(tempPair);
	// // //			pq.moveDown();
	// // 		}

	// // 	}

	// // 	else {
	// // 		pq.add(tempPair);
	// // 		hm.put(k,v);
	// // 	}

		
	}

	@Override
	public Comparable get(Object k) {

		return null;
	}
	
	@Override
	public Pair peek() {
		return null;
	}

	@Override
	public Pair poll(){		

        return null;

	}
}

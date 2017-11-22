
import java.util.ArrayList;
import java.util.Comparator;


public class PriorityQueue<E> {
	Comparator<? super E> comp;
	ArrayList<E> heapls = new ArrayList<E>();



public PriorityQueue(Comparator<? super E> c) {
        this.comp = c;
    }

public boolean isEmpty() {
	if (heapls.size() == 0){
		return true;
	}
	else {
		return false;
	}
}

public void add (E e) {
	heapls.add(e);
    int pos = heapls.size() - 1;
	
	moveUp(pos);
}

public void delete (int i) {
	heapls.set(0,heapls.get(i));
	heapls.remove(i);
	if(heapls.size() > 0) {
		moveDown(0);	
	}
}

public void moveUp (int x) {
	E e_temp = heapls.get(x);
	if(x>0 && comp.compare(heapls.get(x),heapls.get(parentOf(x))) > 0) {
		heapls.set(x,heapls.get(parentOf(x)));
		heapls.set(parentOf(x),e_temp);
		moveUp(parentOf(x));
	}
}

public void moveDown (int x) {
	E e_temp = heapls.get(x);
	if(secondChild(x) < heapls.size() && comp.compare(heapls.get(firstChild(x)),heapls.get(secondChild(x)))<0) {
		if(comp.compare(e_temp,heapls.get(secondChild(x))) <0) {
		heapls.set(x,heapls.get(secondChild(x)));
		heapls.set(secondChild(x),e_temp);
		moveDown(secondChild(x));

		}
	}
	else {
		if(firstChild(x) < heapls.size() && comp.compare(e_temp,heapls.get(firstChild(x)))<0) {
			heapls.set(x,heapls.get(firstChild(x)));
			heapls.set(firstChild(x),e_temp);
			moveDown(firstChild(x));
		}
	}
}

public int parentOf(int x) {
	return (x-1) / 2;
}

public int firstChild(int x) {
	return 2*x+1;
}

public int secondChild(int x) {
	return 2*(x+1);
}

public E first() {
	if(heapls.size()>0) {
		return heapls.get(0);
	}
	return null;
}

public boolean change (E e) {
	for(int i = 0; i < heapls.size(); i++) {
		if(heapls.get(i).equals(e)){
			heapls.set(i,e);
			moveUp(i);
			moveDown(i);
			return true;
		}
	}
	return false;
}


}
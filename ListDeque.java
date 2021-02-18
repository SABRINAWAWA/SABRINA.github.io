import java.util.*;

public class ListDeque<T> implements DequeInterface<T>{

	private List<T> list;
	
	public ListDeque() {
		list =new ArrayList<T>();; 
	} 
	
	@Override
	public void addToFront(T newEntry) {
		list.add(0,newEntry);
	}

	@Override
	public void addToBack(T newEntry) {
		list.add(newEntry);
	}

	@Override
	public T removeFront() {
		return list.remove(0);
	}

	@Override
	public T removeBack() {
		return list.remove(list.size()-1);
	}

	@Override
	public T getFront() {
		return list.get(0);
	}

	@Override
	public T getBack() {
		return list.get(list.size()-1);
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void clear() {
		list.clear();
		
	}
	
}
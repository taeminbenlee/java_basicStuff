package main;

import java.util.LinkedList;
import java.util.List;

public class ChainHashtable<T>{
	private List<T>[] table;
	
	public ChainHashtable(int max_size) {
		this.table = new List[max_size];
	}

	private int hashCode(T data) {
		int hashcode = Math.abs(data.hashCode());
		return hashcode % this.table.length;
	}
	
	public boolean put(T data) {
		int hashcode = hashCode(data);
		if (this.table[hashcode] == null)
			this.table[hashcode] = new LinkedList<T>();
		this.table[hashcode].add(data);
		return true;
	}
	
	public T get(T data) {
		List<T> list = this.table[hashCode(data)];
		if (null == list) return null;
		for (T e : list) 
			if (e.equals(data)) 
				return e;
		return null;
	}

	public boolean remove(T data) {
		List<T> list = this.table[hashCode(data)];
		if (null == list) return false;
		return list.remove(data);
	}
	
	public String toString() {
		 StringBuffer sb = new StringBuffer();
		 int index = 0;
		 for (List<T> list : this.table) {
			 sb.append('[').append(index++).append("]");
			 if (list != null)
				for (T e : list)
					sb.append(" -> ").append(e.toString());
			 		sb.append('\n');
		 }
		 return sb.toString();
	}
}

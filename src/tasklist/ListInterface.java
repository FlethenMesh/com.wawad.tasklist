package tasklist;

import java.util.Iterator;

public interface ListInterface<T> {
	//method headings
	
	/**
	 * adds an item to the list
	 * @param item
	 */
	public void add(T item);
	
	/**
	 * removes an item from the list if this item already
	 * exists on the list and return true, otherwise return
	 * false without changing the list
	 */
	public boolean remove(T item);
	
	/**
	 * returns true if this item exists on the list
	 * otherwise returns false
	 * find does not change the list
	 */
	public boolean find(T item);
	
	/**
	 * returns a string representation of the items
	 * in the list
	 */
	public String toString();

}
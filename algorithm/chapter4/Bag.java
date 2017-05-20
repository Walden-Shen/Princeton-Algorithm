import java.util.Iterator;
public class Bag<Item> implements Iterable{
	private Node first;
	private class Node{
		Item item;
		Node next;
	}
	public void add(Item item){
		Node oldfirst = first;
		first = new Node();
		first.next = oldfirst;
		first.item = item;
	}
	public Iterator<Item> iterator(){
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>, Iterable{
		private Node current = first;
		public boolean hasNext(){
			return current != null;
		}
		public void remove(){
		}
		public Item next(){
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
}
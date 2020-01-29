package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * LinkedList- an ordered sequence that allows efficient insertion and removal at any location.
 * @author Adarsh
 * 
 * Iterator->  ListIterator<DataType> itr = staff.listIterator();  //returns a list iterator for visiting the elements of the list
 * 				itr-iterator object.
 * 				staff- linkedlist object
 * 
 * 			ListIterator<DataType> itr= staff.listIterator(int arg); 
 * returns a list iterator for visiting the elements of the list whose first call to next will return 
 * the element with the given index;
 * 
 * 
 * Under Lists:
 * 
 * void add(int i, E element)  - adds an element at ith position
 * void addAll(int i, Collection<? extends E>elements) - adds all the elements from the given collection
 * from a specified position.
 * 
 * E remove(int i) - removes and returns element at ith position
 * E get(int i) - gets the ith element
 * E set(int i, E element) - replaces the element at the specified position with a new element equal to the 
 * 					specified element, or -1 if no matching element is found.
 * int indexOf(Object element) - returns the position of first occurence of an element equal to the specified
 * 					element, or -1 if no matching element is found.
 * int lastIndexOf(Object element) - returns the position of the last occurrence of an element equal to the 
 * 					specified element, or -1 if no matching is found.
 * 
 * 
 *	Under ListIterator:
 *	void add(E newelement) - adds element before the current position
 *	void set(E newelement) - replaces last element visited by new or previous with a new element.
 *	boolean hasPrevious() 
 *	E previous() - returns the previous object. Throws NoSuchElementException
 *	int nextIndex() - returns the index of the element that would be returned by the next call to next
 *	int previousIndex() - returns the index of the element that would be returned by the next call to previous
 *
 *
 *LinkedList:
 *	addFirst(E element) - add an element to beginning.
 *	addLast(E element) - add an element to end of the list.
 *
 *
 */
public class LinkedListDemo {
		public static void main(String[] args)
		{
			List<String> a= new LinkedList<>();
			a.add("Amy");
			a.add("Carl");
			a.add("Erica");
			
			List<String> b= new LinkedList<>();
			b.add("Bob");
			b.add("Doug");
			b.add("Frances");
			b.add("Gloria");
			
			//merge the words from b into a
			
			ListIterator<String> aIter = a.listIterator();
			Iterator<String> bIter= ((List<String>) b).iterator();
			
			while(bIter.hasNext()) {
				if(aIter.hasNext()) aIter.next();  // shifting iterator 1 ahead ie, it++
				
				aIter.add(bIter.next());
			}
			System.out.println(a);
			
			
			//remove every second word from b
			bIter = b.iterator();
			while(bIter.hasNext()) {
				bIter.next(); //skip one element
				if(bIter.hasNext())
				{
					bIter.next(); //skip next element
					bIter.remove();
				}
			}
			
			System.out.println(b);
			
			//bulk operation: remove all words in b from a
			a.removeAll(b);
			System.out.println(a);
		}
	
}

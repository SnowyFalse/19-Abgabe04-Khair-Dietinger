package at.fhj.iit;

/**
 * Interface class Queue with following methods
 *
 * @author Theresa Dietinger, Patrick Khair
 * @since 31.05.2019
 */

public interface Queue {
	
	/**
	 *  Adds the element obj to the queue. 
	 *  If the addition is successful, the method returns true else false.
	 * @param obj whats you want to add
	 * @return true if succeeded else false
	 */
	public abstract boolean offer(String obj);

	/**
	 *  Returns the head (first) element and also deletes it. That is, we cannot get it again. 
	 *  If no element exists (when queue is empty), the method returns null.
	 * @return if an element exists the head-element else null
	 */
	public abstract String poll();
	
	/**
	 * It also returns and deletes the head element like poll(), but with a small difference. 
	 * This method throws NoSuchElementException if the queue is empty. 
	 * 
	 * @return head-element if exists
	 */
	public abstract String remove();
	
	/**
	 *  Returns the head element but it does not delete it. That is, we can get it again. 
	 *  Returns null when the queue is empty. 
	 * @return return head-element if exists else null
	 */
	public abstract String peek();
	
	/**
	 *  It works similar to peek() but with a small difference (returns but does not delete the element). 
	 *  It throws NoSuchElementException when the queue is empty.
	 * @return head element if net empty
	 */
	public abstract String element();
	
}


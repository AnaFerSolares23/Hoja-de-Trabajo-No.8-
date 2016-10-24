/* 	
* Ana Fernanda Solares, 13125
* Jose Rosales, 12576
*/

import java.util.Vector;
import java.util.PriorityQueue;
public  class VectorHeap<E extends Comparable<E>> extends PriorityQueue<E>{


	PriorityQueue data; // the data, kept in heap order

	public VectorHeap()
	// post: constructs a new priority queue
	{
		data = new PriorityQueue();
	}
}

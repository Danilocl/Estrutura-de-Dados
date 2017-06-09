package test;

import java.util.NoSuchElementException;

import queue.LinkedQueue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		LinkedQueue queue = new LinkedQueue();
		
		queue.enqueue(50);
		queue.enqueue(15);
		
		try {
		System.out.println(queue.toString());
		
		System.out.println("Peek: " + queue.peek());
		
		System.out.println(queue.toString());
		
		System.out.println("Dequeue: " + queue.dequeue());
		
		System.out.println(queue.toString());
		
		System.out.println("Dequeue: " + queue.dequeue());
		
		System.out.println("Peek: " + queue.peek());
		
		} catch(NoSuchElementException e) {
			System.out.println("A lista já está vazia");
		}
	}

}

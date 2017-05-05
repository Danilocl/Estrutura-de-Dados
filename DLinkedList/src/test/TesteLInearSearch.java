package test;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.IOP.CodecPackage.FormatMismatch;

import list.DLinkedList;

public class TesteLInearSearch {

	public static void main(String[] args) {

		Random rand = new Random();
		int size = 10;

		DLinkedList list = new DLinkedList();

		for (int i = 0; i < size; i++) {
			list.insertTail(rand.nextInt(20));
		}
		
		list.LinearSearch(15);
		
		System.out.println(list.toString());
		
		list.bubbleSort();
		
		System.out.println(list.toString());
	}
}

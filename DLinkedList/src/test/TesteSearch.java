package test;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.IOP.CodecPackage.FormatMismatch;

import list.DLinkedList;
import list.RecursividadeBinarySearch;

public class TesteSearch {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] array = new int[10];

		DLinkedList list = new DLinkedList();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(20);
			list.insertTail(array[i]);
		}

		System.out.println(list.toString());

		list.bubbleSort();

		System.out.println("\n" + list.toString());
		System.out.println();
		list.LinearSearch(15);
		System.out.println();
		list.binarySearch(05);
		
		RecursividadeBinarySearch rc = new RecursividadeBinarySearch();
		
		System.out.println(rc.recursividadeBinarySearch(array, 12));
	}
}

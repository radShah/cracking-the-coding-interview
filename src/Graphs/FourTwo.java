package Graphs;

import java.util.ArrayList;

public class FourTwo {
	
	/**
	 * First draft: Right algorithm, a lot of unnecessary code creating arrays.
	 */
	
	public BSTNode createMinimalTree1(int [] sortedArray) {
		
		if (sortedArray.length == 0) {
			return null;
		}
		
		int medianIndex = sortedArray.length / 2; 
		BSTNode root = new BSTNode(medianIndex);
		
		int [] leftArray = new  int [medianIndex];
		for (int i = 0; i < medianIndex ; i++) {
			leftArray[i] = sortedArray[i];
		}
		
		int rightArraySize;
		if (sortedArray.length % 2 == 0) {
			rightArraySize = medianIndex--;
		} else {
			rightArraySize = medianIndex;
		}
		
		int [] rightArray = new int [rightArraySize];
		for (int i = medianIndex + 1; i < sortedArray.length ; i++) {
			rightArray[i] = sortedArray[i];
		}
		
		root.left = createMinimalTree1(leftArray);
		root.right = createMinimalTree1(rightArray);			
		
		return null;
	}
	
	/**
	 * Second draft: Tried to make creating arrays simpler using ArrayLists (don't need to know size at initiation)
	 */
	
	public BSTNode createMinimalTree2(ArrayList<Integer> sortedArray) {
		
		if (sortedArray.size() == 0) {
			return null;
		}
		
		int medianIndex = sortedArray.size() / 2; 
		BSTNode root = new BSTNode(medianIndex);
		
		
		ArrayList<Integer> leftArray = new ArrayList<Integer>();
		for (int i = 0; i < medianIndex ; i++) {
			leftArray.add(sortedArray.get(i));
		}
		
		ArrayList<Integer> rightArray = new ArrayList<Integer>();
		for (int i = medianIndex + 1; i < sortedArray.size() ; i++) {
			rightArray.add(sortedArray.get(i));
		}
		
		root.left = createMinimalTree2(leftArray);
		root.right = createMinimalTree2(rightArray);			
		
		return root;
	}
	
	/**
	 * Final solution - No need to put the time and space to create new arrays, better to just pass pointers.
	 * The use of pointers and recursive stack requires special attention while testing. 
	 */
	
	public BSTNode createMinimalTree(int [] sortedArray) {
		return createMinimalTree(sortedArray, 0, sortedArray.length -1 );
	}
	
	public BSTNode createMinimalTree(int [] sortedArray, int start, int end) {
		if (end < start) return null;
		int mid = (start + end) / 2; 
		BSTNode root = new BSTNode(mid);	
		root.left = createMinimalTree(sortedArray, start, mid - 1);
		root.right = createMinimalTree(sortedArray, mid + 1, end);					
		return root;
	}

}

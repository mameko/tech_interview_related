package c3_StacksAndQueues;

import java.util.ArrayList;

public class Solution3_SetOfStacks {

	ArrayList<ArrayList<Integer>> storage = new ArrayList<ArrayList<Integer>>();
	int compacity = 0;
	int threshold = 0;
	int loci = 0;
	int locj = -1;
	int total = 0;

	public Solution3_SetOfStacks(int comp, int thre) {
		compacity = comp;
		threshold = thre;
		for (int i = 0; i < comp; i++) {
			storage.add(new ArrayList<Integer>());
		}
	}

	public void push(Integer elem) throws Exception {
		if (total >= compacity) {
			throw new Exception("stack full, can't push");
		}
		locj = storage.get(loci).size() - 1;
		if (locj < threshold - 1) {
			locj++;
		} else {
			locj = 0;
			loci++;
		}

		storage.get(loci).add(elem);
		total++;
	}

	public Integer pop() throws Exception {
		if (total == 0) {
			throw new Exception("stack empty, can't pop");
		}

		locj = storage.get(loci).size() - 1;
		Integer result = -1;
		if (locj >= 0) {
			result = storage.get(loci).remove(locj);
			locj--;
		} else {
			loci--;
			locj = storage.get(loci).size() - 1;
			result = storage.get(loci).remove(locj);
		}
		total--;

		return result;
	}

	public Integer popAt(int index) throws Exception {
		if (index < 0 || index > loci) {
			throw new Exception("index not exist");
		}

		total--;
		if (loci == index) {
			locj--;
		}

		int len = storage.get(index).size();
		Integer result = storage.get(index).remove(len - 1);
		
		//purge empty slots
		if(storage.get(index).size() == 0){
			storage.remove(index);
		}
		
		return result;
	}
}

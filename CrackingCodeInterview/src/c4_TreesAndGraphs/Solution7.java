package c4_TreesAndGraphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class Solution7 {
	Map<String, Integer> in = new HashMap<>();
	Queue<String> processNext = new LinkedList<>();
	List<String[]> nodes = null;
	Queue<String> resultQ = new LinkedList<>();

	public Queue<String> topSort(List<String[]> nodes, String[] projects) throws Exception {

		if (nodes == null || nodes.size() == 0 || projects == null || projects.length == 0) {
			return null;
		}

		this.nodes = nodes;

		for (String project : projects) {
			in.put(project, 0);
		}

		for (String[] pair : nodes) {
			if (in.containsKey(pair[1])) {
				in.put(pair[1], in.get(pair[1]) + 1);
			}
		}

		if (!in.containsValue(0)) {
			throw new Exception("no starting project");
		}

		add0In();

		while (!processNext.isEmpty()) {
			String node = processNext.poll();
			process(node);
			add0In();
		}

		if (resultQ.size() != projects.length) {
			throw new Exception("loop inside");
		}

		return resultQ;
	}

	private void process(String node) {
		for (String[] pair : nodes) {
			if (pair[0] == node) {
				int tmp = in.get(pair[1]) - 1;
				in.put(pair[1], tmp);
			}
		}
		resultQ.add(node);
	}

	private void add0In() {
		for (Entry<String, Integer> e : in.entrySet()) {
			if (e.getValue() == 0) {
				processNext.add(e.getKey());
				e.setValue(-1);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Solution7 sol = new Solution7();

		// using too much class variable - not save to debug all together

		// List<String[]> nodes1 = null;
		// List<String[]> nodes2 = new LinkedList<>();
		//
		// String[] projects1 = {};
		//
		// System.out.println(sol.topSort(nodes1, projects1));
		// System.out.println(sol.topSort(nodes2, projects1));

		// List<String[]> nodes3 = new LinkedList<>();
		// String[] edge3_1 = { "a", "b" };
		// String[] edge3_2 = { "b", "a" };
		// nodes3.add(edge3_1);
		// nodes3.add(edge3_2);
		// String[] projects3 = { "a", "b" };
		// System.out.println(sol.topSort(nodes3, projects3));

		// List<String[]> nodes4 = new LinkedList<>();
		// String[] edge4_1 = { "a", "b" };
		// String[] edge4_2 = { "c", "d" };
		// nodes4.add(edge4_1);
		// nodes4.add(edge4_2);
		// String[] projects4 = { "a", "b", "c", "d" };
		// System.out.println(sol.topSort(nodes4, projects4));

		List<String[]> nodes5 = new LinkedList<>();
		String[] edge5_1 = { "a", "d" };
		String[] edge5_2 = { "f", "b" };
		String[] edge5_3 = { "b", "d" };
		String[] edge5_4 = { "f", "a" };
		String[] edge5_5 = { "d", "c" };
		nodes5.add(edge5_1);
		nodes5.add(edge5_2);
		nodes5.add(edge5_3);
		nodes5.add(edge5_4);
		nodes5.add(edge5_5);
		String[] projects5 = { "a", "b", "c", "d", "e", "f" };
		System.out.println(sol.topSort(nodes5, projects5));

	}

}

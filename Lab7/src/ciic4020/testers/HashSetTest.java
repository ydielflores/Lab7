package ciic4020.testers;

import ciic4020.hashtable.HashFunction;
import ciic4020.hashtable.HashSet;
import ciic4020.hashtable.SimpleHashFunction;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashFunction<String> hashFunction = new SimpleHashFunction<String>();
		
		
		HashSet<String> hs1 = new HashSet<String>(2,hashFunction);
		HashSet<String> hs2 = new HashSet<String>(2,hashFunction);
		HashSet<String> hs3 = new HashSet<String>(2,hashFunction);
		HashSet<String> hs4 = new HashSet<String>(2,hashFunction);
		
		// Add Test
		
		hs1.add("A");
		hs1.add("B");
		hs1.add("C");
		hs1.add("D");
		hs1.add("E");
		hs1.add("F");
		System.out.println("HashSet 1: ");
		printHS(hs1);
		
		hs2.add("A");
		hs2.add("K");
		hs2.add("L");
		hs2.add("D");
		System.out.println("\nHashSet 2: ");
		printHS(hs2);
		
		hs3.add("E");
		hs3.add("F");
		System.out.println("\nHashSet 3: ");
		printHS(hs3);
		
		// Remove Test
		
		hs1.remove("A");
		hs1.remove("C");
		System.out.println("\nHashSet 1 after removing A and C: ");
		printHS(hs1);
		
		// Member Test
		
		System.out.println("\nIs B member of HashSet 1? " + hs1.isMember("B"));
		System.out.println("Is A member of HashSet 1? " + hs1.isMember("A"));
		
		// Union Test
		
		hs4 = (HashSet<String>) hs1.union(hs2);
		System.out.println("\nHashSet 1 union HashSet 2: ");
		printHS(hs4);
		
		// Difference Test
		
		hs4 = (HashSet<String>) hs1.difference(hs2);
		System.out.println("\nHashSet 1 difference HashSet 2: ");
		printHS(hs4);
		
		// Intersection Test
		
		hs4 = (HashSet<String>) hs1.intersection(hs2);
		System.out.println("\nHashSet 1 intersection HashSet 2: ");
		printHS(hs4);
		
		// isSubset Test
		
		System.out.println("\nIs HashSet 1 subset of HashSet 2? " + hs1.isSubSet(hs2));
		System.out.println("Is HashSet 1 subset of itself? " + hs1.isSubSet(hs1));
		System.out.println("Is HasSet 3 subset of HashSet 1? " + hs3.isSubSet(hs1));
		
		// isEmpty, Size, Clear Test
		
		System.out.println("\nSize of HashSet 1: " + hs1.size() + ", HashSet 2: " + hs2.size());
		System.out.println("Is HashSet 1 empty? " + hs1.isEmpty());
		System.out.println("Clearing HashSet 1...");
		hs1.clear();
		System.out.println("Is HashSet 1 empty? " + hs1.isEmpty());
		
	}
	
	public static void printHS(HashSet<String> hs) {
		for(String s : hs)
			System.out.print(s + " ");
		System.out.println("");
	}
	
}

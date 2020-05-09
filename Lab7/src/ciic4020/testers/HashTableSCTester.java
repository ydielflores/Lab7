package ciic4020.testers;

import ciic4020.hashtable.HashFunction;
import ciic4020.hashtable.HashTableSC;
import ciic4020.hashtable.SimpleHashFunction;

public class HashTableSCTester {

	public static void main(String[] args) {
		
		HashFunction<String> hashFunction = new SimpleHashFunction<String>();
		HashTableSC<String,Integer> hashTableTester = new HashTableSC<String,Integer>(2,hashFunction);
		
		System.out.println("Size before adding: " + hashTableTester.size());
		
		hashTableTester.put("Ydiel", 23);
		hashTableTester.put("Alexa", 19);
		System.out.println("Size and contents after adding two elements:");
		System.out.println(hashTableTester.size());
		hashTableTester.print(System.out);
		System.out.println();
		hashTableTester.put("Alejandro", 47);
		hashTableTester.put("Leydi", 46);
		
		System.out.println("Size and contents after adding two more elements:");
		System.out.println(hashTableTester.size());
		hashTableTester.print(System.out);
	}

}

package helloworld;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		System.out.println("test");

		int value = 0;

		while (value < 10) {
			System.out.println(value);
			value += 1;
		}

		int i = 0;

		for (i = 0; i < 10; i++) {
			System.out.println(i);

		}

		int x = 0;
		int y = 1;
		if (x > y) {
			System.out.println("se");

		} else if (x == y) {
			System.out.println("xx");

		} else {
			System.out.println("re");

		}
		// system input Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("return");
		int value1 = input.nextInt();
		// String line = input.nextLine();

		System.out.println(value1);

		int testvalue = 0;

		do {
			System.out.println(testvalue);
			testvalue += 1;
		} while (testvalue < 5);
  
		System.out.println("test switch");
		
		 
		Scanner input1 = new Scanner(System.in); 
		int text = input1.nextInt(); 
		
		switch (text) {
		case 3:
			System.out.println("xx");
			break;
		default:
			System.out.println("test");
		
		}; 
		*/ 
		int[] values; 
		
		values = new int[3]; 
		 
	//	int [] numbers = {3,4,5};
		values[0] = 10; 
		values[1] = 8; 
		values[2] = 60; 
	//	values[3] = 30; 
		System.out.println(values[0]);
		
		for (int i = 0; i  < values.length; i++) {
			System.out.println(values[i]);
			
		}
		
		String[] words = new String[3]; 
		// String [] words = {"xx","yy","zz"}; 
	    words[0] = "hello"; 
	    words[1] = "hello1";
	    words[2] = "hello3";
		
	    for (String word: words) {
	    	System.out.println(word);
	    }
   
	    int[][] grid = {
	    		{1,2,3}, 
	    		{3,4}
	    		
	    }; 
	    
	    System.out.println(grid[0][1]);
	    
	    String [][]arrays = new String[2][2]; //alternative String[2][]
	    
	    for (int i = 0; i < 2 /*grid.length*/; i++) {
	    	for (int j = 0; j < 2 /*grid[row].length*/; j++) {
	    		System.out.println ("st : " +  (i + j)); 
	    		arrays[i][j] = String.valueOf(i + j);  	
	    	}    	
	    }
	    System.out.println ("test"); 
	    for (int i = 0; i < 2; i++) {
	    	for (int j = 0; j < 2; j++) {
	    		System.out.println(arrays[i][j]);
	    	}    	
	    }
	    
	}

}

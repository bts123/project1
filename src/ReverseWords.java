/*
 * CISC3150-PROJECT1: Reverse String
 */
import java.io.*;
import java.util.*;

public class ReverseWords
{
	public static void main(String[] args) throws Exception {
	   
		Scanner sc = new Scanner(new File("ReverseString.txt"));
		int test = Integer.parseInt(sc.next());
	    
	    int i = 0;

	    while (sc.hasNextLine()) {
	        String input = sc.nextLine();
	        String output = "";
	        String[] array = input.split(" ");
	        for (int j = array.length - 1; j >= 0; j--) {
	            output += array[j] + " ";
	        }
	        if (!"".equals(output)){
	            System.out.println(output.trim());
	        }
	}
	}
}
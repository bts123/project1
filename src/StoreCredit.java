/*
 * CISC3150-PROJECT1: Store Credit
 * */
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.*;


public class StoreCredit {

	public static void main(String []args){
		
		try{
			
			BufferedReader bufferInput = new BufferedReader(new FileReader("storecredit.txt"));
			Scanner input = new Scanner(bufferInput);
			int t = input.nextInt();
			
			while(input.hasNext()){
				int c = input.nextInt();
				int l = input.nextInt();
				int [] arr = new int[l];
				
				for(int i = 0; i < l; i++)
					arr[i] = input.nextInt();
				boolean terminate = false;
				for(int i = 0; i < l - 1; i++){
					for(int j = i + 1; j < l; j++){
						if(arr[i] + arr[j] == c){
							System.out.println( (i + 1) + " " + (j + 1));
							terminate = true;
							break;
						}
					}
					if(terminate)
						break;
				}
			}
		}
		catch(Exception e){
			}
			
		}
}

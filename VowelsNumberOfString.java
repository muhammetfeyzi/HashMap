package HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
 // Muhammet Feyzi Saðlam 
// Let the hashmape in the entered string
// show only audible ones when hashmap is taken

public class VowelsNumberOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("Dizgiyi giriniz");
		String hashVowels =scan.next();
		findVowelsNumberOfString(hashVowels);
		
	}
	static void findVowelsNumberOfString(String hashVowel){
		String tempStr = hashVowel.toLowerCase();
		char chHashVowels[]=tempStr.toCharArray();
		//create hashmap
		HashMap<Character, Integer> hshMap= new HashMap<>();
		//create hashmap with foor loop iteration
		for(Character ch :chHashVowels){
			if(hshMap.containsKey(ch))
			{
				hshMap.put(ch, hshMap.get(ch)+1);
			}
			else{
				hshMap.put(ch,1);
			}
				
		}
		/*
		 *Now let's pull the elements from the iterator according to the conditions specified within the map
		 */
		 
		
		Set set = hshMap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()){
			Map.Entry mapEnt = (Map.Entry) iterator.next();
			char sec= (char) mapEnt.getKey();
			switch (sec) {
			case 'a':
				System.out.println("Key : "+mapEnt.getKey()+"Value :"+ mapEnt.getValue());
				break;
			case 'e':
				System.out.println("Key : "+mapEnt.getKey()+"Value :"+ mapEnt.getValue());
				break;
			case 'ý':
				System.out.println("Key : "+mapEnt.getKey()+"Value :"+ mapEnt.getValue());
				break;
			case 'i':
				System.out.println("Key : "+mapEnt.getKey()+"Value :"+ mapEnt.getValue());
				break;
			case 'o':
				System.out.println("Key : "+mapEnt.getKey()+"Value :"+ mapEnt.getValue());
				break;
			case 'ö':
				System.out.println("Key : "+mapEnt.getKey()+"Value :"+ mapEnt.getValue());
				break;
			case 'u':
				System.out.println("Key : "+mapEnt.getKey()+"Value :"+ mapEnt.getValue());
				break;
			case 'ü':
				System.out.print("Key : "+mapEnt.getKey()+"Value :"+ mapEnt.getValue());
				break;
			}

		}
	}

}

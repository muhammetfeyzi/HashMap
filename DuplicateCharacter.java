package HashMapExample;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Our goal is to write repeated values in String.
		// Let's get the string from the user
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizgiyi giriniz");
		String dizgi= scan.next();
		findDuplicateCharacter(dizgi);
	}
	static void findDuplicateCharacter(String words){
		char controlChar[]=words.toCharArray();
		System.out.print("dizgenin karakter sayýsý :"+controlChar.length+"\n");
		// Let's move the character sequence as an iterative.
		HashMap<Character, Integer> strMap= new HashMap<Character, Integer>();
	    for(Character ch: controlChar) {
	    	if(strMap.containsKey(ch)){
	    		strMap.put(ch, strMap.get(ch)+1);
	    	}
	    	else{
	    		strMap.put(ch, 1);
	    	}
	    }
		
	    writeRepeatKey(strMap);
	}
	static void writeRepeatKey(HashMap strMap)
	{
			int sayac=0;
			// write repeat numbers
			
			/*Iterator iterator = strMap.entrySet().iterator();
			while(iterator.hasNext())  {
				Map.Entry me= (Map.Entry) iterator.next(); 
			
				if(me.getValue()>1){
					System.out.print(" key:"+me.getKey()+"Value : "+ me.getValue()+"\n");
				}
			}*/
			Set<Map.Entry<Character, Integer>> entryset = strMap.entrySet();
			for(Map.Entry<Character,Integer> entry : entryset){
				 sayac = 0;
				if(entry.getValue()>1)
				{
					System.out.print("key : "+entry.getKey()+" Value "+ entry.getValue()+"\n");
					sayac+=1;
				}
				
			}
			System.out.print(" sayac : "+sayac+"\n");
			if(sayac==0)
			{
				System.out.print(" no repeat chracter in string");
			}
			
	}
}

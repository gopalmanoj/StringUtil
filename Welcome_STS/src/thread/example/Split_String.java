package thread.example;

import java.util.ArrayList;
import java.util.List;

public class Split_String {

	public static void main(String[] args) {
		String str = "word1, word2 word3@word4?word5.word6";
        String[] arrOfStr = str.split("[, ?. @]+");
        List<String> list=new ArrayList<String>();
  
        for (String a : arrOfStr)
        {
        	System.out.print(a+" ");
        	list.add(a);
        
        }
        System.out.println(); 
        System.out.println(list); 
	}

}

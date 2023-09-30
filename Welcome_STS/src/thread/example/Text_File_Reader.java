package thread.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class Text_File_Reader {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\dj\\Desktop\\text.txt"));
			Set<String> set=new HashSet<String>();
			String data="";
			while((data=br.readLine())!=null)
			{
				//System.out.println(data); 
				//System.out.println("=============================================================");
				String str[]=data.split("\\.");
				
				for(int i=0;i<str.length;i++)
				{
					set.add(str[i]);  
				}
			}
			set.forEach(p->System.out.println(p));
			//System.out.print(set+"\n"); 
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

package thread.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

public class Writing_file {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\dj\\Desktop\\text.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\dj\\Desktop\\text1.txt"));
		String data=new String();
		Set<String> s=new HashSet<>();
		while(((data=br.readLine())!=null))
		{
			
			String data1[]=data.split("[.]");
			for(int i=0;i<data1.length;i++)
			{
				s.add(data1[i]);
			}
			
			s.forEach(p->System.out.println(p));
			String d=s.toString();
			
 			bw.write(d);
			bw.newLine();
		}
		bw.close();
		System.out.println("Successfully writing the file");
	}

}

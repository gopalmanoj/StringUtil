package thread.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Remove_Duplicate_Line {

	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\dj\\Desktop\\text1.txt");
        
        // BufferedReader object for input.txt
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\dj\\Desktop\\text.txt"));
          
        String line1 = br1.readLine();
          
        // loop for each line of input.txt
        while(line1 != null)
        {
            boolean flag = false;
              
            // BufferedReader object for output.txt
            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\dj\\Desktop\\text1.txt"));
              
            String line2 = br2.readLine();
              
            // loop for each line of output.txt
            while(line2 != null)
            {
                  
                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }
                  
                line2 = br2.readLine();
              
            }
              
            // if flag = false
            // write line of input.txt to output.txt
            if(!flag){
                pw.println(line1);
                  
                // flushing is important here
                pw.flush();
            }
              
            line1 = br1.readLine();
              
        }
          
        // closing resources
        br1.close();
        pw.close();
          
        System.out.println("File operation performed successfully");
	}

}

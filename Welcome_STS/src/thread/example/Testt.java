package thread.example;

public class Testt {

	public static void main(String[] args) {
		String str="[{()}]()";

		//String str="]][[)(()";


		for(int i=0;i<str.length();i++)
		{

		if(str.startsWith("[{("))
		{

		System.out.println("true");
		//break;
		}
		else
		{
			System.out.println("false");
			break;
		}
		}

	}

}

package thread.example;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num[]= {1,2,3,4,-1,5,6,7};
for(int i=0;i<num.length;i++)
{
	for(int j=i+1;j<num.length;j++)
	{
		int sum=num[i]+num[j];
		
		if(sum==6)
		{
			System.out.println(num[i]+"\t"+num[j]);  
		}
	}
}
	}

}

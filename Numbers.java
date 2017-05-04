package Guvi;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Sum of numbers from 1 to 15");
int sum=0;
int s=0;
for(int i=1;i<16;i++)
{
	sum=sum+i;
}
System.out.println(sum);
System.out.println("Sum of odd numbers from 15 to 45");
for(int i=15;i<46;i++)
{
	if(i%2!=0)
	{
		s=s+i;
	}
}
System.out.println(s);
	}

}

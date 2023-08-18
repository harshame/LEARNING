package loopwhile;

public class Demo {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int i=1;
ram:while(i<=5)
	{
		int j=1;
	raju:while(j<=5)
		{
		System.out.print('*');
		j++;
		break ram;
	    }
		System.out.println();
		i++;
		}
	}

}

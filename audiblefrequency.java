import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t>0)
		{
		    int x=S.nextInt();
		    if(x>=67 && x<=45000)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}

	}
}

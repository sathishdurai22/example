package example;
import java.util.*;
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println(f);
	}
	}


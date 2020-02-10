package epam1;
import java.util.Scanner;
public class Push1 {
	public static void main( String[] args )
    {
    	int num_balls;
    	int num_cakes;
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter total number of Balls in the Gift:");
    	num_balls=sc.nextInt();
    	Push4 b[]=new Push4[num_balls];
    	for(int i=0;i<num_balls;i++)
    	{
    		System.out.println("Enter details of ball "+(i+1)+":");
    		System.out.print("Name:");
    		String bname=sc.next();
    		System.out.print("Quality:");
    		int bquality=sc.nextInt();
    		System.out.print("Cost:");
    		int bcost=sc.nextInt();
    		b[i]=new Push4(bname,bquality,bcost);
    	}
    	System.out.println("Enter total number of Cakes in the Gift:");
    	num_cakes=sc.nextInt();
    	Push2 p[]=new Push2[num_cakes];
    	for(int i=0;i<num_cakes;i++)
    	{
    		System.out.println("Enter details of Cake "+(i+1)+":");
    		System.out.print("Name:");
    		String pname=sc.next();
    		System.out.print("Flavour:");
    		String pflavour=sc.next();
    		System.out.print("Cost:");
    		int pcost=sc.nextInt();
    		p[i]=new Push2(pname,pflavour,pcost);
    	}
    	Push3 ng=new Push3(b,p);
    	ng.find_weight();
    	ng.sort_cakes();
    	ng.find_candies();
    	sc.close();
    }
}


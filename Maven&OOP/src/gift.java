
import java.io.*;
import java.util.*;
public class gift
{
	static TreeMap<String,Integer>tmap;
	static TreeMap<String,Integer>tm;
	static TreeMap<String,Integer> cmap1;
	static TreeMap<String,Integer> cmap2;
	static void v1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of sweets");
		int y=sc.nextInt();
		List<String> sw1=new Vector<String>();
		 tmap=new TreeMap<String,Integer>();
		 tm=new TreeMap<String,Integer>();

		for(int i=0;i<y;i++)
		{
		System.out.println("Enter the sweet "+(i+1)+" name");
		 String sw=sc.next();
		 System.out.println("Enter the sweet "+(i+1)+" price");
		 int sw_price=sc.nextInt();
		 System.out.println("Enter the sweet "+(i+1)+" weight");
		 int sw_weight=sc.nextInt();
		 sw1.add(sw);
		 tmap.put(sw, sw_price);
		 tm.put(sw,sw_weight);
		
		}
	}
	
static void v2()
{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of chocolates");
		 int y1=sc.nextInt();
		 List<String> choc1=new Vector<String>();
		 cmap1=new TreeMap<String,Integer>();
		 cmap2=new TreeMap<String,Integer>();
		 for(int i=0;i<y1;i++)
		 {
			 System.out.println("Enter the chocolate "+(i+1)+" name");
			 String ch=sc.next();
			 System.out.println("Enter the chocolate "+(i+1)+" price");
			 int choc_price=sc.nextInt();
			 System.out.println("Enter the chocolate "+(i+1)+" weight");
			 int choc_weight=sc.nextInt();
			 choc1.add(ch);
			 cmap1.put(ch, choc_price);
			 cmap2.put(ch,choc_weight);
		 }
}
    public static void main(String [] args)
	{
		gift obj=new gift();
		obj.v1();
		obj.v2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type(chocolates or sweets)");
		String h=sc.next();
		System.out.println("Enter the number(1 or 2) where 1:To sort by weight 2:To sort by price");
		int gh=sc.nextInt();
		if(gh==1 && h.equals("chocolates"))
		{
			for(Map.Entry<String,Integer> ee:obj.cmap2.entrySet())
			{
				System.out.println("Chocoalte name: "+ee.getKey()+" Chocolate Weight: "+ee.getValue());
			}
		}
		if(gh==2 && h.equals("chocolates"))
		{
			for(Map.Entry<String,Integer> ee:obj.cmap1.entrySet())
			{
				System.out.println("Chocolate name: "+ee.getKey()+" Choacolate Price: "+ee.getValue());
			}
		}
		if(gh==1 && h.equals("sweets"))
		{
			for(Map.Entry<String,Integer> ee:obj.tm.entrySet())
			{
				System.out.println("Sweet name: "+ee.getKey()+" Sweet Weight: "+ee.getValue());
			}
		}
		if(gh==2 && h.equals("sweets"))
		{
			for(Map.Entry<String,Integer> ee:obj.tmap.entrySet())
			{
				System.out.println("Sweet name: "+ee.getKey()+" Sweet Priec: "+ee.getValue());
			}
		}
		int totalweight=0;
		for(Map.Entry<String,Integer> ee1:obj.tm.entrySet())
		{
			totalweight+=ee1.getValue();
		}
		for(Map.Entry<String,Integer> ee2:obj.cmap2.entrySet())
		{
			totalweight+=ee2.getValue();
		}
		System.out.println("Weight of the giftbox: "+totalweight);
	}

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


class UserSolution
{
	
	ArrayList[] Sum;
	ArrayList[] Buy;
	ArrayList[] Sell;
	
	
	public void init()
	{
		
		
		PriorityQueue<Seller> s1= new PriorityQueue<>(); 
		PriorityQueue<Seller> s2= new PriorityQueue<>(); 
		PriorityQueue<Seller> s3= new PriorityQueue<>(); 
		PriorityQueue<Seller> s4= new PriorityQueue<>(); 
		PriorityQueue<Seller> s5= new PriorityQueue<>(); 
		
		PriorityQueue<Buyer> b1= new PriorityQueue<>(); 
		PriorityQueue<Buyer> b2= new PriorityQueue<>(); 
		PriorityQueue<Buyer> b3= new PriorityQueue<>(); 
		PriorityQueue<Buyer> b4= new PriorityQueue<>(); 
		PriorityQueue<Buyer> b5= new PriorityQueue<>(); 
		
		
		
		
		this.Sum= new ArrayList[5];
		for(int i=0;i<5;i++) {
			Sum[i]=new ArrayList<Integer>();
		}
		this.Buy= new ArrayList[5];
		for(int i=0;i<5;i++) {
			Buy[i]=new ArrayList<Buyer>();
		}
		this.Sell= new ArrayList[5];
		for(int i=0;i<5;i++) {
			Sell[i]=new ArrayList<Seller>();
		};
	}
	public int buy(int mNumber, int mStock, int mQuantity, int mPrice)
	{
		
		Buyer tmp = new Buyer(mNumber, mQuantity, mPrice);
		Buy[mStock-1].add(tmp);
		
		if (Sell[mStock-1].size()==0) {
			return mQuantity;
		}else {
			System.out.println("만약에 sell "+(mStock-1)+"이 존재할때");
			System.out.println(Sell[mStock-1].toString());
			for (int i=0;i<Sell[mStock-1].size();i++) {
				Seller tmp1 = (Seller) Sell[mStock-1].get(i);
//				tmp1.mPrice <mPrice
				System.out.println(Sell[mStock-1].get(i));
				
			}
			
		}
//		buy[mStock-1].sort(Comparator.naturalOrder());
//		System.out.println(mStock+"길이"+sell[mStock-1].size());
//			
//		System.out.println(buy.toString());
		return 0;
	}
	
	public int sell(int mNumber, int mStock, int mQuantity, int mPrice)
	{
		Seller tmp = new Seller(mNumber, mQuantity, mPrice);
		Sell[mStock-1].add(tmp);

//		Sell[mStock-1].sort(Comparator.naturalOrder());
		
//		System.out.println(mStock+"늘어난 길이"+Sell[mStock-1].size());
		return 0;
	}

	public void cancel(int mNumber)
	{
	}
	
	public int bestProfit(int mStock)
	{
//		Sell[0].sort(Comparator.naturalOrder());
//		Buy[0].sort(Comparator.naturalOrder());
//		System.out.println(Buy[0]);
		return 0;
	}
	
}
class Seller implements Comparable<Seller>{
	int mNumber;
	int mQuantity;
	int mPrice;
	public Seller(int mNumber, int mQuantity,int mPrice) {
		this.mNumber=  mNumber;
		this.mQuantity= mQuantity;
		this.mPrice= mPrice;

	}
	@Override
	public String toString() {
		return "["+mNumber +","+mQuantity+","+mPrice+"]";
	}
	@Override
	public int compareTo(Seller o) {
		if(this.mPrice >o.mPrice) {
			return 1;
		}else if(o.mPrice== this.mPrice) {
			if (o.mNumber<this.mNumber) {
				return 1;
			}
		}
		// TODO Auto-generated method stub
		return -1;
	}
}

class Buyer implements Comparable<Buyer>{
	int mNumber;
	int mQuantity;
	int mPrice;
	public Buyer(int mNumber, int mQuantity,int mPrice) {
		this.mNumber=  mNumber;
		this.mQuantity= mQuantity;
		this.mPrice= mPrice;

	}
	@Override
	public String toString() {
		return "["+mNumber +","+mQuantity+","+mPrice+"]";
	}
	@Override
	public int compareTo(Buyer o) {
		if(this.mPrice <o.mPrice) {
			return 1;
		}else if(o.mPrice== this.mPrice) {
			if (o.mNumber<this.mNumber) {
				return 1;
			}
		}
		// TODO Auto-generated method stub
		return -1;
	}
}

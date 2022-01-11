import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;


class UserSolution
{
	ArrayList[] sum;
	int number=0;
	List<Buyer> buy=new ArrayList<Buyer>();
	
	public UserSolution() {
		this.sum= new ArrayList[5];
		for(int i=0;i<5;i++) {
			sum[i]=new ArrayList<Integer>();
		}
		
	}
	public void init()
	{
		

	}
	public int buy(int mNumber, int mStock, int mQuantity, int mPrice)
	{
		PriorityQueue<Buyer> pq = new PriorityQueue<>();
		Buyer tmp = new Buyer(mNumber, mStock, mQuantity, mPrice);
		buy.add(tmp);
		System.out.println(buy.toString());
		return 0;
	}
	
	public int sell(int mNumber, int mStock, int mQuantity, int mPrice)
	{
		return 0;
	}

	public void cancel(int mNumber)
	{
	}
	
	public int bestProfit(int mStock)
	{
		return 0;
	}
}

class Buyer{
	int mNumber;
	int mStock;
	int mQuantity;
	int mPrice;
	public Buyer(int mNumber,int mStock, int mQuantity,int mPrice) {
		this.mNumber=  mNumber;
		this.mStock = mStock;
		this.mQuantity= mQuantity;
		this.mPrice= mPrice;

	}
	@Override
	public String toString() {
		return "["+mNumber +","+ mStock+","+mQuantity+","+mPrice+"]";
	}
}
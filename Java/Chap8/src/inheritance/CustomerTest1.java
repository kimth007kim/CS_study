package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		
		VIPCustomer customerKim =new  VIPCustomer(10101,"kim",1);
//		Customer customerKim = new VIPCustomer(10101, "Kim");
		
		customerKim.bonusPoint=100;
	
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
		
	
	}

}

package Day11;

public class Mobile {
  String modlnm;
  double pr;
  Mobile(String modlnm,double pr)
  {
	  this.modlnm=modlnm;
	  this.pr=pr;
	  
  }
  void displayInfo()
  {
	  System.out.println("Model name:-"+modlnm);
	  System.out.println("Price:-"+pr);
	  
  }
	public static void main(String[] args) {
		Mobile m= new Mobile("iphone",100000);
		m.displayInfo();
		Mobile m1= new Mobile("Samsung Galaxy",75000);
		m1.displayInfo();

	}

}

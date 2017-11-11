

public class Tax {
	
	  double grossIncome;
	  String state;// class member variables    String state;
	  int dependents;    
	  static int customerCounter;    
	  // Constructor    
	  Tax (double gi, String st, int depen){       
		  grossIncome = gi;
		  state = st;       
		  dependents=depen;       
		  customerCounter++;// member variable initialization 
		  System.out.println("Preparing the tax data for customer #" + customerCounter);
				  
	  }
	  public double calcTax() {
		  double stateTax=0;
		  if(grossIncome<30000) {
			  stateTax=grossIncome*0.05;
		  }
		  else {
			  stateTax = grossIncome * 0.06;
		  }
		  return stateTax;
	  }
	

}

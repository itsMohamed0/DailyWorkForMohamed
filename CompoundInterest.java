package testingstuff;

public class CompoundInterest { //class start

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
double p=1200,t=2,c; //setting the three variable to the code where p= principal amount , r= rate, t= time span, and c as the compound interest.
double r=5.4; 
c = p*(Math.pow(1 + r/100, t)); //to find c, we need to apply the compound interest formula. Hence, c=p(1+r)/(100)^t.
								//used the function math.pow to set t as the power value
System.out.println("The compound interest where the principal amount is 1200, the rate is 5.4, and time span is 2 is "); //set the output
System.out.println(c);

	}

}

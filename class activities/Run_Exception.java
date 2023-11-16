package testingstuff;

public class Run_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Exception te = new Test_Exception();
		int [] a = {22,33,44,55,66,77};
		try {
			System.out.println(a[5]);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}


		//try {te.div(24, 0);

	//}catch(Exception e) {
		//System.out.println(e.getMessage());
		//te.div(24, 1);
	//}

	}

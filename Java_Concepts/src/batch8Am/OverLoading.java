package batch8Am;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverLoading a= new OverLoading();
a.cars();a.cars("Jazz");a.cars("TN", 66);
	}
public void cars() {
	System.out.println("Car Details");
}
public void cars(String model) {
	System.out.println("Car Model"+" "+ model);	}

public void cars(String tn, int rtoNo) {
	System.out.println("Rto Details: "+tn+" "+rtoNo);
}
}

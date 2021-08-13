package GirBranchApp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st Version!!");
		System.out.println("2se Version!!");
		//新加的類別
		System.out.println(new Math().add(1,2));
	}

}


class Math{
	int add(int a, int b) {
		return a+b;
	}
}
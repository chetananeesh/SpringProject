package demo;

public class DemoCheck {

	public static void main(String[] args) {
//		String s = "";
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Enter S value");
//		s = scn.nextLine();
//		if(s.equals("1")) {
//			System.out.println("1");
//		}
//		
//		if(s.equals("1")) {
//			System.out.println("2");
//		}
//		
//		if(s.equals("1")) {
//			System.out.println("3");
//		}
		
		CheckDemo cd = new CheckDemo(2);
		
	}

}


class CheckDemo{
	CheckDemo(Object o){
		System.out.println("Coming---2-----");
	}
	CheckDemo(Integer o){
		System.out.println("Coming---1-----");
	}
}
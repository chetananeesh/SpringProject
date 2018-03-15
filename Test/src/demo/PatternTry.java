package demo;

public class PatternTry {

	public static void main(String[] args) {
		
		int n =5;
		
		for(int i=0;i<=n;i++) {
			int count = 0;
			for(int j=0;j<i;j++) {
				System.out.print("1");
				if(j+1 % 2 == 0) {
					System.out.print(" ");
				}else if(count==0 || count==2 && j!=i-1) {
					System.out.print("-");
					count = 0;
				}
				count++;
			}
			System.out.println("");
		}
	}

}

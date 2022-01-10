package test;

public class test {

	public static void main(String[] args) {
		int x =2;
		int y =5;
		
		x = 1;
		x += y;
		
		System.out.println("line1"+ x++);
		x++;
		System.out.println("line2"+ ++x);
		x++;
		
		System.out.println(x);
		System.out.println(-y - y);
		y = -10;
		System.out.println(y/x);
		x=2;
		
		System.out.println(y%x);

	}

}

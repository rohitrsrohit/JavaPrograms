package javaprograms;

public class SwapTwoNumbers {
	public static void main(String[] args)
    {
 
        int a = 333, b = 111;
 
        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
 
        int temp = a;
        a = b;
        b = temp;
 
        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}

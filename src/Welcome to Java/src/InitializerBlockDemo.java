import java.util.*;

public class InitializerBlockDemo {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        
        if (B > 0 && H > 0) {
            flag = true;
        }
        else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

public static void main(String[] args){
		if(flag) {
			int area=B*H;
			System.out.print(area);
		}
	}
}

/*Sample input 1
1
3
Sample output 1
3 */
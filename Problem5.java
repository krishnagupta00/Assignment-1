import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
	double radius= sc.nextInt();
	double height= sc.nextInt();
	double pie =3.14;
	double Volume = pie * radius* radius * height;	
        System.out.print(Volume);

    }
}

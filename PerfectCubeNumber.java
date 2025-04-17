import java.util.Scanner;
public class PerfectCubeNumber{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double numCbrt = Math.cbrt(num);
        if(num==numCbrt*numCbrt*numCbrt){
            System.out.println("It is a perfect cube number");
        } else{
            System.out.println("It is not a perfect cube number");
        }
    }
}

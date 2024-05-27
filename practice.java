import java.util.Scanner;

public class practice {
    public static boolean prime(int y){
        if (y<1){
            System.out.println("negative can not be a prime");
            return false;
        }
        if(y==1){
            System.out.println("any no. other then one please !");
            return false;
        }
        else{
            for(int i=2;i<Math.sqrt(y);i++){
                if(y%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        int u=scanner.nextInt();
        boolean k=prime(u);
        if(k==true){
            System.out.println("prime");
        }
        else{
            System.out.println("no");
        }
    }
}

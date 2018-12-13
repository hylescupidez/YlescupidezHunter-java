import java.util.Scanner;
public class Looper {
    public static void main (String [] args){
        String var1 = " ";
        while(true){
            Scanner user = new Scanner(System.in);
            System.out.print("Enter something: ");
            var1 = user.next();
            if(var1.equals("quit")){
                break;
            }
            String var2 = user.next();
            String var3 = user.next();
            System.out.println(var1);
            System.out.println(var2);
            System.out.println(var3);
        }
        System.out.println("Program ended");
    }

}

import java.util.*;
class Angel{
    int n;
    Scanner s = new Scanner(System.in);
    void read(){
    System.out.println("Enter the limit");
    n = s.nextInt();
    }
    boolean isAngel(int m){
        if(m%100==11){
            return true;
        }
        else{
            return false;
        }
    }
    void display(){
        for(int i = 1; i<=n;i++){
            System.out.println("Enter the number: ");
            int number = s.nextInt();
            boolean check = isAngel(number);
            if(check==true){
                System.out.println(number + " It's a Angel Number");
            }
            else{
                System.out.println(number + " It's not a Angel Number");
            }
        }
    }
    void main(){
        read();
        display();
    }
}
package BusRes;
import javax.swing.*;
import java.util.*;
public class PassCheck {
    private static String password="Dp@123";

    public String getPassword() {
        return password;
    }

    public boolean check_pass(String enteredPass){
        Scanner sc=new Scanner(System.in);
        int n=enteredPass.length();
        if(n<getPassword().length()||n>getPassword().length()){
            System.out.println("Password Wrong!");
            return false;
         }
        for(int i=0;i<n;i++){
             if(enteredPass.charAt(i)!=getPassword().charAt(i)) {
                 System.out.println("Password Wrong!");
                 return false;
             }
        }
        System.out.println("To change the password-Enter 1| else enter 2");
        int opt= sc.nextInt();
        if(opt==1) {
            if (setPassword())
                return false;
        }
        else
         return true;
        return true;
    }
    public boolean setPassword(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the old password: ");
        String old_Pass= sc.nextLine();
        if(old_Pass.equals(password)){
            System.out.println("Enter new password");
            String new_password=sc.nextLine();
            password=new_password;
            System.out.println("Password is changed successfully!!!");
        }
        else{
            System.out.println("Password Wrong! you can't change the password");
            return true;
        }
        return false;
    }
}

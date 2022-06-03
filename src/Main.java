import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str){

        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrom olup olmadığı kontrol edilecek ifadeyi giriniz :");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("Girilen ifade palindrom bir ifadedir");
        }
        else{
            System.out.println("Girilen ifade bir palindrom ifade değildir");
        }

    }
}

import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
public class MyFirstJava {
    public static void main(String[] args){
        //System.out.println(decToHex(98));
        //System.out.println(hexToDec(decToHex(98)));
        People lura = new People("rad",11,"police","shoot");

        lura.printPeople();
    }
    public static String decToHex(int num){
        int temp;

        String hex = "";
        while(num!= 0)
        {
            temp = num % 16;
            if( 0<=temp&&temp<10)
            {
                hex = temp + hex;
            }
            else if(temp <= 15 && temp >=10)
            {
                hex = (char)(temp -10 + 'A') + hex;
            }
            num /= 16;
        }

        return hex;
    }
    public static int hexToDec(String hex){
        int num = 0;
        for(int i = 0; i< hex.length();++i) {
            num += Math.pow(16,hex.length() - i -1) * (hex.charAt(i) - '0');
        }
        return num;

    }
}

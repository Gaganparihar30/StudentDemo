/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pillbox;
import java.util.Scanner;
/**
 *
 * @author gagan
 */
public class Word {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        System.out.println(" Enter a string ");
        String words= input.nextLine();
        char[] c=new char[words.length()];
        for(int i=0;i<words.length();i++){
            c[i]=words.charAt(i);
        }
        for(int i=words.length()-1;i>=0;i--){
            System.out.println(c[i]);
        }
        
        
    }
    
}

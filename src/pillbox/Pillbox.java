/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pillbox;

/**
 *
 * @author gagan
 */
public class Pillbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] pillbox=new char[7];
        pillbox[0]='a';
        pillbox[1]='b';
        pillbox[2]='c';
        pillbox[3]='d';
        pillbox[4]='e';
        pillbox[5]='f';
        pillbox[6]='g';
        
        for(int i=0;i<=pillbox.length-1;i++)
        {
            System.out.println(pillbox[i]);
        }
        System.out.println("Hello");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author USER
 */
public class finaly {
    public static String myMethod()
    {
       try {
         return "angka 10";
         
       }
       finally {
         System.err.println("kosong");
         System.err.println("hasil");
       }
    }
    
    public static void main(String args[])
    {
       System.out.println(myMethod());  
    }
 
}

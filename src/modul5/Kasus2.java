/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author erisa
 */
public class Kasus2 {
    public static void findHurufA(){
        String[] nama = {"a","i","s","y","a","h","a","n","a","y","a","u","m","a","m","i"};
        int count = 6;
        
        for(int i= 0; i<nama.length; i++){
            if( nama[i] == "a")i++;
        }
        System.out.println("Huruf a ada: "+count);
        
            
        }
        public static void main (String[] args){
            findHurufA();
        }

    }
    


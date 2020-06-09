/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptosoft;

import java.util.Scanner;

/**
 *
 * @author pikachu
 */
public class Dekripsi {
    String kunci, cipher, teks="";
    int subkey=0;
    public Dekripsi(){
        Scanner masuk = new Scanner(System.in);
        System.out.println("Input Ciphertext :");
        cipher = masuk.nextLine();
        System.out.println("Input Key :");
        kunci = masuk.nextLine();

    }
    
    public void proses2 () {
        int sor;
        char temp;
        
        //Pembangkitan kunci
        for (int i=0;  i<kunci.length(); i++){
        subkey=subkey^kunci.charAt(i);
        }
        subkey=subkey%1000;
        
        //Proses Dekripsi xor
        for (int i=0; i<cipher.length(); i++){
            sor = cipher.charAt(i)^subkey;
            temp = (char)sor;
            teks = teks+temp;
        }
        System.out.println(teks);
     }   
}

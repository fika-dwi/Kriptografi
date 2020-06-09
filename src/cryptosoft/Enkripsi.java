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
public class Enkripsi {
    String kunci, plain, teks="";
    int subkey=0;
    public Enkripsi(){
        Scanner masuk = new Scanner(System.in);
        System.out.println("Input Plaintext :");
        plain = masuk.nextLine();
        System.out.println("Input Key :");
        kunci = masuk.nextLine();

    }
    
    public void proses1 () {
        int sor;
        char temp;
        
        //Proses pembangkitan kunci
        for (int i=0;  i<kunci.length(); i++){
        subkey=subkey^kunci.charAt(i);
        }
        subkey=subkey%1000;
        
        //Proses Dekripsi xor
        for (int i=0; i<plain.length(); i++){
            sor = plain.charAt(i)^subkey;
            temp = (char)sor;
            teks = teks+temp;
        }
        System.out.println(teks);
     }   
      
}


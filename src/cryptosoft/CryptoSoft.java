/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptosoft;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pikachu
 */
public class CryptoSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int pilih;
        do{
        Scanner masuk = new Scanner(System.in);
        System.out.println("++++++++++   Welcome to Pikachu CryptoSoft  ++++++++++\n\n\n");
        System.out.println("Dear user, in this application you can choose to encrypt or decrypt your message\n\n\n");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.println("3. Exit");
        System.out.println("Please Input Your Choice (1/2/3) =");
        pilih = masuk.nextInt();
        switch(pilih){
            case 1 :
                Enkripsi en = new Enkripsi();
                en.proses1();
            break ;
            
            case 2 :
                Dekripsi dek = new Dekripsi();
                dek.proses2();
            break;
            
            case 3:
                System.out.print("Thank you for using Pikachu CryptoSoft");
                System.exit(0);
            break;
        
        }
                
        
        }while (pilih>0 || pilih<6);
    }
    
}

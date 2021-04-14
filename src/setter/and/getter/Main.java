
package setter.and.getter; //package utama

import java.util.Scanner; //import scanner keyboard
import set.and.get.input; //import data dari class input di package pengisian data

public class Main { //class main

    public static void main(String[] args) { //method main
        
        System.out.println("=== Data Stok ===\n=================\n");
        
        boolean ulang = true; //deklarasi nilai benar boolean
        while (ulang){ //perulangan untuk mengulang program
            Scanner sc = new Scanner (System.in); //object scanner
            input in = new input(); //object class input

            String [] pilihan = {"","Sayur","Buah"}; //array data pulihan
            System.out.println("Pilihan :");
            for (int i = 1; i<=2; i++){ //perulangan menampilkan data pilihan
                System.out.println(i+". "+pilihan[i]);
            }
            System.out.print(">> ");
            int pilih = sc.nextInt();
            System.out.println("\n=================\n.................\n");
            if (1 == pilih){
                //output data pertama
                in.bayam();
                in.kangkung();
                in.kubis();
                in.wortel();
            }else if (pilih == 2){
                //output data kedua
                in.apel();
                in.pisang();
            }
            
            System.out.println("Lihat Ulang Data ?");
            System.out.print("*'Y' untuk lanjut,\n 'T' untuk keluar\n>> ");
            String jawab = sc.next();
            
            if(jawab.equalsIgnoreCase("Y")){ //percabangan pilihan untuk mengulang program
                System.out.println("\n=================\n");
                ulang = true;
            }else{
                ulang = false;
            }
        }
    }
}

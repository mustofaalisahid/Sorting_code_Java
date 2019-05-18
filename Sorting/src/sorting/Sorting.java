    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.util.Scanner;
/**
 *
 * @author TOFA
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Sort baru = new Sort();
        
        int jml;
        System.out.print("Jumlah angka yg akan diinput : "); jml = input.nextInt();
        baru.input(jml);
        
        int menu;
        System.out.println("\n1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Selection Sort");
        System.out.println("4. Insertion Sort");
        do{System.out.print("Pilih menu : "); menu = input.nextInt();}
        while(menu<1 || menu>4);
        
        switch(menu){
            case 1 :
                System.out.println("Bubble Sort");
                baru.bubleSort();
                break;
                
            case 2 :
                System.out.println("Quick Sort");
                baru.quickSort(baru.angka, 0, (baru.jml-1));
                break;
                
            case 3 :
                System.out.println("\n\nSelection Sort");
                baru.selectionSort();
                break;
                
            case 4 :
                System.out.println("\n\nInsertion Sort");
                baru.insertionSort();
                break;
                
        }
    }
}

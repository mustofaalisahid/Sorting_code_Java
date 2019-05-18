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
public class Sort {
    int angka[];
    int jml;
    Scanner masuk = new Scanner(System.in);
    
    int cekUrut(){
        int benar=0;
        int c;
        
         for(c=0; c<jml-1; c++){
            if(angka[c]<angka[c+1]){
                benar++;
            }
        }
        if(benar==(jml-1)){return 1;}
        else {return 0;}
    }
    
    void input(int jml){
        this.jml = jml;
        angka = new int[jml];
        int i;
        for(i = 0; i < jml; i++){
            System.out.print("Angka ke " +(i+1) +" : "); angka[i] = masuk.nextInt();
        }
    }
    void bubleSort(){
        int i, j, k, temp;
        
        for(i = 0; i < jml ; i++){
            for(j = 0; j < jml-i-1; j++){
                if(cekUrut()==1){break;}
                for(k = 0 ; k<jml ; k++){System.out.print(angka[k] +" ");}
                if(angka[j] > angka[j+1]){
                    temp = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = temp;
                }
                System.out.print("\n");
            }
        }
        for(k = 0 ; k<jml ; k++){System.out.print(angka[k] +" ");}
    }
    
    int partisiQuick(int arr[], int low, int hight){
        int pivot = arr[hight];
        int i = low-1;
        int j, temp;
        for(j = low; j < hight ; j++){
            if(arr[j] <= pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[hight];
        arr[hight] = temp;
        
        return i+1;
    }
    
    void quickSort(int arr[], int low, int hight){
        int partisi, k;
        
        for(k = 0 ; k<jml ; k++){System.out.print(angka[k] +" ");}
            System.out.println("");
        if(cekUrut() == 1){}
        else if(low < hight){
            partisi = partisiQuick(angka, low, hight);
            quickSort(angka, low, partisi-1);
            quickSort(angka, partisi+1, hight);
            
        }
    }
    
    void selectionSort(){
        int i, j, k, min, temp;
         for(k = 0 ; k<jml ; k++){System.out.print(angka[k] +" ");}
         System.out.println("");
        
        for(i=0; i<jml; i++){
            min = i;
            for(j=i+1; j<jml; j++){
                if(angka[j] < angka[min]){min = j;}
               }
            temp = angka[i];
            angka[i] = angka[min];
            angka[min] = temp;
            if(cekUrut()==1){break;}
            for(k = 0 ; k<jml ; k++){System.out.print(angka[k] +" ");}
            System.out.println("");
        }
        for(k = 0 ; k<jml ; k++){System.out.print(angka[k] +" ");}
    }
    
    void insertionSort(){
        int i, j, k, l;
        for(l = 0 ; l<jml ; l++){System.out.print(angka[l] +" ");}
        System.out.println("");
        
        for(i = 1; i < jml; i++){
            k = angka[i];
            j = i-1;
            if(cekUrut()==1){break;}
            while(j >= 0 && angka[j] > k){
                angka[j+1] = angka[j];
                j = j-1;
            }
            angka[j+1] = k;
            for(l = 0 ; l<jml ; l++){System.out.print(angka[l] +" ");}
            System.out.println("");
        }
    }
}

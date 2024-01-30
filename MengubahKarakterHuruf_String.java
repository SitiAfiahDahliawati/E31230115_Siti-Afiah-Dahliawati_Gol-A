/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan14;

/**
 *
 * @author Afiah
 */
public class MengubahKarakterHuruf_String {
    public static void main (String[] args){
        String str = "HaRi INI MAkan aPa?";
        
        //mengubah kata diatas dengan huruf kecil
        String lowerstr = str.toLowerCase();
        //mrngubah kata diatas dengan huruf besar
        String upperstr = str.toUpperCase();
        
        //Menampilkan dua String untuk perbandingan
        System.out.println("String awal " +str);
        System.out.println("Sting dalam huruf kecil " +lowerstr);
        
         //Menampilkan dua String untuk perbandingan
         System.out.println("String awal " +str);
         System.out.println("String dalam huruf besar "+upperstr);
    }
}

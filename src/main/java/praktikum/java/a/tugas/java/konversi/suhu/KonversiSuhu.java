/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.java.a.tugas.java.konversi.suhu;


/**
 *
 * @author Raihan
 */
public class KonversiSuhu {
    
    public String getSuhu(){
        String konversi = "";
        
        double celcius = 55.4;
        double fahrenheit = 150.7;
        double kelvin = 200;
        
        double suhu;
        
        String pilih = "c";
        
        if(pilih=="c"){
            suhu = fahrenheit-32*5/9;
            konversi = "suhu celcius : " + suhu;
        }else if(pilih =="f"){
            suhu = 9/5*celcius + 32;
            konversi = "suhu fahrenheit : " + suhu;
        }else {
            konversi = "tidak ditemukan";
        }
        
        return konversi;
        
    }
}

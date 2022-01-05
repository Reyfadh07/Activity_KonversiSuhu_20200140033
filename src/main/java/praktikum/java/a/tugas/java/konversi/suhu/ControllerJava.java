/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.java.a.tugas.java.konversi.suhu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Raihan
 */

@Controller
@ResponseBody
public class ControllerJava {
    
    KonversiSuhu ks = new KonversiSuhu();
    
    @RequestMapping("/suhu")
    public String suhu(){
        String hasil = ks.getSuhu();
        
        return hasil;
    }
}

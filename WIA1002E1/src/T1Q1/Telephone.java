/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1Q1;

/**
 *
 * @author User
 */
public class Telephone {
    String areaCode;
    String number;
    static int numberOfTelephoneObject = 0;
    
    public Telephone(String a, String n){
        areaCode = a;
        number = n;
        numberOfTelephoneObject += 1;
    }
    
    public String getAreaCode(){
        return areaCode;
    }
    
    public void setAreaCode(String a){
        areaCode = a;
    }
    
    public String getNumber(){
        return number;
    }
    
    public void setNumber(String n){
        number = n;
    }
    
    public String makeFullNumber(){
        return areaCode + "-" + number;
    }
}

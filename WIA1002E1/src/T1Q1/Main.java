/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T1Q1;

/**
 *
 * @author User
 */
public class Main {
public static void main(String[] args) {
        Telephone[] tele = {new Telephone("03", "79676300"),
                            new Telephone("03", "79676301"),
                            new Telephone("03", "79676302"),
                            new Telephone("03", "79676303"),
                            new Telephone("03", "79676304")};
        for(int i=0; i<tele.length; i++){
            System.out.println(tele[i].makeFullNumber());
        }
    }
    
}

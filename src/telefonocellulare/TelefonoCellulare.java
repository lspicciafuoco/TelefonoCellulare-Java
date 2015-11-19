/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonocellulare;

/**
 *
 * @author Alessio
 */
public class TelefonoCellulare {

    public static void main(String[] args) {
    
        TelefonoCellulare_1 mio = new TelefonoCellulare_1();
        TelefonoCellulare_1 altro = new TelefonoCellulare_1();
        
        mio.inviaSms(altro, "Ciao a tutti!");
        System.out.println("Mio messaggio: "+ altro.mostraSms());
        
        
    }
    
}

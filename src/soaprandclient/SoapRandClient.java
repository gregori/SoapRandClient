/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaprandclient;

import br.org.catolicasc.programacaovi.soaprandservice.RandService;
import br.org.catolicasc.programacaovi.soaprandservice.RandService_Service;

/**
 *
 * @author rodrigo
 */
public class SoapRandClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RandService_Service r = new RandService_Service();
        RandService service = r.getRandServicePort();
        System.out.println(service.next1());
        System.out.println(service.nextN(4).toString());
    }
    
}

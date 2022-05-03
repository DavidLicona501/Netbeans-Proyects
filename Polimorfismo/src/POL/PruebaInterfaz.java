/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POL;

/**
 *
 * @author invitado
 */
public class PruebaInterfaz {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        PorPagar[] objetosPorPagar = new PorPagar[4];
        objetosPorPagar[0]= new Factura("0123","Silla",2,375.00);
        objetosPorPagar[1]= new Factura("1234","Escritorio",3,79.55);
        
        objetosPorPagar[2]= new EmpleadoAsalariado("Luis","Escobar","1111",800.00);
        objetosPorPagar[3]= new EmpleadoAsalariado("Luisa","Reyes","2222",1800.00);
        
        System.out.println("Facturas y Empleados en forma polimorficas: \n");
        
        for(PorPagar porPagarActual:objetosPorPagar){
        System.out.printf("&s \n%s: $%,.2f\n\n",porPagarActual.toString(),"Pago vencido",porPagarActual.obtenerMontoPago());
    }
        
    }
    
}

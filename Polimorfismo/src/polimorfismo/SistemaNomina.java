/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import POL.*;



/**
 *
 * @author Juana García
 */
public class SistemaNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EmpleadoAsalariado Empleadoasalariado = new EmpleadoAsalariado("Daira","Rodriguez","111",800.00);
         EmpleadoBaseMasComision Empleadobasemascomision = new EmpleadoBaseMasComision("David","Licona","222",5000.00,0.4,800.00);
         EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("David","Licona","222",5000.00,0.6);
         EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Gustavo","Salinas","333",16.75,40);
         
         System.out.println("Se procesan empleados por separado");
         System.out.printf("%s\n%s: $s,.2f\n\n",Empleadoasalariado,"Ingresos",Empleadoasalariado.ingresos());
         System.out.printf("%s\n%s: $s,.2f\n\n",Empleadobasemascomision,"Ingresos",Empleadobasemascomision.ingresos());
         System.out.printf("%s\n%s: $s,.2f\n\n",Empleadobasemascomision,"Ingresos",Empleadobasemascomision.ingresos());
       }
    }
    


/*
 
 */
package POL;

/**
 *
 * @author invitado
 */
public class Factura implements PorPagar {
  private String numeroPieza;
  private String descripcionesPieza;
  private int cantidad;
  private double precioPorArticulo;
 
  //Se crea un constructor 
  public Factura(String pieza, String descripcion, int cuenta, double precio){
      numeroPieza=pieza;
      descripcionesPieza=descripcion;
      
      // se crean los metodos 
      establecerCantidad(cuenta);
      establecerPrecioPorArticulo(precio);
      
  }
  // se desarrollan metodos get/set para el resto de las variables 
  public void establecerNumeroPieza(String pieza){
      numeroPieza=pieza;
  }
  public String obtenerNumeroPieza(){
      return numeroPieza;
  }
  public void establecerDescripcionPieza(String descripcion){
      descripcionesPieza=descripcion;
  }
  public String obtenerDescripcionPieza(){
      return descripcionesPieza;
  }
  public void establecerCantidad(int cuenta){
      if(cuenta>=0)
          cantidad=cuenta;
      else
          throw new IllegalArgumentException("La cantidad debe ser mayor o igual a cero");
  }
  public int obtenerCantidad(){
      return cantidad;
  }
  public void establecerPrecioPorArticulo(double precio){
      if(precio>=0.00)
            precioPorArticulo=precio;
      else
          throw new IllegalArgumentException("El precio por articulo debe ser mayor o igual a cero");
  }
  public double obtenerPrecioPorArticulo(){
      return precioPorArticulo;
  }
  @Override
  public String toString(){
   return String.format("&s:\n&s:%s(%S)\n%s:  %d \n%s: $%,.2f","factura","numero de pieza",obtenerNumeroPieza(),obtenerDescripcionPieza(),"Cantidad",obtenerCantidad(),"Precio por articulo",obtenerPrecioPorArticulo());   
  }
  @Override
  public double obtenerMontoPago(){
      // Se calcula el costo total
      return obtenerCantidad()*obtenerPrecioPorArticulo();
      
  }
}

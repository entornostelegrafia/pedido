/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author ismael
 */
public class Pedido {
    
    //private Producto p1,p2,p3;
    
    protected Producto p1;
    protected Producto p2;
    protected Producto p3;
    
     
    public Pedido(){
      p1=new  Producto();      
      p2=new  Producto();
      p3=new  Producto();
      
      
    }
    public void pedirProducto(int idProducto){
       
       if (idProducto<1||idProducto>3){
           System.out.println("error númeor de producto no válido");
       }
        if (idProducto==1){
          p1.pedirNombre();        
          p1.pedirPrecio();  
        }
        if (idProducto==2){
          p2.pedirNombre();        
          p2.pedirPrecio();  
        }
        if (idProducto==3){
          p3.pedirNombre();        
          p3.pedirPrecio();  
        }
      }
    public double total(){
            return p1.getprecio()+p2.getprecio()+p3.getprecio();
        }
    public void mostrarPedido(){
        p1.resumen();
        p2.resumen();
        p3.resumen();
        System.out.println("PRECIO TOTAL PEDIDO: "+ total());
         
        
        }
    
    
     public static void main(String[] args) {
         
         
         Pedido ped=new Pedido();
         
         for(int i=1;i<=3;i++){
            System.out.println("datos producto: "+i);
             ped.pedirProducto(i);
         
         /*
         System.out.println("datos producto: 1 ");
         ped.pedirProducto(1);
         
         System.out.println("datos producto: 2");
         ped.pedirProducto(2);
         
         System.out.println("datos producto: 3");
         ped.pedirProducto(3);
*/
         
         System.out.println("Son iguales?: "+ ped.p1.iguales(ped.p3));
         
         ped.mostrarPedido();
     }   
    }
}

    
    


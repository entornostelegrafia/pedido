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
public class MainPedido {
    public static void main(String[] args) {
         
         
         Pedido ped=new Pedido();
         for(int i=1;i<=4;i++){
            System.out.println("datos producto: "+i);
             ped.pedirProducto(i);
         }
         System.out.println("Son iguales?: "+ ped.p1.iguales(ped.p3));
         
         ped.mostrarPedido();
     } 
}

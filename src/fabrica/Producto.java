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
import java.util.Scanner;
import java.lang.Math;
public class Producto {
    private String nombre;
    private int serie;
    private double precio;
    public Producto(){
        nombre="";
        serie=generar();
        precio=0.0;
        
    }
    public Producto(String nNombre,double nPrecio){
         serie=generar();
        Scanner SC =new Scanner(System.in);     
               
        while (nPrecio<0){
            System.out.println("Introduce un nuevo precio que no  negativo");
            nPrecio=SC.nextDouble();            
            
        }
        precio=nPrecio;
         while (nNombre.equals("")){
            System.out.println("Introduce un nuevo nombre (no en blanco)");
            nNombre=SC.nextLine();
         }
          nombre=nNombre;
         }
    
        private  int generar(){
             
            return (int) (Math.random()*100000.0)+1;
        }
        public String getNombre(){
            return nombre;
        }
        public int getserie(){
            return serie;
        }
        public double getprecio(){
            return precio;
        }
        public void setNombre(String nNombre){
            Scanner SC =new Scanner(System.in);
            while (nNombre.equals("")){
                System.out.println("Introduce un nuevo nombre (no en blanco)");
                nNombre=SC.nextLine();
         }
          nombre=nNombre;
        }
        
        public void setPrecio(double nPrecio){
          Scanner SC =new Scanner(System.in);             
        
        while (nPrecio<0){
            System.out.println("Introduce un nuevo precio que no  negativo");
            nPrecio=SC.nextDouble();            
            
        }
        precio=nPrecio;
        }
        public void pedirNombre() {
          Scanner SC =new Scanner(System.in);
          String nNombre;
          do  {
            System.out.println("Introduce un nuevo nombre (no en blanco)");
            nNombre=SC.nextLine();
         }while (nNombre.equals(""));
           nombre=nNombre;
        }
         public void pedirPrecio() {
          Scanner SC =new Scanner(System.in);
          double nPrecio;
          do  {
            System.out.println("Introduce un nuevo precio (no negativo)");
            nPrecio=SC.nextDouble();
         }while (nPrecio<0);
           precio=nPrecio;
        }
         public void resumen(){
             System.out.println("INFORME PRODUCTO");
             System.out.println("Nombre producto: "+nombre);
             System.out.println("Precio producto: "+precio);
             System.out.println("Serie producto: "+serie);
         }
         public boolean iguales(Producto pargumento){
             
             if (this.nombre.equals(pargumento.nombre) && this.serie==pargumento.serie)
                 return true;
             else
                 return false;
         }
       
         
         public static void main(String[] args) {
                    
             Producto P1=new Producto();
             Producto P2= new Producto("Fontbella",1.25);
             P1.resumen();
             
      
             P2.resumen();
             
            P1.setNombre("Lanjarón");
             System.out.println("Iguales: "+P1.iguales(P2));
          
            
             
             
             
             
	}
    }


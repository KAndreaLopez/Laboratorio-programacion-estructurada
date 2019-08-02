/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        String tecla= null;
        
        Scanner sc= new Scanner(System.in);
        
        do{
        System.out.println("---------------------------------");
        System.out.println("\tMenu de opciones");
        System.out.println("---------------------------------");
        System.out.println("1.Que es Java IDE\n"+"2.Variables-Operadores\n"+"3.Condicionales\n"+"4.Ciclos\n"
                +"5.Arreglos\n"+"6.Procedimientos\n"+"7.Salir del programa\n"+"Opcion a elegir:");
        opcion=sc.nextInt();
        
        
        switch(opcion){
            case 1:
              System.out.println("---------------------------------");
              System.out.println("\t¿Que es Java IDE?");
              System.out.println("---------------------------------");
              System.out.println("Es un entorno de desarrollo integrado​​ o entorno de desarrollo interactivo\n "
                      + "En inglés Integrated Development Environment\n "
                      + "Es una aplicación informática que proporciona servicios" +"\nintegrales para facilitarle al desarrollador o programador el desarrollo de software.");
            
            break;
            
            case 2:
              System.out.println("---------------------------------");
              System.out.println("\tVariables-Operadores");
              System.out.println("---------------------------------");
               double suma,resta,mult;
               int num1,num2;
               Scanner c1= new Scanner(System.in);
               Scanner c2= new Scanner(System.in);
               
               System.out.println("Ingrese un numero:");
               num1=c1.nextInt();
               System.out.println("Ingrese un segundo numero:");
               num2=c2.nextInt();
               
               suma=(num1+num2);
               resta=(num1-num2);
               mult=(num1*num2); 
               
               System.out.println("La suma de los numeros es:"+suma);
               System.out.println("La resta de los numeros es:"+resta);
               System.out.println("La multiplicacion es:"+mult);
               
            break;
            
            case 3:
                System.out.println("---------------------------------");
                System.out.println("\tCondicionales");
                System.out.println("---------------------------------");
                int edad;
                Scanner s= new Scanner(System.in);
                
                System.out.println("Ingrese su edad:");
                edad=s.nextInt();
                
                if(edad>=18){
                    System.out.println("\nTu edad es: "+edad);
                    System.out.println("Así que eres mayor de edad");
                }
                else{
                System.out.println("\nTu edad es: "+edad);
                System.out.println("Así que eres menor de edad");
            }
                
            break;
            
            case 4:
               System.out.println("---------------------------------");
               System.out.println("\tCiclos");
               System.out.println("---------------------------------"); 
               int numero=51,n1,contador=0;               
               System.out.println("Numeros pares del 1 al 100");
     
               for(int i=0; i<numero; i++){
                  n1=(i*2);
                  System.out.println(n1);
               }
               
               System.out.println("\n\nMultiplos del nummero 20 en el rango de 1 a 100");
               
               for(int j=0; j<=100; j++){
                 if(j % 20==0){
                     contador++;
                 }  
               }
               System.out.println(contador);
               
            break;
            
            case 5:
               System.out.println("---------------------------------");
               System.out.println("\tArreglos");
               System.out.println("---------------------------------"); 
                 
               ArrayList<Integer> pares = new ArrayList<>();
               ArrayList<Integer> impares = new ArrayList<>();
               int li, num;
               Scanner c = new Scanner(System.in);
               
               System.out.println("Ingrese cantidad de elementos: ");
               li = c.nextInt();

               for (int i = 1; i <= li; i++) {
                    System.out.println("Ingrese numero " + i);
                    num = c.nextInt();
               if (num % 2 == 0) {
                    pares.add(num);
                } 
               else {
            impares.add(num);
        }
    }
    System.out.println("\nLos numeros pares son: ");
    for(Integer n : pares){ System.out.print("\n"+n); }
    System.out.println("\nLos numeros impares pares son: ");
    for(Integer n : impares){ System.out.print("\n"+n); }
                
            break;
            
            case 6:
               System.out.println("---------------------------------");
               System.out.println("\tProcedimientos");
               System.out.println("---------------------------------");
               
               procedimientos();
            break;
            
        }
        
        System.out.println("\n¿Desea realizar otra accion? S/N:");
        tecla=new Scanner(System.in).nextLine();
      }while(tecla.equals("s")||tecla.equals("S"));
      
       
    }
    
    private static void procedimientos(){
        int a=0;
        String nombre=null;
        
        if(a>0&& !nombre.equals(" ")){
            System.out.println("Hola, Bienvenido"+nombre);
            return;
        }
        System.out.println("Adios, espero vuelvas");
    }
}


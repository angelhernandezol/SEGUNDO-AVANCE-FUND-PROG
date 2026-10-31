/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundo_avance_eva2_fund_prog;
import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class SEGUNDO_AVANCE_EVA2_FUND_PROG {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner capture = new Scanner(System.in); 
         int opcion, caso, horario; 
         boolean regresar, salir = true;
         double horas, total;
         double costo1 = 25, costo2 = 30;
         String[] productos_G = {"  Botella de agua", "  Gomitas", "  Papas Doritos"};
         String[] productos_cafe = {"  Cafe americano", "  Moka", "  Cafe sin azucar"};
         double[] precios_G = new double[productos_G.length];
         double[] precios_cafe = new double[productos_cafe.length];
         
         precios_G = new double [] {20.0, 12.0, 20.0};
         precios_cafe = new double [] {75.0, 52.0, 50.0};
         
        while(salir){
         System.out.println("    ----------MENU----------");
                System.out.println("Ingrese la seccion a la que desea entrar: ");
                    System.out.println("    1. Costo de sesiones");
                    System.out.println("    2. Inventario");
                    System.out.println("    3. Clientes");
                    System.out.println("    4. ADMIND ");
                    System.out.println("    5. Salir ");
                    System.out.println();

         opcion = capture.nextInt();
            
             switch(opcion){
         
                case 1: 
                     
                    regresar = true;  
                    while(regresar){
                        System.out.println("    ----------COSTO DE SESIONES----------");
                            System.out.println("    1. Costo de sesiones");
                            System.out.println("    2. Informacion de precios");
                            System.out.println("    3. Modificar costo de sesiones");
                            System.out.println("    4. Regresar al menu");
                        
                            caso = capture.nextInt();
                        
                            switch(caso){
                                
                                case 1:
                                    System.out.println();
                                        System.out.println("=====================================================");
                                        System.out.println("           COSTO DE SESION - CIBERCAFe");
                                        System.out.println("=====================================================");
                                    
                                        System.out.print("Ingrese horas: ");
                                            horas = capture.nextDouble();
                                        System.out.println("Ingrese horario: ");
                                          System.out.println("  * 6:00 - 20:00 hrs ($25) --> 1 ");
                                          System.out.println("  * 20:00 - 6:00 hrs ($30) --> 2");
                                            horario = capture.nextInt();
                                        
                                        if(horario == 1){
                                            total = horas * costo1;
                                            
                                            System.out.println("Precio por sesion: $" + total);
                                            System.out.println();
                                            
                                        }else if(horario == 2){
                                            total = horas * costo2;
                                            
                                            System.out.println("Precio por sesion: $" + total);
                                            System.out.println();
                                        
                                        }else{
                                            System.out.println("****OPCION INVALIDA****");
                                            System.out.println();
                                            
                                        }
                                 break;
                                    
                                case 2:
                                    System.out.println();
                                        System.out.println("=====================================================");
                                        System.out.println("           INFO DE PRECIOS - CIBERCAFe");
                                        System.out.println("=====================================================");
                                            System.out.println("Costos por sesion: ");
                                                System.out.println("    6:00 - 20:00 hrs - $" + costo1);
                                                System.out.println("    20:00 - 6:00 hrs - $" + costo2);
                                    System.out.println();
                                            
                                 break;
                                    
                                case 3:
                                    System.out.println();
                                        System.out.println("=====================================================");
                                        System.out.println("           MODOFICAR COSOT POR SESION - CIBERCAFe");
                                        System.out.println("=====================================================");
                                            System.out.print("Ingrese nuevo precio (6:00 - 20:00 hrs):");
                                                costo1 = capture.nextDouble();
                                            System.out.print("Ingrese nuevo precio (20:00 - 6:00 hrs):");
                                                costo2 = capture.nextDouble();
                                    System.out.println();
                                 break;
                                    
                                case 4:
                                    System.out.println();
                                    salir = true;
                                    regresar = false;
                                 break;
                                                                     
                                default:
                                 System.out.println("****OPCION INVALIDA****");
                                 System.out.println();
                                 continue;
                            }

                    }
                    
                break; 
                
                case 2:  
                    
                    regresar = true;  
                    while(regresar){
                        System.out.println("    ----------INVENTARIO----------");
                            System.out.println("    1. Productos regristados");
                            System.out.println("    2. Informacion de precios");
                            System.out.println("    3. Modificar productos");
                            System.out.println("    4. Modificar cafe");
                            System.out.println("    5. Salir al menu");
                        
                            caso = capture.nextInt();
                            
                            switch(caso){
                            
                                case 1:
                                    System.out.println();
                                        System.out.println("=====================================================");
                                        System.out.println("        PRODUCTOS Y CAFE REGRISTRADOS - CIBERCAFe");
                                        System.out.println("=====================================================");
                                    
                                    System.out.println("PRODUCTOS GENERALES: ");
                                    for(int i = 0; i < productos_G.length; i++){
                                        System.out.println("No." + i + productos_G[i]); 
                                    }
                                    
                                    System.out.println();
                                    
                                    System.out.println("CAFES REGISTRADOS: ");
                                    for(int i = 0; i < productos_cafe.length; i++){
                                        System.out.println("No." + i + productos_cafe[i]);
                                    }
                                    
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println();
                                        System.out.println("=====================================================");
                                        System.out.println("        PRECIOS REGRISTRADOS - CIBERCAFe");
                                        System.out.println("=====================================================");
                                    
                                    System.out.println("PRECIOS GENERALES: ");
                                    for(int i = 0; i < productos_G.length; i++){
                                        System.out.println(productos_G[i] + " $" + precios_G[i]); 
                                    }
                                    
                                    System.out.println();
                                    
                                    System.out.println("PRECIOS DE CAFE: ");
                                    for(int i = 0; i < productos_cafe.length; i++){
                                        System.out.println(productos_cafe[i]+ " $" + precios_cafe[i]);
                                    }
                                    
                                    System.out.println();
                                    break;
                                case 3:       
                                    System.out.println();
                                        System.out.println("=====================================================");
                                        System.out.println("        MODIFICAR PRODUCTOS - CIBERCAFe");
                                        System.out.println("=====================================================");
                                    
                                    System.out.println("INGRESE SELECCION:");
                                        System.out.println("1. Modifiicar nombre");
                                        System.out.println("2. Precios");
                                    int selec = capture.nextInt();
                                    
                                    if(selec == 1){
                                        
                                      System.out.print("Ingrese el numero del producto general a modificar: ");
                                        int posicion = capture.nextInt();
                                        capture.nextLine();
                                    
                                        if(posicion >= 0 && posicion <= productos_G.length){
                                            System.out.print("Ingrese el nuevo nombre: ");
                                            productos_G[posicion] = "  " + capture.nextLine();
                                            System.out.println("****PRODUCTO MODIFICADO****");
                                            System.out.println();
                                        
                                        }else{
                                            System.out.println("****POSICION INVALIDA****");
                                            System.out.println();
                                        }
                                    
                                    }else if(selec == 2){
                                        System.out.print("Ingrese el numero del producto general a modificar: ");
                                        int posicion = capture.nextInt();
                                        capture.nextLine();
                                        
                                        if(posicion>= 0 && posicion <= precios_G.length){
                                            System.out.print("Ingrese el nuevo precio: ");
                                            precios_G[posicion] = capture.nextDouble();
                                            System.out.println("****PRODUCTO MODIFICADO****");
                                            System.out.println();
                                        
                                        }else{
                                            System.out.println("****POSICION INVALIDA****");
                                            System.out.println();
                                        }
                                    
                                    }
                                    
                                    break;
                                case 4:
                                   System.out.println();
                                        System.out.println("=====================================================");
                                        System.out.println("        MODIFICAR CAFE - CIBERCAFe");
                                        System.out.println("=====================================================");
                                         
                                    System.out.println("INGRESE SELECCION:");
                                        System.out.println("1. Modifiicar nombre");
                                        System.out.println("2. Precios");
                                    selec = capture.nextInt();
                                    
                                     if(selec == 1){
                                        
                                      System.out.print("Ingrese el numero del cafe a modificar: ");
                                        int posicion = capture.nextInt();
                                        capture.nextLine();
                                    
                                        if(posicion >= 0 && posicion <= productos_cafe.length){
                                            System.out.print("Ingrese el nuevo nombre: ");
                                            productos_cafe[posicion] = "  " + capture.nextLine();
                                            System.out.println("****PRODUCTO MODIFICADO****");
                                            System.out.println();
                                        
                                        }else{
                                            System.out.println("****POSICION INVALIDA****");
                                            System.out.println();
                                        }
                                    
                                    }else if(selec == 2){
                                        System.out.print("Ingrese el numero del cafe a modificar: ");
                                        int posicion = capture.nextInt();
                                        capture.nextLine();
                                        
                                        if(posicion>= 0 && posicion <= precios_G.length){
                                            System.out.print("Ingrese el nuevo precio: ");
                                            precios_cafe[posicion] = capture.nextDouble();
                                            System.out.println("****PRODUCTO MODIFICADO****");
                                            System.out.println();
                                        
                                        }else{
                                            System.out.println("****POSICION INVALIDA****");
                                            System.out.println();
                                        }
                                    
                                    }
                                    
                                    break;    
                                case 5:
                                    System.out.println();
                                    salir = true;
                                    regresar = false;
                                    break;
                            
                            }
                    
                    }
                break;
                 
                case 3: 
                    System.out.println("Hola");
                     break;
                 
                case 4: 
                    System.out.println("Hola");
                    break;
                 
                case 5: 
                    System.out.println("...................SALIENDO..................");
                    salir = false;
                    break;
                default:
                    System.out.println("****OPCION INVALIDA****");
                    System.out.println();
                    continue;
                     
        }
         
      }
         

    }
    
}
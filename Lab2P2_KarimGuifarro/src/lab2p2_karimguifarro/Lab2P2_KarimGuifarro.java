package lab2p2_karimguifarro;

import java.util.*;

public class Lab2P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Random r = new Random();
    public static ArrayList<compu> comp=new ArrayList();
    public static void main(String[] args) {
        char k = 'k';
        while (k == 'k') {
            System.out.println("*****MENU*******\n"
                    + "1) Crear\n"
                    + "2) Listar\n"
                    + "3) Modificar\n"
                    + "4) Eliminar\n"
                    + "5) Listar Computadoras Gamer\n"
                    + "6) Listar Computadoras Educativas\n"
                    + "7) Listar Computadoras de poco uso\n"
                    + "8) Salir");
            int op = KaOz.nextInt();
            switch(op){
                case 1:{
                    int cap_discduro, tam_pantalla,teimpo,cap_bat,duracion_bat;
                    String modelo,num_serie="",procedador,Sys_Op;
                    boolean teclado_num;
                    System.out.println("Ingrese el modelo de la computadora:");
                    modelo=KaOz.next();
                    System.out.println("Ingrese el numero de serie de la computadora:");
                    num_serie=KaOz.next();
                    while(comp.contains(num_serie)){
                        System.out.println("El numero de serie ya existe ingrese uno nuevo:");
                        num_serie=KaOz.next();
                    }   
                    
                }
                break;
                case 2:{
                    
                }
                break;
                case 3:{
                    
                }
                break;
                case 4:{
                    
                }
                break;
                case 5:{
                    
                }
                break;
                case 6:{
                    
                }
                break;
                case 7:{
                    
                }
                break;
                case 8:{
                    
                }
                break;
                default:{
                    System.out.println("Ingrese un valor correcto por favor");
                }
            }
        }
    }

}

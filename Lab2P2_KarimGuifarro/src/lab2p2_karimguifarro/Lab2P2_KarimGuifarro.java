package lab2p2_karimguifarro;

import java.util.*;

public class Lab2P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Random r = new Random();
    public static ArrayList<compu> comp = new ArrayList();
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
            switch (op) {
                case 1: {
                    int cap_discduro, tam_pantalla, tiempo, cap_bat, duracion_bat;
                    String modelo, num_serie, procesador = null, Sys_Op = null;
                    boolean teclado_num = false;
                    String uan;
                    int cont = 0;
                    System.out.println("Ingrese el modelo de la computadora:");
                    modelo = KaOz.next();
                    System.out.println("Ingrese el numero de serie de la computadora:");
                    num_serie = KaOz.next();
                    if (cont<comp.size()) {
                      String o=comp.get(cont).toString();
                    while (o.contains(num_serie)) {
                        System.out.println("El numero de serie ya existe");
                        num_serie = KaOz.next();
                        cont++;
                    }}
                    System.out.println("Ingrese la capacidad del disco duro:");
                    cap_discduro = KaOz.nextInt();
                    System.out.println("Ingrese el tamaño de la pantalla:");
                    tam_pantalla = KaOz.nextInt();
                    System.out.println("Contiene teclado numerio? [SI/NO]:");
                    uan = KaOz.next();
                    uan.toUpperCase();
                    while (uan.equals("SI") || uan.equals("NO")) {
                        System.out.println("Contiene teclado numerio?:");
                        uan = KaOz.next();
                        uan.toUpperCase();
                    }
                    if (uan.equals("SI")) {
                        teclado_num = true;
                    } else if (uan.equals("NO")) {
                        teclado_num = false;
                    }
                    System.out.println("Ingrese que tipo de procesador posee:");
                    System.out.println("1) normal o 2) Gamer");
                    int p = KaOz.nextInt();
                    switch (p) {
                        case 1: {
                            procesador = "Normal";
                        }
                        break;
                        case 2: {
                            procesador = "Gamer";
                        }
                        break;
                        default:
                            System.out.println("Ingese el valor correcto");
                    }

                    System.out.println("Ingrese que tipo de software posee:");
                    System.out.println("1) Windows o 2) ChromeOS");
                    p = KaOz.nextInt();
                    switch (p) {
                        case 1: {
                            Sys_Op = "Windows";
                        }
                        break;
                        case 2: {
                            Sys_Op = "ChromeOS";
                        }
                        break;
                        default:
                            System.out.println("Ingrese un valor correcto");
                    }
                    System.out.println("Ingrese el tiempo de ensamblamiento:");
                    tiempo = KaOz.nextInt();
                    System.out.println("Capacidad de la bateria:");
                    cap_bat = KaOz.nextInt();
                    System.out.println("Duracion de la bateria:");
                    duracion_bat = KaOz.nextInt();
                    comp.add(new compu(modelo, num_serie, cap_discduro, tam_pantalla, teclado_num, procesador, Sys_Op, tiempo, cap_bat, duracion_bat));
                }
                break;
                case 2: {
                    list();
                }
                break;
                case 3: {
                    String series = KaOz.next();
                    String o;
                    for (int i = 0; i < comp.size(); i++) {
                        o = comp.get(i).toString();
                        if (o.contains(series)) {
                            int cap_discduro, tam_pantalla, tiempo, cap_bat, duracion_bat;
                            String modelo,procesador = null, Sys_Op = null;
                            boolean teclado_num = false;
                            String uan;
                            int cont = 0;
                            System.out.println("Ingrese el modelo de la computadora:");
                            modelo = KaOz.next();
                            System.out.println("Ingrese la capacidad del disco duro:");
                            cap_discduro = KaOz.nextInt();
                            System.out.println("Ingrese el tamaño de la pantalla:");
                            tam_pantalla = KaOz.nextInt();
                            System.out.println("Contiene teclado numerio? [SI/NO]:");
                            uan = KaOz.next();
                            uan.toUpperCase();
                            while (uan.equals("SI") || uan.equals("NO")) {
                                System.out.println("Contiene teclado numerio?:");
                                uan = KaOz.next();
                                uan.toUpperCase();
                            }
                            if (uan.equals("SI")) {
                                teclado_num = true;
                            } else if (uan.equals("NO")) {
                                teclado_num = false;
                            }
                            System.out.println("Ingrese que tipo de procesador posee:");
                            System.out.println("1) normal o 2) Gamer");
                            int p = KaOz.nextInt();
                            switch (p) {
                                case 1: {
                                    procesador = "Normal";
                                }
                                break;
                                case 2: {
                                    procesador = "Gamer";
                                }
                                break;
                                default:
                                    System.out.println("Ingese el valor correcto");
                            }

                            System.out.println("Ingrese que tipo de software posee:");
                            System.out.println("1) Windows o 2) ChromeOS");
                            p = KaOz.nextInt();
                            switch (p) {
                                case 1: {
                                    Sys_Op = "Windows";
                                }
                                break;
                                case 2: {
                                    Sys_Op = "ChromeOS";
                                }
                                break;
                                default:
                                    System.out.println("Ingrese un valor correcto");
                            }
                            System.out.println("Ingrese el tiempo de ensamblamiento:");
                            tiempo = KaOz.nextInt();
                            System.out.println("Capacidad de la bateria:");
                            cap_bat = KaOz.nextInt();
                            System.out.println("Duracion de la bateria:");
                            duracion_bat = KaOz.nextInt();
                            comp.get(i).setCap_bat(cap_bat);
                            comp.get(i).setCap_discdur(cap_discduro);
                            comp.get(i).setDuracion_bat(duracion_bat);
                            comp.get(i).setModelo(modelo);
                            comp.get(i).setProcesador(procesador);
                            comp.get(i).setSys_Op(Sys_Op);
                            comp.get(i).setTam_pantalla(tam_pantalla);
                            comp.get(i).setTiempo(tiempo);
                            comp.get(i).setTeclado_num(teclado_num);
                            i=comp.size();
                        }else{
                            System.out.println("Este numero de serie no existe");
                        }
                    }
                }
                break;
                case 4: {
                     String series = KaOz.next();
                    String o;
                    for (int i = 0; i < comp.size(); i++) {
                        o = comp.get(i).toString();
                        if (o.contains(series)) {
                            comp.remove(i);
                        }}
                }
                break;
                case 5: {
                    listgamer();
                }
                break;
                case 6: {
                    listeducativa();
                }
                break;
                case 7: {
                    listpocouso();
                }
                break;
                case 8: {
                    k='n';
                }
                break;
                default: {
                    System.out.println("Ingrese un valor correcto por favor");
                }
            }
        }
    }

    public static void list() {
        for (int i = 0; i < comp.size(); i++) {
            System.out.println(comp.get(i));
        }
    }
    public static void listeducativa() {
        String o;
        for (int i = 0; i < comp.size(); i++) {
            o=comp.get(i).toString();
            if (o.contains("300") && o.contains("ChromeOS")&& o.contains("13")) {
             System.out.println(comp.get(i));   
            }
        }
    }
     public static void listpocouso() {
        String o;
        for (int i = 0; i < comp.size(); i++) {
            o=comp.get(i).toString();
            if (o.contains("2") && o.contains("2")&& o.contains("Windows")) {
             System.out.println(comp.get(i));   
            }
        }}
      public static void listgamer() {
        String o;
        for (int i = 0; i < comp.size(); i++) {
            o=comp.get(i).toString();
            if (o.contains("Gamer") && o.contains("17")&& o.contains("false")) {
             System.out.println(comp.get(i));   
            }
        }
      }}

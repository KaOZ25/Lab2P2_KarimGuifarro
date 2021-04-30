/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_karimguifarro;
public class compu {
   private String modelo;
   private String num_serie;
   private int cap_discdur;
   private int tam_pantalla;
   private boolean teclado_num;
   private String procesador;
   private String Sys_Op;
   private int tiempo;
   private int cap_bat;
   private int duracion_bat;

    public compu() {
    }

    public compu(String modelo, String num_serie, int cap_discdur, int tam_pantalla, boolean teclado_num, String procesador, String Sys_Op, int tiempo, int cap_bat, int duracion_bat) {
        this.modelo = modelo;
        this.num_serie = num_serie;
        this.cap_discdur = cap_discdur;
        this.tam_pantalla = tam_pantalla;
        this.teclado_num = teclado_num;
        this.procesador = procesador;
        this.Sys_Op = Sys_Op;
        this.tiempo = tiempo;
        this.cap_bat = cap_bat;
        this.duracion_bat = duracion_bat;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public int getCap_discdur() {
        return cap_discdur;
    }

    public void setCap_discdur(int cap_discdur) {
        this.cap_discdur = cap_discdur;
    }

    public int getTam_pantalla() {
        return tam_pantalla;
    }

    public void setTam_pantalla(int tam_pantalla) {
        this.tam_pantalla = tam_pantalla;
    }

    public boolean isTeclado_num() {
        return teclado_num;
    }

    public void setTeclado_num(boolean teclado_num) {
        this.teclado_num = teclado_num;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSys_Op() {
        return Sys_Op;
    }

    public void setSys_Op(String Sys_Op) {
        this.Sys_Op = Sys_Op;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCap_bat() {
        return cap_bat;
    }

    public void setCap_bat(int cap_bat) {
        this.cap_bat = cap_bat;
    }

    public int getDuracion_bat() {
        return duracion_bat;
    }

    public void setDuracion_bat(int duracion_bat) {
        this.duracion_bat = duracion_bat;
    }

    @Override
    public String toString() {
        return "compu{" + "modelo=" + modelo + ", num_serie=" + num_serie + ", cap_discdur=" + cap_discdur +"GB" + ", tam_pantalla=" + tam_pantalla + ", teclado_num=" + teclado_num + ", procesador=" + procesador + ", Sys_Op=" + Sys_Op + ", tiempo=" + tiempo + ", cap_bat=" + cap_bat + ", duracion_bat=" + duracion_bat + '}';
    }
   
}

package com.example.parcial_2do_corte;

import java.io.Serializable;

public class Producto implements Serializable {

    public int cant_prod_1, cant_prod_2, cant_prod_3;
    public double precio_prod_1, precio_prod_2, precio_prod_3;


    public Producto(int cant_prod_1, int cant_prod_2, int cant_prod_3) {
        this.cant_prod_1 = cant_prod_1;
        this.cant_prod_2 = cant_prod_2;
        this.cant_prod_3 = cant_prod_3;
        this.precio_prod_1 = 150000;
        this.precio_prod_2 = 1500000;
        this.precio_prod_3 = 850000;

    }
    public Producto(){

    }
    public int getCantprod_1() {return cant_prod_1;}
    public void setCantprod_1(int cant_prod_1) {this.cant_prod_1 = cant_prod_1;}

    public int getCantprod_2() {return cant_prod_2;}
    public void setCantprod_2(int cant_prod_2) {this.cant_prod_2 = cant_prod_2;}

    public int getCantprod_3() {return cant_prod_3;}
    public void setCantprod_3(int cant_prod_3) {this.cant_prod_3 = cant_prod_3;}

    public double getPrecprod_1() {return precio_prod_1;}
    public void setPrecprod_1( double precio_prod_1) {this.precio_prod_1 = precio_prod_1;}

    public double getPrecprod_2() {return precio_prod_2;}
    public void setPrecprod_2( double precio_prod_2) {this.precio_prod_2 = precio_prod_2;}

    public double getPrecprod_3() {return precio_prod_3;}
    public void setPrecprod_3( double precio_prod_3) {this.precio_prod_3 = precio_prod_3;}

}





package com.example.belenlc.mascotass4.POJO;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Contacto extends AppCompatActivity {


    private String nombre;
    private String raza;
    private int foto;
    private String numFav;


    public Contacto(String nombre, String raza, int foto, String numFav) {
        this.nombre = nombre;
        this.raza = raza;
        this.foto = foto;
        this.numFav = numFav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getFoto() { return foto; }

    public void setFoto(int foto) { this.foto = foto; }


    public String getNumFav() { return numFav; }

    public void setNumFav(String numFav) {  this.numFav = numFav; }


}


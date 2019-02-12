package com.example.belenlc.mascotass4.FRAGMENTS;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.belenlc.mascotass4.ADAPTER.MascotaAdapter;
import com.example.belenlc.mascotass4.POJO.Contacto;
import com.example.belenlc.mascotass4.R;

import java.util.ArrayList;

public class HomeRV_fragment extends Fragment{

    private ArrayList<Contacto> mascotas;
    private RecyclerView rvMascotas;
    private ArrayList<Contacto> mascota;


    //para inflar nuestro fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v1 = inflater.inflate(R.layout.fragment_home_rv, container, false);         //equivalente a setContentView
       rvMascotas = (RecyclerView)v1.findViewById(R.id.RVmascotasMain);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);

        inicializarDatos();
        inicializarAdaptador();

        return v1;
    }

    public void inicializarDatos(){

        mascota = new ArrayList<>();

        mascota.add(new Contacto("Pipo", "Corgi",R.drawable.corgi,"0"));
        mascota.add(new Contacto("Kala", "Coker",R.drawable.perro,"0"));
        mascota.add(new Contacto("Bella", "Rodvailler",R.drawable.corgi,"0"));
        mascota.add(new Contacto("Prim", "San Bernardo",R.drawable.yorkshire_terrier,"0"));
        mascota.add(new Contacto("Beba", "Labrador",R.drawable.corgi,"0"));
        mascota.add(new Contacto("Nala", "YorkShire",R.drawable.yorkshire_terrier,"0"));
        mascota.add(new Contacto("Yuri", "hachicko",R.drawable.hachiko,"0"));
        mascota.add(new Contacto("Lexter", "carlino",R.drawable.perro,"0"));
        mascota.add(new Contacto("Bobo", "caniche",R.drawable.hachiko,"0"));

    }

    public MascotaAdapter adapter;

    private void inicializarAdaptador(){
        adapter = new MascotaAdapter(mascotas,getActivity());
        rvMascotas.setAdapter(adapter);

    }


}

package com.example.belenlc.mascotass4.ADAPTER;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.belenlc.mascotass4.POJO.Contacto;
import com.example.belenlc.mascotass4.R;

import java.util.ArrayList;

//va a tener una clase destro statica ViewHolder para que nos ayude a crear a nuestros objetos y asociarlos

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder>{


        ArrayList<Contacto> mascotas;
        Activity activity;

        public MascotaAdapter(ArrayList<Contacto> mascotas, Activity activity){
            this.mascotas = mascotas;
            this.activity = activity;


        }

        public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

            //asociamos nuestro layout a nuestro recyclerview. Indicamos el layout que reciclara el recyclerView
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_principal, viewGroup,false);
            return new MascotaViewHolder(v);
        }


        //asocia los valores de cada uno de los elementos de nuestra lista con cada view.
        public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int i) {

            final Contacto mascota = mascotas.get(i);
            mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
            mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
            mascotaViewHolder.tvRazaCV.setText(mascota.getRaza());
            mascotaViewHolder.contadorFavCV.setTag(mascota.getNumFav());



            mascotaViewHolder.botonFavCV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(activity, "Like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
                    mascotaViewHolder.contadorFavCV.setText(mascota.getNumFav()+1);
                    Toast.makeText(activity, mascota.getNumFav(), Toast.LENGTH_SHORT).show();

                }
            });

        /*
        mascotaViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, Detalle_mascota.class);
                intent.putExtra("nombre",mascota.getNombre());
                intent.putExtra("raza", mascota.getRaza());
                intent.putExtra("numFav", mascota.getNumFav());
                activity.startActivity(intent);
            }

        });
        */

            //mascotaViewHolder.botonFavCV.setOnClickListener(new View.OnClickListener(){

            //  int contador=0;

            //  @Override
            //public void onClick(View v) {

            //  contador= contador +1;
            //mascotaViewHolder.contadorFavCV.setText(contador);
            //}


            //});



        }

        //cantidad de elementos que contiene mi lista
        public int getItemCount() {

            return mascotas.size();
        }

        //declaramos todos los view de cardViewMascota
        public class MascotaViewHolder extends RecyclerView.ViewHolder{

            private ImageView imgFoto;
            private TextView tvNombreCV;
            private TextView tvRazaCV;
            private TextView contadorFavCV;
            private ImageButton botonFavCV;



            //constructor
            public MascotaViewHolder(View itemView) {
                super(itemView);
                imgFoto     = (ImageView) itemView.findViewById(R.id.fotoCV);
                tvNombreCV  = (TextView) itemView.findViewById(R.id.nombreCV);
                //tvRazaCV    = (TextView) itemView.findViewById(R.id.TVrazaCV);
                contadorFavCV = (TextView) itemView.findViewById(R.id.numLikesCV);
                botonFavCV    = (ImageButton) itemView.findViewById(R.id.BotonLikeCV);


            }
        }

    }



package com.example.belenlc.mascotass4;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.belenlc.mascotass4.ADAPTER.PageAdapter;
import com.example.belenlc.mascotass4.FRAGMENTS.HomeRV_fragment;
import com.example.belenlc.mascotass4.FRAGMENTS.PerfilFragment;
import com.example.belenlc.mascotass4.MENU.AcercaDe;
import com.example.belenlc.mascotass4.POJO.Contacto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contacto> mascotas;
    private RecyclerView rvMascotas;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FRANMENTS

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPagerHome);

        if(toolbar!=null){
            setSupportActionBar(toolbar);
        }

        setUpViewPager();

    }

    //     MENU DE OPCIONES

    // para inflar la clase menu.xml Es decir, para mostrarlo en nuestra actividad
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    // para diferenciar que opción clickeamos y a donde queremos que nos lleve
    // recibe el item del menu seleccionado
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.ActionEstrella:
                Intent intentAction = new Intent(this, Top5.class);
                startActivity(intentAction);

            case R.id.ContactoMenu:
                Intent intentMenuOpc1 = new Intent(this, Contacto.class);
                startActivity(intentMenuOpc1);
                break;

            case R.id.AcercaDeMenu:
                Intent intentMenuOpc2 = new Intent(this, AcercaDe.class);
                startActivity(intentMenuOpc2);
                break;

        }

        return super.onContextItemSelected(item);
    }

    //FRAGMENTS

    private ArrayList<Fragment> agregarFragments(){

        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new HomeRV_fragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_fragment);
        tabLayout.getTabAt(1).setIcon(R.drawable.dog_fragment);

    }



}

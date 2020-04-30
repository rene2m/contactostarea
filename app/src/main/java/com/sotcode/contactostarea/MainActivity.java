package com.sotcode.contactostarea;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    private RecyclerView listacontactos;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miactionbar= (Toolbar) findViewById(R.id.miacctionbar);
        setSupportActionBar(miactionbar);

          listacontactos=(RecyclerView) findViewById(R.id.reciclerview_contactos);
        LinearLayoutManager llm = new LinearLayoutManager(this); //esto lo que hace que se muestre como una linea o lista podria mostrarse como un grid es es solo configurarlo
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listacontactos.setLayoutManager(llm);
        inicializarListaContactos();
        inicilizarAdaptador();
    }
    public void inicilizarAdaptador(){
        ContactoAdapter adapter =new ContactoAdapter(contactos);
        listacontactos.setAdapter(adapter);
    }
    public void inicializarListaContactos(){
        contactos=new ArrayList<Contacto>();
        contactos.add(new Contacto(R.drawable.pruebalobo," Lobo "));
        contactos.add(new Contacto(R.drawable.pruebajaguar,"jaguar"));
        contactos.add(new Contacto(R.drawable.pruebapanda,"panda"));
        contactos.add(new Contacto(R.drawable.pruevaleon,"leon"));
        contactos.add(new Contacto(R.drawable.pruebacerdito,"cerdito"));
    }
}

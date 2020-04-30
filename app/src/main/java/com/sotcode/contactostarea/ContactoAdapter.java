package com.sotcode.contactostarea;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactoAdapter  extends RecyclerView.Adapter<ContactoAdapter.ContactoViewHolder>{
    @NonNull
    ArrayList<Contacto> contactos;
    public ContactoAdapter(ArrayList<Contacto> contactos){
        this.contactos=contactos;
    }
    //iniciamos un coleccion de contactos y lo llamamos contactos
    @Override  //infla el layout y lo pasara al viewholder para que el obtenga los views
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto,parent,false);

        return  new ContactoViewHolder(v);
    }

    @Override  //asocia cada elemento de la lista con cada view
    public void onBindViewHolder(@NonNull ContactoViewHolder contactoViewHolder, int position) {
             Contacto contacto = contactos.get(position);
             contactoViewHolder.imgfotocv.setImageResource(contacto.getFoto());
             contactoViewHolder.tvnombrecv.setText(contacto.getNombre());

    }

    @Override
    public int getItemCount() {                     //aqui estan la cantidad de elementos que tiene mi lista
        return contactos.size();                  //debolvemos el tamaño del arraylist creado
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{
        private ImageView  imgfotocv;              //creamos objetos del tipo en este caso imageview para aqui almacenar los view del archivo xml
        private TextView  tvnombrecv;

        public ContactoViewHolder(@NonNull View itemView) {               //este metodo nos ayuda a castear los views y recivew como parametro un view
            super(itemView);                      //este es un metod osobreescrito por lo que la variable que recibe como parametro lo tomamos de los views para convertilos en objetos en este pojo
            imgfotocv     =(ImageView) itemView.findViewById(R.id.img_fotocv);       //castear en la varible creada vamos a almacenar el view casteado es decir convertido en objeto
            tvnombrecv    =(TextView) itemView.findViewById(R.id.tv_nombrecv);

         }
    }
}

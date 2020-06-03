package com.ans.opticks_app.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ans.opticks_app.Modelos.Modelo_tickets;
import com.ans.opticks_app.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdapterActividades extends RecyclerView.Adapter<AdapterActividades.ViewHolder>
        implements View.OnClickListener{

    LayoutInflater inflater;
    ArrayList<Modelo_tickets> actividades;


    //Listener
    private View.OnClickListener listener;


    public AdapterActividades (Context context, ArrayList<Modelo_tickets> actividades){
        this.inflater = LayoutInflater.from(context);
        this.actividades = actividades;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.lista_actividades,parent,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }


    //Metodo Listener

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Integer id_ticket = actividades.get(position).getId_ticket();
        String nombre_cliente = actividades.get(position).getNombre_cliente();
        holder.id_ticket.setText(id_ticket);
        holder.nombre_cliente.setText(nombre_cliente);
    }

    @Override
    public int getItemCount() {
        return actividades.size();
    }

    //OnClick del Listener
    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView id_ticket,nombre_cliente;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id_ticket = itemView.findViewById(R.id.id_ticket);
            nombre_cliente = itemView.findViewById(R.id.nombre_cliente);
        }
    }
}

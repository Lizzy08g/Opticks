package com.ans.opticks_app.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ans.opticks_app.Adaptadores.AdapterActividades;
import com.ans.opticks_app.Modelos.Modelo_tickets;
import com.ans.opticks_app.R;

import java.util.ArrayList;

public class FragmentActividades extends Fragment {

    //Variables
    AdapterActividades adapterActividades;
    RecyclerView recyclerViewActividades;
    ArrayList<Modelo_tickets> ListaActividades;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.actividades_fragment, container, false);
        recyclerViewActividades = view.findViewById(R.id.recyclerViewActividades);
        ListaActividades = new ArrayList<>();
        //cargar lista
        cargarLista();
        //mostar datos
        mostrarDatos();
        return view;
    }

    public void cargarLista(){
        ListaActividades.add(new Modelo_tickets(1516,"Geopark"));
        ListaActividades.add(new Modelo_tickets(1525,"Cepsa"));
        ListaActividades.add(new Modelo_tickets(1530,"Drummond"));
    }

    public void mostrarDatos(){
        recyclerViewActividades.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterActividades = new AdapterActividades(getContext(), ListaActividades);
        recyclerViewActividades.setAdapter(adapterActividades);
    }
}


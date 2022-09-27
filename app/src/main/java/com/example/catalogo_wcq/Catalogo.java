package com.example.catalogo_wcq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Catalogo extends AppCompatActivity {
    List<ListElement> elements;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        init();
    }

    public void init(){
        elements=new ArrayList<>();
        elements.add(new ListElement("#775447","HTML","Pricipiante","Activo"));
        elements.add(new ListElement("#607d8b","CSS","Avanzado","Inactivo"));
        elements.add(new ListElement("#03a9f4","JavasScript","FrondEnd","Activo"));
        elements.add(new ListElement("#f44336","Bootstrap","Pricipiante","Activo"));
        elements.add(new ListElement("#009688","PHP","Avanzado","Inactivo"));
        elements.add(new ListElement("#775447","HTML + CSS + JavaScript","Curso avanzado 30 semnas de duracion","Activo"));
        elements.add(new ListElement("#607d8b","Laravel","Dos meses de aprendisaje","Inactivo"));
        elements.add(new ListElement("#03a9f4","Node.js","Graciassssssssssssssssssss","Activo"));
        elements.add(new ListElement("#f44336","React","Buen curso avanzado","Activo"));
        elements.add(new ListElement("#009688","VUs","Muy buana clase de VU.js","Inactivo"));

        ListAdapter listAdapter=new ListAdapter(elements,this);
        recyclerView= (RecyclerView) findViewById(R.id.listViewCurso);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}
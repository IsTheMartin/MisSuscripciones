package com.mcuadrada.missuscripciones;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.mcuadrada.missuscripciones.Adapters.SuscriptionAdapter;
import com.mcuadrada.missuscripciones.Models.Suscription;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvSuscriptions;
    FloatingActionButton fabInsertSuscription;
    Toolbar toolbar;
    SuscriptionAdapter suscriptionAdapter;
    List<Suscription> suscriptionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        configRecyclerView();

        testRecyclerView();
    }

    private void findViews(){
        rcvSuscriptions = findViewById(R.id.rcvSuscriptions);
        fabInsertSuscription = findViewById(R.id.floatingActionButton);
        toolbar = findViewById(R.id.tlbMain);
    }

    private void configRecyclerView(){
        rcvSuscriptions.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));
        suscriptionAdapter = new SuscriptionAdapter(this, suscriptionList);
        rcvSuscriptions.setAdapter(suscriptionAdapter);
    }

    private void testRecyclerView(){
        suscriptionList.add(new Suscription("Spotify", 99.00, 1,
                null, false, 0));
        suscriptionList.add(new Suscription("Netflix", 129.00, 1,
                null, false, 0));
        suscriptionAdapter.notifyDataSetChanged();
    }
}

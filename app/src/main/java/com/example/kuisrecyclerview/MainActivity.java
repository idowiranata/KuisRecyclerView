package com.example.kuisrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_1);
        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Agung Sartono", "Ayah", R.drawable.ayah));
        keluargaArrayList.add(new Keluarga("Vera yuliati", "Ibu", R.drawable.ibu));
        keluargaArrayList.add(new Keluarga("Ido Eka Wiranata", "Anak Pertama", R.drawable.ido));
        keluargaArrayList.add(new Keluarga("Yeda Khristian Manggala", "Anak Kedua", R.drawable.adik));
    }
    }

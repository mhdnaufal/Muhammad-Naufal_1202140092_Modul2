package com.example.zoang.muhammadnaufal_1202140092_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContentMenu extends AppCompatActivity {

    private List<Menu> menuList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_menu);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new RecyclerViewAdapter(this, menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        Menu menu = new Menu(R.drawable.foto1, "Soup Iga", "Rp. 25.000", R.string.soupiga);
        menuList.add(menu);
        menu = new Menu(R.drawable.foto2, "Beef Steak", "Rp. 24.000", R.string.beefsteak);
        menuList.add(menu);
        menu = new Menu(R.drawable.foto3, "Ayam Goreng", "Rp. 14.000", R.string.ayamgoreng);
        menuList.add(menu);
        menu = new Menu(R.drawable.foto4, "Ikan Bakar", "Rp. 16.000", R.string.ikanbakar);
        menuList.add(menu);
        menu = new Menu(R.drawable.foto5, "Burger", "Rp. 15.000", R.string.burger);
        menuList.add(menu);
        menu = new Menu(R.drawable.foto6, "Juice", "Rp. 13.000", R.string.juice);
        menuList.add(menu);

    }
}

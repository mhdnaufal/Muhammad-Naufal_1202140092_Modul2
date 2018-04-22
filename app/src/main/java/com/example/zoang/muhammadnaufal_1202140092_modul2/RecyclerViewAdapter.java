package com.example.zoang.muhammadnaufal_1202140092_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by ASUS on 2/17/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private LayoutInflater mInflater;
    private List<Menu> menuList;


    public RecyclerViewAdapter(Context context, List<Menu> menuList) {
        mInflater = LayoutInflater.from(context);
        this.menuList = menuList;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView nama, harga;
        ImageView gambar;

        public MyViewHolder(View view) {
            super(view);

            nama = (TextView) view.findViewById(R.id.menu);
            harga = (TextView) view.findViewById(R.id.harga);
            gambar = (ImageView) view.findViewById(R.id.gambar);
            view.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
// Use that to access the affected item in mWordList.
            String element = menuList.get(mPosition).toString();
            Toast.makeText(view.getContext(), nama.getText(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(view.getContext(), DetailMenu.class);
            int gambar = menuList.get(mPosition).getGambar();
            int komposisi = menuList.get(mPosition).getKomposisi();
            intent.putExtra("gambar", gambar);
            intent.putExtra("nama",nama.getText());
            intent.putExtra("harga",harga.getText());
            intent.putExtra("komposisi",komposisi);
            view.getContext().startActivity(intent);

        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_list_menu, parent, false);

        return new MyViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Menu menu = menuList.get(position);
        holder.gambar.setImageResource(menu.getGambar());

        holder.harga.setText(menu.getHarga());
        holder.nama.setText(menu.getNama());


    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

}

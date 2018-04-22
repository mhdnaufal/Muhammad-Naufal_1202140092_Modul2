package com.example.zoang.muhammadnaufal_1202140092_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        Intent intent = getIntent();
        int gambar = intent.getExtras().getInt("gambar");
        String nama = intent.getStringExtra("nama");
        String harga = intent.getStringExtra("harga");
        int komposisis = intent.getExtras().getInt("komposisi");
        ImageView gambarDetail = (ImageView) findViewById(R.id.detailGambar);
        TextView namaMenu = (TextView) findViewById(R.id.namaMenu);
        TextView hargaMenu = (TextView) findViewById(R.id.hargaMenu);
        TextView komposisi = (TextView) findViewById(R.id.komposisi);


        gambarDetail.setImageResource(gambar);
        namaMenu.setText(nama);
        hargaMenu.setText(harga);
        komposisi.setText(komposisis);
    }

    public void konfirmasi(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Pemesanan Berhasil, Harap tunggu sebentar");
        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}

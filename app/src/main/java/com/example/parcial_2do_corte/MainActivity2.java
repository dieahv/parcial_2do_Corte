package com.example.parcial_2do_corte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView Vr_total_prod_1, Vr_total_prod_2, Vr_total_prod_3, Sub_total, Iva, Vr_total;
    private TextView precio_prod_1, precio_prod_2, precio_prod_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        precio_prod_1 = findViewById(R.id.txt_vr_unit_prod_1);
        precio_prod_2 = findViewById(R.id.txt_vr_unit_prod_2);
        precio_prod_3 = findViewById(R.id.txt_vr_unit_prod_3);
        Vr_total_prod_1 = findViewById(R.id.txt_vr_total_prod_1);
        Vr_total_prod_2 = findViewById(R.id.txt_vr_total_prod_2);
        Vr_total_prod_3 = findViewById(R.id.txt_vr_total_prod_3);
        Sub_total = findViewById(R.id.txt_sub_total);
        Iva = findViewById(R.id.txt_iva);
        Vr_total = findViewById(R.id.txt_vr_total);


        Bundle sendObj = getIntent().getExtras();
        Producto prod = null;

        if (sendObj != null) {
            prod = (Producto) sendObj.getSerializable("producto");

            precio_prod_1.setText(String.valueOf(400000));
            precio_prod_2.setText(String.valueOf(1300000));
            precio_prod_3.setText(String.valueOf(750000));

            Vr_total_prod_1.setText(String.valueOf(400000 * prod.getCantprod_1()));
            Vr_total_prod_2.setText(String.valueOf(1300000 * prod.getCantprod_2()));
            Vr_total_prod_3.setText(String.valueOf(750000 * prod.getCantprod_3()));

            int vr_1 = (400000 * prod.getCantprod_1());
            int vr_2 = (1300000 * prod.getCantprod_2());
            int vr_3 = (750000 * prod.getCantprod_3());

            Sub_total.setText(String.valueOf(vr_1+ vr_2 + vr_3));
            Iva.setText(String.valueOf(iva(vr_1,vr_2,vr_3)));
            Vr_total.setText(String.valueOf(iva(vr_1,vr_2,vr_3)+(vr_1+ vr_2 + vr_3)));
        }
    }

    public int multiplicacion(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        if (b == 1)
            return a;
        return a + multiplicacion(a, b - 1);
    }

    public double iva(int vr_1, int vr_2, int vr_3) {

           double Iva = (vr_1 + vr_2 + vr_3) * 0.19;
        return Iva;
    }

}




package edu.tecii.android.final_proyect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;

public class Catalogo1 extends AppCompatActivity {



    public static Uniformes[] ITEMS = {
            new Uniformes("America", R.drawable.america),
            new Uniformes("Atlas", R.drawable.atlas),
            new Uniformes("Barcelona", R.drawable.barcelona),
            new Uniformes("Chivas", R.drawable.chivas),
            new Uniformes("Fly_Emirates", R.drawable.emirates),
            new Uniformes("Jeep", R.drawable.jeep),
            new Uniformes("Pumas", R.drawable.pumas),
            new Uniformes("Real_Madrid", R.drawable.madrid),
    };


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo1);
        GridView gridview = (GridView) findViewById(R.id.grid);
        for(Uniformes uniforme : ITEMS) {
            ImageView ima = new ImageView(this);
            ima.setImageResource(uniforme.getIdDrawable());
            gridview.addView(ima);

        }
    }}
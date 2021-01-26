package com.example.mathsformulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickedTrignomertyBtn(View view) {
        Intent intent1 = new Intent(this,trignometryFormulas.class);
        startActivity(intent1);
    }

    public void clickOtherBtn(View view) {
        Intent intent2 = new Intent(this,OtherFormulas.class);
        startActivity(intent2);
    }

    public void clickGeometryBtn(View view) {
        Intent intent3 = new Intent(this,geometryFormulas.class);
        startActivity(intent3);
    }

    public void clicedAlgebrabtn(View view) {
        Intent intent4 = new Intent(this,AlgebraFormula.class);
        startActivity(intent4);
    }

    public void clickCalculasBtn(View view) {
        Intent intent5 = new Intent(this,calculasFormulas.class);
        startActivity(intent5);
    }

    public void shareFunction(View view) {
            String msg = "maths Formulas functionality perfectly sent !!! 👓🎄🎈🎆🎇🧨🎆🧨🎉✔";
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT,msg);
            intent.setType("text/plain");

            Intent choiser =Intent.createChooser(intent,"share with friends ");
            if(intent.resolveActivity(getPackageManager()) != null){
                startActivity(choiser);
            }
    }
}

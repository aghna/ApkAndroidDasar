package id.ac.uin_malang.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_main);

        Button btn1=(Button)findViewById(R.id.input);
        Button btn2=(Button)findViewById(R.id.close);
        Button btn3=(Button)findViewById(R.id.kal);

        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {
                Intent pindah = new Intent(MainActivity.this, InputdataActivity.class);
                startActivity(pindah);
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {
                Intent mindah = new Intent(MainActivity.this, KalkulatorkuActivity.class);
                startActivity(mindah);
            }

        });

    }
}

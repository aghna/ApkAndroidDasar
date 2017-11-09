package id.ac.uin_malang.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KalkulatorkuActivity extends AppCompatActivity {

    EditText a,b;
    Button tambah,kali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulatorku);

        a=(EditText)findViewById(R.id.satu);
        b=(EditText)findViewById(R.id.dua);
        tambah=(Button)findViewById(R.id.plus);
        kali=(Button)findViewById(R.id.kali);
        hasil=(TextView)findViewById(R.id.kasil);

        tambah.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                if(a.length()==0 && b.length()==0){
                    Toast.makeText(getApplication(),"angka tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (a.length()==0){
                    Toast.makeText(getApplication(),"angka tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (b.length()==0){
                    Toast.makeText(getApplication(),"angka tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else{
                    String isia = a.getText().toString();
                    String isib = b.getText().toString();

                    double p = Double.parseDouble(isia);
                    double l = Double.parseDouble(isib);

                    double hs = tamb(p,l);

                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }

        });

        kali.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                if(a.length()==0 && b.length()==0){
                    Toast.makeText(getApplication(),"angka tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (a.length()==0){
                    Toast.makeText(getApplication(),"angka tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (b.length()==0){
                    Toast.makeText(getApplication(),"angka tidak boleh kosong",Toast.LENGTH_LONG).show();
                }else{
                    String isia = a.getText().toString();
                    String isib = b.getText().toString();

                    double p = Double.parseDouble(isia);
                    double l = Double.parseDouble(isib);

                    double hs = kal(p,l);

                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }

        });

    }
    public double tamb (double a,double b){
        return a+b;
    }

    public double kal (double a,double b){
        return a*b;
    }
}

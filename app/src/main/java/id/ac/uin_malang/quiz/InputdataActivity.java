package id.ac.uin_malang.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class InputdataActivity extends AppCompatActivity {

    EditText a,b,c,d;
    RadioButton mat,indo;
    TextView hasill;
    Button pros;
    Spinner spinner1, spinner2;
    DatePicker datePicker;
    int month;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputdata);

        a=(EditText)findViewById(R.id.nis);
        b=(EditText)findViewById(R.id.nama);
        c=(EditText)findViewById(R.id.nilai);
        d=(EditText)findViewById(R.id.prosen);
//        final RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
//        mat=(RadioButton)findViewById(R.id.mat);
//        indo=(RadioButton)findViewById(R.id.bahasa);
        hasill=(TextView)findViewById(R.id.hasil);
        pros=(Button)findViewById(R.id.proses);
        spinner1=(Spinner)findViewById(R.id.jurusan);
        spinner2=(Spinner)findViewById(R.id.matkul);
        datePicker=(DatePicker)findViewById(R.id.tanggalan);
        pros.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                if(a.length()==0 && b.length()==0 && c.length()==0 && d.length()==0 ){
                    Toast.makeText(getApplication(),"lengkapi data anda",Toast.LENGTH_LONG).show();
                } else{
                    String isia = a.getText().toString();
                    String isib = b.getText().toString();
                    String isic = c.getText().toString();
                    String isid = d.getText().toString();
                    String halo=spinner1.getSelectedItem().toString().trim();
                    String hao=spinner2.getSelectedItem().toString().trim();

                    double p = Double.parseDouble(isic);
                    double l = Double.parseDouble(isid);
                    double hs = p*(l/100);
                    String ha=curreDate();
                    String output = String.valueOf(hs);
                    hasill.setText("NIS: "+isia+"\n Nama: "+isib+"\n jurusan: "+halo+"\n matakuliah: "+hao+"\n tanggal: "+ha+"\n Nilai Akhir: "+isic+"\n Prosentase: "+isid+"%"+"\n Total Nilai: "+output);
                }

            }
        });
    }

    public String curreDate(){
        StringBuilder current=new StringBuilder();
        month=datePicker.getMonth()+1;
        current.append(month+"/"+datePicker.getDayOfMonth()+"/"+datePicker.getYear());

        return current.toString();
    }


}

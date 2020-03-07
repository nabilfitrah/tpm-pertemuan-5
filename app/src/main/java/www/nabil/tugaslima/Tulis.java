package www.nabil.tugaslima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import www.nabil.tugaslima.database.AppDatabase;
import www.nabil.tugaslima.database.DataDiri;

public class Tulis extends AppCompatActivity {

    EditText activitytulis_edt_nama, activitytulis_edt_alamat, activitytulis_edt_jenkel;
    Button activitytulis_btn_tambah;

    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulis);

        appDatabase = AppDatabase.initDB(getApplicationContext());

        activitytulis_edt_nama = findViewById(R.id.activitytulis_edt_nama);
        activitytulis_edt_alamat = findViewById(R.id.activitytulis_edt_alamat);
        activitytulis_edt_jenkel = findViewById(R.id.activitytulis_edt_jenkel);

        activitytulis_btn_tambah = findViewById(R.id.activitytulis_btn_tambah);

        activitytulis_btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData();
            }
        });
    }

    private void insertData(){
        String nama = activitytulis_edt_nama.getText().toString();
        String alamat = activitytulis_edt_alamat.getText().toString();
        char kelamin = activitytulis_edt_jenkel.getText().toString().charAt(0);

        DataDiri item = new DataDiri();
        item.setNama(nama);
        item.setAlamat(alamat);
        item.setJkelamin(kelamin);

        //Setelah itu, Kirim ke Database
        appDatabase.dao().insertData(item);

        activitytulis_edt_nama.setText("");
        activitytulis_edt_alamat.setText("");
        activitytulis_edt_jenkel.setText("");
    }
}

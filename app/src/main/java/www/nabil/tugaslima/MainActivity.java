package www.nabil.tugaslima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import www.nabil.tugaslima.database.AppDatabase;

public class MainActivity extends AppCompatActivity {

    Button activitymain_btn_tulis, activitymain_btn_baca,
            activitymain_btn_update, activitymain_btn_delete;

    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //nyambungin ke database yang kita buat
        appDatabase = AppDatabase.initDB(getApplicationContext());

        activitymain_btn_tulis = findViewById(R.id.activitymain_btn_tulis);
        activitymain_btn_baca = findViewById(R.id.activitymain_btn_baca);
        activitymain_btn_update = findViewById(R.id.activitymain_btn_update);
        activitymain_btn_delete = findViewById(R.id.activitymain_btn_delete);

        activitymain_btn_tulis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tulis.class);
                startActivity(intent);
            }
        });

        activitymain_btn_baca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Baca.class);
                startActivity(intent);
            }
        });

    }


}

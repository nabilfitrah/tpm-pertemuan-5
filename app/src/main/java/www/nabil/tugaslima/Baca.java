package www.nabil.tugaslima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Baca extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baca);
        main_list=new ArrayList<>();
        recyclerView = findViewById(R.id.activitymain_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model("Nabil", "Tasikmalaya", "L"));
        main_list.add(new Model("Alif", "Riau", "L"));
        adapter = new CustomAdapter(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}

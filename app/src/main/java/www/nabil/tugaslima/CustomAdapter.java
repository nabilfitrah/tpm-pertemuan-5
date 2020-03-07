package www.nabil.tugaslima;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    List<Model>  my_list;
    Context context;

    public CustomAdapter(List<Model> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    final Model model = my_list.get(position);
    holder.itemdata_tv_nama.setText(model.getNama());
    holder.itemdata_tv_alamat.setText(model.getAlamat());
    holder.itemdata_tv_jenkel.setText(model.getJenkel());
    holder.itemdata_linear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context,Implisit.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //intent manja kalo gapake ini bakalan error :(
            intent.putExtra("nama",model.getNama());
            intent.putExtra("alamat",model.getAlamat());
            intent.putExtra("jenkel",model.getJenkel());
            context.startActivity(intent);

        }
    });
    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView itemdata_tv_nama,itemdata_tv_alamat,itemdata_tv_jenkel;
        LinearLayout itemdata_linear;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemdata_tv_nama = itemView.findViewById(R.id.itemdata_tv_nama);
            itemdata_tv_alamat = itemView.findViewById(R.id.itemdata_tv_alamat);
            itemdata_tv_jenkel = itemView.findViewById(R.id.itemdata_tv_jenkel);
            itemdata_linear = itemView.findViewById(R.id.itemdata_linear);
        }
    }
}

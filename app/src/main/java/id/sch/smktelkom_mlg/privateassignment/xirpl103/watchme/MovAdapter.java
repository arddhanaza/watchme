package id.sch.smktelkom_mlg.privateassignment.xirpl103.watchme;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Arddhana Zhafran on 5/14/2017.
 */

public class MovAdapter extends RecyclerView.Adapter<MovAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public MovAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public MovAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new MovAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ListItem listItem = listItems.get(position);

        holder.textViewJudul.setText(listItem.getJudul());
        holder.textViewDesc.setText(listItem.getDesc());

        Glide.with(context)
                .load("http://image.tmdb.org/t/p/w500" + listItem.getImageUrl())
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return listItems.size();


    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewJudul;
        public TextView textViewDesc;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}

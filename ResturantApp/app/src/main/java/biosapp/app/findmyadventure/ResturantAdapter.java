package biosapp.app.findmyadventure;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Muhammed Reza on 23-Aug-17.
 */

public class ResturantAdapter extends RecyclerView.Adapter<ResturantHolder> {

    private Context context;
    DataModel obj = new DataModel();
    public ResturantAdapter (Context con){
        context = con;
    }


    @Override
    public ResturantHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.resturant_list,parent,false);
        return new ResturantHolder(view);

    }

    @Override
    public void onBindViewHolder(ResturantHolder holder, int position) {
        holder.rest_name.setText(obj.get_rest(position));
        holder.rest_tag.setText(obj.get_rest_des(position));
        holder.rest_rat.setText(obj.get_rest_rat(position));
        holder.rest_thumb.setImageResource(obj.get_rest_img(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetailActivity.class);
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return obj.get_length();
    }
}

package biosapp.app.findmyadventure;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Muhammed Reza on 23-Aug-17.
 */

public class DetailAdapter extends RecyclerView.Adapter<DetailHolder> {

    DataModel obj = new DataModel();
    private Context context;
    public DetailAdapter(Context con){
        context = con;
    }

    @Override
    public DetailHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.deal_list,parent,false);
        return new DetailHolder(view);
    }

    @Override
    public void onBindViewHolder(DetailHolder holder, int position) {
        holder.deal_thumb.setImageResource(obj.get_deal_img(position));
        holder.deal_name.setText(obj.get_deal(position));
        holder.deal_tag.setText(obj.get_deal_des(position));
        holder.deal_price.setText(obj.get_deal_price(position));
    }

    @Override
    public int getItemCount() {
        return obj.get_length();
    }
}

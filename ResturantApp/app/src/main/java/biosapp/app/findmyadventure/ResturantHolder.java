package biosapp.app.findmyadventure;


import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Muhammed Reza on 23-Aug-17.
 */

class ResturantHolder extends RecyclerView.ViewHolder {

    ImageView rest_thumb;
    TextView  rest_name,rest_tag,rest_rat;

    public ResturantHolder(View itemView) {
        super(itemView);

        rest_thumb = (ImageView) itemView.findViewById(R.id.rest_thumb);
        rest_name = (TextView) itemView.findViewById(R.id.rest_name);
        rest_tag = (TextView) itemView.findViewById(R.id.rest_tag);
        rest_rat = (TextView) itemView.findViewById(R.id.rest_rat);

    }
}

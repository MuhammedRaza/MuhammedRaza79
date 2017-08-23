package biosapp.app.findmyadventure;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Muhammed Reza on 23-Aug-17.
 */

class DetailHolder extends RecyclerView.ViewHolder {

    ImageView deal_thumb;
    TextView deal_name, deal_tag, deal_price;

    public DetailHolder(View itemView) {
        super(itemView);

        deal_thumb = (ImageView) itemView.findViewById(R.id.deal_thumb);
        deal_name = (TextView) itemView.findViewById(R.id.deal_name);
        deal_tag = (TextView) itemView.findViewById(R.id.deal_tag);
        deal_price  = (TextView) itemView.findViewById(R.id.deal_price);

    }

}

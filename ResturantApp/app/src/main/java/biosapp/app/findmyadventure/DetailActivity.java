package biosapp.app.findmyadventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        RecyclerView detail_view = (RecyclerView) findViewById(R.id.deal_id);
        DetailAdapter adapter = new DetailAdapter(DetailActivity.this);

        detail_view.setLayoutManager(new LinearLayoutManager(DetailActivity.this));
        detail_view.setAdapter(adapter);
    }
}

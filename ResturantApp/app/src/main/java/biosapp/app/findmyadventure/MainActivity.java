package biosapp.app.findmyadventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rest_view = (RecyclerView) findViewById(R.id.rest_id);
        ResturantAdapter adapter = new ResturantAdapter(MainActivity.this);

        rest_view.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rest_view.setAdapter(adapter);


    }
}

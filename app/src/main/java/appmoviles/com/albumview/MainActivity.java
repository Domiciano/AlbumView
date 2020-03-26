package appmoviles.com.albumview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Integer> photos;
    private CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.photos_viewer);
        recyclerView= findViewById(R.id.grid);
        photos=new ArrayList<>();
        adapter=new CustomAdapter(this,photos);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        photos.add(R.drawable.e1);
        photos.add(R.drawable.e2);
        photos.add(R.drawable.e3);
        photos.add(R.drawable.e4);
        photos.add(R.drawable.e5);
        photos.add(R.drawable.e6);
        photos.add(R.drawable.e7);
        photos.add(R.drawable.e8);
        photos.add(R.drawable.e9);
        adapter.notifyDataSetChanged();

    }

}

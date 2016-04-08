package teamkevinlove.com.wififinder;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.Toolbar;
import java.util.ArrayList;
import java.util.List;

public class NetworkInformation extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Boolean mFromSavedInstanceState;
    private DataAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_information);

        if(savedInstanceState!=null){
            mFromSavedInstanceState = true;
        }

    }




    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // inflate layout for this class
        View layout = inflater.inflate(R.layout.activity_network_information, container, false);
        recyclerView = (RecyclerView)layout.findViewById(R.id.WifiList);
        adapter = new DataAdapter(this, getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        return layout;
    }

    public static List<WifiData> getData(){

        List<WifiData> data = new ArrayList<>();

            int[] icons ={R.mipmap.ic_launcher, R.mipmap.ic_launcher};
            String[] titles = {"Klove", "George", "Jim", "YouTube"};

            for(int i=0; i<titles.length && i<icons.length;i++){

            WifiData current = new WifiData();
            current.iconId=icons[i];
            current.title=titles[i];

            data.add(current);
        }
        return data;
    }
}

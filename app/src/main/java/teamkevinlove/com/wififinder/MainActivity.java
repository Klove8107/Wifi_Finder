package teamkevinlove.com.wififinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Bind(R.id.progressBar)
    ProgressBar mProgressBar;
    @Bind(R.id.searchButton)
    Button mSearchButton;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mProgressBar.setVisibility(View.INVISIBLE);
        mSearchButton = (Button)findViewById(R.id.searchButton);
        mSearchButton.setOnClickListener(this);
    }

    private void toggleRefresh() {
        if (mProgressBar.getVisibility() == View.INVISIBLE) {
            mProgressBar.setVisibility(View.VISIBLE);

        } else {
            mProgressBar.setVisibility(View.INVISIBLE);

        }
    }

    private void mSearchButtonClick(){
        startActivity(new Intent("teamkevinlove.com.wififinder.NetworkInformation"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.searchButton:
                mSearchButtonClick();
                break;
        }
    }
}


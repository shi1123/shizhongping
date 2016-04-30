package cn.studyjames.s1.sj35.shizhongping;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when 查看机型 Button is clicked
     */
    public void showSeries(View v){
        setContentView(R.layout.show_series);
    }

    /**
     * This method is called when type of computer Button is clicked
     */
    public void showT460Detail(View v){
        setContentView(R.layout.show_t460_detail);
    }
    public void showComputerDetail(View v){
        Toast.makeText(this, "The details of this computer is missing now! But we will fix it soon!", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when type of computer Button is clicked
     */
    public void openJD(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.jd.com"));
        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

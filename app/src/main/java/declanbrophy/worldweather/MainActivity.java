package declanbrophy.worldweather;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.io.*;
import java.net.*;
import java.net.URLConnection;




public class MainActivity extends AppCompatActivity  {


    public static final String API_Key = "ae3723984918e29156906ffa2182bf02";

    public static final String Website_Id = "http://openweathermap.org/forecast16";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize button on user interface
        Button submit = (Button) findViewById(R.id.Submit);

        //Give button functionality
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });





        }


}

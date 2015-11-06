package net.thepixelist.thedarkesttimeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button myButton;
    TextView thewords;
    ImageView theimage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button) findViewById(R.id.button);
        myButton.setOnClickListener(new OurOnClickListener(this));
        thewords = (TextView) findViewById(R.id.textwords);
        theimage = (ImageView) findViewById(R.id.imageView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast toastMessage = Toast.makeText(this, "you went back to the start", Toast.LENGTH_LONG);
            toastMessage.show();
            finish();
            startActivity(getIntent());

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

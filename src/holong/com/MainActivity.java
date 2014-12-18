package holong.com;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
halaman2 obD = new halaman2();

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.tombol2);
      
        b.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View arg0) {
            // here i call new screen;
            Intent i = new Intent(MainActivity.this, halaman2.class);
            startActivity(i);
            } 
         });
    }



}

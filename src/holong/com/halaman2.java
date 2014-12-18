package holong.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class halaman2 extends Activity {
MainActivity ob;
halaman3 hal3;

public void onCreate(Bundle icicle){
	super.onCreate(icicle);
    setContentView(R.layout.halaman2ku);
    Button b = (Button) findViewById(R.id.keluar);
    b.setOnClickListener(new View.OnClickListener() {
       public void onClick(View arg0) {
 setResult(RESULT_OK);
 Intent i = new Intent(halaman2.this, halaman3.class);
 startActivity(i);
       } 
    });
}
public void setOb( MainActivity obA){
    this.ob=obA;
   }
}

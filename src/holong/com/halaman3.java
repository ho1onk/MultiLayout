package holong.com;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class halaman3 extends Activity {
	
	private MainActivity ob;

	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
	    setContentView(R.layout.halaman3);
	    Button b = (Button) findViewById(R.id.tmblKembali);
	    b.setOnClickListener(new View.OnClickListener() {
	       public void onClick(View arg0) {
	 setResult(RESULT_OK);
	 finish();
	       } 
	    });
	}
	//ini adalah parent atau induknya,
	public void setOb( MainActivity obA){
	    this.ob=obA;
	   }
}

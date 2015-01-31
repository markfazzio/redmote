package music.player;




import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class HelloWebView extends Activity{
	
	
	WebView mWebView;

	
	   public void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	        setContentView(R.layout.mainweb);
	        
	        Button web_play = (Button) findViewById(R.id.Button02);
	        web_play.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent intent = new Intent();
	                setResult(RESULT_OK, intent);
	                finish();
	            }

	        });
	    
	    

	    mWebView = (WebView) findViewById(R.id.webview);
	    mWebView.getSettings().setJavaScriptEnabled(true);
	    mWebView.loadUrl("http://redmote.markfazzio.com");
	
	   
	   }
}


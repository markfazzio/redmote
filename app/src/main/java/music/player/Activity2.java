package music.player;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity2 extends Activity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apple);

        Button info_play = (Button) findViewById(R.id.Button02);
        Button apple_volup = (Button) findViewById(R.id.apple_volup);
        Button apple_voldn = (Button) findViewById(R.id.apple_voldn);
        Button apple_menu = (Button) findViewById(R.id.apple_menu);
        Button apple_next = (Button) findViewById(R.id.apple_next);
        Button apple_prev = (Button) findViewById(R.id.apple_prev);
        Button apple_play = (Button) findViewById(R.id.apple_play);
        
        
        
        apple_volup.setOnClickListener(new OnClickListener(){

             //  @Override
               public void onClick(View arg0) {
                    MediaPlayer mp = MediaPlayer.create(Activity2.this,
                              R.raw.apple_volup);
                    try {
						mp.prepare();
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block 
						e.printStackTrace();
					}
                    mp.start();
                    // i.e. react on the end of the music-file:
                    mp.setOnCompletionListener(new OnCompletionListener(){

                         // @Override
                         public void onCompletion(MediaPlayer arg0) {
       
                        	
                          
              	 
                        	 // File has ended !!! 
                         }
                    });
               }
        });
        
        apple_voldn.setOnClickListener(new OnClickListener(){

            //  @Override
              public void onClick(View arg0) {
                   MediaPlayer mp = MediaPlayer.create(Activity2.this,
                             R.raw.apple_voldn);
                   try {
						mp.prepare();
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block 
						e.printStackTrace();
					}
                   mp.start();
                   // i.e. react on the end of the music-file:
                   mp.setOnCompletionListener(new OnCompletionListener(){

                        // @Override
                        public void onCompletion(MediaPlayer arg0) {
      
                       	
                         
             	 
                       	 // File has ended !!! 
                        }
                   });
              }
       });
        
        apple_menu.setOnClickListener(new OnClickListener(){

            //  @Override
              public void onClick(View arg0) {
                   MediaPlayer mp = MediaPlayer.create(Activity2.this,
                             R.raw.apple_menu);
                   try {
						mp.prepare();
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block 
						e.printStackTrace();
					}
                   mp.start();
                   // i.e. react on the end of the music-file:
                   mp.setOnCompletionListener(new OnCompletionListener(){

                        // @Override
                        public void onCompletion(MediaPlayer arg0) {
      
                       	
                         
             	 
                       	 // File has ended !!! 
                        }
                   });
              }
       });
        
        apple_next.setOnClickListener(new OnClickListener(){

            //  @Override
              public void onClick(View arg0) {
                   MediaPlayer mp = MediaPlayer.create(Activity2.this,
                             R.raw.apple_next);
                   try {
						mp.prepare();
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block 
						e.printStackTrace();
					}
                   mp.start();
                   // i.e. react on the end of the music-file:
                   mp.setOnCompletionListener(new OnCompletionListener(){

                        // @Override
                        public void onCompletion(MediaPlayer arg0) {
      
                       	
                         
             	 
                       	 // File has ended !!! 
                        }
                   });
              }
       });
        
        apple_prev.setOnClickListener(new OnClickListener(){

            //  @Override
              public void onClick(View arg0) {
                   MediaPlayer mp = MediaPlayer.create(Activity2.this,
                             R.raw.apple_prev);
                   try {
						mp.prepare();
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block 
						e.printStackTrace();
					}
                   mp.start();
                   // i.e. react on the end of the music-file:
                   mp.setOnCompletionListener(new OnCompletionListener(){

                        // @Override
                        public void onCompletion(MediaPlayer arg0) {
      
                       	
                         
             	 
                       	 // File has ended !!! 
                        }
                   });
              }
       });
        
        apple_play.setOnClickListener(new OnClickListener(){

            //  @Override
              public void onClick(View arg0) {
                   MediaPlayer mp = MediaPlayer.create(Activity2.this,
                             R.raw.apple_play);
                   try {
						mp.prepare();
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block 
						e.printStackTrace();
					}
                   mp.start();
                   // i.e. react on the end of the music-file:
                   mp.setOnCompletionListener(new OnCompletionListener(){

                        // @Override
                        public void onCompletion(MediaPlayer arg0) {
      
                       	
                         
             	 
                       	 // File has ended !!! 
                        }
                   });
              }
       });
        
        info_play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });
    }
}
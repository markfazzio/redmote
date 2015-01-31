package music.redmote;

import java.io.IOException;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class ProjectorRemote extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.projector);


        // Find the Button from the xml-file.

        Button proj_pwr = (Button) this.findViewById(R.id.proj_pwr);
        Button proj_poweroff = (Button) this.findViewById(R.id.proj_poweroff);
        Button proj_volup = (Button) this.findViewById(R.id.proj_volup);
        Button proj_voldn = (Button) this.findViewById(R.id.proj_voldn);
        Button proj_magup = (Button) this.findViewById(R.id.proj_magup);
        Button proj_magdn = (Button) this.findViewById(R.id.proj_magdn);
        Button proj_right = (Button) this.findViewById(R.id.proj_right);
        Button proj_left = (Button) this.findViewById(R.id.proj_left);
        Button proj_down = (Button) this.findViewById(R.id.proj_down);
        Button proj_up = (Button) this.findViewById(R.id.proj_up);
        Button codes_play = (Button) findViewById(R.id.Button02);


        proj_pwr.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.proj_pwr);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });


        proj_volup.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.btn_3);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });

        proj_voldn.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.btn_4);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });

        proj_magup.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.btn_5);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });

        proj_magdn.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.btn_6);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });

        proj_right.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.btn_7);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });

        proj_left.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.btn_8);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });

        proj_down.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.btn_9);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });

        proj_up.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.btn_0);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });

        proj_poweroff.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                final MediaPlayer mp = MediaPlayer.create(ProjectorRemote.this,
                        R.raw.btn_2);
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
                mp.setOnCompletionListener(new OnCompletionListener() {

                    // @Override
                    public void onCompletion(MediaPlayer arg0) {
                        mp.reset();
                    }
                });
            }
        });


        codes_play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });
    }


}



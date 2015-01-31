package music.redmote;

import java.io.IOException;


import android.content.Intent;
import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TVRemote extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);


        // Find the Button from the xml-file.

        Button btn1_play = (Button) this.findViewById(R.id.btn1_play);
        Button btn2_play = (Button) this.findViewById(R.id.btn2_play);
        Button btn3_play = (Button) this.findViewById(R.id.btn3_play);
        Button btn4_play = (Button) this.findViewById(R.id.btn4_play);
        Button btn5_play = (Button) this.findViewById(R.id.btn5_play);
        Button btn6_play = (Button) this.findViewById(R.id.btn6_play);
        Button btn7_play = (Button) this.findViewById(R.id.btn7_play);
        Button btn8_play = (Button) this.findViewById(R.id.btn8_play);
        Button btn9_play = (Button) this.findViewById(R.id.btn9_play);
        Button btn0_play = (Button) this.findViewById(R.id.btn0_play);
        Button chnup_play = (Button) this.findViewById(R.id.chnup_play);
        Button chndn_play = (Button) this.findViewById(R.id.chndn_play);
        Button volup_play = (Button) this.findViewById(R.id.volup_play);
        Button voldn_play = (Button) this.findViewById(R.id.voldn_play);
        Button pwr_play = (Button) this.findViewById(R.id.pwr_play);
        Button inpt_play = (Button) this.findViewById(R.id.inpt_play);
        Button info_play = (Button) this.findViewById(R.id.info_play);
        Button codes_play = (Button) this.findViewById(R.id.codes_play);
        Button web_play = (Button) this.findViewById(R.id.web_play);


        btn1_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
                        R.raw.westinghouse_btn1);
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


                        // File has ended !!!
                    }
                });
            }
        });


        btn2_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
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


                        // File has ended !!!
                    }
                });
            }
        });

        btn3_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
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


                        // File has ended !!!
                    }
                });
            }
        });

        btn4_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
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


                        // File has ended !!!
                    }
                });
            }
        });

        btn5_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
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


                        // File has ended !!!
                    }
                });
            }
        });

        btn6_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
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


                        // File has ended !!!
                    }
                });
            }
        });

        btn7_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
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


                        // File has ended !!!
                    }
                });
            }
        });

        btn8_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
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


                        // File has ended !!!
                    }
                });
            }
        });

        btn9_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
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


                        // File has ended !!!
                    }
                });
            }
        });

        btn0_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
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


                        // File has ended !!!
                    }
                });
            }
        });

        pwr_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
                        R.raw.westinghouse_power);
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


                        // File has ended !!!
                    }
                });
            }
        });

        inpt_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
                        R.raw.westinghouse_input);
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


                        // File has ended !!!
                    }
                });
            }
        });

        chnup_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
                        R.raw.chnup);
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


                        // File has ended !!!
                    }
                });
            }
        });

        chndn_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
                        R.raw.chndn);
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


                        // File has ended !!!
                    }
                });
            }
        });

        volup_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
                        R.raw.westinghouse_volup);
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


                        // File has ended !!!
                    }
                });
            }


        });

        voldn_play.setOnClickListener(new OnClickListener() {

            //  @Override
            public void onClick(View arg0) {
                MediaPlayer mp = MediaPlayer.create(TVRemote.this,
                        R.raw.voldn);
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


                        // File has ended !!!
                    }
                });
            }

        });

        info_play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), AppleRemote.class);
                startActivityForResult(myIntent, 0);
            }

        });
        codes_play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ProjectorRemote.class);
                startActivityForResult(myIntent, 0);
            }

        });

        web_play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), DownloadCodesWebView.class);
                startActivityForResult(myIntent, 0);
            }

        });


    }
}


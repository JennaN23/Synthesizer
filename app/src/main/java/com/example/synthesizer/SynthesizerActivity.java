package com.example.synthesizer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SynthesizerActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonA;
    private Button buttonBb;
    private Button buttonB;
    private Button buttonC;
    private Button buttonCS;
    private Button buttonD;
    private Button buttonEb;
    private Button buttonE;
    private Button buttonF;
    private Button buttonFS;
    private Button buttonG;
    private Button buttonGS;
    private Button buttonHA;
    private Button buttonHBb;
    private Button buttonHB;
    private Button buttonHC;
    private Button buttonHCS;
    private Button buttonHD;
    private Button buttonHEb;
    private Button buttonHE;
    private Button buttonHF;
    private Button buttonHFS;
    private Button buttonHG;
    private Button buttonHGS;
    private Button buttonPlayScale;
    private Button buttonTwinkle;
    private Button buttonNoSurprises;
    private Button buttonWestworld;
    private SoundPool soundPool;
    private int noteA;
    private int noteBb;
    private int noteB;
    private int noteC;
    private int noteCS;
    private int noteD;
    private int noteEb;
    private int noteE;
    private int noteF;
    private int noteFS;
    private int noteG;
    private int noteGS;
    private int noteHA;
    private int noteHBb;
    private int noteHB;
    private int noteHC;
    private int noteHCS;
    private int noteHD;
    private int noteHEb;
    private int noteHE;
    private int noteHF;
    private int noteHFS;
    private int noteHG;
    private int noteHGS;

    public static final float DEFAULT_VOLUME = 1.0f;
    public static final float DEFAULT_RATE = 1.0f;
    public static final int DEFAULT_PRIORITY = 1;
    public static final int WHOLE_NOTE = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        wireWidgets();
        setListeners();
        initializeSoundPool();
    }

    private void initializeSoundPool() {
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.load(this, R.raw.scalea, 1);
        noteA = soundPool.load(this, R.raw.scalea, 1);
        noteBb = soundPool.load(this, R.raw.scalebb, 1);
        noteB = soundPool.load(this, R.raw.scaleb, 1);
        noteC = soundPool.load(this, R.raw.scalec, 1);
        noteCS = soundPool.load(this, R.raw.scalecs, 1);
        noteD = soundPool.load(this, R.raw.scaled, 1);
        noteEb = soundPool.load(this, R.raw.scaleds, 1);
        noteE = soundPool.load(this, R.raw.scalee, 1);
        noteF = soundPool.load(this, R.raw.scalef, 1);
        noteFS = soundPool.load(this, R.raw.scalefs, 1);
        noteG = soundPool.load(this, R.raw.scaleg, 1);
        noteGS = soundPool.load(this, R.raw.scalegs, 1);
        noteHA = soundPool.load(this, R.raw.scalehigha, 1);
        noteHBb = soundPool.load(this, R.raw.scalehighbb, 1);
        noteHB = soundPool.load(this, R.raw.scalehighb, 1);
        noteHC = soundPool.load(this, R.raw.scalehighc, 1);
        noteHCS = soundPool.load(this, R.raw.scalehighcs, 1);
        noteHD = soundPool.load(this, R.raw.scalehighd, 1);
        noteHEb = soundPool.load(this, R.raw.scalehighds, 1);
        noteHE = soundPool.load(this, R.raw.scalehighe, 1);
        noteHF = soundPool.load(this, R.raw.scalehighf, 1);
        noteHFS = soundPool.load(this, R.raw.scalehighfs, 1);
        noteHG = soundPool.load(this, R.raw.scalehighg, 1);
        noteHGS = soundPool.load(this, R.raw.scalehighgs, 1);
    }

    private void setListeners() {
        buttonA.setOnClickListener(this);
        buttonBb.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonCS.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonEb.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonFS.setOnClickListener(this);
        buttonG.setOnClickListener(this);
        buttonGS.setOnClickListener(this);
        buttonHA.setOnClickListener(this);
        buttonHBb.setOnClickListener(this);
        buttonHB.setOnClickListener(this);
        buttonHC.setOnClickListener(this);
        buttonHCS.setOnClickListener(this);
        buttonHD.setOnClickListener(this);
        buttonHEb.setOnClickListener(this);
        buttonHE.setOnClickListener(this);
        buttonHF.setOnClickListener(this);
        buttonHFS.setOnClickListener(this);
        buttonHG.setOnClickListener(this);
        buttonHGS.setOnClickListener(this);
        buttonPlayScale.setOnClickListener(this);
        buttonTwinkle.setOnClickListener(this);
        buttonNoSurprises.setOnClickListener(this);
        buttonWestworld.setOnClickListener(this);

    }

    private void wireWidgets() {
        buttonA = findViewById(R.id.button_synth_a);
        buttonBb = findViewById(R.id.button_synth_bb);
        buttonB = findViewById(R.id.button_synth_b);
        buttonC = findViewById(R.id.button_synth_c);
        buttonCS = findViewById(R.id.button_synth_cs);
        buttonD = findViewById(R.id.button_synth_d);
        buttonEb = findViewById(R.id.button_synth_eb);
        buttonE = findViewById(R.id.button_synth_e);
        buttonF = findViewById(R.id.button_synth_f);
        buttonFS = findViewById(R.id.button_synth_fs);
        buttonG = findViewById(R.id.button_synth_g);
        buttonGS = findViewById(R.id.button_synth_gs);
        buttonHA = findViewById(R.id.button_synth_ha);
        buttonHBb = findViewById(R.id.button_synth_hbb);
        buttonHB = findViewById(R.id.button_synth_hb);
        buttonHC = findViewById(R.id.button_synth_hc);
        buttonHCS = findViewById(R.id.button_synth_hcs);
        buttonHD = findViewById(R.id.button_synth_hd);
        buttonHEb = findViewById(R.id.button_synth_heb);
        buttonHE = findViewById(R.id.button_synth_he);
        buttonHF = findViewById(R.id.button_synth_hf);
        buttonHFS = findViewById(R.id.button_synth_hfs);
        buttonHG = findViewById(R.id.button_synth_hg);
        buttonHGS = findViewById(R.id.button_synth_hgs);
        buttonPlayScale = findViewById(R.id.button_synth_scale);
        buttonTwinkle = findViewById(R.id.button_main_twinkle);
        buttonNoSurprises = findViewById(R.id.button_main_ns);
        buttonWestworld = findViewById(R.id.button_main_westworld);

    }

    @Override
    public void onClick(View v) {
        //one method to handle the clicks of all the buttons
        //but don't forget to tell the buttons who is doing the listening.
        switch(v.getId()) {
            case R.id.button_synth_a:
                soundPool.play(noteA, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_bb:
                soundPool.play(noteBb, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "B♭", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_b:
                soundPool.play(noteB, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "B", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_c:
                soundPool.play(noteC, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "C", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_cs:
                soundPool.play(noteCS, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "C#", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_d:
                soundPool.play(noteD, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "D", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_eb:
                soundPool.play(noteEb, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "E♭", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_e:
                soundPool.play(noteE, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "E", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_f:
                soundPool.play(noteF, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "F", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_fs:
                soundPool.play(noteFS, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "F#", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_g:
                soundPool.play(noteG, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "G", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_gs:
                soundPool.play(noteGS, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "G#", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_ha:
                soundPool.play(noteHA, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_hbb:
                soundPool.play(noteHBb, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "B♭", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_hb:
                soundPool.play(noteHB, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "B", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_hc:
                soundPool.play(noteHC, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "C", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_hcs:
                soundPool.play(noteHCS, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "C#", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_hd:
                soundPool.play(noteHD, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "D", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_heb:
                soundPool.play(noteHEb, 1.0f, 1.0f, 1, 0, 1.0f);
                Toast.makeText(this, "E♭", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_he:
                soundPool.play(noteHE, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "E", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_hf:
                soundPool.play(noteHF, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "F", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_hfs:
                soundPool.play(noteHFS, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "F#", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_hg:
                soundPool.play(noteHG, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "G", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_synth_hgs:
                soundPool.play(noteHGS, 1.0f, 1.0f, 1, 0, 1.0f);

                Toast.makeText(this, "G#", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_synth_scale:
                playScale();
                break;
            case R.id.button_main_twinkle:
                playTwinkle();
                break;
            case R.id.button_main_ns:
                playNoSurprises();
                break;
            case R.id.button_main_westworld:
                playWestworld();
                break;
        }
    }

    private void playWestworld() {
        playNote(noteA);
        delay(WHOLE_NOTE);
        playNote(noteA);
        delay(WHOLE_NOTE);
        playNote(noteF);
        delay(WHOLE_NOTE);
        playNote(noteF);
        delay(WHOLE_NOTE);
        playNote(noteA);
        playNote(noteHA);
        delay(WHOLE_NOTE/2);
        playNote(noteA);
        delay(WHOLE_NOTE/2);
        playNote(noteA);
        delay(WHOLE_NOTE/2);
        playNote(noteA);
        delay(WHOLE_NOTE/2);
        playNote(noteA);
        delay(WHOLE_NOTE/2);

    }

    private void playNoSurprises() {
        playNote(noteA);
        delay(WHOLE_NOTE/2);
        playNote(noteC);
        delay(WHOLE_NOTE/2);
        playNote(noteF);
        delay(WHOLE_NOTE/2);
        playNote(noteC);
        delay(WHOLE_NOTE/2);
        playNote(noteA);
        delay(WHOLE_NOTE/2);
        playNote(noteC);
        delay(WHOLE_NOTE/2);
        playNote(noteF);
        delay(WHOLE_NOTE/2);
        playNote(noteC);
        delay(WHOLE_NOTE/2);
        playNote(noteA);
        delay(WHOLE_NOTE/2);
        playNote(noteC);
        delay(WHOLE_NOTE/2);
        playNote(noteF);
        delay(WHOLE_NOTE/2);
        playNote(noteC);
        delay(WHOLE_NOTE/2);
        playNote(noteBb);
        delay(WHOLE_NOTE/2);
        playNote(noteCS);
        delay(WHOLE_NOTE/2);
        playNote(noteF);
        delay(WHOLE_NOTE/2);
        playNote(noteG);
        delay(WHOLE_NOTE/2);
    }

    private void playTwinkle() {
        playNote(noteA);
        delay(WHOLE_NOTE/2);
        playNote(noteA);
        delay(WHOLE_NOTE/2);
        playNote(noteE);
        delay(WHOLE_NOTE/2);
        playNote(noteE);
        delay(WHOLE_NOTE/2);
        playNote(noteFS);
        delay(WHOLE_NOTE/2);
        playNote(noteFS);
        delay(WHOLE_NOTE/2);
        playNote(noteE);
        delay(WHOLE_NOTE);
        playNote(noteD);
        delay(WHOLE_NOTE/2);
        playNote(noteD);
        delay(WHOLE_NOTE/2);
        playNote(noteCS);
        delay(WHOLE_NOTE/2);
        playNote(noteCS);
        delay(WHOLE_NOTE/2);
        playNote(noteB);
        delay(WHOLE_NOTE/2);
        playNote(noteB);
        delay(WHOLE_NOTE/2);
        playNote(noteA);
    }

    private void playScale() {
        playNote(noteA);
        delay(WHOLE_NOTE);
        playNote(noteBb);
        delay(WHOLE_NOTE);
        playNote(noteB);
        delay(WHOLE_NOTE);
        playNote(noteC);
        delay(WHOLE_NOTE);
        playNote(noteCS);
        delay(WHOLE_NOTE);
        playNote(noteD);
        delay(WHOLE_NOTE);
        playNote(noteEb);
        delay(WHOLE_NOTE);
        playNote(noteE);
        delay(WHOLE_NOTE);
        playNote(noteF);
        delay(WHOLE_NOTE);
        playNote(noteFS);
        delay(WHOLE_NOTE);
        playNote(noteG);
        delay(WHOLE_NOTE);
        playNote(noteGS);
    }

    private void delay(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void playNote(int note, int loop) {
        soundPool.play(note, DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRIORITY, loop, DEFAULT_RATE);
    }

    private void playNote(int note) {
        playNote(note, 0);
    }

}

package com.example.synthesizer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private Button buttonStarlight;
    private Button buttonSunburn;
    private Button buttonFringe;
    private Button buttonFord;
    private Button buttonGot;
    private Button buttonBHS;
    private SoundPool soundPool;
    private Map<Integer, Integer> noteMap;
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
        initializeNoteMap();
    }

    private void initializeNoteMap() {
        noteMap = new HashMap<>();
        //in a map you store a key value pair
        noteMap.put(R.id.button_synth_a, noteA);
        noteMap.put(R.id.button_synth_b, noteB);
        noteMap.put(R.id.button_synth_bb, noteBb);
        noteMap.put(R.id.button_synth_c, noteC);
        noteMap.put(R.id.button_synth_cs, noteCS);
        noteMap.put(R.id.button_synth_d, noteD);
        noteMap.put(R.id.button_synth_eb, noteEb);
        noteMap.put(R.id.button_synth_e, noteE);
        noteMap.put(R.id.button_synth_f, noteF);
        noteMap.put(R.id.button_synth_fs, noteFS);
        noteMap.put(R.id.button_synth_g, noteG);
        noteMap.put(R.id.button_synth_gs, noteGS);
        noteMap.put(R.id.button_synth_ha, noteHA);
        noteMap.put(R.id.button_synth_hbb, noteHBb);
        noteMap.put(R.id.button_synth_hb, noteHB);
        noteMap.put(R.id.button_synth_hc, noteHC);
        noteMap.put(R.id.button_synth_hcs, noteHCS);
        noteMap.put(R.id.button_synth_hd, noteHD);
        noteMap.put(R.id.button_synth_heb, noteHEb);
        noteMap.put(R.id.button_synth_he, noteHE);
        noteMap.put(R.id.button_synth_hf, noteHF);
        noteMap.put(R.id.button_synth_hfs, noteHFS);
        noteMap.put(R.id.button_synth_hg, noteHG);
        noteMap.put(R.id.button_synth_hgs, noteHGS);



        //the key is the button id, the value is the note id

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
        KeyboardNoteListener noteListener = new KeyboardNoteListener();
        buttonA.setOnClickListener(noteListener);
        buttonBb.setOnClickListener(noteListener);
        buttonB.setOnClickListener(noteListener);
        buttonC.setOnClickListener(noteListener);
        buttonCS.setOnClickListener(noteListener);
        buttonD.setOnClickListener(noteListener);
        buttonEb.setOnClickListener(noteListener);
        buttonE.setOnClickListener(noteListener);
        buttonF.setOnClickListener(noteListener);
        buttonFS.setOnClickListener(noteListener);
        buttonG.setOnClickListener(noteListener);
        buttonGS.setOnClickListener(noteListener);
        buttonHA.setOnClickListener(noteListener);
        buttonHBb.setOnClickListener(noteListener);
        buttonHB.setOnClickListener(noteListener);
        buttonHC.setOnClickListener(noteListener);
        buttonHCS.setOnClickListener(noteListener);
        buttonHD.setOnClickListener(noteListener);
        buttonHEb.setOnClickListener(noteListener);
        buttonHE.setOnClickListener(noteListener);
        buttonHF.setOnClickListener(noteListener);
        buttonHFS.setOnClickListener(noteListener);
        buttonHG.setOnClickListener(noteListener);
        buttonHGS.setOnClickListener(noteListener);
        buttonPlayScale.setOnClickListener(this);
        buttonTwinkle.setOnClickListener(this);
        buttonNoSurprises.setOnClickListener(this);
        buttonWestworld.setOnClickListener(this);
        buttonStarlight.setOnClickListener(this);
        buttonSunburn.setOnClickListener(this);
        buttonFringe.setOnClickListener(this);
        buttonFord.setOnClickListener(this);
        buttonGot.setOnClickListener(this);
        buttonBHS.setOnClickListener(this);
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
        buttonStarlight = findViewById(R.id.button_synth_starlight);
        buttonSunburn = findViewById(R.id.button_synth_sunburn);
        buttonFringe = findViewById(R.id.button_main_fringe);
        buttonFord = findViewById(R.id.button_main_ford);
        buttonGot = findViewById(R.id.button_main_got);
        buttonBHS = findViewById(R.id.button_main_blackholesun);


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
            case R.id.button_synth_starlight:
                playStarlight();
                break;
            case R.id.button_synth_sunburn:
                playSunburn();
                break;
            case R.id.button_main_fringe:
                playFringe();
                break;
            case R.id.button_main_ford:
                playFord();
                break;
            case R.id.button_main_got:
                playGot();
                break;
            case R.id.button_main_blackholesun:
                playBlackHoleSun();
                break;

        }
    }

    private void playBlackHoleSun() {
        Song bhs = new Song();
        bhs.add(new Note(noteHC, WHOLE_NOTE/2));
        bhs.add(new Note(noteHEb, WHOLE_NOTE/3));
        bhs.add(new Note(noteHF, WHOLE_NOTE));
        bhs.add(new Note(noteHC, WHOLE_NOTE/2));
        bhs.add(new Note(noteHEb, WHOLE_NOTE/3));
        bhs.add(new Note(noteHF, WHOLE_NOTE));
        bhs.add(new Note(noteHC, WHOLE_NOTE/2));
        bhs.add(new Note(noteHEb, WHOLE_NOTE/3));
        bhs.add(new Note(noteHF, WHOLE_NOTE/2));
        bhs.add(new Note(noteHGS, WHOLE_NOTE/3));
        bhs.add(new Note(noteHEb, WHOLE_NOTE/2));
        bhs.add(new Note(noteHF, WHOLE_NOTE/3));
        bhs.add(new Note(noteHC, WHOLE_NOTE));
        bhs.add(new Note(noteGS, WHOLE_NOTE/2));
        bhs.add(new Note(noteHBb, WHOLE_NOTE/3));
        bhs.add(new Note(noteHB, WHOLE_NOTE));
        bhs.add(new Note(noteHCS, WHOLE_NOTE/2));
        bhs.add(new Note(noteHB, WHOLE_NOTE/3));
        bhs.add(new Note(noteHBb, WHOLE_NOTE));
        bhs.add(new Note(noteGS, WHOLE_NOTE/3));
        bhs.add(new Note(noteG, WHOLE_NOTE/2));
        bhs.add(new Note(noteEb, WHOLE_NOTE));
        bhs.add(new Note(noteHC, WHOLE_NOTE/3));
        bhs.add(new Note(noteHC, WHOLE_NOTE/2));
        bhs.add(new Note(noteHBb, WHOLE_NOTE/2));
        bhs.add(new Note(noteHCS, WHOLE_NOTE));

        playSong(bhs);
    }

    private void playGot() {
        Song got = new Song();
        got.add(new Note(noteHG, WHOLE_NOTE/2));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteHEb, WHOLE_NOTE/4));
        got.add(new Note(noteHF, WHOLE_NOTE/4));
        got.add(new Note(noteHG, WHOLE_NOTE/2));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteHEb, WHOLE_NOTE/4));
        got.add(new Note(noteHF, WHOLE_NOTE/4));
        got.add(new Note(noteHG, WHOLE_NOTE/2));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteHEb, WHOLE_NOTE/4));
        got.add(new Note(noteHF, WHOLE_NOTE/4));
        got.add(new Note(noteHG, WHOLE_NOTE/2));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteHEb, WHOLE_NOTE/4));
        got.add(new Note(noteHF, WHOLE_NOTE/4));
        got.add(new Note(noteHG, WHOLE_NOTE/2));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteHE, WHOLE_NOTE/4));
        got.add(new Note(noteHF, WHOLE_NOTE/4));
        got.add(new Note(noteHG, WHOLE_NOTE/2));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteHE, WHOLE_NOTE/4));
        got.add(new Note(noteHF, WHOLE_NOTE/4));
        got.add(new Note(noteHG, WHOLE_NOTE/2));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteHE, WHOLE_NOTE/4));
        got.add(new Note(noteHF, WHOLE_NOTE/4));
        got.add(new Note(noteHG, WHOLE_NOTE/2));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteHE, WHOLE_NOTE));
        got.add(new Note(noteG, WHOLE_NOTE));
        got.add(new Note(noteC, WHOLE_NOTE));
        got.add(new Note(noteEb, WHOLE_NOTE/3));
        got.add(new Note(noteF, WHOLE_NOTE/3));
        got.add(new Note(noteG, WHOLE_NOTE/2));
        got.add(new Note(noteC, WHOLE_NOTE));
        got.add(new Note(noteEb, WHOLE_NOTE/3));
        got.add(new Note(noteF, WHOLE_NOTE/2));
        got.add(new Note(noteD, WHOLE_NOTE/3));
        got.add(new Note(noteA, WHOLE_NOTE/2));
        got.add(new Note(noteBb, WHOLE_NOTE/3));
        got.add(new Note(noteC, WHOLE_NOTE/3));
        got.add(new Note(noteD, WHOLE_NOTE/2));
        got.add(new Note(noteA, WHOLE_NOTE/2));
        got.add(new Note(noteBb, WHOLE_NOTE/3));
        got.add(new Note(noteC, WHOLE_NOTE/3));
        got.add(new Note(noteD, WHOLE_NOTE/2));
        got.add(new Note(noteA, WHOLE_NOTE/2));
        got.add(new Note(noteBb, WHOLE_NOTE/2));
        got.add(new Note(noteF, WHOLE_NOTE));
        got.add(new Note(noteBb, WHOLE_NOTE));
        got.add(new Note(noteEb, WHOLE_NOTE/3));
        got.add(new Note(noteD, WHOLE_NOTE/3));
        got.add(new Note(noteF, WHOLE_NOTE/2));
        got.add(new Note(noteBb, WHOLE_NOTE));
        got.add(new Note(noteEb, WHOLE_NOTE/3));
        got.add(new Note(noteD, WHOLE_NOTE/3));
        got.add(new Note(noteC, WHOLE_NOTE));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteG, WHOLE_NOTE/2));
        got.add(new Note(noteGS, WHOLE_NOTE/3));
        got.add(new Note(noteHBb, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteG, WHOLE_NOTE/2));
        got.add(new Note(noteGS, WHOLE_NOTE/3));
        got.add(new Note(noteHBb, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteG, WHOLE_NOTE/2));
        got.add(new Note(noteGS, WHOLE_NOTE/3));
        got.add(new Note(noteHBb, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteG, WHOLE_NOTE/2));
        got.add(new Note(noteGS, WHOLE_NOTE));
        got.add(new Note(noteHG, WHOLE_NOTE));
        got.add(new Note(noteHC, WHOLE_NOTE));
        got.add(new Note(noteHEb, WHOLE_NOTE/3));
        got.add(new Note(noteHF, WHOLE_NOTE/3));
        got.add(new Note(noteHG, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE));
        got.add(new Note(noteHEb, WHOLE_NOTE/3));
        got.add(new Note(noteHF, WHOLE_NOTE/2));
        got.add(new Note(noteHD, WHOLE_NOTE/3));
        got.add(new Note(noteHA, WHOLE_NOTE/2));
        got.add(new Note(noteHBb, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE/3));
        got.add(new Note(noteHD, WHOLE_NOTE/2));
        got.add(new Note(noteHA, WHOLE_NOTE/2));
        got.add(new Note(noteHBb, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE/3));
        got.add(new Note(noteHD, WHOLE_NOTE/2));
        got.add(new Note(noteHA, WHOLE_NOTE/2));
        got.add(new Note(noteHBb, WHOLE_NOTE/2));
        got.add(new Note(noteHF, WHOLE_NOTE));
        got.add(new Note(noteHBb, WHOLE_NOTE));
        got.add(new Note(noteHEb, WHOLE_NOTE/3));
        got.add(new Note(noteHD, WHOLE_NOTE/3));
        got.add(new Note(noteHF, WHOLE_NOTE/2));
        got.add(new Note(noteHBb, WHOLE_NOTE));
        got.add(new Note(noteHEb, WHOLE_NOTE/3));
        got.add(new Note(noteHD, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE));
        got.add(new Note(noteF, WHOLE_NOTE/2));
        got.add(new Note(noteGS, WHOLE_NOTE/3));
        got.add(new Note(noteHBb, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteF, WHOLE_NOTE/2));
        got.add(new Note(noteGS, WHOLE_NOTE/3));
        got.add(new Note(noteHBb, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteF, WHOLE_NOTE/2));
        got.add(new Note(noteGS, WHOLE_NOTE/3));
        got.add(new Note(noteHBb, WHOLE_NOTE/3));
        got.add(new Note(noteHC, WHOLE_NOTE/2));
        got.add(new Note(noteF, WHOLE_NOTE/2));
        got.add(new Note(noteHBb, WHOLE_NOTE));





        playSong(got);
    }

    private void playFord() {
        Song ford = new Song();
        ford.add(new Note(noteB, WHOLE_NOTE));
        ford.add(new Note(noteD, WHOLE_NOTE + 500));
        ford.add(new Note(noteBb, WHOLE_NOTE));
        ford.add(new Note(noteB, WHOLE_NOTE));
        ford.add(new Note(noteE, WHOLE_NOTE + 500));
        ford.add(new Note(noteBb, WHOLE_NOTE));
        ford.add(new Note(noteB, WHOLE_NOTE));
        ford.add(new Note(noteFS, WHOLE_NOTE + 500));
        ford.add(new Note(noteGS, WHOLE_NOTE));
        ford.add(new Note(noteHA, WHOLE_NOTE + 500));
        ford.add(new Note(noteGS, WHOLE_NOTE + 500));
        ford.add(new Note(noteB, WHOLE_NOTE));
        ford.add(new Note(noteD, WHOLE_NOTE + 500));
        ford.add(new Note(noteBb, WHOLE_NOTE));
        ford.add(new Note(noteBb, WHOLE_NOTE));
        ford.add(new Note(noteB, WHOLE_NOTE + 500));
        ford.add(new Note(noteE, WHOLE_NOTE));
        ford.add(new Note(noteFS, WHOLE_NOTE + 500));
        ford.add(new Note(noteB, WHOLE_NOTE));
        ford.add(new Note(noteF, WHOLE_NOTE));
        ford.add(new Note(noteFS, WHOLE_NOTE ));


        playSong(ford);
    }

    private void playFringe() {
        Song fringe = new Song();
        fringe.add(new Note(noteC, WHOLE_NOTE/3));
        fringe.add(new Note(noteEb, WHOLE_NOTE/3));
        fringe.add(new Note(noteG, WHOLE_NOTE/3));
        fringe.add(new Note(noteC, WHOLE_NOTE/3));
        fringe.add(new Note(noteEb, WHOLE_NOTE/3));
        fringe.add(new Note(noteG, WHOLE_NOTE/3));
        fringe.add(new Note(noteC, WHOLE_NOTE/3));
        fringe.add(new Note(noteEb, WHOLE_NOTE/3));
        fringe.add(new Note(noteC, WHOLE_NOTE/3));
        fringe.add(new Note(noteEb, WHOLE_NOTE/3));
        fringe.add(new Note(noteGS, WHOLE_NOTE/3));
        fringe.add(new Note(noteC, WHOLE_NOTE/3));
        fringe.add(new Note(noteEb, WHOLE_NOTE/3));
        fringe.add(new Note(noteGS, WHOLE_NOTE/3));
        fringe.add(new Note(noteC, WHOLE_NOTE/3));
        fringe.add(new Note(noteEb, WHOLE_NOTE/3));
        fringe.add(new Note(noteB, WHOLE_NOTE/3));
        fringe.add(new Note(noteD, WHOLE_NOTE/3));
        fringe.add(new Note(noteF, WHOLE_NOTE/3));
        fringe.add(new Note(noteB, WHOLE_NOTE/3));
        fringe.add(new Note(noteD, WHOLE_NOTE/3));
        fringe.add(new Note(noteF, WHOLE_NOTE/3));
        fringe.add(new Note(noteB, WHOLE_NOTE/3));
        fringe.add(new Note(noteD, WHOLE_NOTE/3));
        fringe.add(new Note(noteB, WHOLE_NOTE/3));
        fringe.add(new Note(noteD, WHOLE_NOTE/3));
        fringe.add(new Note(noteG, WHOLE_NOTE/3));
        fringe.add(new Note(noteB, WHOLE_NOTE/3));
        fringe.add(new Note(noteD, WHOLE_NOTE/3));
        fringe.add(new Note(noteG, WHOLE_NOTE/3));
        fringe.add(new Note(noteB, WHOLE_NOTE/3));
        fringe.add(new Note(noteD, WHOLE_NOTE/3));

        playSong(fringe);


    }

    private void playSunburn() {
        Song sunburn = new Song();
        sunburn.add(new Note(noteB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteA, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteA, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteA, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteG, WHOLE_NOTE/4));
        sunburn.add(new Note(noteA, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteHB, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));
        sunburn.add(new Note(noteC, WHOLE_NOTE/4));
        sunburn.add(new Note(noteE, WHOLE_NOTE/4));


        playSong(sunburn);
    }

    private void playStarlight() {
        Song starlight = new Song();
        starlight.add(new Note(noteHEb, WHOLE_NOTE/2));
        starlight.add(new Note(noteHB, WHOLE_NOTE/2));
        starlight.add(new Note(noteFS, WHOLE_NOTE/2));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/3));
        starlight.add(new Note(noteHE, WHOLE_NOTE/2));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/2));
        starlight.add(new Note(noteGS, WHOLE_NOTE/2));
        starlight.add(new Note(noteHE, WHOLE_NOTE/3));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/2));
        starlight.add(new Note(noteHB, WHOLE_NOTE/2));
        starlight.add(new Note(noteGS, WHOLE_NOTE/2));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/3));
        starlight.add(new Note(noteHE, WHOLE_NOTE/2));
        starlight.add(new Note(noteHB, WHOLE_NOTE/2));
        starlight.add(new Note(noteGS, WHOLE_NOTE));
        starlight.add(new Note(noteHCS, WHOLE_NOTE));
        starlight.add(new Note(noteHB, WHOLE_NOTE/3));
        starlight.add(new Note(noteHB, WHOLE_NOTE));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHB, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/2));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE));
        starlight.add(new Note(noteHB, WHOLE_NOTE/3));
        starlight.add(new Note(noteHB, WHOLE_NOTE));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHB, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/2));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHB, WHOLE_NOTE));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/3));
        starlight.add(new Note(noteHEb, WHOLE_NOTE));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/3));
        starlight.add(new Note(noteHE, WHOLE_NOTE/2));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/2));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/2));
        starlight.add(new Note(noteHEb, WHOLE_NOTE/3));
        starlight.add(new Note(noteHE, WHOLE_NOTE/3));
        starlight.add(new Note(noteHCS, WHOLE_NOTE/3));
        starlight.add(new Note(noteHB, WHOLE_NOTE/3));
        starlight.add(new Note(noteHB, WHOLE_NOTE/3));

        playSong(starlight);
    }

    private void playWestworld() {
        Song westworld = new Song();
        westworld.add(new Note(noteA, WHOLE_NOTE*2));
        westworld.add(new Note(noteA, WHOLE_NOTE*2));
        westworld.add(new Note(noteF, WHOLE_NOTE*2));
        westworld.add(new Note(noteF, WHOLE_NOTE*2));
        westworld.add(new Note(noteHA));
        westworld.add(new Note(noteHC));
        westworld.add(new Note(noteHD));
        westworld.add(new Note(noteHE));
        westworld.add(new Note(noteHE, WHOLE_NOTE*2));
        westworld.add(new Note(noteE, WHOLE_NOTE*2));
        westworld.add(new Note(noteHA));
        westworld.add(new Note(noteHE));
        westworld.add(new Note(noteHD));
        westworld.add(new Note(noteHC));
        westworld.add(new Note(noteHC, WHOLE_NOTE*2));
        westworld.add(new Note(noteF, WHOLE_NOTE*2));
        westworld.add(new Note(noteHA));
        westworld.add(new Note(noteHC));
        westworld.add(new Note(noteHD));
        westworld.add(new Note(noteHE));
        westworld.add(new Note(noteHE, WHOLE_NOTE*2));
        westworld.add(new Note(noteG, WHOLE_NOTE*2));
        westworld.add(new Note(noteHBb));
        westworld.add(new Note(noteHF));
        westworld.add(new Note(noteHE));
        westworld.add(new Note(noteHD));
        westworld.add(new Note(noteHE, WHOLE_NOTE*2));
        westworld.add(new Note(noteA, WHOLE_NOTE*2));
        westworld.add(new Note(noteHE, WHOLE_NOTE/2));
        westworld.add(new Note(noteHF, WHOLE_NOTE/3));
        westworld.add(new Note(noteHE, WHOLE_NOTE/2));
        westworld.add(new Note(noteHF, WHOLE_NOTE/3));
        westworld.add(new Note(noteHE, WHOLE_NOTE/3));
        westworld.add(new Note(noteHD, WHOLE_NOTE/3));
        westworld.add(new Note(noteHC, WHOLE_NOTE));
        westworld.add(new Note(noteHD, WHOLE_NOTE*2));
        westworld.add(new Note(noteHD, WHOLE_NOTE/2));
        westworld.add(new Note(noteHE, WHOLE_NOTE/3));
        westworld.add(new Note(noteHD, WHOLE_NOTE/2));
        westworld.add(new Note(noteHE, WHOLE_NOTE/3));
        westworld.add(new Note(noteHD, WHOLE_NOTE/3));
        westworld.add(new Note(noteHC, WHOLE_NOTE/3));
        westworld.add(new Note(noteG, WHOLE_NOTE));
        westworld.add(new Note(noteA, WHOLE_NOTE));
        westworld.add(new Note(noteG, WHOLE_NOTE*2));
        westworld.add(new Note(noteHF, WHOLE_NOTE/2));
        westworld.add(new Note(noteHG, WHOLE_NOTE/3));
        westworld.add(new Note(noteHF, WHOLE_NOTE/2));
        westworld.add(new Note(noteHG, WHOLE_NOTE/3));
        westworld.add(new Note(noteHF, WHOLE_NOTE/2));
        westworld.add(new Note(noteHE));
        westworld.add(new Note(noteHD, WHOLE_NOTE));
        westworld.add(new Note(noteHF, WHOLE_NOTE/2));
        westworld.add(new Note(noteHE, WHOLE_NOTE*2));


        playSong(westworld);

    }

    private void playNoSurprises() {
        Song noSurprises = new Song();
        noSurprises.add(new Note(noteA, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteF, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteA, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteF, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteA, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteF, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteBb, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteCS, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteF, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteG, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteA, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteF, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteA, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteF, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteA, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteF, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteC, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteB, WHOLE_NOTE/4));
        noSurprises.add(new Note(noteBb, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteCS, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteF, WHOLE_NOTE/2));
        noSurprises.add(new Note(noteG, WHOLE_NOTE/2));

        playSong(noSurprises);
    }

    private void playTwinkle() {
        Song twinkle = new Song();
        twinkle.add(new Note(noteA, WHOLE_NOTE/2));
        twinkle.add(new Note(noteA, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHE, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHE, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHFS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHFS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHE));
        twinkle.add(new Note(noteD, WHOLE_NOTE/2));
        twinkle.add(new Note(noteD, WHOLE_NOTE/2));
        twinkle.add(new Note(noteCS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteCS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteB, WHOLE_NOTE/2));
        twinkle.add(new Note(noteB, WHOLE_NOTE/2));
        twinkle.add(new Note(noteA));
        twinkle.add(new Note(noteHE, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHE, WHOLE_NOTE/2));
        twinkle.add(new Note(noteD, WHOLE_NOTE/2));
        twinkle.add(new Note(noteD, WHOLE_NOTE/2));
        twinkle.add(new Note(noteCS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteCS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteB));
        twinkle.add(new Note(noteHE, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHE, WHOLE_NOTE/2));
        twinkle.add(new Note(noteD, WHOLE_NOTE/2));
        twinkle.add(new Note(noteD, WHOLE_NOTE/2));
        twinkle.add(new Note(noteCS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteCS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteB));
        twinkle.add(new Note(noteA, WHOLE_NOTE/2));
        twinkle.add(new Note(noteA, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHE, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHE, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHFS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHFS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteHE));
        twinkle.add(new Note(noteD, WHOLE_NOTE/2));
        twinkle.add(new Note(noteD, WHOLE_NOTE/2));
        twinkle.add(new Note(noteCS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteCS, WHOLE_NOTE/2));
        twinkle.add(new Note(noteB, WHOLE_NOTE/2));
        twinkle.add(new Note(noteB, WHOLE_NOTE/2));
        twinkle.add(new Note(noteA));


        playSong(twinkle);

    }

    private void playScale() {
        Song scale = new Song();
        scale.add(new Note(noteA));
        scale.add(new Note(noteBb));
        scale.add(new Note(noteB));
        scale.add(new Note(noteC));
        scale.add(new Note(noteCS));
        scale.add(new Note(noteD));
        scale.add(new Note(noteEb));
        scale.add(new Note(noteE));
        scale.add(new Note(noteF));
        scale.add(new Note(noteG));
        scale.add(new Note(noteGS));
        scale.add(new Note(noteHA));
        scale.add(new Note(noteHBb));
        scale.add(new Note(noteHB));
        scale.add(new Note(noteHC));
        scale.add(new Note(noteHCS));
        scale.add(new Note(noteHD));
        scale.add(new Note(noteHEb));
        scale.add(new Note(noteHE));
        scale.add(new Note(noteHF));
        scale.add(new Note(noteHG));
        scale.add(new Note(noteHGS));

        playSong(scale);
    }

    private void playSong(Song song) {
        for(Note note: song.getNotes()) {
            playNote(note);
            delay(note.getDelay());
        }
    }

    private void delay(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void playNote(Note note){
        playNote(note.getNoteId(), 0);
    }

    private void playNote(int note, int loop) {
        soundPool.play(note, DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRIORITY, loop, DEFAULT_RATE);
    }

    private void playNote(int note) {
        playNote(note, 0);
    }

    private class KeyboardNoteListener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            int id = v.getId();
            int note = noteMap.get(id);
            playNote(note);
        }
    }

}

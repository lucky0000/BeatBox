package com.bignerdranch.android.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";

    private AssetManager mAssets;
    private List<Sound> sounds = new ArrayList<>();

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        loadSounds();
    }

    private void loadSounds() {
        String[] soundNames = new String[0];

        try {
            soundNames = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG, "loadSounds: " + soundNames.length);

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String filename :
                soundNames) {
            String assetPath = SOUNDS_FOLDER + "/" + filename;
            Sound sound = new Sound(assetPath);
            sounds.add(sound);

        }


    }

    public List<Sound> getSounds() {
        return sounds;
    }

}

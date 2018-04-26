package com.bignerdranch.android.beatbox;

public class Sound {
    private String assetPath;

    public String getAssetPath() {
        return assetPath;
    }

    public String getName() {
        return name;
    }

    private String name;

    public Sound(String assetPath) {
        this.assetPath = assetPath;
        String[] componts = assetPath.split("/");
        String filename = componts[componts.length - 1];
        name = filename.replace(".wav", "");
    }

    private Integer soundId;

    public Integer getSoundId() {
        return soundId;
    }

    public void setSoundId(Integer soundId) {
        this.soundId = soundId;
    }
}

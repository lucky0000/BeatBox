package com.bignerdranch.android.beatbox;

public class SoundViewModel {
    private Sound sound;
    private BeatBox beatBox;

    public SoundViewModel(BeatBox box) {
        beatBox=box;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public String getTitle() {
        return sound.getName();
    }

    public void onButtonClicked() {
        beatBox.play(sound);
    }
}

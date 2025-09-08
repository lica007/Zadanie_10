package ru.netology.statistic;

public class Radio {
    private int nomberRadioStation;
    private int soundVolume;

    public int getNomberRadioStation() {
        return nomberRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setNomberRadioStation(int newNomberRadioStation) {
        if (newNomberRadioStation < 0) {
            return;
        }
        if (newNomberRadioStation > 9) {
            return;
        }
        nomberRadioStation = newNomberRadioStation;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 100) {
            return;
        }
        if (newSoundVolume < 0) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseStation1p() {
        if (nomberRadioStation < 9) {
            nomberRadioStation += 1;
        } else {
            nomberRadioStation = 0;
        }
    }

    public void decreaseStation1p() {
        if (nomberRadioStation > 0) {
            nomberRadioStation -= 1;
        } else {
            nomberRadioStation = 9;
        }
    }

    public void increaseSoundVolume() {
        if (soundVolume < 100) {
            soundVolume += 1;
        } else {
            return;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > 0) {
            soundVolume -= 1;
        } else {
            return;
        }
    }
}

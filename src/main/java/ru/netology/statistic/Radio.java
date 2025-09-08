package ru.netology.statistic;

public class Radio {
    private int soundVolume;
    private int stationCont = 10;
    private int nomberRadioStation;

    public Radio(int newStationCont) {
        this.stationCont = newStationCont;
    }

    public Radio() {

    }

    public int getNomberRadioStation() { return nomberRadioStation; }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setNomberRadioStation(int newNomberRadioStation) {
        if (newNomberRadioStation < 0 || newNomberRadioStation >= stationCont) {
            return;
        }
        nomberRadioStation = newNomberRadioStation;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 100 || newSoundVolume < 0) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseStation1p() {
        if (nomberRadioStation < stationCont - 1) {
            nomberRadioStation++;
        } else {
            nomberRadioStation = 0;
        }
    }

    public void decreaseStation1p() {
        if (nomberRadioStation > 0) {
            nomberRadioStation--;
        } else {
            nomberRadioStation = stationCont - 1;
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

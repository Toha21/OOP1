package ru.netology;

public class Radio {
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if(newCurrentVolume < 0){
            return;
        }
        if (newCurrentVolume > 10){
            return;
        }
        currentVolume = newCurrentVolume;
    }

    private int currentVolume;

    public void next(){
        if (currentStation < 9){
            currentStation ++;
        }else {
            currentStation = 0;
        }
    }
    public void prev(){
        if (currentStation > 0 ){
            currentStation --;
        }else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0){
            return;
        }
        if (newCurrentStation > 9){
            return;
        }
        this.currentStation = newCurrentStation;
    }
    public void increaseVolume(){
        if (currentVolume < 10){
            currentVolume++;
        }else {
            currentVolume = 10;
        }
    }
    public void decreaseVolume(){
        if (currentVolume > 0){
            currentVolume--;
        }else {
            currentVolume = 0;
        }
    }

}

public class Radio {
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }


    public int numberStation;

    public int getNumberStation() {
        return numberStation;
    }

    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            newCurrentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;

    }

    public void setDecreaseVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNumberStation(int newNumberStation) {
        if ((newNumberStation < 9) && (newNumberStation > 0)) {
            newNumberStation = newNumberStation + 1;
        }
        if (newNumberStation > 9) {
            newNumberStation = 0;
        }
        if (newNumberStation < 0) {
            newNumberStation = 9;
        }

        numberStation = newNumberStation;
    }


}

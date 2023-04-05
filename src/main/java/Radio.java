public class Radio {
    private int currentVolume;

    private int numberStation;


    public int getCurrentVolume() {
        return currentVolume;
    }


    public int getNumberStation() {
        return numberStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void switchStationUp() {
        if (numberStation == 9) {
            numberStation = 0;
        } else {
            numberStation = numberStation + 1;
        }

    }

    public void switchStationDown() {
        if (numberStation == 0) {
            numberStation = 9;
        } else {
            numberStation = numberStation - 1;
        }


    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }


    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;


        }
    }


}




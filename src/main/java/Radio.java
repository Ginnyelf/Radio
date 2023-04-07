

public class Radio {
    private int currentVolume;

    private int numberStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberOfRadioStations = 10;

    private int maxNumberStation = numberOfRadioStations - 1;
    private int minNumberStation = 0;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
        this.maxNumberStation = numberOfRadioStations - 1;


    }

    public Radio() {
        this.numberOfRadioStations = getNumberOfRadioStations();
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public int getNumberStation() {
        return numberStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > maxNumberStation) {
            return;
        }
        if (newNumberStation < minNumberStation) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void switchStationUp() {
        if (numberStation == maxNumberStation) {
            numberStation = 0;
        } else {
            numberStation = numberStation + 1;
        }

    }

    public void switchStationDown() {
        if (numberStation == minNumberStation) {
            numberStation = maxNumberStation;
        } else {
            numberStation = numberStation - 1;
        }


    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }


    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;


        }
    }


}




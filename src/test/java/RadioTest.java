import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void volumeAboveMax() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(101);
        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void volumeAboveMin() {
        Radio rad = new Radio();
        rad.setDecreaseVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void plusVolume() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(20);
        int expected = 21;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void stationAboveMax() {
        Radio rad = new Radio();
        rad.setNumberStation(10);
        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void stationAboveMin() {
        Radio rad = new Radio();
        rad.setNumberStation(-1);
        int expected = 9;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void stationPlus() {
        Radio rad = new Radio();
        rad.setNumberStation(8);
        int expected = 9;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);


    }
}

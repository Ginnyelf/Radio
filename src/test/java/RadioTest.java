import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void plusVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void minusVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void minusStation() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        rad.switchStationDown();
        int expected = 9;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void plusStation() {
        Radio rad = new Radio();
        rad.setNumberStation(9);
        rad.switchStationUp();
        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);


    }

}

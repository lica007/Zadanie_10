import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();
        rad.setNomberRadioStation(5);

        int expected = 5;
        int actual = rad.getNomberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSetRadioStation() {
        Radio rad = new Radio(12);
        rad.setNomberRadioStation(12);

        int expected = 0;
        int actual = rad.getNomberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinBorderlineSetRadioStation() {
        Radio rad = new Radio();
        rad.setNomberRadioStation(0);

        int expected = 0;
        int actual = rad.getNomberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderlineSetRadioStation() {
        Radio rad = new Radio();
        rad.setNomberRadioStation(9);

        int expected = 9;
        int actual = rad.getNomberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativRadioStation() {
        Radio rad = new Radio();
        rad.setNomberRadioStation(-5);

        int expected = 0;
        int actual = rad.getNomberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderlineIncreaseStation1p() {
        Radio rad = new Radio(12);
        rad.setNomberRadioStation(11);
        rad.increaseStation1p();

        int expected = 0;
        int actual = rad.getNomberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation1p() {
        Radio rad = new Radio();
        rad.setNomberRadioStation(2);
        rad.increaseStation1p();

        int expected = 3;
        int actual = rad.getNomberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinBorderlineDecreaseStation1p() {
        Radio rad = new Radio();
        rad.setNomberRadioStation(0);
        rad.decreaseStation1p();

        int expected = 9;
        int actual = rad.getNomberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation1p() {
        Radio rad = new Radio(12);
        rad.setNomberRadioStation(1);
        rad.decreaseStation1p();

        int expected = 0;
        int actual = rad.getNomberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(85);

        int expected = 85;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSetSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(101);

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSetSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(-1);

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinBorderlineSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(0);

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderlineSoundVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(100);

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolume1p() {
        Radio rad = new Radio();
        rad.setSoundVolume(10);
        rad.increaseSoundVolume();

        int expected = 11;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderlineIncreaseSoundVolume1p() {
        Radio rad = new Radio();
        rad.setSoundVolume(100);
        rad.increaseSoundVolume();

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume1p() {
        Radio rad = new Radio();
        rad.setSoundVolume(10);
        rad.decreaseSoundVolume();

        int expected = 9;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinBorderDecreaseSoundVolume1p() {
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        rad.decreaseSoundVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}

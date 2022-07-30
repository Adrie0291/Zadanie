import Wzorce.WzorceProjektowe.Day2.BrudnyKod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BrudnyKodTest {

    @Test
    void addNumbers() {
        int first = 49;
        int second = 932;
        int expected = first + second;

        int actual = BrudnyKod.addNumbers(first, second, "jakis tekst");
        Assertions.assertEquals(expected, actual);

    }
}
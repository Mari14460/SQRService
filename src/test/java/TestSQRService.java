import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSQRService {
    @ParameterizedTest
    @CsvFileSource(resources = "/SQRServiceData.csv")
    void testSquareNumber(int expected, int limitMin, int limitMax) {
        SQRService sQRService = new SQRService();
        int actual = sQRService.calculateSquareNumber(limitMin, limitMax);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}

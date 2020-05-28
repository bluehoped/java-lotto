package step2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("로또 판매자 클래스 테스트")
public class LottoSellerTest {

    @ParameterizedTest
    @CsvSource(value = {"1000:1", "10000:10", "7000:7"}, delimiter = ':')
    @DisplayName("금액 입력받고 금액만큼 로또 받는 테스트")
    void putMoneyGetLottoNumberList(int input, int expected) {
        LottoSeller seller = new LottoSeller();
        List<LotteryNumbers> lotteryNumbersList = seller.receiveMoney(input);

        assertThat(lotteryNumbersList).hasSize(expected);

    }

}

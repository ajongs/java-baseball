package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class GameTest {
    @Test
    void 컴퓨터가_생성한_숫자_조건체크(){
        Game game = new Game();
        List<Integer> result = game.createComputerNumber();

        assertThat(result.size()).isEqualTo(3);
        assertThat(result.get(0) != result.get(1)).isEqualTo(true);
        assertThat(result.get(0) != result.get(2)).isEqualTo(true);
        assertThat(result.get(1) != result.get(2)).isEqualTo(true);
    }

    @Test
    void 사용자_숫자_입력받기(){
        Game game = new Game();
        String userNumber = "123";

        InputStream in = new ByteArrayInputStream(userNumber.getBytes());
        System.setIn(in);
        List<Integer> user = game.inputUserNumber();
        assertThat(user.get(0)).isEqualTo(1);
        assertThat(user.get(1)).isEqualTo(2);
        assertThat(user.get(2)).isEqualTo(3);

    }
}
package racingcar.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarMoveServiceTest {

    @DisplayName("")
    @Test
    void move() {

    }

    @DisplayName("이동여부를 결정한다.")
    @Test
    void isMove() {
        CarMoveService carMoveService = new CarMoveService("1");
        assertTrue(carMoveService.isMove() >= 0);
        assertTrue(carMoveService.isMove() <= 1);
    }
}
package racingcar.controller;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Round;
import racingcar.view.InputView;

public class RacingcarController {
    private final InputView inputView = new InputView();

    public void run() {
        List<Car> cars = inputView.readCarNames().stream()
                .map(Car::new)
                .toList();
        Round round = new Round(inputView.readTryCount());
    }
}
package view.input;

import view.output.OutputView;

import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String CAR_NAMES_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String TRY_COUNT_INPUT_MESSAGE = "시도할 회수는 몇회인가요?";
    private final Scanner scanner;
    private final InputValidator inputValidator = new InputValidator();


    public InputView(final Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> readCarName() {
        OutputView.printAnnounceMessage(CAR_NAMES_INPUT_MESSAGE);

        final String delimiter = ",";
        String carNames = scanner.nextLine();
        List<String> splitCarNames = List.of(carNames.split(delimiter));

        inputValidator.validateCarName(splitCarNames);
        return splitCarNames;
    }

    public int readGameTry() {
        OutputView.printAnnounceMessage(TRY_COUNT_INPUT_MESSAGE);

        String gameTry = scanner.nextLine();

        inputValidator.validateGameTry(gameTry);
        return Integer.parseInt(gameTry);
    }
}
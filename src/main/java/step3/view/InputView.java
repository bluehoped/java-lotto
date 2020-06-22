package step3.view;

import step3.util.InputScanner;

public class InputView {

    private InputView() {}

    public static InputView addQuestion(String message) {
        System.out.println(message);
        return new InputView();
    }

    public int inputPrice() {
        return InputScanner.inputNumber();
    }

    public String inputWinnerNumbers() {
        return InputScanner.inputString();
    }
}

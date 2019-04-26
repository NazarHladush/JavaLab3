package ua.lviv.iot;

import java.util.List;

public class Main {
    public static void main(final String[]args) {
        RegexWorker regexWorker = new RegexWorker();
        String text = RegexWorker.readInputText();
        List<String> creditCard = regexWorker.searchCreditCard(text);
        regexWorker.showResult(creditCard);
    }
}

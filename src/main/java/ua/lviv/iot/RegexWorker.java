package ua.lviv.iot;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWorker {

    private List<String> cardList = new LinkedList<>();

    public static String readInputText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public List<String> searchCreditCard(final String string) {
        Pattern pattern = Pattern.compile(
                "(\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4})|(\\d{16})");

        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String cardNumber = matcher.group();
            System.out.println(cardNumber);
            cardList.add(cardNumber);
        }
        return cardList;
    }

        public void showResult(final List<String> cardList) {
             for (String card : cardList) {
                System.out.println("Card number: "  + card);
            }
        }
    }

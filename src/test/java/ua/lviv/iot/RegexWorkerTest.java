package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegexWorkerTest {
private String inputText;
public List<String> list = new LinkedList<>();

    @BeforeEach
    void setUp() {
        inputText = "tyctugvyvyvyi 4444 7777 8888 9999 " +
                "hvykgvyvbygkihil 8888 7777 4444 5555 kvslm;" +
                "smc 8974569823014528 re";
        list.add("4444 7777 8888 9999");
        list.add("8888 7777 4444 5555");
        list.add("8974569823014528");
    }

    @Test
    void searchCreditCard() {
        RegexWorker regexWorker = new RegexWorker();
        List<String> cardList = regexWorker.searchCreditCard(inputText);
        assertNotNull(cardList);
        assertEquals(list,cardList);
    }
}

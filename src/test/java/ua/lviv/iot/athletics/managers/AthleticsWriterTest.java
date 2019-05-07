package ua.lviv.iot.athletics.managers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.athletics.models.*;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AthleticsWriterTest {

    private List<Athletics> athletics = new LinkedList<>();

    @BeforeEach
    void setUp() {
        athletics.add(new Throw(16, "Throw",
                false, 120, 16,
                ThrowType.BULLET));
        athletics.add(new Throw(177, "Throw",
                false, 127, 19,
                ThrowType.DISK));
        athletics.add(new Run(122, "Run",
                true, 30, 188,
                RunType.LONG, 77, 99));
        athletics.add(new Run(142, "Run",
                true, 35, 111,
                RunType.MIDDLE, 45, 101));
        athletics.add(new Jumping(17, "Jumping",
                false, 125, 5, JumpType.TRIPLEJUMP,
                4.3));
        athletics.add(new SportWalking(17, "SportWalking",
                false, 128, 5, 88, 15));
    }

    @Test
    void writeToFile() {
        AthleticsWriter writer = new AthleticsWriter();
        writer.writeToFile(athletics);

        File myFile = new File("result.csv");
        assertTrue(myFile.exists() && myFile.isFile(),
                "Initialization file problem");

        try (FileInputStream fis = new FileInputStream("result.csv");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr)) {

            for (Athletics athletic : athletics) {
                assertEquals(athletic.getHeaders(), bufReader.readLine());
                assertEquals(athletic.toCSV(), bufReader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

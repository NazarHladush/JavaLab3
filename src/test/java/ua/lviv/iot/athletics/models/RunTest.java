package ua.lviv.iot.athletics.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {
    @Test
    void runTypeGetterAndSetter() {
        Run run = new Run();
        run.setKindOfRun(RunType.MIDDLE);
        assertEquals(RunType.MIDDLE, run.getKindOfRun());
    }

    @Test
    void speedGetterAndSetter() {
        Run run = new Run();
        run.setSpeed(45);
        assertEquals(45, run.getSpeed());
    }

    @Test
    void timeGetterAndSetter() {
        Run run = new Run();
        run.setTime(7);
        assertEquals(7, run.getTime());
    }
}

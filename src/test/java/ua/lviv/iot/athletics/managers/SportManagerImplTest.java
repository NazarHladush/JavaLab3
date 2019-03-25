package ua.lviv.iot.athletics.managers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.athletics.models.*;

import java.util.List;

class SportManagerImplTest {

    private SportManager sportManager;

    @BeforeEach
    void setAthletics() {
        sportManager = new SportManagerImpl();
        sportManager.addAthletics(new Throw(16, "Throw",
                false, 120, 16,
                ThrowType.BULLET));
        sportManager.addAthletics(new Throw(177, "Throw",
                false, 127, 19,
                ThrowType.DISK));
        sportManager.addAthletics(new Run(122, "Run",
                true, 30, 188,
                RunType.LONG, 77, 99));
        sportManager.addAthletics(new Run(142, "Run",
                true, 35, 111,
                RunType.MIDDLE, 45, 101));
        sportManager.addAthletics(new Jumping(17, "Jumping",
                false, 125, 5, JumpType.TRIPLEJUMP,
                4.3));
        sportManager.addAthletics(new SportWalking(17, "Jumping",
                false, 128, 5, 88, 15));
    }

    @Test
    void searchKindsOfSportsWithFinishLine() {
        List<Athletics> resultAthletics = sportManager.
                searchKindsOfSports(true);
        Assertions.assertEquals(2, resultAthletics.size());
        Assertions.assertTrue(resultAthletics.get(0).
                isAvailabilityFinishLine());
    }

    @Test
    void searchKindsOfSportsWithoutFinishLine() {
        List<Athletics> resultAthletics = sportManager.
                searchKindsOfSports(false);
        Assertions.assertEquals(4, resultAthletics.size());
        Assertions.assertFalse(resultAthletics.get(0).
                isAvailabilityFinishLine());
    }

    @Test
    void sortAscendingAverageDuration() {
        List<Athletics> resultAthletics = sportManager.
                sortAverageDuration(sportManager.getList(), true);
        for (int i = 1; i < resultAthletics.size(); i++) {
            Assertions.assertTrue(resultAthletics.get(i - 1).
                    getAverageDuration() >= resultAthletics.get(i).
                    getAverageDuration());
        }
        Assertions.assertNotNull(resultAthletics);
    }

    @Test
    void sortDescendingAverageDuration() {
        List<Athletics> resultAthletics = sportManager.
                sortAverageDuration(sportManager.getList(), false);
        for (int i = 1; i < resultAthletics.size(); i++) {
            Assertions.assertTrue(resultAthletics.get(i - 1).
                    getAverageDuration() <= resultAthletics.get(i).
                    getAverageDuration());
        }
        Assertions.assertNotNull(resultAthletics);
    }

    @Test
    void sortAscendingMaxfAthleteCount() {
        List<Athletics> resultAthletics = sportManager.
                sortMaxfAthleteCount(sportManager.getList(), true);
        for (int i = 1; i < resultAthletics.size(); i++) {
            Assertions.assertTrue(resultAthletics.get(i - 1).
                    getMaxfAthleteCount() >= resultAthletics.get(i).
                    getMaxfAthleteCount());
        }
        Assertions.assertNotNull(resultAthletics);
    }

    @Test
    void sortDescendingMaxfAthleteCount() {
        List<Athletics> resultAthletics = sportManager.
                sortMaxfAthleteCount(sportManager.getList(), false);
        for (int i = 1; i < resultAthletics.size(); i++) {
            Assertions.assertTrue(resultAthletics.get(i - 1).
                    getMaxfAthleteCount() <= resultAthletics.get(i).
                    getMaxfAthleteCount());
        }
        Assertions.assertNotNull(resultAthletics);
    }
}

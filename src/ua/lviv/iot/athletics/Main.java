package ua.lviv.iot.athletics;

import ua.lviv.iot.athletics.managers.SportManagerImpl;
import ua.lviv.iot.athletics.models.*;


import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Athletics> athletics = new ArrayList();
        athletics.add(new Throw(16, "Throw",
                false, 120, 16,
                ThrowType.BULLET));
        athletics.add(new SportWalking(19, "SportWalking",
                true, 544, 188,
                455, 77));
        athletics.add(new Run(122, "Run",
                true, 30, 188,
                RunType.LONG, 77, 99));
        athletics.add(new Jumping(17, "Jumping",
                false, 100, 188,
                JumpType.TRIPLEJUMP, 856));

        SportManagerImpl manager = new SportManagerImpl(athletics);

        manager.searchKindsOfSports(true);

        manager.sortAverageDuration(athletics, true);


        manager.sortMaxfAthleteCount(athletics, true);

    }

}

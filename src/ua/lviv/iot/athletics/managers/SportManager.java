package ua.lviv.iot.athletics.managers;

import ua.lviv.iot.athletics.models.*;

import java.util.List;

public interface SportManager {
    List<Athletics> searchKindsOfSports(boolean availabilityFinishLine);

    void sortAverageDuration(List<Athletics> athletics, boolean reverse);

    void sortMaxfAthleteCount(List<Athletics> athletics, boolean reverse);
}

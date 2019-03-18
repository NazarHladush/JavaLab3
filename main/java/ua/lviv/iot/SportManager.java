package ua.lviv.iot;

import ua.lviv.iot.athletics.models.Athletics;

import java.util.List;

public interface SportManager {
    List<Athletics> searchKindsOfSports(final boolean availabilityFinishLine);

    void sortAverageDuration(final List<Athletics> athletics,
                             final boolean reverse);

    void sortMaxfAthleteCount(final List<Athletics> athletics,
                              final boolean reverse);

    void addAthletics(Athletics athletic);
}

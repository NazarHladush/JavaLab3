package ua.lviv.iot.athletics.managers;

import ua.lviv.iot.athletics.models.Athletics;

import java.util.List;

public interface SportManager {
    List<Athletics> searchKindsOfSports(final boolean availabilityFinishLine);

    List<Athletics> sortAverageDuration(final List<Athletics> athletics,
                                        final boolean reverse);

    List<Athletics> sortMaxfAthleteCount(final List<Athletics> athletics,
                                         final boolean reverse);

    void addAthletics(Athletics athletic);

    List<Athletics> getList();
}

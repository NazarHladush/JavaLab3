package ua.lviv.iot.athletics.managers;

import ua.lviv.iot.athletics.models.Athletics;

import java.util.Collections;
import java.util.List;

public class SportManagerImpl implements SportManager {

    private List<Athletics> athletics;

    public void setAthletics(List<Athletics> athletics) {
        this.athletics = athletics;
    }

    public SportManagerImpl(List<Athletics> athletics) {
        this.athletics = athletics;
    }

    @Override
    public List<Athletics> searchKindsOfSports(boolean availabilityFinishLine) {
        athletics.stream().filter(athletics1 -> (athletics1.isAvailabilityFinishLine() == availabilityFinishLine)).forEach(athletics1 -> System.out.println(athletics1.getNameKindOfSports() + "  " + athletics1.isAvailabilityFinishLine()));
        return null;
    }

    @Override
    public List<Athletics> sortAverageDuration() {
        athletics.sort((Athletics a1, Athletics a2) -> (Double.compare(a1.getAverageDuration(), a2.getAverageDuration())));
        return athletics;
    }

    @Override
    public List<Athletics> sortMaxfAthleteCount() {
        athletics.sort((Athletics a1, Athletics a2) -> (Integer.compare(a1.getMaxfAthleteCount(), a2.getMaxfAthleteCount())));
        return athletics;
    }
}

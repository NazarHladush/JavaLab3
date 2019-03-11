package ua.lviv.iot.athletics.managers;

import ua.lviv.iot.athletics.models.Athletics;

import java.util.Collections;
import java.util.Comparator;
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
    public void sortAverageDuration(List<Athletics> athletics, boolean reverse) {

        if (reverse) {
            Collections.sort(athletics, Comparator.comparing(Athletics::getAverageDuration).reversed());
            athletics.stream().forEach(System.out::println);

        }
        else {
            Collections.sort(athletics, Comparator.comparing(Athletics::getAverageDuration));
            athletics.stream().forEach(Athletics::getAverageDuration);
        }
    }

    @Override
    public void sortMaxfAthleteCount(List<Athletics> athletics, boolean reverse) {
        if (reverse){
            Collections.sort(athletics, Comparator.comparing(Athletics::getMaxfAthleteCount).reversed());
        }
        else {
            Collections.sort(athletics, Comparator.comparing(Athletics::getMaxfAthleteCount));
        }
    }
}

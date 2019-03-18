package ua.lviv.iot;

import ua.lviv.iot.athletics.models.Athletics;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SportManagerImpl implements SportManager {

    private List<Athletics> athletics = new LinkedList<>();

    public void setAthletics(final List<Athletics> athletics) {
        this.athletics = athletics;
    }

    public SportManagerImpl(final List<Athletics> athletics) {
        this.athletics = athletics;
    }

    public SportManagerImpl() {
    }

    @Override
    public void addAthletics(final Athletics athletic) {
        athletics.add(athletic);
    }

    @Override
    public List<Athletics> searchKindsOfSports(
            final boolean availabilityFinishLine) {
        List<Athletics> result = new LinkedList<>();
        athletics.stream().filter(athletics1 -> (athletics1.
                isAvailabilityFinishLine() == availabilityFinishLine)).
                forEach(athletics1 -> result.add(athletics1));
        System.out.println("result is:" + result);
        return result;
    }

    @Override
    public void sortAverageDuration(final List<Athletics> athletics,
                                    final boolean reverse) {

        if (reverse) {
            Collections.sort(athletics, Comparator.comparing(
                    Athletics::getAverageDuration).reversed());
            athletics.stream().forEach(System.out::println);
        } else {
            Collections.sort(athletics, Comparator.comparing(
                    Athletics::getAverageDuration));
            athletics.stream().forEach(Athletics::getAverageDuration);
        }
    }

    @Override
    public void sortMaxfAthleteCount(final List<Athletics> athletics,
                                     final boolean reverse) {
        if (reverse) {
            Collections.sort(athletics, Comparator.comparing(
                    Athletics::getMaxfAthleteCount).reversed());
        } else {
            Collections.sort(athletics, Comparator.comparing(
                    Athletics::getMaxfAthleteCount));
        }
    }
}

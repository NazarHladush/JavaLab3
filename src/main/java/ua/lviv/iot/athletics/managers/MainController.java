package ua.lviv.iot.athletics.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.athletics.models.Athletics;
import ua.lviv.iot.athletics.models.Run;
import ua.lviv.iot.athletics.models.RunType;

@RestController
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private RunRepository runRepository;

    @GetMapping("/athletics")
    public Iterable<Run> find() {
       return runRepository.findAll();
    }

    @GetMapping("/athletics/{id}")
    public Athletics findById(@PathVariable Integer id) {
        return runRepository.findById(id).orElseThrow();
    }

    @PostMapping("/athletics")
    public Run add(@RequestBody Run newRun) {
        return runRepository.save(newRun);
    }

    @PutMapping("/athletics/{id}")
    public Run edit(@RequestBody Run newRun, @PathVariable Integer id) {

        return runRepository.findById(id).map(run -> {
            run.setMaxfAthleteCount(newRun.getMaxfAthleteCount());
            run.setNameKindOfSports(newRun.getNameKindOfSports());
            run.setAvailabilityFinishLine(newRun.isAvailabilityFinishLine());
            run.setAverageDuration(newRun.getAverageDuration());
            run.setLength(newRun.getLength());
            run.setTime(newRun.getTime());
            run.setId(id);
            return runRepository.save(run);}).orElseThrow();
    }

    @DeleteMapping("/athletics/{id}")
    public String delete(@PathVariable Integer id) {
        runRepository.deleteById(id);
        return "Delete";
    }
}

package ua.lviv.iot.athletics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.athletics.managers.RunRepository;
import ua.lviv.iot.athletics.models.Run;
import ua.lviv.iot.athletics.models.RunType;

@SpringBootApplication
public class DbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(RunRepository repository) {
        return args -> {
            repository.save(new Run(122, "Run",
                    true, 30, 188,
                    RunType.LONG, 77, 99));
            repository.save(new Run(56, "Run2",
                    false, 8, 99,
                    RunType.MIDDLE, 86, 150));
            repository.findAll().forEach(run -> System.out.println(run.getHeaders()));
            repository.findAll().forEach(run -> System.out.println(run.toCSV()));
        };
    }
}

package ua.lviv.iot.athletics.managers;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.athletics.models.Run;

public interface RunRepository extends CrudRepository<Run, Integer> {
}

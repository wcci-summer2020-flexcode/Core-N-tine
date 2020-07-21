package corentine.demo.repository;

import corentine.demo.models.Muscle;
import org.springframework.data.repository.CrudRepository;

public interface MuscleRepository extends CrudRepository<Muscle, Long> {
    Muscle findMuscleByName(String name);
}

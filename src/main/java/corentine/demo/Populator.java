package corentine.demo;

import corentine.demo.models.Exercise;
import corentine.demo.models.Item;
import corentine.demo.repository.ExerciseRepository;
import corentine.demo.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ExerciseRepository exerciseRepo;
    @Resource
    private ItemRepository itemRepo;

    @Override
    public void run(String... args) throws Exception {

        Item chair = new Item("Chair");
        Item stairs = new Item("Stairs");
        Item jugs = new Item("Jugs");

        itemRepo.save(chair);
        itemRepo.save(stairs);
        itemRepo.save(jugs);

        Exercise tricepsDip = new Exercise("Triceps Dip", "", "", chair);
        Exercise stepUp = new Exercise("Step Up", "", "", stairs);
        Exercise bicepCurls = new Exercise("Bicep Curls", "", "", jugs);

        exerciseRepo.save(tricepsDip);
        exerciseRepo.save(stepUp);
        exerciseRepo.save(bicepCurls);

    }
}

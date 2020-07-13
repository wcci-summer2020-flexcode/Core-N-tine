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

        Exercise tricepsChairDip = new Exercise("Triceps Chair Dip", "", "", chair);
        Exercise chairPlank = new Exercise("Chair Plank", "", "", chair);
        Exercise legLift = new Exercise("Leg Lift", "", "", chair);
        Exercise quickFeet = new Exercise("Quick Feet", "", "", chair);
        Exercise splitSquat = new Exercise("Split Squat", "", "", chair);
        Exercise stepUp = new Exercise("Step Up", "", "", stairs);
        Exercise tricepsStairDip = new Exercise("Triceps Stair Dip", "", "", stairs);
        Exercise skaterSteps = new Exercise("Skater Steps", "", "", stairs);
        Exercise mountainClimber = new Exercise("Mountain Climber", "", "", stairs);
        Exercise doubleStepUp = new Exercise("Double Step Up", "", "", stairs);
        Exercise bicepCurls = new Exercise("Bicep Curls", "", "", jugs);
        Exercise gobletSquat = new Exercise("Goblet Squat", "", "", jugs);
        Exercise farmersWalk = new Exercise("Farmers Walk", "", "", jugs);
        Exercise bentOverRow = new Exercise("Bent Over Row", "", "", jugs);
        Exercise jugClean = new Exercise("Jug Clean", "", "", jugs);

        exerciseRepo.save(tricepsChairDip);
        exerciseRepo.save(chairPlank);
        exerciseRepo.save(legLift);
        exerciseRepo.save(quickFeet);
        exerciseRepo.save(stepUp);
        exerciseRepo.save(tricepsStairDip);
        exerciseRepo.save(skaterSteps);
        exerciseRepo.save(mountainClimber);
        exerciseRepo.save(doubleStepUp);
        exerciseRepo.save(splitSquat);
        exerciseRepo.save(bicepCurls);
        exerciseRepo.save(gobletSquat);
        exerciseRepo.save(farmersWalk);
        exerciseRepo.save(bentOverRow);
        exerciseRepo.save(jugClean);

    }
}

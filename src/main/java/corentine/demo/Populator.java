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

        Exercise tricepsChairDip = new Exercise("Triceps Chair Dip", "", "", 5, 3, 80, chair);
        Exercise chairPlank = new Exercise("Chair Plank", "", "", 2, 5, 80,  chair);
        Exercise legLift = new Exercise("Leg Lift", "", "",5, 5, 70,  chair);
        Exercise quickFeet = new Exercise("Quick Feet", "", "", 10, 10, 60,  chair);
        Exercise splitSquat = new Exercise("Split Squat", "", "", 3, 12, 50,chair);
        Exercise stepUp = new Exercise("Step Up", "", "", 30, 12, 50,stairs);
        Exercise tricepsStairDip = new Exercise("Triceps Stair Dip", "", "", 15,12, 60, stairs);
        Exercise skaterSteps = new Exercise("Skater Steps", "", "",10, 10, 60, stairs);
        Exercise mountainClimber = new Exercise("Mountain Climber", "", "", 5, 12, 50,  stairs);
        Exercise doubleStepUp = new Exercise("Double Step Up", "", "",10, 12, 50, stairs);
        Exercise bicepCurls = new Exercise("Bicep Curls", "", "", 10,10, 65,  jugs);
        Exercise gobletSquat = new Exercise("Goblet Squat", "", "", 10,10, 70,  jugs);
        Exercise farmersWalk = new Exercise("Farmers Walk", "", "", 10, 10, 70, jugs);
        Exercise bentOverRow = new Exercise("Bent Over Row", "", "",10, 10, 60, jugs);
        Exercise jugClean = new Exercise("Jug Clean", "", "", 10, 10, 60, jugs);

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

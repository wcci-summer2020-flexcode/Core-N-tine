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

        Exercise tricepsChairDip = new Exercise("Triceps Chair Dip", "/images/tricepsChairDip.gif", "Put your hands on the edge of the seat of the chair. While in a sitting position hold yourself up in front of the chair. Slowly bend your elbows as much as you can, then return to the starting position. Repeat this motion up to 20 times.", chair);
        Exercise chairPlank = new Exercise("Chair Plank", "/images/chairPlank.gif", "Place your forearms in the seat of the chair and lock your fingers together. Stretch your body away from the chair hold yourself up on your toes. Be sure to keep your back straight. Hold this position up to 60 seconds.", chair);
        Exercise legLift = new Exercise("Leg Lift", "/images/legLift.gif", "Sit on the edge of the chair, knees at 90 degrees and feet flat on the floor. With your hand on the chair lift your legs into your chest by bending your knees, then return your feet to the floor. Repeat this motion up to 30 times.", chair);
        Exercise quickFeet = new Exercise("Quick Feet", "/images/quickFeet.gif", "While sitting in the chair with your back straight, pretend to run in place by lifting your legs from the floor. Don't return your feet to the floor until the exercise is over. Continue motion for up to 60 seconds.", chair);
        Exercise splitSquat = new Exercise("Split Squat", "/images/splitSquat.gif", "Stand in front of the chair facing away as if you were going to sit. Take a step away from the chair and place one foot on the chair behind you. Slowly bend your other knee as much as you can and return to the starting position. Continue motion up to 20 times and repeat with other foot on the chair.", chair);
        Exercise stepUp = new Exercise("Step Up", "/images/stepUp.gif", "While facing the stairs step with your right foot and then your left. Return to the starting position. Repeat the motion up to 20 times. Then repeat starting with your left foot.", stairs);
        Exercise tricepsStairDip = new Exercise("Triceps Stair Dip", "", "Sit on one of the bottom steps so that your heels touch the floor. Where ever comfortable lift yours up by placing your hands on a step. Lower yourself by bending your elbows and then return to the starting position. Repeat the motion up to 20 times.", stairs);
        Exercise skaterSteps = new Exercise("Skater Steps", "", "Climb the stairs by skipping a step each time. Place your feet as close to the end of each step as you can. Repeat until you have climbed the stair up to 10 times.", stairs);
        Exercise mountainClimber = new Exercise("Mountain Climber", "", "Place your hands on the second step in a push up position. Bring your right foot forward by bending your knee into your chest and then return it to the starting position. Repeat with your left foot. Continue this motion quickly up to 10 times each leg.", stairs);
        Exercise doubleStepUp = new Exercise("Double Step Up", "/images/doubleStepUp.gif", "While facing the stairs step up to the second step with your right foot and then your left. Return to the starting position. Repeat the motion up to 20 times. Then repeat starting with your left foot.", stairs);
        Exercise bicepCurls = new Exercise("Bicep Curls", "", "While standing with a jug in each hand slowly bring the jug to your shoulder and return it to the starting position. You can alternate hands or do them at the same time. Repeat the motion for each jug up to 20 times.", jugs);
        Exercise gobletSquat = new Exercise("Goblet Squat", "", "Hold a single jug with both hands at your chest. Bend your knees to a 90 degree angle and return to the starting position. Repeat the motion up to 20 times.", jugs);
        Exercise farmersWalk = new Exercise("Farmers Walk", "", "While holding a jug in each hand at your side, walk with the jugs for up to 60 seconds.", jugs);
        Exercise bentOverRow = new Exercise("Bent Over Row", "", "While holding jugs at your side, with your legs bent slightly keep your back straight and bend over until your upper body is almost perpendicular with the floor. Once in position lift the jugs into your chest and return them to the starting position. Repeat up to 20 times.", jugs);
        Exercise jugClean = new Exercise("Jug Clean", "", "Place the jugs at your feet. Bend your knees and grasp them. Lift the jugs to your shoulders and then stand up. Once in a standing position, lift the jugs above your head and hold them there for a second. Reverse the motion and return the jugs to the floor. Repeat up to 20 times.", jugs);

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

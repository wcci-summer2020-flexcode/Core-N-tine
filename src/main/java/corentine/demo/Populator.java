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
        Item room = new Item("Empty room");

        itemRepo.save(chair);
        itemRepo.save(stairs);
        itemRepo.save(jugs);
        itemRepo.save(room);

        Exercise tricepsChairDip = new Exercise("Triceps Chair Dip", "/images/tricepsChairDip.gif", "Put your hands on the edge of the seat of the chair. While in a sitting position hold yourself up in front of the chair. Slowly bend your elbows as much as you can, then return to the starting position. Repeat this motion up to 20 times.", 5, 3, 80, chair);
        Exercise chairPlank = new Exercise("Chair Plank", "/images/tricepsChairDip.gif", "Place your forearms in the seat of the chair and lock your fingers together. Stretch your body away from the chair hold yourself up on your toes. Be sure to keep your back straight. Hold this position up to 60 seconds.", 2, 5, 80,  chair);
        Exercise legLift = new Exercise("Leg Lift", "/images/tricepsChairDip.gif", "Sit on the edge of the chair, knees at 90 degrees and feet flat on the floor. With your hand on the chair lift your legs into your chest by bending your knees, then return your feet to the floor. Repeat this motion up to 30 times.",5, 5, 70,  chair);
        Exercise quickFeet = new Exercise("Quick Feet", "/images/tricepsChairDip.gif", "While sitting in the chair with your back straight, pretend to run in place by lifting your legs from the floor. Don't return your feet to the floor until the exercise is over. Continue motion for up to 60 seconds.", 10, 10, 60,  chair);
        Exercise splitSquat = new Exercise("Split Squat", "/images/tricepsChairDip.gif", "Stand in front of the chair facing away. Take a step away from the chair and place one foot on the chair behind you. Slowly bend your other knee and return to the starting position. Continue motion up to 20 times and repeat with other foot on the chair.", 3, 12, 50,chair);
        Exercise stepUp = new Exercise("Step Up", "/images/tricepsChairDip.gif", "While facing the stairs step with your right foot and then your left. Return to the starting position. Repeat the motion up to 20 times. Then repeat starting with your left foot.", 30, 12, 50,stairs);
        Exercise tricepsStairDip = new Exercise("Triceps Stair Dip", "/images/tricepsChairDip.gif", "Sit on one of the bottom steps so that your heels touch the floor. Where ever comfortable lift yours up by placing your hands on a step. Lower yourself by bending your elbows and then return to the starting position. Repeat the motion up to 20 times.", 15,12, 60, stairs);
        Exercise skaterSteps = new Exercise("Skater Steps", "/images/tricepsChairDip.gif", "Climb the stairs by skipping a step each time. Place your feet as close to the end of each step as you can. Repeat until you have climbed the stair up to 10 times.",10, 10, 60, stairs);
        Exercise mountainClimber = new Exercise("Mountain Climber", "/images/tricepsChairDip.gif", "Place your hands on the second step in a push up position. Bring your right foot forward by bending your knee into your chest and then return it to the starting position. Repeat with your left foot. Continue this motion quickly up to 10 times each leg.", 5, 12, 50,  stairs);
        Exercise doubleStepUp = new Exercise("Double Step Up", "/images/tricepsChairDip.gif", "While facing the stairs step up to the second step with your right foot and then your left. Return to the starting position. Repeat the motion up to 20 times. Then repeat starting with your left foot.",10, 12, 50, stairs);
        Exercise bicepCurls = new Exercise("Bicep Curls", "/images/tricepsChairDip.gif", "While standing with a jug in each hand slowly bring the jug to your shoulder and return it to the starting position. You can alternate hands or do them at the same time. Repeat the motion for each jug up to 20 times.", 10,10, 65,  jugs);
        Exercise gobletSquat = new Exercise("Goblet Squat", "/images/tricepsChairDip.gif", "Hold a single jug with both hands at your chest. Bend your knees to a 90 degree angle and return to the starting position. Repeat the motion up to 20 times.", 10,10, 70,  jugs);
        Exercise farmersWalk = new Exercise("Farmers Walk", "/images/tricepsChairDip.gif", "While holding a jug in each hand at your side, walk with the jugs for up to 60 seconds.", 10, 10, 70, jugs);
        Exercise bentOverRow = new Exercise("Bent Over Row", "/images/tricepsChairDip.gif", "While holding jugs, keep your back straight and bend over until your upper body is almost perpendicular with the floor. Once in position lift the jugs into your chest and return them to the starting position. Repeat up to 20 times.",10, 10, 60, jugs);
        Exercise jugClean = new Exercise("Jug Clean", "/images/tricepsChairDip.gif", "Place the jugs at your feet. Lift the jugs to your shoulders and then stand up. Once in a standing position, lift the jugs above your head and hold them there for a second. Reverse the motion and return the jugs to the floor. Repeat up to 20 times.", 10, 10, 60, jugs);
        Exercise wallSit = new Exercise("Wall Sit", "/images/tricepsChairDip.gif", "Start with your back against a wall with your feet shoulder width and about 2 feet from the wall. Engage your abdominal muscles and slowly slide your back down the wall until your thighs are parallel to the ground. Adjust your feet so your knees are directly above your ankles (rather than over your toes). Keep your back flat against the wall.", 60, 10, 60, room);
        Exercise plank = new Exercise("Plank", "/images/tricepsChairDip.gif", " Start on the floor on your hands and knees. Place your hands directly under your shoulders. Step your feet back, one at a time. For more stability, bring your feet wider than hip-distance apart, and bring them closer for more of a challenge. Maintain a straight line from heels through the top of your head, looking down at the floor, with gaze slightly in front of your face. Now, tighten your abs, quads, glutes, and hold.", 1, 10, 60, room);
        Exercise pushUps = new Exercise("Push Ups", "/images/tricepsChairDip.gif", "Get down on all fours. Then straighten your arms and legs. Lower your body until your chest nearly touches the floor. Pause, push yourself back up and repeat", 0, 10, 70, room);
        Exercise sitUps = new Exercise("Sit Ups", "/images/tricepsChairDip.gif", "Start out laying on your back with your knees bent, feet flat on the floor. Lift your upper body up tp your knees. Slowly lower yourself back down. Repeat", 10, 10, 70, room);
        Exercise crunches = new Exercise("Crunches", "/images/tricepsChairDip.gif", "Start out laying on your back with your knees bent, feet flat on the floor. Lift your upper body up just until your shoulders leave the ground. Slowly lower yourself back down. Repeat", 10, 10, 60, room);
        Exercise jumpingJacks = new Exercise("Jumping Jacks", "/images/tricepsChairDip.gif", "Stand upright with your legs together, arms at your sides. Bend your knees slightly, and jump into the air. As you jump, spread your legs to be about shoulder-width apart. Stretch your arms out and over your head. Jump back to starting position. Repeat", 10, 10, 70, room);
        Exercise squats = new Exercise("Squats", "/images/tricepsChairDip.gif", " Stand straight with feet hip-width apart. Lower down, as if sitting in an invisible chair. Straighten your legs to lift back up. Repeat", 10, 10, 70, room);
        Exercise walkingLunges = new Exercise("Lunges", "/images/tricepsChairDip.gif", "Stand tall with feet hip-width apart. Take a big step forward with right leg. Start to shift your weight forward so heel hits the floor first. Lower your body until right thigh is parallel to the floor and right shin is vertical. Don't let your knee go your toe. If mobility allows, lightly tap left knee to the floor while keeping weight in right heel. Press into right heel to drive back up to starting position. Repeat on the other side.", 10, 10, 70, room);
        Exercise calfRaises = new Exercise("Calf Raises", "/images/tricepsChairDip.gif", "Stand with your torso upright, your feet hip-width apart and your toes pointing forward. Raise your heels off the floor and squeeze your calves. Return to the starting position, by slowly lowering your heels, and repeat.", 1, 10, 60, room);
        Exercise flutterKick = new Exercise("Flutter Kicks", "/images/tricepsChairDip.gif", "Lie on your back and extend your legs up to a 45-degree angle. Keeping your legs stick straight and glued together with your toes pointed, start lowering one leg. Raise your lowered leg and lower the other, focusing on keeping your core engaged. Continue the movement, alternating between legs.", 1, 10, 60, room);
        Exercise russianTwist = new Exercise("Russian Twist", "/images/tricepsChairDip.gif", "Sit with bent knees and your feet pressing firmly into the floor, holding a dumbbell in each hand next to your chest. Sit back slightly, keeping your spine straight. Exhale as you twist to the left, punching your right arm over to the left side. Inhale back to center, and then do the opposite side.", 1, 10, 60, room);
        Exercise bicycleCrunch = new Exercise("Bicycle Crunch", "/images/tricepsChairDip.gif", "Lie flat on the floor with your lower back pressed to the ground. Put your hands behind your head, then bring your knees in towards your chest and lift your shoulder blades off the ground, but be sure not to pull on your neck. Straighten your right leg out to about a 45-degree angle to the ground while turning your upper body to the left, bringing your right elbow towards the left knee. Make sure your rib cage is moving and not just your elbows. Now switch sides and do the same motion on the other side to complete one rep.", 1, 10, 60, room);







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
        exerciseRepo.save(wallSit);
        exerciseRepo.save(plank);
        exerciseRepo.save(pushUps);
        exerciseRepo.save(sitUps);
        exerciseRepo.save(crunches);
        exerciseRepo.save(jumpingJacks);
        exerciseRepo.save(squats);
        exerciseRepo.save(walkingLunges);
        exerciseRepo.save(calfRaises);
        exerciseRepo.save(flutterKick);
        exerciseRepo.save(russianTwist);
        exerciseRepo.save(bicycleCrunch);


    }
}

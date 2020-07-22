package corentine.demo;

import corentine.demo.models.Exercise;
import corentine.demo.models.ExercisePlan;
import corentine.demo.models.Item;
import corentine.demo.models.Muscle;
import corentine.demo.repository.ExerciseRepository;
import corentine.demo.repository.ItemRepository;
import corentine.demo.repository.MuscleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ExerciseRepository exerciseRepo;
    @Resource
    private ItemRepository itemRepo;
    @Resource
    private MuscleRepository muscleRepo;

    @Override
    public void run(String... args) throws Exception {

        Item chair = new Item("Chair", "/images/chair.jpg");
        Item stairs = new Item("Stairs", "/images/stairs.jpg");
        Item jugs = new Item("Jugs", "/images/jug.jpg");
        Item room = new Item("Empty Room", "/images/room.jpg");
        Item paperPlates = new Item("Paper Plates", "/images/paperplates.jfif");
        Item pillow = new Item("Pillow", "/images/pillow.jfif");
        Item pvcPipe = new Item("PVC Pipe", "/images/pvcpipe.jpg");


        itemRepo.save(chair);
        itemRepo.save(stairs);
        itemRepo.save(jugs);
        itemRepo.save(room);
        itemRepo.save(paperPlates);
        itemRepo.save(pillow);
        itemRepo.save(pvcPipe);

        Exercise tricepsChairDip = new Exercise("Triceps Chair Dip", "/images/tricepsChairDip.gif","https://www.youtube.com/embed/3ydgLFLK8e0" ,"Put your hands on the edge of the seat of the chair. While in a sitting position hold yourself up in front of the chair. Slowly bend your elbows as much as you can, then return to the starting position. Repeat this motion up to 20 times.", 5, 3, 80, chair);
        Exercise chairPlank = new Exercise("Chair Plank", "/images/chairPlank.gif","https://www.youtube.com/embed/GMqoX8bDfDU" ,"Place your forearms in the seat of the chair and lock your fingers together. Stretch your body away from the chair hold yourself up on your toes. Be sure to keep your back straight. Hold this position up to 60 seconds.", 2, 5, 80,  chair);
        Exercise legLift = new Exercise("Leg Lift", "/images/legLift.gif", "https://www.youtube.com/embed/5WLiZTSRFz4" ,"Sit on the edge of the chair, knees at 90 degrees and feet flat on the floor. With your hand on the chair lift your legs into your chest by bending your knees, then return your feet to the floor. Repeat this motion up to 30 times.",5, 5, 70,  chair);
        Exercise quickFeet = new Exercise("Quick Feet", "/images/quickFeet.gif", "https://www.youtube.com/embed/ex-Xs8n7DNM" ,"While sitting in the chair with your back straight, pretend to run in place by lifting your legs from the floor. Don't return your feet to the floor until the exercise is over. Continue motion for up to 60 seconds.", 10, 10, 60,  chair);
        Exercise splitSquat = new Exercise("Split Squat", "/images/splitSquat.gif", "https://www.youtube.com/embed/2ZhRUFlMD54","Stand in front of the chair facing away. Take a step away from the chair and place one foot on the chair behind you. Slowly bend your other knee and return to the starting position. Continue motion up to 20 times and repeat with other foot on the chair.", 3, 12, 50,chair);
        Exercise stepUp = new Exercise("Step Up", "/images/stepUp.gif", "https://www.youtube.com/embed/1hiWQ7pehjQ","While facing the stairs step with your right foot and then your left. Return to the starting position. Repeat the motion up to 20 times. Then repeat starting with your left foot.", 30, 12, 50,stairs);
        Exercise tricepsStairDip = new Exercise("Triceps Stair Dip", "/images/tricepsStairDip.gif", "https://www.youtube.com/embed/ZGH1fHYRvvA","Sit on one of the bottom steps so that your heels touch the floor. Where ever comfortable lift yours up by placing your hands on a step. Lower yourself by bending your elbows and then return to the starting position. Repeat the motion up to 20 times.", 15,12, 60, stairs);
        Exercise skaterSteps = new Exercise("Skater Steps", "/images/skaterSteps.gif", "https://www.youtube.com/embed/-4oNyjbLYjM","Climb the stairs by skipping a step each time. Place your feet as close to the end of each step as you can. Repeat until you have climbed the stair up to 10 times.",10, 10, 60, stairs);
        Exercise mountainClimber = new Exercise("Mountain Climber", "/images/mountainClimber.gif", "https://www.youtube.com/embed/YTLLxFGX5BU","Place your hands on the second step in a push up position. Bring your right foot forward by bending your knee into your chest and then return it to the starting position. Repeat with your left foot. Continue this motion quickly up to 10 times each leg.", 5, 12, 50,  stairs);
        Exercise doubleStepUp = new Exercise("Double Step Up", "/images/doubleStepUp.gif", "https://www.youtube.com/embed/radkp4o5gAs","While facing the stairs step up to the second step with your right foot and then your left. Return to the starting position. Repeat the motion up to 20 times. Then repeat starting with your left foot.",10, 12, 50, stairs);
        Exercise bicepCurls = new Exercise("Bicep Curls", "/images/bicepCurls.gif","https://www.youtube.com/embed/Nkl8WnH6tDU" ,"While standing with a jug in each hand slowly bring the jug to your shoulder and return it to the starting position. You can alternate hands or do them at the same time. Repeat the motion for each jug up to 20 times.", 10,10, 65,  jugs);
        Exercise gobletSquat = new Exercise("Goblet Squat", "/images/gobletSquat.gif","https://www.youtube.com/embed/mF5tnEBrdkc" ,"Hold a single jug with both hands at your chest. Bend your knees to a 90 degree angle and return to the starting position. Repeat the motion up to 20 times.", 10,10, 70,  jugs);
        Exercise farmersWalk = new Exercise("Farmers Walk", "/images/farmersWalk.gif","https://www.youtube.com/embed/hx24PM6gXs8" ,"While holding a jug in each hand at your side, walk with the jugs for up to 60 seconds.", 10, 10, 70, jugs);
        Exercise bentOverRow = new Exercise("Bent Over Row", "/images/bentOverRow.gif","https://www.youtube.com/embed/LktGPg-AkvY" ,"While holding jugs, keep your back straight and bend over until your upper body is almost perpendicular with the floor. Once in position lift the jugs into your chest and return them to the starting position. Repeat up to 20 times.",10, 10, 60, jugs);
        Exercise jugClean = new Exercise("Jug Clean", "/images/jugClean.gif","https://www.youtube.com/embed/eAgesyfA2uM" ,"Place the jugs at your feet. Lift the jugs to your shoulders and then stand up. Once in a standing position, lift the jugs above your head and hold them there for a second. Reverse the motion and return the jugs to the floor. Repeat up to 20 times.", 10, 10, 60, jugs);
        Exercise wallSit = new Exercise("Wall Sit", "/images/wallSit.gif","https://www.youtube.com/embed/-cdph8hv0O0" ,"Start with your back against a wall with your feet shoulder width and about 2 feet from the wall. Engage your abdominal muscles and slowly slide your back down the wall until your thighs are parallel to the ground. Adjust your feet so your knees are directly above your ankles (rather than over your toes). Keep your back flat against the wall.", 60, 10, 60, room);
        Exercise plank = new Exercise("Plank", "/images/plank.gif","https://www.youtube.com/embed/ASdvN_XEl_c" ," Start on the floor on your hands and knees. Place your hands directly under your shoulders. Step your feet back, one at a time. For more stability, bring your feet wider than hip-distance apart, and bring them closer for more of a challenge. Maintain a straight line from heels through the top of your head, looking down at the floor, with gaze slightly in front of your face. Now, tighten your abs, quads, glutes, and hold.", 1, 10, 60, room);
        Exercise pushUps = new Exercise("Push Ups", "/images/pushUps.gif","https://www.youtube.com/embed/rjc0O7OXS3g" ,"Get down on all fours. Then straighten your arms and legs. Lower your body until your chest nearly touches the floor. Pause, push yourself back up and repeat", 0, 10, 70, room);
        Exercise sitUps = new Exercise("Sit Ups", "/images/sitUps.gif","https://www.youtube.com/embed/1fbU_MkV7NE" ,"Start out laying on your back with your knees bent, feet flat on the floor. Lift your upper body up tp your knees. Slowly lower yourself back down. Repeat", 10, 10, 70, room);
        Exercise crunches = new Exercise("Crunches", "/images/crunches.gif","https://www.youtube.com/embed/Xyd_fa5zoEU" ,"Start out laying on your back with your knees bent, feet flat on the floor. Lift your upper body up just until your shoulders leave the ground. Slowly lower yourself back down. Repeat", 10, 10, 60, room);
        Exercise jumpingJacks = new Exercise("Jumping Jacks", "/images/jumpingJacks.gif", "https://www.youtube.com/embed/c4DAnQ6DtF8","Stand upright with your legs together, arms at your sides. Bend your knees slightly, and jump into the air. As you jump, spread your legs to be about shoulder-width apart. Stretch your arms out and over your head. Jump back to starting position. Repeat", 10, 10, 70, room);
        Exercise squats = new Exercise("Squats", "/images/squats.gif", "https://www.youtube.com/embed/mGvzVjuY8SY"," Stand straight with feet hip-width apart. Lower down, as if sitting in an invisible chair. Straighten your legs to lift back up. Repeat", 10, 10, 70, room);
        Exercise walkingLunges = new Exercise("Lunges", "/images/walkingLunges.gif","https://www.youtube.com/embed/L8fvypPrzzs" ,"Stand tall with feet hip-width apart. Take a big step forward with right leg. Start to shift your weight forward so heel hits the floor first. Lower your body until right thigh is parallel to the floor and right shin is vertical. Don't let your knee go your toe. If mobility allows, lightly tap left knee to the floor while keeping weight in right heel. Press into right heel to drive back up to starting position. Repeat on the other side.", 10, 10, 70, room);
        Exercise calfRaises = new Exercise("Calf Raises", "/images/calfRaises.gif","https://www.youtube.com/embed/_iYwv4QVFjM" ,"Stand with your torso upright, your feet hip-width apart and your toes pointing forward. Raise your heels off the floor and squeeze your calves. Return to the starting position, by slowly lowering your heels, and repeat.", 1, 10, 60, room);
        Exercise flutterKick = new Exercise("Flutter Kicks", "/images/flutterKick.gif","https://www.youtube.com/embed/eEG9uXjx4vQ" ,"Lie on your back and extend your legs up to a 45-degree angle. Keeping your legs stick straight and glued together with your toes pointed, start lowering one leg. Raise your lowered leg and lower the other, focusing on keeping your core engaged. Continue the movement, alternating between legs.", 1, 10, 60, room);
        Exercise russianTwist = new Exercise("Russian Twist", "/images/russianTwist.gif","https://www.youtube.com/embed/JyUqwkVpsi8" ,"Sit with bent knees and your feet pressing firmly into the floor, holding a dumbbell in each hand next to your chest. Sit back slightly, keeping your spine straight. Exhale as you twist to the left, punching your right arm over to the left side. Inhale back to center, and then do the opposite side.", 1, 10, 60, room);
        Exercise bicycleCrunch = new Exercise("Bicycle Crunch", "/images/bicycleCrunch.gif","https://www.youtube.com/embed/eBZ4rdDjLFM" ,"Lie flat on the floor with your lower back pressed to the ground. Put your hands behind your head, then bring your knees in towards your chest and lift your shoulder blades off the ground, but be sure not to pull on your neck. Straighten your right leg out to about a 45-degree angle to the ground while turning your upper body to the left, bringing your right elbow towards the left knee. Make sure your rib cage is moving and not just your elbows. Now switch sides and do the same motion on the other side to complete one rep.", 1, 10, 60, room);
        Exercise slidingBurpee = new Exercise("Sliding Burpee", "/images/slidingburpee.jpg", "https://www.youtube.com/embed/qvWpWU5c3a8", "Stand with the balls of your feet on paper plates. Push your hips back, bend your knees, and lower into a squat. Place your hands on the floor. Slide your feet out to a plank position. Quickly bend your knees and slide your feet back into your hands. Return to standing. That's one rep. Do 15 reps total.", 5, 10, 60, paperPlates);
        Exercise slidingPushupJack = new Exercise("Sliding Pushup Jack", "/images/slidingpushupjack.jpg", "https://www.youtube.com/embed/PwPdFhJkwvk", "With the plates under your feet, squat down to the floor, placing your hands wider than shoulder-width apart. Slide your feet into a wide V as you lower your body into a pushup. As you press up, bend your legs and slide your knees into your hands, tucking them into your chest. That's one rep. Do 10 reps total.", 5, 10, 70, paperPlates);
        Exercise slidingThighSlimmer = new Exercise("Sliding Thigh Slimmer", "/images/slidingthighslimmer.jpg", "https://www.youtube.com/embed/wAhMhzVDH4M", "Begin in a runner's lunge with your right leg forward, hands on either side of your right foot, and left leg straight (the paper plate should be under your left foot). Bend your left knee and slide your leg into your chest, squeezing your knees together. Quickly extend your left leg back out to your full lunge. That's one rep. Do 15 reps on the right leg, 15 on the left.", 3, 10, 60, paperPlates);
        Exercise slidingTricepsPushup = new Exercise("Sliding Triceps Pushup", "/images/slidingtricepspushup.jpg", "https://www.youtube.com/embed/FHnE8As1cSg", "Begin at the top of a modified pushup position with your hands on the plates, shoulder-width apart. Bend your left elbow and lower into a pushup (keeping your arm close to your body) as you slide your right arm straight out on the floor. Press back up, sliding your right arm in. That's one rep. Do 15 reps total, alternating arms each time.", 5, 10, 70, paperPlates);
        Exercise slidingSitUp = new Exercise("Sliding Sit Up", "/images/slidingsitup.jpg", "https://www.youtube.com/embed/pJZf9yfGIMk", "Lie on your back with your legs extended and together. Place your arms out to each side in a 'T' shape, with the plates under your palms. Keeping your arms straight and elbows soft, press down and slide your arms in by your sides as you sit up and bend your knees. Slide back out and return to your start position. That's one rep. Do 15 reps total.", 3, 10, 70, paperPlates);
        Exercise heelCurlCrunch = new Exercise("Heel Curl Crunch", "/images/heelcurlcrunch.jpg", "https://www.youtube.com/embed/bHNgRvTk5PA", "Sit with your hands behind your head, spine straight. Bend your knees and flex your feet so that just your heels are pressed into the plates. Slide your legs out straight as you hinge back, lowering all the way down to the floor with your body, sliding your legs out into a wide 'V' position. Bend your knees and use your abs to return to your starting position, sliding your heels into your body as you sit up. That's one rep. Do 15 reps total.", 5, 12, 70, paperPlates);
        Exercise legDarts = new Exercise("Leg Darts", "/images/legdart.jpg", "https://www.youtube.com/embed/GeWKYPqV3A8", "Lie on your stomach with your legs together. Arms along your sides. Lift your abdominal muscles away from the mat. Inhale. Exhale. Keep your abdominal muscles pulled in. Extend energy through your spine and out the top of your head to lift your upper body slightly off the mat. Anchor your pubic bone to the mat to protect your lower back. Your legs and glutes are engaged as part of the stability of the lower body but don't over-squeeze them. Your head is an extension of your spine. Your gaze will be down. Your shoulder blades will slide down your back as your arms reach behind you like they are being blown back. Hold for an inhale. Exhale to lengthen and lower your body to the floor. Repeat this exercise three times.", 5, 8, 70,pillow);
        Exercise halfRollLegLifts = new Exercise("Half Roll Back Leg Lifts", "/images/halfleglifts.jfif", "https://www.youtube.com/embed/UU1c3vX-PMs", "Start on all fours with the hands under the shoulders and the knees under the hips. Extend one leg behind you. Lift the leg to hip level and then slowly lower it back down. Repeat with the opposite leg until set is complete.", 5, 10, 70, pillow);
        Exercise pillowTwist = new Exercise("Pillow Twist", "/images/pillowtwist.jfif", "https://www.youtube.com/embed/rCgGlW8I5MI", "Lay flat on your back with the pillow above your chest and your arms and abs engaged. Pull your knees in toward you and lift up your chest using the power from your abdominals and your hip flexors. Maintain a strong boat position as you twist from the belly to face the left side, then the right.", 5, 10, 80, pillow);
        Exercise extendLegs = new Exercise("Extend Legs", "/images/extendlegs.jfif", "https://www.youtube.com/embed/HKDFDsGBk5k", "Place a pillow between your knees and squeeze thigh muscles. Squat down by bending from your hips and pushing your buttocks backwards. Keep your back flat and squeeze the pillow with your knees. Keep your thigh muscles tight throughout the movement.", 5, 8, 80, pillow);
        Exercise abTuck = new Exercise("Ab Tuck with Pillow Pass", "/images/abtuck.jfif", "https://www.youtube.com/embed/ZJrmX7X-qtw", "Legs together and bent, feet off the ground – crunch up to put the pillow between your legs, extend and then take the pillow and bring it over your head", 5, 8, 70, pillow);
        Exercise sidePlank = new Exercise("Side Plank with Reach Under", "/images/sideplank.jfif", "https://www.youtube.com/embed/EvPhjA3N1fw", "into a side plank position, passing the pillow under your side and bringing up into the air", 5, 8, 90, pillow);
        Exercise passThrough = new Exercise("PVC Pass-Through", "/images/pvcpassthrough.jfif", "https://www.youtube.com/embed/fN84_sH7sAM", "Hold the PVC horizontally in front of hips with arms straight and hands in snatch grip (about a hands length outside of hips, palms facing hips). Tuck tail under, squeeze glutes, engage core, and think about pulling the pipe into hips by squeezing shoulder blades back and down to start. With arms straight, slowly rotate pipe up, overhead, and behind hips (or as low as possible). If you have issues getting the pipe overhead, widen your grip. Keeping arms straight, slowly bring the pipe back to front. That's one rep.", 5, 12, 60, pvcPipe);
        Exercise figure8 = new Exercise("Figure 8", "/images/figure8.jfif", "https://www.youtube.com/embed/bHHT3RMQ0pI", "Start in the same position as PVC pass-through: pipe at hips, arms straight, hands in wide grip, glutes and core engaged. Actively pull on the PVC as if pulling it apart. Then, keeping arms straight, bring the left arm overhead and then down behind hips. Then, do the same with the right arm. Slowly return each arm to the front, one at a time. That's one rep. Repeat, blending movements together into one fluid motion.", 10, 12, 60, pvcPipe);
        Exercise shoulderFlexionStretch = new Exercise("PVC Pipe Shoulder Flexion Stretch", "/images/shoulderstretch.jfif", "https://www.youtube.com/embed/8drTcsh9Loo", "Start in a half-kneeling position, left leg forward and right leg back. Balance the pipe on one end, to the right of the left foot. Choke-up on the PVC pipe with the right hand, about level with your eyes.Hinge at hips and sink chest down until you feel a stretch in your shoulder. Contract the shoulder as if you're trying to push the pipe into the ground. Hold for 10 to 20 seconds. Release. That's one rep. Repeat on the other side.", 10, 10, 70, pvcPipe);
        Exercise pipeLean = new Exercise("PVC Pipe Lean", "/images/pipelean.jfif", "https://www.youtube.com/embed/QDGYYeHPd7E", "Hold the PVC pipe vertically along spine so that it's touching the back of head, between shoulder blades, and tailbone. Keeping pipe in contact with each touch point, hinge at the hips so that upper body is leaning forward. Keep knees straight but not locked. Continue bending until you feel tension at back of legs or just before the pipe detaches from one of the points of contact. Slowly lift chest to return to start.", 10,  10, 65, pvcPipe);
        Exercise frontSquat = new Exercise("PVC Pipe Front Squat", "/images/pvcfrontsquat.jfif", "https://www.youtube.com/embed/_5DJOO6OGSs", "Hold the PVC pipe in front rack position so that the pipe rests horizontally across the chest, with fingers and thumbs loosely wrapped around the pipe, fingers pointing backward toward shoulders. Rotate elbows until they are parallel to the floor (or as close to that as possible) to start. Do an air squat while keeping elbows high. Keeping chest up, continue squatting until hips go below parallel or form is compromised, whichever comes first. Then, keeping weight in heels, stand to return to start.", 5, 12, 70, pvcPipe);
        Exercise overheadSquat = new Exercise("PVC Overhead Squat", "/images/overheadsquat.jfif", "https://www.youtube.com/embed/TjIBLuaVw3M", "Stand with feet slightly wider than hip-width apart. Hold the PVC pipe with a wide grip, then lock arms out overhead. Squeeze glutes, engage your core, and tuck your ribs under to start. Initiate the squat by sending hips back and bending knees. Slowly descend, maintaining tightness in the upper back, and without letting the pipe go too far in front or behind the center line. Push up on the PVC pipe as if trying to touch the ceiling. Keeping chest tall, continue squatting until you break parallel or your form is compromised, whichever comes first. Then, press through the midfoot to stand.", 10, 12, 60, pvcPipe);



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
        exerciseRepo.save(slidingBurpee);
        exerciseRepo.save(slidingPushupJack);
        exerciseRepo.save(slidingThighSlimmer);
        exerciseRepo.save(slidingTricepsPushup);
        exerciseRepo.save(slidingSitUp);
        exerciseRepo.save(heelCurlCrunch);
        exerciseRepo.save(legDarts);
        exerciseRepo.save(halfRollLegLifts);
        exerciseRepo.save(pillowTwist);
        exerciseRepo.save(extendLegs);
        exerciseRepo.save(abTuck);
        exerciseRepo.save(sidePlank);
        exerciseRepo.save(passThrough);
        exerciseRepo.save(figure8);
        exerciseRepo.save(shoulderFlexionStretch);
        exerciseRepo.save(pipeLean);
        exerciseRepo.save(frontSquat);
        exerciseRepo.save(overheadSquat);

        Muscle triceps = new Muscle("Triceps", tricepsChairDip, tricepsStairDip, mountainClimber, farmersWalk, bentOverRow, jugClean, pushUps, slidingBurpee, slidingPushupJack, slidingTricepsPushup, slidingSitUp);
        Muscle biceps = new Muscle("Biceps", bicepCurls, farmersWalk, bentOverRow,slidingBurpee, slidingTricepsPushup, slidingSitUp);
        Muscle chest = new Muscle("Chest", tricepsChairDip, tricepsStairDip, farmersWalk, bentOverRow, pushUps, slidingPushupJack, slidingTricepsPushup, passThrough, figure8, overheadSquat);
        Muscle back = new Muscle("Back", tricepsChairDip, chairPlank, tricepsStairDip, mountainClimber, farmersWalk, bentOverRow, jugClean, plank, sitUps, slidingBurpee, slidingTricepsPushup, slidingSitUp, pipeLean, overheadSquat);
        Muscle abs = new Muscle("Abs", chairPlank, legLift, mountainClimber, farmersWalk, jugClean, wallSit, plank, pushUps, sitUps, crunches, squats, flutterKick, russianTwist, bicycleCrunch, slidingBurpee, slidingPushupJack, slidingTricepsPushup, slidingSitUp, heelCurlCrunch, legDarts, halfRollLegLifts, pillowTwist, extendLegs, abTuck, sidePlank);
        Muscle quads = new Muscle("Quads", quickFeet, stepUp, skaterSteps, doubleStepUp, splitSquat, gobletSquat, farmersWalk, jugClean, wallSit, jumpingJacks, squats, walkingLunges, flutterKick, bicycleCrunch, slidingThighSlimmer, shoulderFlexionStretch, frontSquat);
        Muscle calves = new Muscle("Calves", quickFeet, stepUp, skaterSteps, doubleStepUp, gobletSquat, farmersWalk, jugClean, wallSit, squats, calfRaises, slidingThighSlimmer);
        Muscle glutes = new Muscle("Glutes", quickFeet, stepUp, skaterSteps, doubleStepUp, splitSquat, gobletSquat, farmersWalk, jugClean, wallSit, sitUps, jumpingJacks, squats, walkingLunges, flutterKick, slidingThighSlimmer);

        muscleRepo.save(triceps);
        muscleRepo.save(biceps);
        muscleRepo.save(chest);
        muscleRepo.save(back);
        muscleRepo.save(abs);
        muscleRepo.save(quads);
        muscleRepo.save(calves);
        muscleRepo.save(glutes);

    }
}
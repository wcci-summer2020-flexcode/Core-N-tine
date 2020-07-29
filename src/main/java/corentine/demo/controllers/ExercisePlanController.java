package corentine.demo.controllers;

import corentine.demo.models.Exercise;
import corentine.demo.models.ExercisePlan;
import corentine.demo.repository.ExercisePlanRepository;
import corentine.demo.repository.ExerciseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Controller
public class ExercisePlanController {
    @Resource
    private ExercisePlanRepository exercisePlanRepo;
    @Resource
    private ExerciseRepository exerciseRepo;

    @RequestMapping({"/exerciseplan"})
    public String displayAllExercisePlans(Model model){
        model.addAttribute("exercisePlans", exercisePlanRepo.findAll());
        return "exercisePlansView";
    }

    @RequestMapping("/exerciseplan/{id}")
    public String displaySingleExercisePlan(@PathVariable long id, Model model) {
        Optional<ExercisePlan> retrievedPlan = exercisePlanRepo.findById(id);
        ExercisePlan foundPlan = retrievedPlan.get();
        model.addAttribute("exercisePlan", foundPlan);
        return "exercisePlanView";
    }

    @RequestMapping("/buildaplan")
    public String displayBuildPlan(Model model){
        model.addAttribute("exercisePlans", exercisePlanRepo.findAll());
        model.addAttribute("exercises", exerciseRepo.findAll());
        return "BuildAPlan";
    }

    @PostMapping("/buildaplan/add-plan")
    public String buildAPlan(@RequestParam String planName, @RequestParam int amountOfDays,
                             @RequestParam String exerciseName1, @RequestParam String exerciseName2,
                             @RequestParam String exerciseName3, @RequestParam String exerciseName4,
                             @RequestParam String dayTwoExerciseName1, @RequestParam String dayTwoExerciseName2,
                             @RequestParam String dayTwoExerciseName3, @RequestParam String dayTwoExerciseName4,
                             @RequestParam String dayThreeExerciseName1, @RequestParam String dayThreeExerciseName2,
                             @RequestParam String dayThreeExerciseName3, @RequestParam String dayThreeExerciseName4,
                             @RequestParam String dayFourExerciseName1, @RequestParam String dayFourExerciseName2,
                             @RequestParam String dayFourExerciseName3, @RequestParam String dayFourExerciseName4,
                             @RequestParam String dayFiveExerciseName1, @RequestParam String dayFiveExerciseName2,
                             @RequestParam String dayFiveExerciseName3, @RequestParam String dayFiveExerciseName4){

        Exercise dayOneExercise1 = exerciseRepo.findExerciseByName(exerciseName1);
        Exercise dayOneExercise2 = exerciseRepo.findExerciseByName(exerciseName2);
        Exercise dayOneExercise3 = exerciseRepo.findExerciseByName(exerciseName3);
        Exercise dayOneExercise4 = exerciseRepo.findExerciseByName(exerciseName4);
        Exercise dayTwoExercise1 = exerciseRepo.findExerciseByName(dayTwoExerciseName1);
        Exercise dayTwoExercise2 = exerciseRepo.findExerciseByName(dayTwoExerciseName2);
        Exercise dayTwoExercise3 = exerciseRepo.findExerciseByName(dayTwoExerciseName3);
        Exercise dayTwoExercise4 = exerciseRepo.findExerciseByName(dayTwoExerciseName4);
        Exercise dayThreeExercise1 = exerciseRepo.findExerciseByName(dayThreeExerciseName1);
        Exercise dayThreeExercise2 = exerciseRepo.findExerciseByName(dayThreeExerciseName2);
        Exercise dayThreeExercise3 = exerciseRepo.findExerciseByName(dayThreeExerciseName3);
        Exercise dayThreeExercise4 = exerciseRepo.findExerciseByName(dayThreeExerciseName4);
        Exercise dayFourExercise1 = exerciseRepo.findExerciseByName(dayFourExerciseName1);
        Exercise dayFourExercise2 = exerciseRepo.findExerciseByName(dayFourExerciseName2);
        Exercise dayFourExercise3 = exerciseRepo.findExerciseByName(dayFourExerciseName3);
        Exercise dayFourExercise4 = exerciseRepo.findExerciseByName(dayFourExerciseName4);
        Exercise dayFiveExercise1 = exerciseRepo.findExerciseByName(dayFiveExerciseName1);
        Exercise dayFiveExercise2 = exerciseRepo.findExerciseByName(dayFiveExerciseName2);
        Exercise dayFiveExercise3 = exerciseRepo.findExerciseByName(dayFiveExerciseName3);
        Exercise dayFiveExercise4 = exerciseRepo.findExerciseByName(dayFiveExerciseName4);

        ArrayList<Exercise> dayOneExercises = new ArrayList<>();
        dayOneExercises.add(dayOneExercise1);
        dayOneExercises.add(dayOneExercise2);
        dayOneExercises.add(dayOneExercise3);
        dayOneExercises.add(dayOneExercise4);
        ArrayList<Exercise> dayTwoExercises = new ArrayList<>();
        dayTwoExercises.add(dayTwoExercise1);
        dayTwoExercises.add(dayTwoExercise2);
        dayTwoExercises.add(dayTwoExercise3);
        dayTwoExercises.add(dayTwoExercise4);
        ArrayList<Exercise> dayThreeExercises = new ArrayList<>();
        dayThreeExercises.add(dayThreeExercise1);
        dayThreeExercises.add(dayThreeExercise2);
        dayThreeExercises.add(dayThreeExercise3);
        dayThreeExercises.add(dayThreeExercise4);
        ArrayList<Exercise> dayFourExercises = new ArrayList<>();
        dayFourExercises.add(dayFourExercise1);
        dayFourExercises.add(dayFourExercise2);
        dayFourExercises.add(dayFourExercise3);
        dayFourExercises.add(dayFourExercise4);
        ArrayList<Exercise> dayFiveExercises = new ArrayList<>();
        dayFiveExercises.add(dayFiveExercise1);
        dayFiveExercises.add(dayFiveExercise2);
        dayFiveExercises.add(dayFiveExercise3);
        dayFiveExercises.add(dayFiveExercise4);

        ExercisePlan planToAdd = new ExercisePlan(planName, amountOfDays, dayOneExercises, dayTwoExercises, dayThreeExercises, dayFourExercises, dayFiveExercises);
        exercisePlanRepo.save(planToAdd);
        return "redirect:/exerciseplan";
    }

//    @PostMapping("/buildaplan/add-plan")
//    public String buildAPlan(@PathVariable long id, @RequestParam String planName, @RequestParam int amountOfDays, @RequestParam Collection<Exercise> dayOneExercises, @RequestParam Collection<Exercise> dayTwoExercises, @RequestParam Collection<Exercise> dayThreeExercises, @RequestParam Collection<Exercise> dayFourExercises, @RequestParam Collection<Exercise> dayFiveExercises, Model model){
//        ExercisePlan exercisePlanToAdd;
//        Object newPlan = new Object();
//        String newPlanName = newPlan.getString();
//        Optional<ExercisePlan> exercisePlanToAddOpt = exercisePlanRepo.findById(id);
//        if(exercisePlanToAddOpt.isEmpty()){
//            exercisePlanToAdd = new ExercisePlan(planName, amountOfDays, dayOneExercises,dayTwoExercises,dayThreeExercises,dayFourExercises,dayFiveExercises);
//            exercisePlanRepo.save(exercisePlanToAdd);
//        }else{
//            exercisePlanToAdd = exercisePlanToAddOpt.get();
//        }Optional<ExercisePlan> retrievedPlan = exercisePlanRepo.findById(id);
//        ExercisePlan foundPlan = retrievedPlan.get();
//        model.addAttribute("exercisePlan", foundPlan);
//        return "redirect:/exerciseplan";
//    }
}

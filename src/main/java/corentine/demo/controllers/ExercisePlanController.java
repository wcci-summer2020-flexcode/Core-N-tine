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
    public String buildAPlan(@RequestParam String planName, @RequestParam int amountOfDays, @RequestParam String exerciseName1){
        Exercise dayOneExercise = exerciseRepo.findExerciseByName(exerciseName1);
        ArrayList<Exercise> dayOneExercises = new ArrayList<>();
        dayOneExercises.add(dayOneExercise);
        ExercisePlan planToAdd = new ExercisePlan(planName, amountOfDays, dayOneExercises);
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

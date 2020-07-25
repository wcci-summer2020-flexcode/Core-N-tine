package corentine.demo.controllers;

import corentine.demo.models.ExercisePlan;
import corentine.demo.repository.ExercisePlanRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class ExercisePlanController {
    @Resource
    private ExercisePlanRepository exercisePlanRepo;
    @Resource
    private ExercisePlanRepository exerciseRepo;

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
        System.out.println(retrievedPlan.get().getDayOneExercises());
        return "exercisePlanView";
    }
}

package corentine.demo.controllers;

import corentine.demo.models.Exercise;
import corentine.demo.repository.ExerciseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class ExerciseController {

    @Resource
    private ExerciseRepository exerciseRepo;

    //add all exercises view if needed

    @RequestMapping({"/exercises"})
    public String displayAllExercises(Model model){
        model.addAttribute("exercises", exerciseRepo.findAll());
        return "exercisesView";
    }

    @RequestMapping("/exercise/{id}")
    public String displaySingleExercise(@PathVariable long id, Model model) {
        Optional<Exercise> retrievedExercise = exerciseRepo.findById(id);
        Exercise foundExercise = retrievedExercise.get();
        model.addAttribute("exercise", foundExercise);
        return "exercisesView";  //this single view
    }



}

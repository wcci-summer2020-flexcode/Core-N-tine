package corentine.demo.controllers;

import corentine.demo.models.Muscle;
import corentine.demo.repository.MuscleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class MuscleController {

    @Resource
    private MuscleRepository muscleRepo;

    @RequestMapping({"/muscles"})
    public String displayAllMuscles(Model model){
        model.addAttribute("muscles", muscleRepo.findAll());
        return "musclesView";
    }

    @RequestMapping("/muscles/{name}")
    public String displaySingleMuscle(@PathVariable String name, Model model) {
        model.addAttribute("muscle", muscleRepo.findMuscleByName(name));
        model.addAttribute("exercise", muscleRepo.findAll());
        return "muscleView";
    }


}
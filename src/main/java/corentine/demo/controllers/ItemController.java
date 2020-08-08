package corentine.demo.controllers;

import corentine.demo.models.Item;
import corentine.demo.repository.ExerciseRepository;
import corentine.demo.repository.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;


@Controller
public class ItemController {

    @Resource
    private ItemRepository itemRepo;
    @Resource
    private ExerciseRepository exerciseRepo;

    @RequestMapping({"/items"})
    public String displayAllItems(Model model){
        model.addAttribute("items", itemRepo.findAll());
        model.addAttribute("exercises", exerciseRepo.findAll());
        model.addAttribute("chair", itemRepo.findItemByName("Chair"));
        model.addAttribute("stairs", itemRepo.findItemByName("Stairs"));
        model.addAttribute("jugs", itemRepo.findItemByName("Jugs"));
        model.addAttribute("room", itemRepo.findItemByName("Empty Room"));
        model.addAttribute("pvcPipe", itemRepo.findItemByName("PVC Pipe"));
        model.addAttribute("paperPlates", itemRepo.findItemByName("Paper Plates"));
        model.addAttribute("pillow", itemRepo.findItemByName("Pillow"));
        model.addAttribute("rope", itemRepo.findItemByName("Rope"));
        model.addAttribute("backpack", itemRepo.findItemByName("Backpack"));
        return "itemsView";
    }

    @RequestMapping("/items/{id}")
    public String displaySingleItem(@PathVariable long id, Model model) {
        Optional<Item> retrievedItem = itemRepo.findById(id);
        Item foundItem = retrievedItem.get();
        model.addAttribute("item", foundItem);
        return "itemView";
    }

}
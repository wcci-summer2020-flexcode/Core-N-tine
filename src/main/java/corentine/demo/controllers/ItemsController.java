package corentine.demo.controllers;

import corentine.demo.models.Item;
import corentine.demo.repository.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;


@Controller
public class ItemsController {

    @Resource
    private ItemRepository itemRepo;

    @RequestMapping("/home/items")
    public String displayAllItems(Model model){
        model.addAttribute("item", itemRepo.findAll());
        return "items";
    }

    @RequestMapping("/home/item/{id}")
    public String displayItems(@PathVariable long id, Model model){
        Optional<Item> retrievedItem = itemRepo.findById(id);
        Item foundItem = retrievedItem.get();
        model.addAttribute("item", foundItem);
        return "itemsView";
    }
}

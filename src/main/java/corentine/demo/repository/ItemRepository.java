package corentine.demo.repository;

import corentine.demo.models.Exercise;
import corentine.demo.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
    Item findItemByName(String name);
}
package corentine.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    @ManyToMany(mappedBy = "items")
    private Collection<Exercise> exercises;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() { return imageUrl; }

    public Collection<Exercise> getExercises() {
        return exercises;
    }

    public Item() { }

    public Item(String name, String imageUrl, Exercise... exercises) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.exercises = new ArrayList<>(Arrays.asList(exercises));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

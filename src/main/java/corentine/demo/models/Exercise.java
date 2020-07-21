package corentine.demo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Exercise {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    private int timeInMinutes;
    private int youngAge;
    private int oldAge;
    @Lob
    private String description;
    @ManyToMany
    private Collection<Item> items;
    @ManyToMany
    private Collection<Muscle> muscles;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getTimeInMinutes() {return timeInMinutes;}
    public int getYoungAge(){return youngAge;}
    public int getOldAge() {return oldAge;}

    public String getDescription() {
        return description;
    }

    public Collection<Item> getItems() {
        return items;
    }

    public Exercise() { }

    public Exercise(String name, String imageUrl, String description, int timeInMinutes, int youngAge, int oldAge,  Item... items) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.timeInMinutes = timeInMinutes;
        this.youngAge = youngAge;
        this.oldAge = oldAge;
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(id, exercise.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

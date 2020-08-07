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
    private String videoUrl;
    private int timeInMinutes;
    private int youngAge;
    private int oldAge;
    @Lob
    private String description;
    @ManyToMany
    private Collection<Item> items;
    @ManyToMany
    private Collection<Muscle> muscles;
    @ManyToMany
    private Collection<ExercisePlan> dayOneExercises;
    @ManyToMany
    private Collection<ExercisePlan> dayTwoExercises;
    @ManyToMany
    private Collection<ExercisePlan> dayThreeExercises;
    @ManyToMany
    private Collection<ExercisePlan> dayFourExercises;
    @ManyToMany
    private Collection<ExercisePlan> dayFiveExercises;

    public Exercise(String name) {
        this.name = name; }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVideoUrl() {return videoUrl;}

    public int getTimeInMinutes() {return timeInMinutes;}
    public int getYoungAge(){return youngAge;}
    public int getOldAge() {return oldAge;}

    public String getDescription() {
        return description;
    }

    public Collection<Muscle> getMuscles() {
        return muscles;
    }

    public Collection<Item> getItems() {
        return items;
    }

    public Exercise() { }

    public Exercise(String name, String imageUrl, String videoUrl, String description, int timeInMinutes, int youngAge, int oldAge, Collection<Muscle> muscles, Item... items) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
        this.description = description;
        this.timeInMinutes = timeInMinutes;
        this.youngAge = youngAge;
        this.oldAge = oldAge;
        this.muscles = muscles;
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

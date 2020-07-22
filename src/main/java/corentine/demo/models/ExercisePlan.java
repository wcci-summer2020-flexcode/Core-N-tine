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
public class ExercisePlan {

    @Id
    @GeneratedValue
    private Long id;
    private String planName;
    private int amountOfDays;
    @ManyToMany(mappedBy = "exercisePlans")
    private Collection<Exercise> exercises;

    public Long getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }

    public Collection<Exercise> getExercises() {
        return exercises;
    }

    public ExercisePlan(){}

    public ExercisePlan(String planName, int amountOfDays, Exercise... exercises){
        this.planName = planName;
        this.amountOfDays = amountOfDays;
        this.exercises = new ArrayList<>(Arrays.asList(exercises));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExercisePlan that = (ExercisePlan) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

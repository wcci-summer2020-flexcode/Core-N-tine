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
    @ManyToMany
    private Collection<Exercise> dayOneExercises;
    @ManyToMany
    private Collection<Exercise> dayTwoExercises;
    @ManyToMany
    private Collection<Exercise> dayThreeExercises;
    @ManyToMany
    private Collection<Exercise> dayFourExercises;
    @ManyToMany
    private Collection<Exercise> dayFiveExercises;

    public Long getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }

    public Collection<Exercise> getDayOneExercises() {
        return dayOneExercises;
    }

    public Collection<Exercise> getDayTwoExercises() {
        return dayTwoExercises;
    }

    public Collection<Exercise> getDayThreeExercises() {
        return dayThreeExercises;
    }

    public Collection<Exercise> getDayFourExercises() { return dayFourExercises; }

    public Collection<Exercise> getDayFiveExercises() {
        return dayFiveExercises;
    }

    public ExercisePlan(){}

    public ExercisePlan(String planName, int amountOfDays, Collection<Exercise> dayOneExercises, Collection<Exercise> dayTwoExercises, Collection<Exercise> dayThreeExercises, Collection<Exercise> dayFourExercises, Collection<Exercise> dayFiveExercises){
        this.planName = planName;
        this.amountOfDays = amountOfDays;
        this.dayOneExercises = dayOneExercises;
        this.dayTwoExercises = dayTwoExercises;
        this.dayThreeExercises = dayThreeExercises;
        this.dayFourExercises = dayFourExercises;
        this.dayFiveExercises = dayFiveExercises;
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

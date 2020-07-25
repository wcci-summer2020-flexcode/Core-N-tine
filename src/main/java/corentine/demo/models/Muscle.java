package corentine.demo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Muscle {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany
    private Collection<Exercise> exercises;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Exercise> getExercises() {
        return exercises;
    }

    public Muscle() {  }

    public Muscle(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Muscle muscle = (Muscle) o;
        return id.equals(muscle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

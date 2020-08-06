package corentine.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.DiscriminatorColumn;

public class FeedBack {

    @NotNull
    private String name;

    @NotNull
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @NotNull
    private String feedback;

}

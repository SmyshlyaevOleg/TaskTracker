package ru.smyshlyaev.TaskTracker.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Engineer {

    private int engineerId;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "taskOwner")
    private List<Task> tasks;

    private String role;

}

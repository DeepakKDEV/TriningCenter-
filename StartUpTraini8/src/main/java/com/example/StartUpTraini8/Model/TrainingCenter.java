package com.example.StartUpTraini8.Model;


import com.example.StartUpTraini8.Model.enumsclass.CourseEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Entity
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String centerName;


    private String centerCode;

    @NotNull
    private Address address;

    @NotNull
    private Integer studentCapacity;

    @NotNull
    private CourseEnum coursesOffered;

    private Long createdOn;


    private String contactEmail;

    @Size(min = 10, max = 12)
    private String contactPhone;

    // Getters and setters
}

package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "model")
public class Category extends BasicEntity{


    @Column(name = "name", length = 40)
    private String name;

    // @Column(columnDefinition = "ENUM('CRIME','SCI_FI') NOT NULL")
    @Column(name="code", nullable = false, length = 40, unique = true)
    @Enumerated(EnumType.STRING)
    private CategoryCode code;



}

package org.itstep.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "spring-pojo")
public class SpringPogo {
    @Id
    @Column (name = "id")
    @JsonProperty
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "text_field")
    @JsonProperty
    private String textField;

    @Column (name = "condition")
    @JsonProperty
    private Boolean condition;
}

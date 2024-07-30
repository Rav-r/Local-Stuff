package com.Rav_R.DatabaseApplication.Domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Authors {
    private Long id;
    private String name;
    private Integer age;

}

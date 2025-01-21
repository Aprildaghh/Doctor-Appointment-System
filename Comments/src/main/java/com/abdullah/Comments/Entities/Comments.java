package com.abdullah.Comments.Entities;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Comments {

    @Id
    private Integer id;
    private Integer doctorId;
    private Integer userId;
    private String comment;
    private Integer rating;
}

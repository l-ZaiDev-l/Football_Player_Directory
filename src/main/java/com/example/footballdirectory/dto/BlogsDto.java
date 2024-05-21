package com.example.footballdirectory.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class BlogsDto {

    private Long id;
    private String photoUrl;
    private String title;
    private LocalDate creation_date;

}

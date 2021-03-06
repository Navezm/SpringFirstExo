package com.example.exospring.models.forms;

import com.example.exospring.entities.Library;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class MangaForm {
    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String genre;

    @Getter
    @Setter
    private String imgSrc;

    @Getter
    @Setter
    private Library library;
}

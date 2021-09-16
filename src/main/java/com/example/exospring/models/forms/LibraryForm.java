package com.example.exospring.models.forms;

import com.example.exospring.entities.Manga;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@ToString
public class LibraryForm {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private List<Manga> mangas = new ArrayList<>();
}

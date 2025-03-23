package it.ddalpra.acme.todo.domain;

import it.ddalpra.acme.todo.domain.util.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TodoTaskList extends BaseEntity {

    private String displayName;
    private Boolean isOwner;
    private Boolean isShared;
    private String wellknownListName;



    // Costruttori, getter e setter
}
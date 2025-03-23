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

    public String displayName;
    public Boolean isOwner;
    public Boolean isShared;
    public String wellknownListName;

    // Costruttori, getter e setter
}
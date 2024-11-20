package com.wora.citronix.dtos.champ;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.UUID;

@Data
public class ChampCreateDTO {
    @Positive(message = "La superficie doit être positive.")
    private double superficie;

    @NotNull(message = "L'identifiant de la ferme est obligatoire.")
    private UUID fermeId;
}


package com.wora.citronix.entities;

import com.wora.citronix.entities.enums.Saison;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recolte {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @PastOrPresent
    private LocalDate dateRecolte;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Saison saison;

    @Min(0)
    private Double quantiteTotale;

    @ManyToOne
    @JoinColumn(name = "champ_id", nullable = false)
    private Champ champ;

    @OneToMany(mappedBy = "recolte", cascade = CascadeType.ALL)
    private List<DetailRecolte> details;

}

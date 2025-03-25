package lt.mariaus.baigiamasis_darbas.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Detale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String pavadinimas;

    @Column(nullable = false)
    private String kaina;

    @Column(nullable = false)
    private Long kiekis;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "automobilis_id", nullable = false)
    private Automobilis automobilis;

    @ManyToOne
    @JoinColumn(name = "sandelys_id")
    private Sandelys sandelys;
}



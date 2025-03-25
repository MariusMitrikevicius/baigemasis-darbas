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
    private String pavadinimas;
    private String kaina;
    private Long kiekis;
//    private Long automobilis_id;
//    private Long sandelys_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "automobilis_id")
    private Sandelys sandelys;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sandelys_id")
    private Automobilis automobilis;
}

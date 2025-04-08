package lt.mariaus.baigiamasis_darbas.service;

import lombok.RequiredArgsConstructor;
import lt.mariaus.baigiamasis_darbas.entity.Automobilis;
import lt.mariaus.baigiamasis_darbas.entity.Detale;
import lt.mariaus.baigiamasis_darbas.entity.Sandelys;
import lt.mariaus.baigiamasis_darbas.repository.DetaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DetaleService {

    private final DetaleRepository detaleRepository;

    public List<Detale> gautiVisasDetales() {
        return detaleRepository.findAll();
    }

    public Detale pridetiDetale(Detale detale) {
        return detaleRepository.saveAndFlush(detale);
    }

//    public void pridetiTestinesDetales() {
//        // 1. Padanga
//        Detale detale1 = new Detale();
//        detale1.setPavadinimas("Padanga");
//        detale1.setKaina("300");
//        detale1.setKiekis(4L);
//
//        Automobilis auto1 = new Automobilis();
//        auto1.setVinKodas("1C4RJFCG9KC687917");
//        auto1.setMarke("Jeep");
//
//        Sandelys sand1 = new Sandelys();
//        sand1.setPavadinimas("Padangų sandėlys");
//        sand1.setAdresas("Klevų g. 1");
//
//        detale1.setAutomobilis(auto1);
//        detale1.setSandelys(sand1);
//        pridetiDetale(detale1);
//
//        // 2. Stabdžių kaladėlės
//        Detale detale2 = new Detale();
//        detale2.setPavadinimas("Stabdžių kaladėlės");
//        detale2.setKaina("150");
//        detale2.setKiekis(8L);
//
//        Automobilis auto2 = new Automobilis();
//        auto2.setVinKodas("WBAFR1C50BC678342");
//        auto2.setMarke("BMW");
//
//        Sandelys sand2 = new Sandelys();
//        sand2.setPavadinimas("Stabdžių detalių sandėlys");
//        sand2.setAdresas("Gedimino pr. 45");
//
//        detale2.setAutomobilis(auto2);
//        detale2.setSandelys(sand2);
//        pridetiDetale(detale2);
//
//        // 3. Oro filtras
//        Detale detale3 = new Detale();
//        detale3.setPavadinimas("Oro filtras");
//        detale3.setKaina("45");
//        detale3.setKiekis(12L);
//
//        Automobilis auto3 = new Automobilis();
//        auto3.setVinKodas("JM1GJ1W56F1234567");
//        auto3.setMarke("Mazda");
//
//        Sandelys sand3 = new Sandelys();
//        sand3.setPavadinimas("Variklio detalių sandėlys");
//        sand3.setAdresas("Savanorių pr. 12");
//
//        detale3.setAutomobilis(auto3);
//        detale3.setSandelys(sand3);
//        pridetiDetale(detale3);
//
//        // 4. Akumuliatorius
//        Detale detale4 = new Detale();
//        detale4.setPavadinimas("Akumuliatorius");
//        detale4.setKaina("200");
//        detale4.setKiekis(5L);
//
//        Automobilis auto4 = new Automobilis();
//        auto4.setVinKodas("5YJSA1E21HF123456");
//        auto4.setMarke("Tesla");
//
//        Sandelys sand4 = new Sandelys();
//        sand4.setPavadinimas("Elektros sistemų sandėlys");
//        sand4.setAdresas("Technologijų g. 7");
//
//        detale4.setAutomobilis(auto4);
//        detale4.setSandelys(sand4);
//        pridetiDetale(detale4);
//    }
}


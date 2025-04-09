package lt.mariaus.baigiamasis_darbas.service;

import lombok.RequiredArgsConstructor;
import lt.mariaus.baigiamasis_darbas.entity.Detale;
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

}


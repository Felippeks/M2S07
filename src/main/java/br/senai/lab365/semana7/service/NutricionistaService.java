import br.senai.lab365.semana7.entity.Nutricionista;
import br.senai.lab365.semana7.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutricionistaService {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public Nutricionista createNutricionista(Nutricionista nutricionista) {
        return nutricionistaRepository.save(nutricionista);
    }

    public Nutricionista updateNutricionista(Nutricionista nutricionista) {
        return nutricionistaRepository.save(nutricionista);
    }

    public void deleteNutricionista(Long id) {
        nutricionistaRepository.deleteById(id);
    }

    public List<Nutricionista> getAllNutricionistas() {
        return nutricionistaRepository.findAll();
    }

    public Nutricionista getNutricionistaById(Long id) {
        return nutricionistaRepository.findById(id).orElse(null);
    }
    public NutricionistaService(NutricionistaRepository nutricionistaRepository) {
        this.nutricionistaRepository = nutricionistaRepository;
    }
}
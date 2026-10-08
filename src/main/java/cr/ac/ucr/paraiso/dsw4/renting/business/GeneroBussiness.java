package cr.ac.ucr.paraiso.dsw4.renting.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.ac.ucr.paraiso.dsw4.renting.domain.Genero;
import cr.ac.ucr.paraiso.dsw4.renting.data.GeneroData;

@Service
public class GeneroBussiness {

    @Autowired
    private GeneroData generoData;
   
    public List<Genero> findAll() {
        return generoData.findAll();
    }

}

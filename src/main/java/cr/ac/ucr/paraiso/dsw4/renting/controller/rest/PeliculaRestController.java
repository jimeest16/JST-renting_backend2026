package cr.ac.ucr.paraiso.dsw4.renting.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cr.ac.ucr.paraiso.dsw4.renting.business.PeliculaBusiness;
import cr.ac.ucr.paraiso.dsw4.renting.domain.Pelicula;


@RestController
@RequestMapping(value = "/peliculas")
@CrossOrigin(origins= "http://localhost:4200")
public class PeliculaRestController {
    @Autowired
    private PeliculaBusiness peliculaBusiness;
 
 
    @GetMapping()
    public ResponseEntity<List<Pelicula>> findMovies(@RequestParam("titulo") String titulo, @RequestParam("genero") String genero) {
        List<Pelicula> peliculas = peliculaBusiness.findMoviesByTitleOrGenre(titulo, genero);
 
        if (peliculas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(peliculas); 
    }
   
}

package cr.ac.ucr.paraiso.dsw4.renting.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cr.ac.ucr.paraiso.dsw4.renting.business.PeliculaBusiness;
import cr.ac.ucr.paraiso.dsw4.renting.domain.Pelicula;


@Controller
public class PeliculaController {
    private final PeliculaBusiness movieBussiness;

    @Autowired
    public PeliculaController(PeliculaBusiness movieBussiness) {
        this.movieBussiness = movieBussiness;
        
    }
 
    @RequestMapping(value="/findMovies", method=RequestMethod.GET)
    public String start(Model model){
        return "findMovies";
    }
 
    @RequestMapping(value="/findMovies", method=RequestMethod.POST)
    public String findMovies(Model model, @RequestParam("titulo") String title, @RequestParam("genero") String genre){
        List<Pelicula> peliculas = movieBussiness.findMoviesByTitleOrGenre(title, genre);
        model.addAttribute("peliculas", peliculas);
        return "findMovies";
    }
        
}

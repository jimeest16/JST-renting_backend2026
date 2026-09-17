package cr.ac.ucr.paraiso.dsw4.renting.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
    
   @RequestMapping(value="/", method=RequestMethod.GET)
   public String welcome(){
       return "welcome"; // corresponde al nombre de la plantilla
   }


}



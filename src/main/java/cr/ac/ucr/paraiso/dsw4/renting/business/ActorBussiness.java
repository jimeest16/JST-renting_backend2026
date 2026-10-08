package cr.ac.ucr.paraiso.dsw4.renting.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.ac.ucr.paraiso.dsw4.renting.data.ActorData;
import cr.ac.ucr.paraiso.dsw4.renting.domain.Actor;

@Service
public class ActorBussiness {
   
    @Autowired
    private ActorData actorData;
   
     public List<Actor> findAll() {
         return actorData.findAll();
     }

}

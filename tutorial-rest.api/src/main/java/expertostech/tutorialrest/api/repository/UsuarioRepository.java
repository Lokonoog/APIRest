package expertostech.tutorialrest.api.repository;

import expertostech.tutorialrest.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioRepository extends CrudRepository<UsuarioModel,Integer> {
}

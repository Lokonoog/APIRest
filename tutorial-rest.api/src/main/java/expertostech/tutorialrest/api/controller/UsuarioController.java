package expertostech.tutorialrest.api.controller;

import expertostech.tutorialrest.api.model.UsuarioModel;
import expertostech.tutorialrest.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //  Faz a consulta
    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultarUsuarioPorId(@PathVariable(name = "codigo", required = true) Integer codigo){
        return usuarioRepository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record)) // caso eu encontre os dados do usuario
                .orElse(ResponseEntity.notFound().build()); // caso eu não encontre
    }

    //salva meus dados
    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
}

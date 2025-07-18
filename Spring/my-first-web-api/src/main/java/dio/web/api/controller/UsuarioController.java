package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    private final UsuarioRepository repository;

    @Autowired
    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @PutMapping("/users")
    public void putUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}

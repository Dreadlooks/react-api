package br.com.gabriels.reactapi.authorapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public ResponseEntity<AuthorsJson> findAll() {

        AuthorsJson authorsJson = new AuthorsJson(authorRepository.findAll());
        return ResponseEntity.ok(authorsJson);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorJson> findById(@PathVariable("id") Long id) {
        Optional<Author> possibleAuthor = authorRepository.findById(id);

        if (possibleAuthor.isPresent()) {
            AuthorJson authorJson = new AuthorJson(possibleAuthor.get());
            return ResponseEntity.ok(authorJson);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @Transactional
    public ResponseEntity<AuthorsJson> save(@RequestBody @Valid AuthorForm form) {
        Author author = form.toModel();
        authorRepository.save(author);
        return findAll();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<AuthorsJson> update(@PathVariable("id") Long id, @RequestBody @Valid AuthorForm form) {
        Optional<Author> possibleAuthor = authorRepository.findById(id);

        if (possibleAuthor.isPresent()) {
            Author author = form.update(possibleAuthor.get());
            authorRepository.save(author);
            return ResponseEntity.ok(findAll()).getBody();
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AuthorsJson> deleteById(@PathVariable("id") Long id) {
        authorRepository.deleteById(id);

        return findAll();
    }

    @GetMapping("/book")
    public BooksJson findAllBooks() {
        return new BooksJson(authorRepository.findAll());
    }

//    @GetMapping("/name")
//    public AuthorNameDto findAllNames() {
//        return new AuthorsJson(authorRepository.findAll());
//    }
}

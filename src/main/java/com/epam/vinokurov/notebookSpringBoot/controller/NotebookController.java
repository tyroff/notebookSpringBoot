package com.epam.vinokurov.notebookSpringBoot.controller;

import com.epam.vinokurov.notebookSpringBoot.entity.Notebook;
import com.epam.vinokurov.notebookSpringBoot.exception.ValidationException;
import com.epam.vinokurov.notebookSpringBoot.service.NotebookService;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Log
@RestController
@RequestMapping("/notebooks")
public class NotebookController {

    private final NotebookService notebookService;

    public NotebookController(NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @PostMapping("/save")
    public Notebook saveNotebook(@RequestBody Notebook notebook) throws ValidationException {
        log.info("Handling save notebook: " + notebook);
        return notebookService.createNotebook(notebook);
    }

    @GetMapping("/findAll")
    public List<Notebook> findAllnotebooks() {
        log.info("Handling find all notebook request");
        return notebookService.findAll();
    }

    @GetMapping("/findById")
    public Notebook findById(@RequestParam Long id) {
        log.info("Handling find by id request: " + id);
        return notebookService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteNotebook(@PathVariable Long id) {
        log.info("Handling delete notebook request: " + id);
        notebookService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

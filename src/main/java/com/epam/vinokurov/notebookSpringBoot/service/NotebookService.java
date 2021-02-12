package com.epam.vinokurov.notebookSpringBoot.service;

import com.epam.vinokurov.notebookSpringBoot.entity.Notebook;
import com.epam.vinokurov.notebookSpringBoot.repository.NotebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotebookService {

    @Autowired
    private final NotebookRepository notebookRepository;

    public NotebookService(NotebookRepository notebookRepository) {
        this.notebookRepository = notebookRepository;
    }

    public void createNotebook(Notebook notebook) {
        notebookRepository.save(notebook);
    }

    public List<Notebook> findAll() {
        return notebookRepository.findAll();
    }

    public Notebook findById(Long notebookId) {
        return notebookRepository.findById(notebookId).orElse(null);
    }

    public void deleteById(Long notebookId) {
        notebookRepository.deleteById(notebookId);
    }

    public void deleteAll() {
        notebookRepository.deleteAll();
    }
}

package com.epam.vinokurov.notebookSpringBoot.repository;

import com.epam.vinokurov.notebookSpringBoot.entity.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotebookRepository extends JpaRepository<Notebook, Long> {

}

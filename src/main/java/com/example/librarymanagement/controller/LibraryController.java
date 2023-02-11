package com.example.librarymanagement.controller;

import com.example.librarymanagement.model.Library;
import com.example.librarymanagement.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/library-app")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("find-all")
    public List<Library> getAll()
    {
        return libraryService.getAllLibrary();
    }

    @GetMapping("find-by-name/name/{name}")
    public Library getByName(@PathVariable String name)
    {
        return libraryService.getByName(name);
    }

    @PostMapping("add-library")
    public void addLibrary(@RequestBody Library library){
        libraryService.addToLibrary(library);
    }

}

package com.example.librarymanagement.service;

import com.example.librarymanagement.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private static List<Library> libraries=new ArrayList<>();
    static {
        libraries.add(new Library("City Library","Lalbagh,Prayagraj",1,List.of("free wifi","24x7 open")));
        libraries.add(new Library("Central Library","Gomti nagar,Lucknow",2,List.of("free wifi","10000+ Books")));

    }

    public void addToLibrary(Library library){
        libraries.add(library);
    }

    public List<Library> getAllLibrary(){
        return libraries;
    }

    public Library getByName(String name){
        for (Library obj:libraries){
            if(name.equals(obj.getName())){
                return obj;
            }
        }
        return null;
    }

}

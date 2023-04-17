package edu.escuelaing.ieti.codelab7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @RequestMapping("/")
    public String name() {
        return "Daniel Hernández";
    }
}

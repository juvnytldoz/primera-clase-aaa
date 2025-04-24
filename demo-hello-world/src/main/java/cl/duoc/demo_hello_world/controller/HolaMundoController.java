package cl.duoc.demo_hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/api/v1/hola")
    public String holaMundo(){
        return "Hola estudiantes de DUOC UC 😁";
    }

    @GetMapping("/api/v1/ADIOS")
    public String chaoMundo(){
        return "Adios estudiantes de DUOC UC 😘";
    }
}

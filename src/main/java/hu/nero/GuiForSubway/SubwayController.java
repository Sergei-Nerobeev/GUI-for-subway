package hu.nero.GuiForSubway;

import hu.nero.Subway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubwayController {


    @GetMapping("/subway/{name}")
    public Subway createSubway(@PathVariable String name) {
        var subway = new Subway(name);
        return subway;
    }

}

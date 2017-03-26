package oneticketaway.controllers;

import oneticketaway.model.Powerball;
import oneticketaway.services.ContentMigrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

/**
 * Created by administrator on 3/26/17.
 */
@RestController
public class PowerballController {

    @Autowired
    ContentMigrationService _contentMigrationService;

    @RequestMapping("/powerball")
    public Powerball[] getNumbers() throws MalformedURLException {
        Powerball[] pb = _contentMigrationService.getAllPowerballNumbers();
       return pb;
    }
}

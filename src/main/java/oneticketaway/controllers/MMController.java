package oneticketaway.controllers;

import oneticketaway.model.MegaMillions;
import oneticketaway.services.ContentMigrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

/**
 * Created by administrator on 3/25/17.
 */
@RestController
public class MMController {

    @Autowired
    private ContentMigrationService _contentMigrationService;

    @RequestMapping("/megamillions")
    public MegaMillions[] mmNumbers(){
        MegaMillions[] mm = null;
        try {
            mm =  _contentMigrationService.getAllMegaMillionsNumbers();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return mm;
    }


}

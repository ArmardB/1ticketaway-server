package oneticketaway.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by administrator on 3/25/17.
 */
public class MMController {

    @RequestMapping("/numbers")
    public String getWinningNumbers() {
        return "12 24 25 43 55";
    }
}

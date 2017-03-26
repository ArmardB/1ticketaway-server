package oneticketaway.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import oneticketaway.model.MegaMillions;
import oneticketaway.model.Powerball;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by administrator on 3/25/17.
 */
@Service
public class ContentMigrationService {

    public MegaMillions[] getAllMegaMillionsNumbers() throws MalformedURLException {
        ObjectMapper mapper = new ObjectMapper();
        MegaMillions[] mm = null;
        URL url = new URL("https://data.ny.gov/resource/5xaw-6ayf.json");

        try {
            mm = mapper.readValue(url, MegaMillions[].class);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return mm;
    }

    public Powerball[] getAllPowerballNumbers() throws MalformedURLException {
        ObjectMapper mapper = new ObjectMapper();
        Powerball[] pb = null;
        URL url = new URL("https://data.ny.gov/resource/d6yy-54nr.json");

        try {
            pb = mapper.readValue(url, Powerball[].class);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return pb;

    }
}

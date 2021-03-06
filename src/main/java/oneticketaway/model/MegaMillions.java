package oneticketaway.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by administrator on 3/25/17.
 */
public class MegaMillions {

    private String _drawDate;
    private String _winningNumbers;
    private String _megaBall;
    private String _multiplier;

    @JsonProperty("draw_date")
    public String getDrawDate() {
        return _drawDate;
    }

    public void setDrawDate(String drawDate) {
        _drawDate = drawDate;
    }

    @JsonProperty("winning_numbers")
    public String getWinningNumbers() {
        return _winningNumbers;
    }

    public void setWinningNumbers(String winningNumbers) {
        _winningNumbers = winningNumbers;
    }

    @JsonProperty("mega_ball")
    public String getMegaBall() {
        return _megaBall;
    }

    public void setMegaBall(String megaBall) {
        _megaBall = megaBall;
    }

    @JsonProperty("multiplier")
    public String getMultiplier() {
        return _multiplier;
    }

    public void setMultiplier(String multiplier) {
        _multiplier = multiplier;
    }

}

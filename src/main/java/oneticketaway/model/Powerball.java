package oneticketaway.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by administrator on 3/26/17.
 */
public class Powerball {

    private String _drawDate;
    private String _winningNumbers;
    private String _multiplyer;

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

    @JsonProperty("multiplier")
    public String getMultiplyer() {
        return _multiplyer;
    }

    public void setMultiplyer(String multiplyer) {
        _multiplyer = multiplyer;
    }
}

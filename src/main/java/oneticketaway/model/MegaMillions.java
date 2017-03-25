package oneticketaway.model;

/**
 * Created by administrator on 3/25/17.
 */
public class MegaMillions {

    private String _drawDate;
    private String _winningNumbers;
    private String _megaBall;
    private String _multiplier;

    public MegaMillions(String drawDate, String winningNumbers, String megaBall, String multiplier) {
        _drawDate = drawDate;
        _winningNumbers = winningNumbers;
        _megaBall = megaBall;
        _multiplier = multiplier;
    }

    public String getDrawDate() {
        return _drawDate;
    }

    public void setDrawDate(String drawDate) {
        _drawDate = drawDate;
    }

    public String getWinningNumbers() {
        return _winningNumbers;
    }

    public void setWinningNumbers(String winningNumbers) {
        _winningNumbers = winningNumbers;
    }

    public String getMegaBall() {
        return _megaBall;
    }

    public void setMegaBall(String megaBall) {
        _megaBall = megaBall;
    }

    public String getMultiplier() {
        return _multiplier;
    }

    public void setMultiplier(String multiplier) {
        _multiplier = multiplier;
    }

}

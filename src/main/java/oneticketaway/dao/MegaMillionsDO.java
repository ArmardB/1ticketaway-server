package oneticketaway.dao;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Armard Bellamy on 3/25/17.
 */

@Entity
@Table(name = "mega_millions")
public class MegaMillionsDO implements Serializable {

    private static final long serialVersionUUID = 20170325;

    private String _drawDate;
    private String _winningNumbers;
    private String _megaBall;
    private String _multiplier;
    private long _id;

    public MegaMillionsDO(String drawDate, String winningNumbers, String megaBall, String multiplier) {
        _drawDate = drawDate;
        _winningNumbers = winningNumbers;
        _megaBall = megaBall;
        _multiplier = multiplier;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    @Column(name="draw_date")
    public String getDrawDate() {
        return _drawDate;
    }

    public void setDrawDate(String drawDate) {
        _drawDate = drawDate;
    }
    @Column(name="winning_numbers")
    public String getWinningNumbers() {
        return _winningNumbers;
    }

    public void setWinningNumbers(String winningNumbers) {
        _winningNumbers = winningNumbers;
    }
    @Column(name="mega_ball")
    public String getMegaBall() {
        return _megaBall;
    }

    public void setMegaBall(String megaBall) {
        _megaBall = megaBall;
    }
    @Column(name="multiplier")
    public String getMultiplier() {
        return _multiplier;
    }

    public void setMultiplier(String multiplier) {
        _multiplier = multiplier;
    }
}

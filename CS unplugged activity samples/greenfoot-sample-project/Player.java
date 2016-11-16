import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("NumberToSearch")
    @Expose
    private Integer numberToSearch;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("roundStatus")
    @Expose
    private Integer roundStatus;
    @SerializedName("Round")
    @Expose
    private Integer round;
    @SerializedName("GameState")
    @Expose
    private Integer gameState;
    @SerializedName("RandomNumber")
    @Expose
    private List<Integer> randomNumber = new ArrayList<Integer>();

    /**
     * 
     * @return
     *     The score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The numberToSearch
     */
    public Integer getNumberToSearch() {
        return numberToSearch;
    }

    /**
     * 
     * @param numberToSearch
     *     The NumberToSearch
     */
    public void setNumberToSearch(Integer numberToSearch) {
        this.numberToSearch = numberToSearch;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The roundStatus
     */
    public Integer getRoundStatus() {
        return roundStatus;
    }

    /**
     * 
     * @param roundStatus
     *     The roundStatus
     */
    public void setRoundStatus(Integer roundStatus) {
        this.roundStatus = roundStatus;
    }

    /**
     * 
     * @return
     *     The round
     */
    public Integer getRound() {
        return round;
    }

    /**
     * 
     * @param round
     *     The Round
     */
    public void setRound(Integer round) {
        this.round = round;
    }

    /**
     * 
     * @return
     *     The gameState
     */
    public Integer getGameState() {
        return gameState;
    }

    /**
     * 
     * @param gameState
     *     The GameState
     */
    public void setGameState(Integer gameState) {
        this.gameState = gameState;
    }

    /**
     * 
     * @return
     *     The randomNumber
     */
    public List<Integer> getRandomNumber() {
        return randomNumber;
    }

    /**
     * 
     * @param randomNumber
     *     The RandomNumber
     */
    public void setRandomNumber(List<Integer> randomNumber) {
        this.randomNumber = randomNumber;
    }

}

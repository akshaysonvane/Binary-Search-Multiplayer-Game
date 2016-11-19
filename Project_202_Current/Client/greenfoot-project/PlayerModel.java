import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.*;

public class PlayerModel implements IPlayerIterator
{

    @SerializedName("players")
    @Expose
    private List<Player> players = new ArrayList<Player>();
    @SerializedName("Result")
    @Expose
    private Boolean result;

    /**
     * 
     * @return
     *     The players
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * 
     * @param players
     *     The players
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    /**
     * 
     * @return
     *     The result
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The Result
     */
    public void setResult(Boolean result) {
        this.result = result;
    }

    @Override
    public String toString()
    {
        String str = "";
        Iterator<Player> itr = players.iterator();
        while(itr.hasNext()) {
            Player p = itr.next();
            str += p.getName() + " " + p.getScore();
        }
        return str;
    }

    @Override
    public Iterator createIterator()
    {
        return players.iterator();
    }
}
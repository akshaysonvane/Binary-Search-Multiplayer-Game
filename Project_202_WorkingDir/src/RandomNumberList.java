package multiplayerGameServer;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import java.util.*;
public class RandomNumberList extends ServerResource 
{    
    @Get
    public List<Integer> getListOfRandomNumber(int nBound)
    {
        Random randomNumberGenerator = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            list.add(randomNumberGenerator.nextInt(nBound));
        }
        return list;
    }    
}
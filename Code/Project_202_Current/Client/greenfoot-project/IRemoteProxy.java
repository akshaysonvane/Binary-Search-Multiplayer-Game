import java.util.Timer;

public interface IRemoteProxy  
{
    public boolean startServer();
    public boolean joinGame();
    public boolean startGame();
    public void getStatus(Timer timer);
}

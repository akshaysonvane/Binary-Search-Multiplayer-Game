package multiplayerGameServer;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;
import org.restlet.data.Protocol;
import org.restlet.Component;

public class MultiplayerGame extends Application {

    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
    @Override
    public synchronized Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a new instance of HelloWorldResource.
        Router router = new Router(getContext());

        // Defines only one route
        router.attach("/JoinGame", JoinGame.class);
	router.attach("/LeaveGame", LeaveGame.class);

        return router;
    }
    
    public static void main(String[] args) throws Exception {  
        // Create a new Component.  
        Component component = new Component();  

	System.out.printf("i am here");

        // Add a new HTTP server listening on port 8080.  
        component.getServers().add(Protocol.HTTP, 8083);  

	System.out.printf("i am here");

        // Attach the sample application.  
        component.getDefaultHost().attach("/MultiPlayerGame",  
            new MultiplayerGame());  

	System.out.printf("i am here");

        // Start the component.  
        component.start();  
    }  


}

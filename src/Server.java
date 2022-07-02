
import java.io.Serializable;
import java.util.function.Consumer;


public class Server extends NetworkConnection{
    
    private int port;

    public Server(Consumer<Serializable> onReceiveCallback) {
        super(onReceiveCallback);
        this.port = port;
    }

    @Override
    protected boolean isServer() {
      //  throw new UnsupportedOperationException("Not supported yet.");
       return true;
    }

    @Override
    protected String getIP() {
      //  throw new UnsupportedOperationException("Not supported yet."); 
return null;
    }

    @Override
    protected int getPort() {
       // throw new UnsupportedOperationException("Not supported yet."); 
     return port;
    }
    
}

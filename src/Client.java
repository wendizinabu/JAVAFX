
import java.io.Serializable;
import java.util.function.Consumer;


public class Client extends NetworkConnection{

    
    private String ip;
    private int port;
    public Client( String ip, int port, Consumer<Serializable> onReceiveCallback) {
        super(onReceiveCallback);
         this.ip = ip;
        this.port = port;
    }

    @Override
    protected boolean isServer() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return false;
    }

    @Override
    protected String getIP() {
      //  throw new UnsupportedOperationException("Not supported yet.");
return ip;
    }

    @Override
    protected int getPort() {
      //  throw new UnsupportedOperationException("Not supported yet.");
      return port;
    }
    
}

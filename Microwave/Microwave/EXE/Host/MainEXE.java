/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Host
//!	Generated Date	: Sat, 11, May 2019 
	File Path	: EXE/Host/MainEXE.java
*********************************************************************/


//## auto_generated
import com.telelogic.microwave.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainEXE.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainEXE {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("com.telelogic.microwave.evClose");
            Class.forName("com.telelogic.microwave.evElectricity");
            Class.forName("com.telelogic.microwave.eventmessage_0");
            Class.forName("com.telelogic.microwave.evKeyPress");
            Class.forName("com.telelogic.microwave.evNoElectricity");
            Class.forName("com.telelogic.microwave.evOpen");
            Class.forName("com.telelogic.microwave.evStartGrill");
            Class.forName("com.telelogic.microwave.evStartNormal");
            Class.forName("com.telelogic.microwave.evStartUnfrozing");
            Class.forName("com.telelogic.microwave.evStartWashing");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    protected static MicrowaveBuilder p_MicrowaveBuilder = null;
    
    //## configuration EXE::Host 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainEXE initializer_EXE = new MainEXE();
        p_MicrowaveBuilder = new MicrowaveBuilder(RiJMainThread.instance());
        p_MicrowaveBuilder.startBehavior();
        //#[ configuration EXE::Host 
        //#]
        RiJOXF.Start();
        p_MicrowaveBuilder=null;
    }
    
}
/*********************************************************************
	File Path	: EXE/Host/MainEXE.java
*********************************************************************/


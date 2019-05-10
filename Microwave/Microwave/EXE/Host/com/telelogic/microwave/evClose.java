/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evClose
//!	Generated Date	: Sat, 11, May 2019 
	File Path	: EXE/Host/com/telelogic/microwave/evClose.java
*********************************************************************/

package com.telelogic.microwave;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/microwave/evClose.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::microwave 


//## event evClose() 
public class evClose extends RiJEvent implements AnimatedEvent {
    
    public static final int evClose_microwave_telelogic_com_id = 17222;		//## ignore 
    
    
    // Constructors
    
    public  evClose() {
        lId = evClose_microwave_telelogic_com_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evClose_microwave_telelogic_com_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("com.telelogic.microwave.evClose");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="evClose(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/microwave/evClose.java
*********************************************************************/


/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evStartWashing
//!	Generated Date	: Sat, 11, May 2019 
	File Path	: EXE/Host/com/telelogic/microwave/evStartWashing.java
*********************************************************************/

package com.telelogic.microwave;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/microwave/evStartWashing.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::microwave 


//## event evStartWashing() 
public class evStartWashing extends RiJEvent implements AnimatedEvent {
    
    public static final int evStartWashing_microwave_telelogic_com_id = 17219;		//## ignore 
    
    
    // Constructors
    
    public  evStartWashing() {
        lId = evStartWashing_microwave_telelogic_com_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evStartWashing_microwave_telelogic_com_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("com.telelogic.microwave.evStartWashing");
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
          String s="evStartWashing(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/microwave/evStartWashing.java
*********************************************************************/


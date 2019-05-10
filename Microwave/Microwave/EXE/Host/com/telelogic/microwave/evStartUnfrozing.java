/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evStartUnfrozing
//!	Generated Date	: Sat, 11, May 2019 
	File Path	: EXE/Host/com/telelogic/microwave/evStartUnfrozing.java
*********************************************************************/

package com.telelogic.microwave;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/microwave/evStartUnfrozing.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::microwave 


//## event evStartUnfrozing() 
public class evStartUnfrozing extends RiJEvent implements AnimatedEvent {
    
    public static final int evStartUnfrozing_microwave_telelogic_com_id = 17218;		//## ignore 
    
    
    // Constructors
    
    public  evStartUnfrozing() {
        lId = evStartUnfrozing_microwave_telelogic_com_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evStartUnfrozing_microwave_telelogic_com_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("com.telelogic.microwave.evStartUnfrozing");
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
          String s="evStartUnfrozing(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/microwave/evStartUnfrozing.java
*********************************************************************/


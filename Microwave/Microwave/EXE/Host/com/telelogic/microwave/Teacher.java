/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Teacher
//!	Generated Date	: Sat, 11, May 2019 
	File Path	: EXE/Host/com/telelogic/microwave/Teacher.java
*********************************************************************/

package com.telelogic.microwave;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/microwave/Teacher.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::microwave 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor Teacher 
public class Teacher implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassTeacher = new AnimClass("com.telelogic.microwave.Teacher",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  Teacher() {
        try {
            animInstance().notifyConstructorEntered(animClassTeacher.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassTeacher; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Teacher.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Teacher.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Teacher.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/microwave/Teacher.java
*********************************************************************/


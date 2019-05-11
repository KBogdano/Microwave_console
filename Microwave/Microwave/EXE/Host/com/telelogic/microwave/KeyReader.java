/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: KeyReader
//!	Generated Date	: Sat, 11, May 2019 
	File Path	: EXE/Host/com/telelogic/microwave/KeyReader.java
*********************************************************************/

package com.telelogic.microwave;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/microwave/KeyReader.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::microwave 


//## class KeyReader 
public class KeyReader implements RiJActive, RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassKeyReader = new AnimClass("com.telelogic.microwave.KeyReader",false);
    //#]
    
    protected RiJThread m_thread;		//## ignore 
    
    public Reactive reactive;		//## ignore 
    
    protected Display itsDisplay;		//## link itsDisplay 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int action_2=1;
    public static final int action_1=2;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public void cancelEvent(RiJEvent event) {
        m_thread.cancelEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    //## statechart_method 
    public void run() {
        m_thread.run();
    }
    
    //## statechart_method 
    public void start() {
        m_thread.start(this);
    }
    
    // Constructors
    
    //## auto_generated 
    public  KeyReader(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassKeyReader.getUserClass(),
               new ArgData[] {
               });
        
        m_thread = new RiJThread("KeyReader");
        reactive = new Reactive(m_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Display getItsDisplay() {
        return itsDisplay;
    }
    
    //## auto_generated 
    public void __setItsDisplay(Display p_Display) {
        itsDisplay = p_Display;
        if(p_Display != null)
            {
                animInstance().notifyRelationAdded("itsDisplay", p_Display);
            }
        else
            {
                animInstance().notifyRelationCleared("itsDisplay");
            }
    }
    
    //## auto_generated 
    public void _setItsDisplay(Display p_Display) {
        if(itsDisplay != null)
            {
                itsDisplay.__setItsKeyReader(null);
            }
        __setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void setItsDisplay(Display p_Display) {
        if(p_Display != null)
            {
                p_Display._setItsKeyReader(this);
            }
        _setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void _clearItsDisplay() {
        animInstance().notifyRelationCleared("itsDisplay");
        itsDisplay = null;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        if(done)
            {
                start();
            }
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case action_2:
                {
                    action_2_add(animStates);
                }
                break;
                case action_1:
                {
                    action_1_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case action_2:
                {
                    res = action_2_takeEvent(id);
                }
                break;
                case action_1:
                {
                    res = action_1_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void action_2_add(AnimStates animStates) {
            animStates.add("ROOT.action_2");
        }
        
        //## statechart_method 
        public void action_1_add(AnimStates animStates) {
            animStates.add("ROOT.action_1");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void action_1Exit() {
        }
        
        //## statechart_method 
        public int action_1TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            action_1_exit();
            action_1_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void action_2Exit() {
        }
        
        //## statechart_method 
        public void action_2_entDef() {
            action_2_enter();
        }
        
        //## statechart_method 
        public int action_1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = action_1TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void action_2Enter() {
            //#[ state action_2.(Entry) 
            System.out.println("_______________________________________________________________________________");
            System.out.println("|   Microwave Project - author: Kamil Bogdanowski                              |"); 
            System.out.println("|   Index Number: 292481                                                       |");
            System.out.println("|   Profile: Mechatronics 3rd year        Subject: Software Engingeering       |");
            System.out.println("|   Here you have a device that allows you to microwave, grill, unfroze        |");
            System.out.println("|   your meal and then to wash a device in a proper way                        |");
            System.out.println("|                                                                              |");
            System.out.println("|   There is an instruction for you how to use it underneath                   |"); 
            System.out.println("|   To turn on the normal mode press n                                         |");
            System.out.println("|   To turn on the grill mode press g                                          |"); 
            System.out.println("|   To turn on the unfrozing mode press u                                      |");
            System.out.println("|   To turn on the washing mode press w                                        |"); 
            System.out.println("|   To open the door press o                                                   |"); 
            System.out.println("|   To close the door press c                                                  |"); 
            System.out.println("|   To press the safety button which stops the electricity flow press s        |"); 
            System.out.println("|   To unpress the safety button what lets the electricity flow again press p  |");  
            System.out.println("|______________________________________________________________________________|");     
            System.out.println(" ");
            System.out.println("Enter your command below: ");
            
            //#]
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void action_1Enter() {
            //#[ state action_1.(Entry) 
            
            char cmd = 0;
            
            try
            {
            while (Character.isLetterOrDigit(cmd) == false)
            cmd = (char)System.in.read();
            if((cmd != 's' &&  cmd != 'o') &&  (cmd != 'c' &&  cmd != 'x') &&  (cmd != 'n' &&  cmd != 'g')&&  (cmd != 'u' &&  cmd != 'w')){
            System.out.println("\007");
            System.out.println("Enter a correct value");   
            }
            }
            
            catch(java.io.IOException e)
            {
            System.err.println("Exception while reading from console: " + e);
            }
            
            if(itsDisplay != null)
            itsDisplay.gen(new evKeyPress(cmd));
            
            //#]
        }
        
        //## statechart_method 
        public void action_2_exit() {
            popNullConfig();
            action_2Exit();
            animInstance().notifyStateExited("ROOT.action_2");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            action_2_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void action_1_exit() {
            popNullConfig();
            action_1Exit();
            animInstance().notifyStateExited("ROOT.action_1");
        }
        
        //## statechart_method 
        public void action_1_entDef() {
            action_1_enter();
        }
        
        //## statechart_method 
        public void action_1_enter() {
            animInstance().notifyStateEntered("ROOT.action_1");
            pushNullConfig();
            rootState_subState = action_1;
            rootState_active = action_1;
            action_1Enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void action_2_enter() {
            animInstance().notifyStateEntered("ROOT.action_2");
            pushNullConfig();
            rootState_subState = action_2;
            rootState_active = action_2;
            action_2Enter();
        }
        
        //## statechart_method 
        public int action_2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = action_2TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int action_2TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            action_2_exit();
            action_1_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return KeyReader.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassKeyReader; 
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
        
        msg.add("itsDisplay", false, true, itsDisplay);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(KeyReader.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            KeyReader.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            KeyReader.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/microwave/KeyReader.java
*********************************************************************/


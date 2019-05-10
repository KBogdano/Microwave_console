/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Microwave
//!	Generated Date	: Sat, 11, May 2019 
	File Path	: EXE/Host/com/telelogic/microwave/Microwave.java
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
// com/telelogic/microwave/Microwave.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::microwave 


//## class Microwave 
public class Microwave implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassMicrowave = new AnimClass("com.telelogic.microwave.Microwave",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int DownGrillTime;		//## attribute DownGrillTime 
    
    protected int DryingTime;		//## attribute DryingTime 
    
    protected int MicrowaveTime;		//## attribute MicrowaveTime 
    
    protected int RinsingTime;		//## attribute RinsingTime 
    
    protected int RoundTimeFinish;		//## attribute RoundTimeFinish 
    
    protected int RoundTimeStart;		//## attribute RoundTimeStart 
    
    protected int UnfrozingTime;		//## attribute UnfrozingTime 
    
    protected int UpGrillTime;		//## attribute UpGrillTime 
    
    protected int WashingTime;		//## attribute WashingTime 
    
    protected Display itsDisplay;		//## link itsDisplay 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Washing=1;
    public static final int Washing_Washing=2;
    public static final int Rinsing=3;
    public static final int Drying=4;
    public static final int Unfrozing=5;
    public static final int Unfrozing_Unfrozing=6;
    public static final int TurnAroundStart1=7;
    public static final int TurnAroundFinish1=8;
    public static final int Open3=9;
    public static final int Open2=10;
    public static final int Open1=11;
    public static final int Open=12;
    public static final int Off=13;
    public static final int NoElectricity4=14;
    public static final int NoElectricity3=15;
    public static final int NoElectricity2=16;
    public static final int NoElectricity1=17;
    public static final int Microwaving=18;
    public static final int TurnAroundStart=19;
    public static final int TurnAroundFinish=20;
    public static final int Microwaving_Microwaving=21;
    public static final int Grilling=22;
    public static final int UpGrill=23;
    public static final int DownGrill=24;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int Washing_subState;		//## ignore 
    
    protected int Washing_lastState;		//## ignore 
    
    public static final int Microwave_Timeout_Washing_Washing_id = 1;		//## ignore 
    
    public static final int Microwave_Timeout_Rinsing_id = 2;		//## ignore 
    
    public static final int Microwave_Timeout_Drying_id = 3;		//## ignore 
    
    protected int Unfrozing_subState;		//## ignore 
    
    protected int Unfrozing_lastState;		//## ignore 
    
    public static final int Microwave_Timeout_Unfrozing_Unfrozing_id = 4;		//## ignore 
    
    public static final int Microwave_Timeout_TurnAroundStart1_id = 5;		//## ignore 
    
    public static final int Microwave_Timeout_TurnAroundFinish1_id = 6;		//## ignore 
    
    protected int Microwaving_subState;		//## ignore 
    
    protected int Microwaving_lastState;		//## ignore 
    
    public static final int Microwave_Timeout_TurnAroundStart_id = 7;		//## ignore 
    
    public static final int Microwave_Timeout_TurnAroundFinish_id = 8;		//## ignore 
    
    public static final int Microwave_Timeout_Microwaving_Microwaving_id = 9;		//## ignore 
    
    protected int Grilling_subState;		//## ignore 
    
    protected int Grilling_lastState;		//## ignore 
    
    public static final int Microwave_Timeout_UpGrill_id = 10;		//## ignore 
    
    public static final int Microwave_Timeout_DownGrill_id = 11;		//## ignore 
    
    
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
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Microwave(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassMicrowave.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation SetupGrill() 
    public void SetupGrill() {
        try {
            animInstance().notifyMethodEntered("SetupGrill",
               new ArgData[] {
               });
        
        //#[ operation SetupGrill() 
        DownGrillTime = 5000;   
        UpGrillTime = 5000;
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation SetupNormal() 
    public void SetupNormal() {
        try {
            animInstance().notifyMethodEntered("SetupNormal",
               new ArgData[] {
               });
        
        //#[ operation SetupNormal() 
        MicrowaveTime = 10000;
        RoundTimeStart = 400; 
        RoundTimeFinish = 400;   
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation SetupUnfrozing() 
    public void SetupUnfrozing() {
        try {
            animInstance().notifyMethodEntered("SetupUnfrozing",
               new ArgData[] {
               });
        
        //#[ operation SetupUnfrozing() 
        RoundTimeStart = 400; 
        RoundTimeFinish = 400; 
        UnfrozingTime = 10000;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation SetupWashing() 
    public void SetupWashing() {
        try {
            animInstance().notifyMethodEntered("SetupWashing",
               new ArgData[] {
               });
        
        //#[ operation SetupWashing() 
        WashingTime = 4000;
        RinsingTime = 4000;
        DryingTime = 4000;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getDownGrillTime() {
        return DownGrillTime;
    }
    
    //## auto_generated 
    public void setDownGrillTime(int p_DownGrillTime) {
        DownGrillTime = p_DownGrillTime;
    }
    
    //## auto_generated 
    public int getDryingTime() {
        return DryingTime;
    }
    
    //## auto_generated 
    public void setDryingTime(int p_DryingTime) {
        DryingTime = p_DryingTime;
    }
    
    //## auto_generated 
    public int getMicrowaveTime() {
        return MicrowaveTime;
    }
    
    //## auto_generated 
    public void setMicrowaveTime(int p_MicrowaveTime) {
        MicrowaveTime = p_MicrowaveTime;
    }
    
    //## auto_generated 
    public int getRinsingTime() {
        return RinsingTime;
    }
    
    //## auto_generated 
    public void setRinsingTime(int p_RinsingTime) {
        RinsingTime = p_RinsingTime;
    }
    
    //## auto_generated 
    public int getRoundTimeFinish() {
        return RoundTimeFinish;
    }
    
    //## auto_generated 
    public void setRoundTimeFinish(int p_RoundTimeFinish) {
        RoundTimeFinish = p_RoundTimeFinish;
    }
    
    //## auto_generated 
    public int getRoundTimeStart() {
        return RoundTimeStart;
    }
    
    //## auto_generated 
    public void setRoundTimeStart(int p_RoundTimeStart) {
        RoundTimeStart = p_RoundTimeStart;
    }
    
    //## auto_generated 
    public int getUnfrozingTime() {
        return UnfrozingTime;
    }
    
    //## auto_generated 
    public void setUnfrozingTime(int p_UnfrozingTime) {
        UnfrozingTime = p_UnfrozingTime;
    }
    
    //## auto_generated 
    public int getUpGrillTime() {
        return UpGrillTime;
    }
    
    //## auto_generated 
    public void setUpGrillTime(int p_UpGrillTime) {
        UpGrillTime = p_UpGrillTime;
    }
    
    //## auto_generated 
    public int getWashingTime() {
        return WashingTime;
    }
    
    //## auto_generated 
    public void setWashingTime(int p_WashingTime) {
        WashingTime = p_WashingTime;
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
                itsDisplay.__setItsMicrowave(null);
            }
        __setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void setItsDisplay(Display p_Display) {
        if(p_Display != null)
            {
                p_Display._setItsMicrowave(this);
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
            if(Grilling_subState == state)
                {
                    return true;
                }
            if(Microwaving_subState == state)
                {
                    return true;
                }
            if(Unfrozing_subState == state)
                {
                    return true;
                }
            if(Washing_subState == state)
                {
                    return true;
                }
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
                case Microwaving:
                {
                    Microwaving_add(animStates);
                }
                break;
                case Grilling:
                {
                    Grilling_add(animStates);
                }
                break;
                case Unfrozing:
                {
                    Unfrozing_add(animStates);
                }
                break;
                case Washing:
                {
                    Washing_add(animStates);
                }
                break;
                case Off:
                {
                    Off_add(animStates);
                }
                break;
                case Open1:
                {
                    Open1_add(animStates);
                }
                break;
                case Open2:
                {
                    Open2_add(animStates);
                }
                break;
                case Open3:
                {
                    Open3_add(animStates);
                }
                break;
                case Open:
                {
                    Open_add(animStates);
                }
                break;
                case NoElectricity1:
                {
                    NoElectricity1_add(animStates);
                }
                break;
                case NoElectricity2:
                {
                    NoElectricity2_add(animStates);
                }
                break;
                case NoElectricity3:
                {
                    NoElectricity3_add(animStates);
                }
                break;
                case NoElectricity4:
                {
                    NoElectricity4_add(animStates);
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
                case TurnAroundStart:
                {
                    res = TurnAroundStart_takeEvent(id);
                }
                break;
                case Microwaving_Microwaving:
                {
                    res = Microwaving_Microwaving_takeEvent(id);
                }
                break;
                case TurnAroundFinish:
                {
                    res = TurnAroundFinish_takeEvent(id);
                }
                break;
                case DownGrill:
                {
                    res = DownGrill_takeEvent(id);
                }
                break;
                case UpGrill:
                {
                    res = UpGrill_takeEvent(id);
                }
                break;
                case TurnAroundStart1:
                {
                    res = TurnAroundStart1_takeEvent(id);
                }
                break;
                case Unfrozing_Unfrozing:
                {
                    res = Unfrozing_Unfrozing_takeEvent(id);
                }
                break;
                case TurnAroundFinish1:
                {
                    res = TurnAroundFinish1_takeEvent(id);
                }
                break;
                case Washing_Washing:
                {
                    res = Washing_Washing_takeEvent(id);
                }
                break;
                case Rinsing:
                {
                    res = Rinsing_takeEvent(id);
                }
                break;
                case Drying:
                {
                    res = Drying_takeEvent(id);
                }
                break;
                case Off:
                {
                    res = Off_takeEvent(id);
                }
                break;
                case Open1:
                {
                    res = Open1_takeEvent(id);
                }
                break;
                case Open2:
                {
                    res = Open2_takeEvent(id);
                }
                break;
                case Open3:
                {
                    res = Open3_takeEvent(id);
                }
                break;
                case Open:
                {
                    res = Open_takeEvent(id);
                }
                break;
                case NoElectricity1:
                {
                    res = NoElectricity1_takeEvent(id);
                }
                break;
                case NoElectricity2:
                {
                    res = NoElectricity2_takeEvent(id);
                }
                break;
                case NoElectricity3:
                {
                    res = NoElectricity3_takeEvent(id);
                }
                break;
                case NoElectricity4:
                {
                    res = NoElectricity4_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Washing_add(AnimStates animStates) {
            animStates.add("ROOT.Washing");
            switch (Washing_subState) {
                case Washing_Washing:
                {
                    Washing_Washing_add(animStates);
                }
                break;
                case Rinsing:
                {
                    Rinsing_add(animStates);
                }
                break;
                case Drying:
                {
                    Drying_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void Washing_Washing_add(AnimStates animStates) {
            animStates.add("ROOT.Washing.Washing");
        }
        
        //## statechart_method 
        public void Rinsing_add(AnimStates animStates) {
            animStates.add("ROOT.Washing.Rinsing");
        }
        
        //## statechart_method 
        public void Drying_add(AnimStates animStates) {
            animStates.add("ROOT.Washing.Drying");
        }
        
        //## statechart_method 
        public void Unfrozing_add(AnimStates animStates) {
            animStates.add("ROOT.Unfrozing");
            switch (Unfrozing_subState) {
                case TurnAroundStart1:
                {
                    TurnAroundStart1_add(animStates);
                }
                break;
                case Unfrozing_Unfrozing:
                {
                    Unfrozing_Unfrozing_add(animStates);
                }
                break;
                case TurnAroundFinish1:
                {
                    TurnAroundFinish1_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void Unfrozing_Unfrozing_add(AnimStates animStates) {
            animStates.add("ROOT.Unfrozing.Unfrozing");
        }
        
        //## statechart_method 
        public void TurnAroundStart1_add(AnimStates animStates) {
            animStates.add("ROOT.Unfrozing.TurnAroundStart1");
        }
        
        //## statechart_method 
        public void TurnAroundFinish1_add(AnimStates animStates) {
            animStates.add("ROOT.Unfrozing.TurnAroundFinish1");
        }
        
        //## statechart_method 
        public void Open3_add(AnimStates animStates) {
            animStates.add("ROOT.Open3");
        }
        
        //## statechart_method 
        public void Open2_add(AnimStates animStates) {
            animStates.add("ROOT.Open2");
        }
        
        //## statechart_method 
        public void Open1_add(AnimStates animStates) {
            animStates.add("ROOT.Open1");
        }
        
        //## statechart_method 
        public void Open_add(AnimStates animStates) {
            animStates.add("ROOT.Open");
        }
        
        //## statechart_method 
        public void Off_add(AnimStates animStates) {
            animStates.add("ROOT.Off");
        }
        
        //## statechart_method 
        public void NoElectricity4_add(AnimStates animStates) {
            animStates.add("ROOT.NoElectricity4");
        }
        
        //## statechart_method 
        public void NoElectricity3_add(AnimStates animStates) {
            animStates.add("ROOT.NoElectricity3");
        }
        
        //## statechart_method 
        public void NoElectricity2_add(AnimStates animStates) {
            animStates.add("ROOT.NoElectricity2");
        }
        
        //## statechart_method 
        public void NoElectricity1_add(AnimStates animStates) {
            animStates.add("ROOT.NoElectricity1");
        }
        
        //## statechart_method 
        public void Microwaving_add(AnimStates animStates) {
            animStates.add("ROOT.Microwaving");
            switch (Microwaving_subState) {
                case TurnAroundStart:
                {
                    TurnAroundStart_add(animStates);
                }
                break;
                case Microwaving_Microwaving:
                {
                    Microwaving_Microwaving_add(animStates);
                }
                break;
                case TurnAroundFinish:
                {
                    TurnAroundFinish_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void TurnAroundStart_add(AnimStates animStates) {
            animStates.add("ROOT.Microwaving.TurnAroundStart");
        }
        
        //## statechart_method 
        public void TurnAroundFinish_add(AnimStates animStates) {
            animStates.add("ROOT.Microwaving.TurnAroundFinish");
        }
        
        //## statechart_method 
        public void Microwaving_Microwaving_add(AnimStates animStates) {
            animStates.add("ROOT.Microwaving.Microwaving");
        }
        
        //## statechart_method 
        public void Grilling_add(AnimStates animStates) {
            animStates.add("ROOT.Grilling");
            switch (Grilling_subState) {
                case DownGrill:
                {
                    DownGrill_add(animStates);
                }
                break;
                case UpGrill:
                {
                    UpGrill_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void UpGrill_add(AnimStates animStates) {
            animStates.add("ROOT.Grilling.UpGrill");
        }
        
        //## statechart_method 
        public void DownGrill_add(AnimStates animStates) {
            animStates.add("ROOT.Grilling.DownGrill");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            Washing_subState = RiJNonState;
            Washing_lastState = RiJNonState;
            Unfrozing_subState = RiJNonState;
            Unfrozing_lastState = RiJNonState;
            Microwaving_subState = RiJNonState;
            Microwaving_lastState = RiJNonState;
            Grilling_subState = RiJNonState;
            Grilling_lastState = RiJNonState;
        }
        
        //## statechart_method 
        public void DownGrillExit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_DownGrill_id, this);
        }
        
        //## statechart_method 
        public void GrillingExit() {
        }
        
        //## statechart_method 
        public int Microwaving_MicrowavingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_Microwaving_Microwaving_id)
                {
                    animInstance().notifyTransitionStarted("18");
                    Microwaving_Microwaving_exit();
                    TurnAroundFinish_entDef();
                    animInstance().notifyTransitionEnded("18");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void NoElectricity1_enter() {
            animInstance().notifyStateEntered("ROOT.NoElectricity1");
            rootState_subState = NoElectricity1;
            rootState_active = NoElectricity1;
            NoElectricity1Enter();
        }
        
        //## statechart_method 
        public void NoElectricity3_exit() {
            NoElectricity3Exit();
            animInstance().notifyStateExited("ROOT.NoElectricity3");
        }
        
        //## statechart_method 
        public void Open_exit() {
            OpenExit();
            animInstance().notifyStateExited("ROOT.Open");
        }
        
        //## statechart_method 
        public void OpenExit() {
            //#[ state Open.(Exit) 
                             System.out.println("The door has been closed");
            //#]
        }
        
        //## statechart_method 
        public int Open2TakeevClose() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("30");
            Open2_exit();
            Unfrozing_enter();
            Unfrozing_entShallowHist();
            animInstance().notifyTransitionEnded("30");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Washing_exit() {
            Washing_lastState = Washing_subState;
            switch (Washing_subState) {
                case Washing_Washing:
                {
                    Washing_Washing_exit();
                    Washing_lastState = Washing_Washing;
                }
                break;
                case Rinsing:
                {
                    Rinsing_exit();
                    Washing_lastState = Rinsing;
                }
                break;
                case Drying:
                {
                    Drying_exit();
                    Washing_lastState = Drying;
                }
                break;
                default:
                    break;
            }
            Washing_subState = RiJNonState;
            WashingExit();
            animInstance().notifyStateExited("ROOT.Washing");
        }
        
        //## statechart_method 
        public void Washing_entShallowHist() {
            if(Washing_lastState != RiJNonState)
                {
                    Washing_subState = Washing_lastState;
                    switch (Washing_subState) {
                        case Washing_Washing:
                        {
                            Washing_Washing_enter();
                        }
                        break;
                        case Rinsing:
                        {
                            Rinsing_enter();
                        }
                        break;
                        case Drying:
                        {
                            Drying_enter();
                        }
                        break;
                        default:
                            break;
                    }
                }
        }
        
        //## statechart_method 
        public void NoElectricity2_exit() {
            NoElectricity2Exit();
            animInstance().notifyStateExited("ROOT.NoElectricity2");
        }
        
        //## statechart_method 
        public void NoElectricity2_enter() {
            animInstance().notifyStateEntered("ROOT.NoElectricity2");
            rootState_subState = NoElectricity2;
            rootState_active = NoElectricity2;
            NoElectricity2Enter();
        }
        
        //## statechart_method 
        public void NoElectricity3_enter() {
            animInstance().notifyStateEntered("ROOT.NoElectricity3");
            rootState_subState = NoElectricity3;
            rootState_active = NoElectricity3;
            NoElectricity3Enter();
        }
        
        //## statechart_method 
        public void Off_enter() {
            animInstance().notifyStateEntered("ROOT.Off");
            rootState_subState = Off;
            rootState_active = Off;
            OffEnter();
        }
        
        //## statechart_method 
        public int Open3_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evClose.evClose_microwave_telelogic_com_id))
                {
                    res = Open3TakeevClose();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Drying_exit() {
            DryingExit();
            animInstance().notifyStateExited("ROOT.Washing.Drying");
        }
        
        //## statechart_method 
        public void Washing_Washing_exit() {
            Washing_WashingExit();
            animInstance().notifyStateExited("ROOT.Washing.Washing");
        }
        
        //## statechart_method 
        public void Washing_entDef() {
            Washing_enter();
            
            animInstance().notifyTransitionStarted("11");
            Washing_Washing_entDef();
            animInstance().notifyTransitionEnded("11");
        }
        
        //## statechart_method 
        public void UpGrillEnter() {
            //#[ state Grilling.UpGrill.(Entry) 
                              System.out.println("Up Grill in use");
            //#]
            itsRiJThread.schedTimeout(UpGrillTime, Microwave_Timeout_UpGrill_id, this, "ROOT.Grilling.UpGrill");
        }
        
        //## statechart_method 
        public int Microwaving_Microwaving_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = Microwaving_MicrowavingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Microwaving_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int Microwaving_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evNoElectricity.evNoElectricity_microwave_telelogic_com_id))
                {
                    res = MicrowavingTakeevNoElectricity();
                }
            else if(event.isTypeOf(evOpen.evOpen_microwave_telelogic_com_id))
                {
                    res = MicrowavingTakeevOpen();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int MicrowavingTakeevNoElectricity() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("14");
            Microwaving_exit();
            NoElectricity1_entDef();
            animInstance().notifyTransitionEnded("14");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int MicrowavingTakeevOpen() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("13");
            Microwaving_exit();
            Open_entDef();
            animInstance().notifyTransitionEnded("13");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void NoElectricity1_exit() {
            NoElectricity1Exit();
            animInstance().notifyStateExited("ROOT.NoElectricity1");
        }
        
        //## statechart_method 
        public void NoElectricity2_entDef() {
            NoElectricity2_enter();
        }
        
        //## statechart_method 
        public void NoElectricity4_enter() {
            animInstance().notifyStateEntered("ROOT.NoElectricity4");
            rootState_subState = NoElectricity4;
            rootState_active = NoElectricity4;
            NoElectricity4Enter();
        }
        
        //## statechart_method 
        public void Open3_entDef() {
            Open3_enter();
        }
        
        //## statechart_method 
        public void TurnAroundFinish1_entDef() {
            TurnAroundFinish1_enter();
        }
        
        //## statechart_method 
        public int Unfrozing_Unfrozing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = Unfrozing_UnfrozingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Unfrozing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int UnfrozingTakeevNoElectricity() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("31");
            Unfrozing_exit();
            NoElectricity3_entDef();
            animInstance().notifyTransitionEnded("31");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RinsingEnter() {
            //#[ state Washing.Rinsing.(Entry) 
                                        System.out.println("Rinsing");
            //#]
            itsRiJThread.schedTimeout(RinsingTime, Microwave_Timeout_Rinsing_id, this, "ROOT.Washing.Rinsing");
        }
        
        //## statechart_method 
        public void TurnAroundFinishEnter() {
            //#[ state Microwaving.TurnAroundFinish.(Entry) 
            System.out.println("Finishing to turn around");
            //#]
            itsRiJThread.schedTimeout(RoundTimeFinish, Microwave_Timeout_TurnAroundFinish_id, this, "ROOT.Microwaving.TurnAroundFinish");
        }
        
        //## statechart_method 
        public void TurnAroundStartExit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_TurnAroundStart_id, this);
        }
        
        //## statechart_method 
        public void Open1Exit() {
            //#[ state Open1.(Exit) 
                                              System.out.println("The door has been closed");
            //#]
        }
        
        //## statechart_method 
        public int TurnAroundFinish1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = TurnAroundFinish1TakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Unfrozing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Unfrozing_Unfrozing_enter() {
            animInstance().notifyStateEntered("ROOT.Unfrozing.Unfrozing");
            Unfrozing_subState = Unfrozing_Unfrozing;
            rootState_active = Unfrozing_Unfrozing;
            Unfrozing_UnfrozingEnter();
        }
        
        //## statechart_method 
        public void Unfrozing_Unfrozing_entDef() {
            Unfrozing_Unfrozing_enter();
        }
        
        //## statechart_method 
        public int Unfrozing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evNoElectricity.evNoElectricity_microwave_telelogic_com_id))
                {
                    res = UnfrozingTakeevNoElectricity();
                }
            else if(event.isTypeOf(evOpen.evOpen_microwave_telelogic_com_id))
                {
                    res = UnfrozingTakeevOpen();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int UnfrozingTakeevOpen() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("29");
            Unfrozing_exit();
            Open2_entDef();
            animInstance().notifyTransitionEnded("29");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Microwaving_MicrowavingEnter() {
            //#[ state Microwaving.Microwaving.(Entry) 
                               System.out.println("Microwaving...");
            //#]
            itsRiJThread.schedTimeout(MicrowaveTime, Microwave_Timeout_Microwaving_Microwaving_id, this, "ROOT.Microwaving.Microwaving");
        }
        
        //## statechart_method 
        public int TurnAroundStartTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_TurnAroundStart_id)
                {
                    animInstance().notifyTransitionStarted("17");
                    TurnAroundStart_exit();
                    Microwaving_Microwaving_entDef();
                    animInstance().notifyTransitionEnded("17");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int NoElectricity1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evElectricity.evElectricity_microwave_telelogic_com_id))
                {
                    res = NoElectricity1TakeevElectricity();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Open2Exit() {
            //#[ state Open2.(Exit) 
                                                             System.out.println("The door has been closed");
            //#]
        }
        
        //## statechart_method 
        public int Open3TakeevClose() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("37");
            Open3_exit();
            Washing_enter();
            Washing_entShallowHist();
            animInstance().notifyTransitionEnded("37");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Open3Enter() {
            //#[ state Open3.(Entry) 
                             System.out.println("The door is open");
            //#]
        }
        
        //## statechart_method 
        public void TurnAroundStart1_enter() {
            animInstance().notifyStateEntered("ROOT.Unfrozing.TurnAroundStart1");
            Unfrozing_subState = TurnAroundStart1;
            rootState_active = TurnAroundStart1;
            TurnAroundStart1Enter();
        }
        
        //## statechart_method 
        public void TurnAroundStart1_entDef() {
            TurnAroundStart1_enter();
        }
        
        //## statechart_method 
        public int WashingTakeevNoElectricity() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("38");
            Washing_exit();
            NoElectricity4_entDef();
            animInstance().notifyTransitionEnded("38");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void UpGrill_exit() {
            UpGrillExit();
            animInstance().notifyStateExited("ROOT.Grilling.UpGrill");
        }
        
        //## statechart_method 
        public void Grilling_entShallowHist() {
            if(Grilling_lastState != RiJNonState)
                {
                    Grilling_subState = Grilling_lastState;
                    switch (Grilling_subState) {
                        case DownGrill:
                        {
                            DownGrill_enter();
                        }
                        break;
                        case UpGrill:
                        {
                            UpGrill_enter();
                        }
                        break;
                        default:
                            break;
                    }
                }
        }
        
        //## statechart_method 
        public int NoElectricity4_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evElectricity.evElectricity_microwave_telelogic_com_id))
                {
                    res = NoElectricity4TakeevElectricity();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Open2Enter() {
            //#[ state Open2.(Entry) 
                                  System.out.println("The door is open");
            //#]
        }
        
        //## statechart_method 
        public void Open3Exit() {
            //#[ state Open3.(Exit) 
                                                               System.out.println("The door has been closed");
            //#]
        }
        
        //## statechart_method 
        public int TurnAroundFinish1TakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_TurnAroundFinish1_id)
                {
                    animInstance().notifyTransitionStarted("28");
                    Unfrozing_exit();
                    Off_entDef();
                    animInstance().notifyTransitionEnded("28");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Unfrozing_entDef() {
            Unfrozing_enter();
            
            animInstance().notifyTransitionStarted("10");
            TurnAroundStart1_entDef();
            animInstance().notifyTransitionEnded("10");
        }
        
        //## statechart_method 
        public void Rinsing_exit() {
            RinsingExit();
            animInstance().notifyStateExited("ROOT.Washing.Rinsing");
        }
        
        //## statechart_method 
        public int DownGrill_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = DownGrillTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Grilling_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Grilling_enter() {
            animInstance().notifyStateEntered("ROOT.Grilling");
            rootState_subState = Grilling;
            GrillingEnter();
        }
        
        //## statechart_method 
        public void TurnAroundFinish_exit() {
            TurnAroundFinishExit();
            animInstance().notifyStateExited("ROOT.Microwaving.TurnAroundFinish");
        }
        
        //## statechart_method 
        public int TurnAroundStart_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = TurnAroundStartTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Microwaving_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int OffTakeevStartUnfrozing() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            Off_exit();
            //#[ transition 7 
            SetupUnfrozing();
            //#]
            Unfrozing_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Open1Enter() {
            //#[ state Open1.(Entry) 
                            System.out.println("The door is open");
            //#]
        }
        
        //## statechart_method 
        public void TurnAroundStart1Enter() {
            //#[ state Unfrozing.TurnAroundStart1.(Entry) 
                                  System.out.println("Starting to turn around");
            //#]
            itsRiJThread.schedTimeout(RoundTimeStart, Microwave_Timeout_TurnAroundStart1_id, this, "ROOT.Unfrozing.TurnAroundStart1");
        }
        
        //## statechart_method 
        public int Unfrozing_UnfrozingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_Unfrozing_Unfrozing_id)
                {
                    animInstance().notifyTransitionStarted("27");
                    Unfrozing_Unfrozing_exit();
                    TurnAroundFinish1_entDef();
                    animInstance().notifyTransitionEnded("27");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Drying_enter() {
            animInstance().notifyStateEntered("ROOT.Washing.Drying");
            Washing_subState = Drying;
            rootState_active = Drying;
            DryingEnter();
        }
        
        //## statechart_method 
        public void Washing_enter() {
            animInstance().notifyStateEntered("ROOT.Washing");
            rootState_subState = Washing;
            WashingEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int GrillingTakeevOpen() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("22");
            Grilling_exit();
            Open1_entDef();
            animInstance().notifyTransitionEnded("22");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Microwaving_Microwaving_exit() {
            Microwaving_MicrowavingExit();
            animInstance().notifyStateExited("ROOT.Microwaving.Microwaving");
        }
        
        //## statechart_method 
        public void Microwaving_Microwaving_enter() {
            animInstance().notifyStateEntered("ROOT.Microwaving.Microwaving");
            Microwaving_subState = Microwaving_Microwaving;
            rootState_active = Microwaving_Microwaving;
            Microwaving_MicrowavingEnter();
        }
        
        //## statechart_method 
        public void TurnAroundStart_entDef() {
            TurnAroundStart_enter();
        }
        
        //## statechart_method 
        public void Microwaving_entDef() {
            Microwaving_enter();
            
            animInstance().notifyTransitionStarted("12");
            TurnAroundStart_entDef();
            animInstance().notifyTransitionEnded("12");
        }
        
        //## statechart_method 
        public int NoElectricity1TakeevElectricity() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("16");
            NoElectricity1_exit();
            Microwaving_enter();
            Microwaving_entShallowHist();
            animInstance().notifyTransitionEnded("16");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Open1_enter() {
            animInstance().notifyStateEntered("ROOT.Open1");
            rootState_subState = Open1;
            rootState_active = Open1;
            Open1Enter();
        }
        
        //## statechart_method 
        public void Open1_entDef() {
            Open1_enter();
        }
        
        //## statechart_method 
        public int Open2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evClose.evClose_microwave_telelogic_com_id))
                {
                    res = Open2TakeevClose();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Open3_exit() {
            Open3Exit();
            animInstance().notifyStateExited("ROOT.Open3");
        }
        
        //## statechart_method 
        public void UnfrozingExit() {
        }
        
        //## statechart_method 
        public void UnfrozingEnter() {
        }
        
        //## statechart_method 
        public void RinsingExit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_Rinsing_id, this);
        }
        
        //## statechart_method 
        public int Washing_WashingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_Washing_Washing_id)
                {
                    animInstance().notifyTransitionStarted("33");
                    Washing_Washing_exit();
                    Rinsing_entDef();
                    animInstance().notifyTransitionEnded("33");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Washing_Washing_enter() {
            animInstance().notifyStateEntered("ROOT.Washing.Washing");
            Washing_subState = Washing_Washing;
            rootState_active = Washing_Washing;
            Washing_WashingEnter();
        }
        
        //## statechart_method 
        public void UpGrillExit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_UpGrill_id, this);
        }
        
        //## statechart_method 
        public void UpGrill_entDef() {
            UpGrill_enter();
        }
        
        //## statechart_method 
        public int Grilling_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evNoElectricity.evNoElectricity_microwave_telelogic_com_id))
                {
                    res = GrillingTakeevNoElectricity();
                }
            else if(event.isTypeOf(evOpen.evOpen_microwave_telelogic_com_id))
                {
                    res = GrillingTakeevOpen();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int TurnAroundFinishTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_TurnAroundFinish_id)
                {
                    animInstance().notifyTransitionStarted("19");
                    Microwaving_exit();
                    Off_entDef();
                    animInstance().notifyTransitionEnded("19");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void NoElectricity3_entDef() {
            NoElectricity3_enter();
        }
        
        //## statechart_method 
        public void Open_enter() {
            animInstance().notifyStateEntered("ROOT.Open");
            rootState_subState = Open;
            rootState_active = Open;
            OpenEnter();
        }
        
        //## statechart_method 
        public void Open2_exit() {
            Open2Exit();
            animInstance().notifyStateExited("ROOT.Open2");
        }
        
        //## statechart_method 
        public void Open2_enter() {
            animInstance().notifyStateEntered("ROOT.Open2");
            rootState_subState = Open2;
            rootState_active = Open2;
            Open2Enter();
        }
        
        //## statechart_method 
        public int TurnAroundStart1TakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_TurnAroundStart1_id)
                {
                    animInstance().notifyTransitionStarted("26");
                    TurnAroundStart1_exit();
                    Unfrozing_Unfrozing_entDef();
                    animInstance().notifyTransitionEnded("26");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int Rinsing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = RinsingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Washing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int WashingTakeevStartWashing() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            Washing_exit();
            //#[ transition 8 
            SetupWashing();
            //#]
            Off_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
        public int TurnAroundFinish_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = TurnAroundFinishTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Microwaving_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void TurnAroundStart_enter() {
            animInstance().notifyStateEntered("ROOT.Microwaving.TurnAroundStart");
            Microwaving_subState = TurnAroundStart;
            rootState_active = TurnAroundStart;
            TurnAroundStartEnter();
        }
        
        //## statechart_method 
        public void MicrowavingEnter() {
        }
        
        //## statechart_method 
        public void Off_entDef() {
            Off_enter();
        }
        
        //## statechart_method 
        public void Open1_exit() {
            Open1Exit();
            animInstance().notifyStateExited("ROOT.Open1");
        }
        
        //## statechart_method 
        public void Open3_enter() {
            animInstance().notifyStateEntered("ROOT.Open3");
            rootState_subState = Open3;
            rootState_active = Open3;
            Open3Enter();
        }
        
        //## statechart_method 
        public void TurnAroundFinish1Exit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_TurnAroundFinish1_id, this);
        }
        
        //## statechart_method 
        public void TurnAroundFinish1Enter() {
            //#[ state Unfrozing.TurnAroundFinish1.(Entry) 
                                      System.out.println("Finishing to turn around");
            //#]
            itsRiJThread.schedTimeout(RoundTimeFinish, Microwave_Timeout_TurnAroundFinish1_id, this, "ROOT.Unfrozing.TurnAroundFinish1");
        }
        
        //## statechart_method 
        public int TurnAroundStart1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = TurnAroundStart1TakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Unfrozing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void TurnAroundStart1_exit() {
            TurnAroundStart1Exit();
            animInstance().notifyStateExited("ROOT.Unfrozing.TurnAroundStart1");
        }
        
        //## statechart_method 
        public void Unfrozing_enter() {
            animInstance().notifyStateEntered("ROOT.Unfrozing");
            rootState_subState = Unfrozing;
            UnfrozingEnter();
        }
        
        //## statechart_method 
        public void DryingExit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_Drying_id, this);
        }
        
        //## statechart_method 
        public int RinsingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_Rinsing_id)
                {
                    animInstance().notifyTransitionStarted("34");
                    Rinsing_exit();
                    Drying_entDef();
                    animInstance().notifyTransitionEnded("34");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Rinsing_entDef() {
            Rinsing_enter();
        }
        
        //## statechart_method 
        public void Washing_Washing_entDef() {
            Washing_Washing_enter();
        }
        
        //## statechart_method 
        public void WashingExit() {
        }
        
        //## statechart_method 
        public void DownGrillEnter() {
            //#[ state Grilling.DownGrill.(Entry) 
                      System.out.println("Down Grill in use");
            //#]
            itsRiJThread.schedTimeout(DownGrillTime, Microwave_Timeout_DownGrill_id, this, "ROOT.Grilling.DownGrill");
        }
        
        //## statechart_method 
        public void Grilling_entDef() {
            Grilling_enter();
            
            animInstance().notifyTransitionStarted("9");
            DownGrill_entDef();
            animInstance().notifyTransitionEnded("9");
        }
        
        //## statechart_method 
        public void Microwaving_MicrowavingExit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_Microwaving_Microwaving_id, this);
        }
        
        //## statechart_method 
        public void TurnAroundStartEnter() {
            //#[ state Microwaving.TurnAroundStart.(Entry) 
            System.out.println("Starting to turn around");
            //#]
            itsRiJThread.schedTimeout(RoundTimeStart, Microwave_Timeout_TurnAroundStart_id, this, "ROOT.Microwaving.TurnAroundStart");
        }
        
        //## statechart_method 
        public void Microwaving_enter() {
            animInstance().notifyStateEntered("ROOT.Microwaving");
            rootState_subState = Microwaving;
            MicrowavingEnter();
        }
        
        //## statechart_method 
        public int NoElectricity2TakeevElectricity() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("25");
            NoElectricity2_exit();
            Grilling_enter();
            Grilling_entShallowHist();
            animInstance().notifyTransitionEnded("25");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int NoElectricity3_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evElectricity.evElectricity_microwave_telelogic_com_id))
                {
                    res = NoElectricity3TakeevElectricity();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void OffEnter() {
        }
        
        //## statechart_method 
        public void TurnAroundFinish1_enter() {
            animInstance().notifyStateEntered("ROOT.Unfrozing.TurnAroundFinish1");
            Unfrozing_subState = TurnAroundFinish1;
            rootState_active = TurnAroundFinish1;
            TurnAroundFinish1Enter();
        }
        
        //## statechart_method 
        public void Unfrozing_exit() {
            Unfrozing_lastState = Unfrozing_subState;
            switch (Unfrozing_subState) {
                case TurnAroundStart1:
                {
                    TurnAroundStart1_exit();
                    Unfrozing_lastState = TurnAroundStart1;
                }
                break;
                case Unfrozing_Unfrozing:
                {
                    Unfrozing_Unfrozing_exit();
                    Unfrozing_lastState = Unfrozing_Unfrozing;
                }
                break;
                case TurnAroundFinish1:
                {
                    TurnAroundFinish1_exit();
                    Unfrozing_lastState = TurnAroundFinish1;
                }
                break;
                default:
                    break;
            }
            Unfrozing_subState = RiJNonState;
            UnfrozingExit();
            animInstance().notifyStateExited("ROOT.Unfrozing");
        }
        
        //## statechart_method 
        public void Drying_entDef() {
            Drying_enter();
        }
        
        //## statechart_method 
        public int DownGrillTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_DownGrill_id)
                {
                    animInstance().notifyTransitionStarted("20");
                    DownGrill_exit();
                    UpGrill_entDef();
                    animInstance().notifyTransitionEnded("20");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int UpGrill_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = UpGrillTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Grilling_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void UpGrill_enter() {
            animInstance().notifyStateEntered("ROOT.Grilling.UpGrill");
            Grilling_subState = UpGrill;
            rootState_active = UpGrill;
            UpGrillEnter();
        }
        
        //## statechart_method 
        public void Microwaving_Microwaving_entDef() {
            Microwaving_Microwaving_enter();
        }
        
        //## statechart_method 
        public void Open_entDef() {
            Open_enter();
        }
        
        //## statechart_method 
        public void Unfrozing_UnfrozingExit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_Unfrozing_Unfrozing_id, this);
        }
        
        //## statechart_method 
        public void Unfrozing_UnfrozingEnter() {
            //#[ state Unfrozing.Unfrozing.(Entry) 
                           System.out.println("Unfrozing....");
            //#]
            itsRiJThread.schedTimeout(UnfrozingTime, Microwave_Timeout_Unfrozing_Unfrozing_id, this, "ROOT.Unfrozing.Unfrozing");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Off_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void TurnAroundFinish_enter() {
            animInstance().notifyStateEntered("ROOT.Microwaving.TurnAroundFinish");
            Microwaving_subState = TurnAroundFinish;
            rootState_active = TurnAroundFinish;
            TurnAroundFinishEnter();
        }
        
        //## statechart_method 
        public void Microwaving_exit() {
            Microwaving_lastState = Microwaving_subState;
            switch (Microwaving_subState) {
                case TurnAroundStart:
                {
                    TurnAroundStart_exit();
                    Microwaving_lastState = TurnAroundStart;
                }
                break;
                case Microwaving_Microwaving:
                {
                    Microwaving_Microwaving_exit();
                    Microwaving_lastState = Microwaving_Microwaving;
                }
                break;
                case TurnAroundFinish:
                {
                    TurnAroundFinish_exit();
                    Microwaving_lastState = TurnAroundFinish;
                }
                break;
                default:
                    break;
            }
            Microwaving_subState = RiJNonState;
            MicrowavingExit();
            animInstance().notifyStateExited("ROOT.Microwaving");
        }
        
        //## statechart_method 
        public void NoElectricity1Exit() {
            //#[ state NoElectricity1.(Exit) 
                  System.out.println("Power has been regained");
            //#]
        }
        
        //## statechart_method 
        public int Open_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evClose.evClose_microwave_telelogic_com_id))
                {
                    res = OpenTakeevClose();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Open1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evClose.evClose_microwave_telelogic_com_id))
                {
                    res = Open1TakeevClose();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Open1TakeevClose() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("23");
            Open1_exit();
            Grilling_enter();
            Grilling_entShallowHist();
            animInstance().notifyTransitionEnded("23");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void TurnAroundFinish1_exit() {
            TurnAroundFinish1Exit();
            animInstance().notifyStateExited("ROOT.Unfrozing.TurnAroundFinish1");
        }
        
        //## statechart_method 
        public void DownGrill_exit() {
            DownGrillExit();
            animInstance().notifyStateExited("ROOT.Grilling.DownGrill");
        }
        
        //## statechart_method 
        public void DownGrill_entDef() {
            DownGrill_enter();
        }
        
        //## statechart_method 
        public void GrillingEnter() {
        }
        
        //## statechart_method 
        public void TurnAroundStart_exit() {
            TurnAroundStartExit();
            animInstance().notifyStateExited("ROOT.Microwaving.TurnAroundStart");
        }
        
        //## statechart_method 
        public void NoElectricity1_entDef() {
            NoElectricity1_enter();
        }
        
        //## statechart_method 
        public void NoElectricity2Exit() {
            //#[ state NoElectricity2.(Exit) 
                                     System.out.println("Power has been regained");
            //#]
        }
        
        //## statechart_method 
        public int NoElectricity3TakeevElectricity() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("32");
            NoElectricity3_exit();
            Unfrozing_enter();
            Unfrozing_entShallowHist();
            animInstance().notifyTransitionEnded("32");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void NoElectricity4Enter() {
            //#[ state NoElectricity4.(Entry) 
                                         System.out.println("No power supply");
            //#]
        }
        
        //## statechart_method 
        public void Off_exit() {
            OffExit();
            animInstance().notifyStateExited("ROOT.Off");
        }
        
        //## statechart_method 
        public void Open2_entDef() {
            Open2_enter();
        }
        
        //## statechart_method 
        public void Unfrozing_entShallowHist() {
            if(Unfrozing_lastState != RiJNonState)
                {
                    Unfrozing_subState = Unfrozing_lastState;
                    switch (Unfrozing_subState) {
                        case TurnAroundStart1:
                        {
                            TurnAroundStart1_enter();
                        }
                        break;
                        case Unfrozing_Unfrozing:
                        {
                            Unfrozing_Unfrozing_enter();
                        }
                        break;
                        case TurnAroundFinish1:
                        {
                            TurnAroundFinish1_enter();
                        }
                        break;
                        default:
                            break;
                    }
                }
        }
        
        //## statechart_method 
        public int Washing_Washing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = Washing_WashingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Washing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int UpGrillTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_UpGrill_id)
                {
                    animInstance().notifyTransitionStarted("21");
                    Grilling_exit();
                    Off_entDef();
                    animInstance().notifyTransitionEnded("21");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void TurnAroundFinish_entDef() {
            TurnAroundFinish_enter();
        }
        
        //## statechart_method 
        public void MicrowavingExit() {
        }
        
        //## statechart_method 
        public void Microwaving_entShallowHist() {
            if(Microwaving_lastState != RiJNonState)
                {
                    Microwaving_subState = Microwaving_lastState;
                    switch (Microwaving_subState) {
                        case TurnAroundStart:
                        {
                            TurnAroundStart_enter();
                        }
                        break;
                        case Microwaving_Microwaving:
                        {
                            Microwaving_Microwaving_enter();
                        }
                        break;
                        case TurnAroundFinish:
                        {
                            TurnAroundFinish_enter();
                        }
                        break;
                        default:
                            break;
                    }
                }
        }
        
        //## statechart_method 
        public void NoElectricity3Exit() {
            //#[ state NoElectricity3.(Exit) 
                                        System.out.println("Power has been regained");
            //#]
        }
        
        //## statechart_method 
        public void NoElectricity3Enter() {
            //#[ state NoElectricity3.(Entry) 
                                 System.out.println("No power supply");
            //#]
        }
        
        //## statechart_method 
        public int OffTakeevStartGrill() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            Off_exit();
            //#[ transition 6 
            SetupGrill();
            //#]
            Grilling_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int OpenTakeevClose() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("15");
            Open_exit();
            Microwaving_enter();
            Microwaving_entShallowHist();
            animInstance().notifyTransitionEnded("15");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void OpenEnter() {
            //#[ state Open.(Entry) 
            System.out.println("The door is open");
            //#]
        }
        
        //## statechart_method 
        public void Unfrozing_Unfrozing_exit() {
            Unfrozing_UnfrozingExit();
            animInstance().notifyStateExited("ROOT.Unfrozing.Unfrozing");
        }
        
        //## statechart_method 
        public void Rinsing_enter() {
            animInstance().notifyStateEntered("ROOT.Washing.Rinsing");
            Washing_subState = Rinsing;
            rootState_active = Rinsing;
            RinsingEnter();
        }
        
        //## statechart_method 
        public void WashingEnter() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void NoElectricity2Enter() {
            //#[ state NoElectricity2.(Entry) 
                               System.out.println("No power supply");
            //#]
        }
        
        //## statechart_method 
        public void NoElectricity4Exit() {
            //#[ state NoElectricity4.(Exit) 
                                        System.out.println("Power has been regained");
            //#]
        }
        
        //## statechart_method 
        public void NoElectricity4_entDef() {
            NoElectricity4_enter();
        }
        
        //## statechart_method 
        public int OffTakeevStartNormal() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            Off_exit();
            //#[ transition 5 
            SetupNormal() ;
            //#]
            Microwaving_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void OffExit() {
        }
        
        //## statechart_method 
        public void DryingEnter() {
            //#[ state Washing.Drying.(Entry) 
                            System.out.println("Drying");
            //#]
            itsRiJThread.schedTimeout(DryingTime, Microwave_Timeout_Drying_id, this, "ROOT.Washing.Drying");
        }
        
        //## statechart_method 
        public void Washing_WashingEnter() {
            //#[ state Washing.Washing.(Entry) 
                                     System.out.println("Washing");
            //#]
            itsRiJThread.schedTimeout(WashingTime, Microwave_Timeout_Washing_Washing_id, this, "ROOT.Washing.Washing");
        }
        
        //## statechart_method 
        public int Washing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evNoElectricity.evNoElectricity_microwave_telelogic_com_id))
                {
                    res = WashingTakeevNoElectricity();
                }
            else if(event.isTypeOf(evOpen.evOpen_microwave_telelogic_com_id))
                {
                    res = WashingTakeevOpen();
                }
            else if(event.isTypeOf(evStartWashing.evStartWashing_microwave_telelogic_com_id))
                {
                    res = WashingTakeevStartWashing();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int WashingTakeevOpen() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("36");
            Washing_exit();
            Open3_entDef();
            animInstance().notifyTransitionEnded("36");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void DownGrill_enter() {
            animInstance().notifyStateEntered("ROOT.Grilling.DownGrill");
            Grilling_subState = DownGrill;
            rootState_active = DownGrill;
            DownGrillEnter();
        }
        
        //## statechart_method 
        public int GrillingTakeevNoElectricity() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("24");
            Grilling_exit();
            NoElectricity2_entDef();
            animInstance().notifyTransitionEnded("24");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Grilling_exit() {
            Grilling_lastState = Grilling_subState;
            switch (Grilling_subState) {
                case DownGrill:
                {
                    DownGrill_exit();
                    Grilling_lastState = DownGrill;
                }
                break;
                case UpGrill:
                {
                    UpGrill_exit();
                    Grilling_lastState = UpGrill;
                }
                break;
                default:
                    break;
            }
            Grilling_subState = RiJNonState;
            GrillingExit();
            animInstance().notifyStateExited("ROOT.Grilling");
        }
        
        //## statechart_method 
        public void TurnAroundFinishExit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_TurnAroundFinish_id, this);
        }
        
        //## statechart_method 
        public void NoElectricity1Enter() {
            //#[ state NoElectricity1.(Entry) 
                                    System.out.println("No power supply");
            //#]
        }
        
        //## statechart_method 
        public int NoElectricity2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evElectricity.evElectricity_microwave_telelogic_com_id))
                {
                    res = NoElectricity2TakeevElectricity();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int NoElectricity4TakeevElectricity() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("39");
            NoElectricity4_exit();
            Washing_enter();
            Washing_entShallowHist();
            animInstance().notifyTransitionEnded("39");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void NoElectricity4_exit() {
            NoElectricity4Exit();
            animInstance().notifyStateExited("ROOT.NoElectricity4");
        }
        
        //## statechart_method 
        public int Off_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evStartUnfrozing.evStartUnfrozing_microwave_telelogic_com_id))
                {
                    res = OffTakeevStartUnfrozing();
                }
            else if(event.isTypeOf(evStartGrill.evStartGrill_microwave_telelogic_com_id))
                {
                    res = OffTakeevStartGrill();
                }
            else if(event.isTypeOf(evStartNormal.evStartNormal_microwave_telelogic_com_id))
                {
                    res = OffTakeevStartNormal();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void TurnAroundStart1Exit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_TurnAroundStart1_id, this);
        }
        
        //## statechart_method 
        public int Drying_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = DryingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Washing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int DryingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Microwave_Timeout_Drying_id)
                {
                    animInstance().notifyTransitionStarted("35");
                    Washing_exit();
                    Off_entDef();
                    animInstance().notifyTransitionEnded("35");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Washing_WashingExit() {
            itsRiJThread.unschedTimeout(Microwave_Timeout_Washing_Washing_id, this);
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
            return Microwave.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassMicrowave; 
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
        
        msg.add("DownGrillTime", DownGrillTime);
        msg.add("DryingTime", DryingTime);
        msg.add("MicrowaveTime", MicrowaveTime);
        msg.add("RinsingTime", RinsingTime);
        msg.add("RoundTimeFinish", RoundTimeFinish);
        msg.add("RoundTimeStart", RoundTimeStart);
        msg.add("UnfrozingTime", UnfrozingTime);
        msg.add("UpGrillTime", UpGrillTime);
        msg.add("WashingTime", WashingTime);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsDisplay", false, true, itsDisplay);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Microwave.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Microwave.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Microwave.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/microwave/Microwave.java
*********************************************************************/


package graph;

import java.util.ArrayList;
import java.util.List;

public class Automaton{

    private State initialState;
    private List<State> states = new ArrayList<>();
    private List<TransitionRelation> transitionRelations = new ArrayList<>();
    
    public void setInitialState(State s) {
        initialState = s;
    }

    public void addState(State s){
        states.add(s);
    }

    synchronized public void addTransitionRelation(TransitionRelation t) {
        transitionRelations.add(t);   
    }

    public State getInitialState() {
        return initialState;
    }
    
    public State getState(String id){
        for(State s : states){
            if(id.equals(s.getId())){
                return s;
            }
        }
        return null;
    }
    
    public List<State> getStates() {
        return states;
    }

    public TransitionRelation getTransitionRelation(String from, String to){
        for(TransitionRelation t : transitionRelations){
            if (from.equals(t.getFrom().getId()) &&
                    to.equals(t.getTo().getId())){
                return t;
            }
        }
        return null;
    }
    
    public List<TransitionRelation> getTransitionRelations() {
        return transitionRelations;
    }

    public boolean isNewState(String id) {
        for (State s : states) {
            if (id.equals(s.getId())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isNewState(State state) {
        for (State s : states) {
            if (state.getId().equals(s.getId())) {
                return false;
            }
        }
        return true;
    }

    public boolean isInitialState(State state) {
        return state.getId().equals(initialState.getId());
    }
    
    public boolean isNewTransition(TransitionRelation transition) {
        for (TransitionRelation t : transitionRelations) {
            if (transition.getFrom().getId().equals(t.getFrom().getId()) &&
                    transition.getTo().getId().equals(t.getTo().getId())){
                return false;
            }
        }
        return true;
    }
}

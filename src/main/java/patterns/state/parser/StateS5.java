package patterns.state.parser;

/**
 * Created by Geryones on 09/10/2018.
 */
public class StateS5 extends AbstractState implements  StateInterface {
    public StateS5(AbstractState state){
        super(state);
    }
    @Override public StateInterface readChar(Character character) {
        if(isDigit(character)){
            exp = 10*exp + getNumericValue(character);
            return new StateS6(this);
        }
        throw new IllegalArgumentException();

    }
}

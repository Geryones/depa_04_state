package patterns.state.parser;


/**
 * Created by Geryones on 09/10/2018.
 */
public class StateS0 extends AbstractState implements StateInterface{
    public StateS0(){
        super();
    }

    @Override public AbstractState readChar(Character character) {
        if (isDigit(character)) {
            m = getNumericValue(character);
            return new StateS1(this);
        } else if(character == '.'){
            return new StateS2(this);
        }
        throw new IllegalArgumentException();
    }
}

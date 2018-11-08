package patterns.state.parser;

/**
 * Created by Geryones on 09/10/2018.
 */
public class StateS4 extends AbstractState implements  StateInterface{
    public StateS4(AbstractState state){
        super(state);
    }

    @Override public StateInterface readChar(Character character) {
        if (isDigit(character)){
            exp = 10*exp + getNumericValue(character);
            return  new StateS6(this);
        }else if (character == '+'){
            return  new StateS5(this);
        }else if (character == '-'){
            exp_sign = -1;
            return new StateS5(this);
        }
        throw new IllegalArgumentException();
    }
}

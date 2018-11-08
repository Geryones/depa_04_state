package patterns.state.parser;

/**
 * Created by Geryones on 09/10/2018.
 */
public class StateS1 extends AbstractState implements StateInterface{
    public StateS1(AbstractState state){
        super(state);
    }

    @Override public StateInterface readChar(Character character) {
        if (isDigit(character)){
            m = 10 * m + getNumericValue(character);
            return this;
        }else if(character == 'e' || character == 'E'){
            return new StateS4(this);
        }else if(character == '.'){
            return new StateS3(this);
        }
        throw new IllegalArgumentException();
    }
}

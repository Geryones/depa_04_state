package patterns.state.parser;

/**
 * Created by Geryones on 09/10/2018.
 */
public class StateS2 extends AbstractState implements StateInterface {

    public StateS2(AbstractState state){
        super(state);
    }
    @Override public StateInterface readChar(Character character) {
        if (isDigit(character)){
            m = m + getNumericValue(character) / quo;
            quo = quo*10;
            return new StateS3(this);
        }
        throw new IllegalArgumentException();
    }
}

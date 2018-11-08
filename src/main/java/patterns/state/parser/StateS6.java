package patterns.state.parser;

/**
 * Created by Geryones on 09/10/2018.
 */
public class StateS6 extends AbstractState implements StateInterface {
    public StateS6(AbstractState state){
        super(state);
    }

    @Override public double finish() {

        return m * Math.pow(10, exp_sign * exp);
    }

    @Override public StateInterface readChar(Character character) {
       if(isDigit(character)){
           exp = 10*exp + getNumericValue(character);
           return this;
       }
       throw new IllegalArgumentException();
    }
}

package patterns.state.parser;

/**
 * Created by Geryones on 09/10/2018.
 */
public class StateS3 extends AbstractState implements StateInterface {

    public StateS3(AbstractState state){
        super(state);
    }

    @Override public StateInterface readChar(Character character) {
       if (isDigit(character)){
           m = m + getNumericValue(character)/quo;
           quo = quo*10;
           return this;
       }else if (character == 'e' || character == 'E'){
           return new StateS4(this);
       }
       throw new IllegalArgumentException();
    }

    @Override public double finish() {
        return m * Math.pow(10, exp_sign * exp);
    }
}

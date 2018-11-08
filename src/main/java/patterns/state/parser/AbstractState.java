package patterns.state.parser;

/**
 * Created by Geryones on 09/10/2018.
 */
public abstract class AbstractState implements StateInterface {
    protected double m = 0, quo = 10;
    protected int exp = 0, exp_sign = 1;
    protected int pos = 0;

    public AbstractState(AbstractState state) {
        this.m = state.m;
        this.quo = state.quo;
        this.exp = state.exp;
        this.exp_sign = state.exp_sign;
        this.pos = state.pos;
    }

    public AbstractState(){}

    @Override public double finish() {
        throw new IllegalStateException();
    }

    protected boolean isDigit(Character character){
        return Character.isDigit(character);
    }

    protected int getNumericValue(Character character){
        return Character.getNumericValue(character);
    }

}

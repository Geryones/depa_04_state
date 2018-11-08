package patterns.state.parser;

/**
 * Created by Geryones on 09/10/2018.
 */
public interface StateInterface {
    StateInterface readChar(Character character);
    double finish();
}

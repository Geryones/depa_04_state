package patterns.state.parser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Geryones on 09/10/2018.
 */
public class StateFloatConverter {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        while (s != null && s.length() > 0) {
            try {
                double d = parseFloat(s);
                System.out.println(d);
            } catch (IllegalArgumentException e) {
                System.out.println("Illegal Format");
            }
            s = r.readLine();
        }
    }

    private static double parseFloat(String s) {
        StateInterface state = new StateS0();
        int pos = 0;
        char c;

        while(pos < s.length()){
            c = s.charAt(pos);
            state= state.readChar(c);
            pos++;


        }
        return state.finish();

    }
}

import org.renjin.script.RenjinScriptEngineFactory;
import org.renjin.sexp.IntArrayVector;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Test{

    public static void main(String[] args) throws ScriptException {
        // create a script engine manager:
        RenjinScriptEngineFactory factory = new RenjinScriptEngineFactory();
        // create a Renjin engine:
        ScriptEngine engine = factory.getScriptEngine();


        engine.put("x", 10);
        engine.put("y", 20);


        Object eval = engine.eval("x+y");
        System.out.print(((IntArrayVector)eval).toIntArrayUnsafe()[0]);
    }


}
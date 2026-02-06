package o;

import java.util.Objects;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/* loaded from: classes4.dex */
public final class SY1 extends AbstractC9882u3 {
    public static final SY1 c = new SY1();

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(AbstractC9882u3.b, 2);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            try {
                ScriptEngine engineByName = new ScriptEngineManager().getEngineByName(str2);
                if (engineByName != null) {
                    return Objects.toString(engineByName.eval(str3), null);
                }
                throw new IllegalArgumentException("No script engine named " + str2);
            } catch (Exception e) {
                throw C6036eM0.b(e, "Error in script engine [%s] evaluating script [%s].", str2, str3);
            }
        }
        throw C6036eM0.a("Bad script key format [%s]; expected format is EngineName:Script.", str);
    }
}

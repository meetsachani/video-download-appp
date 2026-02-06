package o;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* loaded from: classes.dex */
public class RY1 implements QY1 {
    public final ScriptHandlerBoundaryInterface a;

    public RY1(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.a = scriptHandlerBoundaryInterface;
    }

    public static RY1 a(InvocationHandler invocationHandler) {
        return new RY1((ScriptHandlerBoundaryInterface) C7128ip.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // o.QY1
    public void remove() {
        this.a.remove();
    }
}

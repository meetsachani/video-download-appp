package o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.mY0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8052mY0<R> implements InterfaceC6976iB0<R>, Serializable {
    private final int arity;

    public AbstractC8052mY0(int i) {
        this.arity = i;
    }

    @Override // o.InterfaceC6976iB0
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String x = C6551gQ1.x(this);
        C6562gT0.o(x, "renderLambdaToString(...)");
        return x;
    }
}

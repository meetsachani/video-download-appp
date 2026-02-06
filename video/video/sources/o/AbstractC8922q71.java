package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.q71  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8922q71 extends AbstractC7762lQ {
    @Override // o.AbstractC7762lQ
    @NotNull
    public AbstractC7762lQ W(int i, @Nullable String str) {
        QZ0.a(i);
        return QZ0.b(this, str);
    }

    @NotNull
    public abstract AbstractC8922q71 b0();

    @InterfaceC10472wS0
    @Nullable
    public final String g0() {
        AbstractC8922q71 abstractC8922q71;
        AbstractC8922q71 e = C8909q40.e();
        if (this == e) {
            return "Dispatchers.Main";
        }
        try {
            abstractC8922q71 = e.b0();
        } catch (UnsupportedOperationException unused) {
            abstractC8922q71 = null;
        }
        if (this != abstractC8922q71) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public String toString() {
        String g0 = g0();
        if (g0 == null) {
            return NV.a(this) + C11304zt1.a + NV.b(this);
        }
        return g0;
    }
}

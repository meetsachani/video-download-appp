package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class OA2 extends AbstractC7762lQ {
    @NotNull
    public static final OA2 Z = new OA2();

    @Override // o.AbstractC7762lQ
    public void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        C9871u00.d1.j0(runnable, true, false);
    }

    @Override // o.AbstractC7762lQ
    @InterfaceC10472wS0
    public void R(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        C9871u00.d1.j0(runnable, true, true);
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public AbstractC7762lQ W(int i, @Nullable String str) {
        QZ0.a(i);
        if (i >= C4528Vl2.d) {
            return QZ0.b(this, str);
        }
        return super.W(i, str);
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}

package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.u00  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9871u00 extends C7065iY1 {
    @NotNull
    public static final C9871u00 d1 = new C9871u00();

    public C9871u00() {
        super(C4528Vl2.c, C4528Vl2.d, C4528Vl2.e, C4528Vl2.a);
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public AbstractC7762lQ W(int i, @Nullable String str) {
        QZ0.a(i);
        if (i >= C4528Vl2.c) {
            return QZ0.b(this, str);
        }
        return super.W(i, str);
    }

    @Override // o.C7065iY1, o.AbstractC7335jg0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final void n0() {
        super.close();
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }
}

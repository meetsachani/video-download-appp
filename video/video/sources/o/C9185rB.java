package o;

import java.io.Reader;
import java.util.function.IntPredicate;

/* renamed from: o.rB */
/* loaded from: classes4.dex */
public class C9185rB extends AbstractC7172j0 {
    public C9185rB(Reader reader, final int i) {
        super(reader, new IntPredicate() { // from class: o.qB
            @Override // java.util.function.IntPredicate
            public final boolean test(int i2) {
                return C9185rB.f(i, i2);
            }
        });
    }

    public static /* synthetic */ boolean f(int i, int i2) {
        if (i2 == i) {
            return true;
        }
        return false;
    }

    public C9185rB(Reader reader, IntPredicate intPredicate) {
        super(reader, intPredicate);
    }
}

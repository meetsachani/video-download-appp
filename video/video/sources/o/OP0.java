package o;

import androidx.lifecycle.u;

/* loaded from: classes.dex */
public final class OP0 implements u.b {
    public final EH2<?>[] b;

    public OP0(EH2<?>... eh2Arr) {
        C6562gT0.p(eh2Arr, "initializers");
        this.b = eh2Arr;
    }

    @Override // androidx.lifecycle.u.b
    public <T extends CH2> T a(Class<T> cls, AbstractC6553gR abstractC6553gR) {
        EH2<?>[] eh2Arr;
        C6562gT0.p(cls, "modelClass");
        C6562gT0.p(abstractC6553gR, "extras");
        T t = null;
        for (EH2<?> eh2 : this.b) {
            if (C6562gT0.g(eh2.a(), cls)) {
                Object invoke = eh2.b().invoke(abstractC6553gR);
                if (invoke instanceof CH2) {
                    t = (T) invoke;
                } else {
                    t = null;
                }
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}

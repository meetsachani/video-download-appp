package o;

import o.CH2;

/* loaded from: classes.dex */
public final class EH2<T extends CH2> {
    public final Class<T> a;
    public final HA0<AbstractC6553gR, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public EH2(Class<T> cls, HA0<? super AbstractC6553gR, ? extends T> ha0) {
        C6562gT0.p(cls, "clazz");
        C6562gT0.p(ha0, "initializer");
        this.a = cls;
        this.b = ha0;
    }

    public final Class<T> a() {
        return this.a;
    }

    public final HA0<AbstractC6553gR, T> b() {
        return this.b;
    }
}

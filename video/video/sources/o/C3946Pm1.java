package o;

import o.AbstractC6553gR;

/* renamed from: o.Pm1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3946Pm1 extends AbstractC6553gR {
    public C3946Pm1() {
        this(null, 1, null);
    }

    @Override // o.AbstractC6553gR
    public <T> T a(AbstractC6553gR.b<T> bVar) {
        C6562gT0.p(bVar, "key");
        return (T) b().get(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(AbstractC6553gR.b<T> bVar, T t) {
        C6562gT0.p(bVar, "key");
        b().put(bVar, t);
    }

    public C3946Pm1(AbstractC6553gR abstractC6553gR) {
        C6562gT0.p(abstractC6553gR, "initialExtras");
        b().putAll(abstractC6553gR.b());
    }

    public /* synthetic */ C3946Pm1(AbstractC6553gR abstractC6553gR, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? AbstractC6553gR.a.b : abstractC6553gR);
    }
}

package o;

/* loaded from: classes.dex */
public final class L5 {
    public static final <I, O> X5<C7458kA2> c(I5 i5, O5<I, O> o5, I i, AbstractC5244b6 abstractC5244b6, final HA0<O, C7458kA2> ha0) {
        C6562gT0.p(i5, "<this>");
        C6562gT0.p(o5, "contract");
        C6562gT0.p(abstractC5244b6, "registry");
        C6562gT0.p(ha0, "callback");
        return new N5(i5.t(o5, abstractC5244b6, new H5() { // from class: o.J5
            @Override // o.H5
            public final void a(Object obj) {
                L5.e(HA0.this, obj);
            }
        }), o5, i);
    }

    public static final <I, O> X5<C7458kA2> d(I5 i5, O5<I, O> o5, I i, final HA0<O, C7458kA2> ha0) {
        C6562gT0.p(i5, "<this>");
        C6562gT0.p(o5, "contract");
        C6562gT0.p(ha0, "callback");
        return new N5(i5.X(o5, new H5() { // from class: o.K5
            @Override // o.H5
            public final void a(Object obj) {
                L5.f(HA0.this, obj);
            }
        }), o5, i);
    }

    public static final void e(HA0 ha0, Object obj) {
        ha0.invoke(obj);
    }

    public static final void f(HA0 ha0, Object obj) {
        ha0.invoke(obj);
    }
}

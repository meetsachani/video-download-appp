package o;

import o.HJ;

/* renamed from: o.aN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5070aN0 extends CO1 {
    public static final HJ.a<Integer> h = HJ.a.a("camerax.core.imageInput.inputFormat", Integer.TYPE);
    public static final HJ.a<N80> i = HJ.a.a("camerax.core.imageInput.inputDynamicRange", N80.class);

    /* renamed from: o.aN0$a */
    /* loaded from: classes.dex */
    public interface a<B> {
        B p(N80 n80);
    }

    default N80 P() {
        return (N80) C10907yF1.l((N80) h(i, N80.m));
    }

    default boolean V() {
        return g(i);
    }

    default int t() {
        return ((Integer) j(h)).intValue();
    }
}

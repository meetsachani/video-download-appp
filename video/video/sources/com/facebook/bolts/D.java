package com.facebook.bolts;

import com.facebook.bolts.B;
import o.InterfaceC5056aJ2;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class D {
    @Nullable
    public B<?> a;

    public D(@Nullable B<?> b) {
        this.a = b;
    }

    public final void a() {
        this.a = null;
    }

    @InterfaceC5056aJ2(otherwise = 4)
    public final void finalize() {
        B.c E;
        B<?> b = this.a;
        if (b != null && (E = B.j.E()) != null) {
            E.a(b, new E(b.N()));
        }
    }
}

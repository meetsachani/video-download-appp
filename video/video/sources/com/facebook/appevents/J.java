package com.facebook.appevents;

import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class J {
    public int a;
    @NotNull
    public I b = I.SUCCESS;

    public final int a() {
        return this.a;
    }

    @NotNull
    public final I b() {
        return this.b;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final void d(@NotNull I i) {
        C6562gT0.p(i, "<set-?>");
        this.b = i;
    }
}

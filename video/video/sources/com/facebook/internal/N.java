package com.facebook.internal;

import android.graphics.Bitmap;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class N {
    @NotNull
    public final M a;
    @Nullable
    public final Exception b;
    public final boolean c;
    @Nullable
    public final Bitmap d;

    public N(@NotNull M m, @Nullable Exception exc, boolean z, @Nullable Bitmap bitmap) {
        C6562gT0.p(m, "request");
        this.a = m;
        this.b = exc;
        this.c = z;
        this.d = bitmap;
    }

    @Nullable
    public final Bitmap a() {
        return this.d;
    }

    @Nullable
    public final Exception b() {
        return this.b;
    }

    @NotNull
    public final M c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }
}

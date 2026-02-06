package com.facebook.bolts;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import o.C6562gT0;
import o.C8319ne2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class h {
    @NotNull
    public final k a;

    public h(@NotNull k kVar) {
        C6562gT0.p(kVar, "tokenSource");
        this.a = kVar;
    }

    public final boolean a() {
        return this.a.k();
    }

    @NotNull
    public final i b(@Nullable Runnable runnable) {
        return this.a.m(runnable);
    }

    public final void c() throws CancellationException {
        this.a.n();
    }

    @NotNull
    public String toString() {
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{h.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.a.k())}, 3));
        C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }
}

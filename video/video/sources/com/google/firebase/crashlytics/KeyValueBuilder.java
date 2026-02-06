package com.google.firebase.crashlytics;

import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class KeyValueBuilder {
    @NotNull
    public final FirebaseCrashlytics a;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics firebaseCrashlytics) {
        C6562gT0.p(firebaseCrashlytics, "crashlytics");
        this.a = firebaseCrashlytics;
    }

    public final void a(@NotNull String str, double d) {
        C6562gT0.p(str, "key");
        this.a.k(str, d);
    }

    public final void b(@NotNull String str, float f) {
        C6562gT0.p(str, "key");
        this.a.l(str, f);
    }

    public final void c(@NotNull String str, int i) {
        C6562gT0.p(str, "key");
        this.a.m(str, i);
    }

    public final void d(@NotNull String str, long j) {
        C6562gT0.p(str, "key");
        this.a.n(str, j);
    }

    public final void e(@NotNull String str, @NotNull String str2) {
        C6562gT0.p(str, "key");
        C6562gT0.p(str2, "value");
        this.a.o(str, str2);
    }

    public final void f(@NotNull String str, boolean z) {
        C6562gT0.p(str, "key");
        this.a.p(str, z);
    }
}

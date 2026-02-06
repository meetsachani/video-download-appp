package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import o.C6562gT0;
import o.IR1;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;

@InterfaceC9150r20(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder` from the main module.")
/* loaded from: classes3.dex */
public final class KeyValueBuilder {
    @NotNull
    public final FirebaseCrashlytics a;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics firebaseCrashlytics) {
        C6562gT0.p(firebaseCrashlytics, "crashlytics");
        this.a = firebaseCrashlytics;
    }

    @InterfaceC9150r20(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @IR1(expression = "", imports = {}))
    public final void a(@NotNull String str, double d) {
        C6562gT0.p(str, "key");
        this.a.k(str, d);
    }

    @InterfaceC9150r20(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @IR1(expression = "", imports = {}))
    public final void b(@NotNull String str, float f) {
        C6562gT0.p(str, "key");
        this.a.l(str, f);
    }

    @InterfaceC9150r20(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @IR1(expression = "", imports = {}))
    public final void c(@NotNull String str, int i) {
        C6562gT0.p(str, "key");
        this.a.m(str, i);
    }

    @InterfaceC9150r20(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @IR1(expression = "", imports = {}))
    public final void d(@NotNull String str, long j) {
        C6562gT0.p(str, "key");
        this.a.n(str, j);
    }

    @InterfaceC9150r20(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @IR1(expression = "", imports = {}))
    public final void e(@NotNull String str, @NotNull String str2) {
        C6562gT0.p(str, "key");
        C6562gT0.p(str2, "value");
        this.a.o(str, str2);
    }

    @InterfaceC9150r20(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @IR1(expression = "", imports = {}))
    public final void f(@NotNull String str, boolean z) {
        C6562gT0.p(str, "key");
        this.a.p(str, z);
    }
}

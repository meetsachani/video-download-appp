package com.google.firebase.analytics;

import android.os.Bundle;
import o.C6562gT0;
import o.InterfaceC5670cr1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ParametersBuilder {
    @NotNull
    public final Bundle a = new Bundle();

    @NotNull
    public final Bundle a() {
        return this.a;
    }

    public final void b(@InterfaceC5670cr1 String str, double d) {
        C6562gT0.p(str, "key");
        this.a.putDouble(str, d);
    }

    public final void c(@InterfaceC5670cr1 String str, long j) {
        C6562gT0.p(str, "key");
        this.a.putLong(str, j);
    }

    public final void d(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle) {
        C6562gT0.p(str, "key");
        C6562gT0.p(bundle, "value");
        this.a.putBundle(str, bundle);
    }

    public final void e(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        C6562gT0.p(str, "key");
        C6562gT0.p(str2, "value");
        this.a.putString(str, str2);
    }

    public final void f(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle[] bundleArr) {
        C6562gT0.p(str, "key");
        C6562gT0.p(bundleArr, "value");
        this.a.putParcelableArray(str, bundleArr);
    }
}

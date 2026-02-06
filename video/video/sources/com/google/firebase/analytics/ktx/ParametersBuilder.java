package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import o.C6562gT0;
import o.InterfaceC5670cr1;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;

@InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
/* loaded from: classes3.dex */
public final class ParametersBuilder {
    @NotNull
    public final Bundle a = new Bundle();

    @NotNull
    public final Bundle a() {
        return this.a;
    }

    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void b(@InterfaceC5670cr1 String str, double d) {
        C6562gT0.p(str, "key");
        this.a.putDouble(str, d);
    }

    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void c(@InterfaceC5670cr1 String str, long j) {
        C6562gT0.p(str, "key");
        this.a.putLong(str, j);
    }

    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void d(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle) {
        C6562gT0.p(str, "key");
        C6562gT0.p(bundle, "value");
        this.a.putBundle(str, bundle);
    }

    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void e(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        C6562gT0.p(str, "key");
        C6562gT0.p(str2, "value");
        this.a.putString(str, str2);
    }

    @InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void f(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle[] bundleArr) {
        C6562gT0.p(str, "key");
        C6562gT0.p(bundleArr, "value");
        this.a.putParcelableArray(str, bundleArr);
    }
}

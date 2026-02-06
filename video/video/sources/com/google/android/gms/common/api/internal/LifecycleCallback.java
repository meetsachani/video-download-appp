package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.InterfaceC10389w71;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class LifecycleCallback {
    @InterfaceC5670cr1
    @KeepForSdk
    public final LifecycleFragment X;

    @KeepForSdk
    public LifecycleCallback(@InterfaceC5670cr1 LifecycleFragment lifecycleFragment) {
        this.X = lifecycleFragment;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static LifecycleFragment c(@InterfaceC5670cr1 Activity activity) {
        return e(new LifecycleActivity(activity));
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static LifecycleFragment d(@InterfaceC5670cr1 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static LifecycleFragment e(@InterfaceC5670cr1 LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.d()) {
            return zzd.I2(lifecycleActivity.b());
        }
        if (lifecycleActivity.c()) {
            return zzb.h(lifecycleActivity.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk
    @InterfaceC10389w71
    public void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 FileDescriptor fileDescriptor, @InterfaceC5670cr1 PrintWriter printWriter, @InterfaceC5670cr1 String[] strArr) {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Activity b() {
        Activity g = this.X.g();
        Preconditions.r(g);
        return g;
    }

    @KeepForSdk
    @InterfaceC10389w71
    public void f(int i, int i2, @InterfaceC5670cr1 Intent intent) {
    }

    @KeepForSdk
    @InterfaceC10389w71
    public void g(@InterfaceC11300zs1 Bundle bundle) {
    }

    @KeepForSdk
    @InterfaceC10389w71
    public void h() {
    }

    @KeepForSdk
    @InterfaceC10389w71
    public void i() {
    }

    @KeepForSdk
    @InterfaceC10389w71
    public void j(@InterfaceC5670cr1 Bundle bundle) {
    }

    @KeepForSdk
    @InterfaceC10389w71
    public void k() {
    }

    @KeepForSdk
    @InterfaceC10389w71
    public void l() {
    }
}

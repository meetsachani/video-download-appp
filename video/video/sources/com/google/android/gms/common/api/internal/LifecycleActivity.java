package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import o.ActivityC4864Yy0;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class LifecycleActivity {
    public final Object a;

    public LifecycleActivity(@InterfaceC5670cr1 Activity activity) {
        Preconditions.s(activity, "Activity must not be null");
        this.a = activity;
    }

    @InterfaceC5670cr1
    public final Activity a() {
        return (Activity) this.a;
    }

    @InterfaceC5670cr1
    public final ActivityC4864Yy0 b() {
        return (ActivityC4864Yy0) this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof ActivityC4864Yy0;
    }

    @KeepForSdk
    public LifecycleActivity(@InterfaceC5670cr1 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}

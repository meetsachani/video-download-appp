package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class Wrappers {
    public static final Wrappers b = new Wrappers();
    @InterfaceC11300zs1
    public PackageManagerWrapper a = null;

    @InterfaceC5670cr1
    @KeepForSdk
    public static PackageManagerWrapper a(@InterfaceC5670cr1 Context context) {
        return b.b(context);
    }

    @InterfaceC5056aJ2
    @InterfaceC5670cr1
    public final synchronized PackageManagerWrapper b(@InterfaceC5670cr1 Context context) {
        try {
            if (this.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.a = new PackageManagerWrapper(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}

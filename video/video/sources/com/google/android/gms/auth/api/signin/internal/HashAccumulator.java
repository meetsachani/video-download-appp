package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class HashAccumulator {
    @VisibleForTesting
    public static int b = 31;
    public int a = 1;

    @InterfaceC5670cr1
    @KeepForSdk
    public HashAccumulator a(@InterfaceC11300zs1 Object obj) {
        int hashCode;
        int i = b * this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.a = i + hashCode;
        return this;
    }

    @KeepForSdk
    public int b() {
        return this.a;
    }

    @InterfaceC5670cr1
    public final HashAccumulator c(boolean z) {
        this.a = (b * this.a) + (z ? 1 : 0);
        return this;
    }
}

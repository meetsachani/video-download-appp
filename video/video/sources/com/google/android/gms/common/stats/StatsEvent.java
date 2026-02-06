package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.InterfaceC5670cr1;

@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface Types {
        @KeepForSdk
        public static final int a = 7;
        @KeepForSdk
        public static final int b = 8;
    }

    @InterfaceC5670cr1
    public abstract String B0();

    public abstract long b();

    public abstract int m0();

    @InterfaceC5670cr1
    public final String toString() {
        long b = b();
        int m0 = m0();
        String B0 = B0();
        return b + "\t" + m0 + "\t-1" + B0;
    }
}

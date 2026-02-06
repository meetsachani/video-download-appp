package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "RootTelemetryConfigurationCreator")
/* loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzaj();
    @SafeParcelable.Field(getter = "getVersion", id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    public final boolean Y;
    @SafeParcelable.Field(getter = "getBatchPeriodMillis", id = 4)
    public final int Y0;
    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", id = 3)
    public final boolean Z;
    @SafeParcelable.Field(getter = "getMaxMethodInvocationsInBatch", id = 5)
    public final int Z0;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) int i3) {
        this.X = i;
        this.Y = z;
        this.Z = z2;
        this.Y0 = i2;
        this.Z0 = i3;
    }

    @KeepForSdk
    public int B0() {
        return this.Z0;
    }

    @KeepForSdk
    public boolean E0() {
        return this.Y;
    }

    @KeepForSdk
    public boolean G0() {
        return this.Z;
    }

    @KeepForSdk
    public int d0() {
        return this.X;
    }

    @KeepForSdk
    public int m0() {
        return this.Y0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, d0());
        SafeParcelWriter.g(parcel, 2, E0());
        SafeParcelWriter.g(parcel, 3, G0());
        SafeParcelWriter.F(parcel, 4, m0());
        SafeParcelWriter.F(parcel, 5, B0());
        SafeParcelWriter.b(parcel, a);
    }
}

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "ConnectionTelemetryConfigurationCreator")
/* loaded from: classes2.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzm();
    @SafeParcelable.Field(getter = "getRootTelemetryConfiguration", id = 1)
    public final RootTelemetryConfiguration X;
    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    public final boolean Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyAllowlist", id = 4)
    public final int[] Y0;
    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", id = 3)
    public final boolean Z;
    @SafeParcelable.Field(getter = "getMaxMethodInvocationsLogged", id = 5)
    public final int Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyDisallowlist", id = 6)
    public final int[] a1;

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@SafeParcelable.Param(id = 1) @InterfaceC5670cr1 RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) int[] iArr, @SafeParcelable.Param(id = 5) int i, @InterfaceC11300zs1 @SafeParcelable.Param(id = 6) int[] iArr2) {
        this.X = rootTelemetryConfiguration;
        this.Y = z;
        this.Z = z2;
        this.Y0 = iArr;
        this.Z0 = i;
        this.a1 = iArr2;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public int[] B0() {
        return this.Y0;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public int[] E0() {
        return this.a1;
    }

    @KeepForSdk
    public boolean G0() {
        return this.Y;
    }

    @KeepForSdk
    public boolean H0() {
        return this.Z;
    }

    @InterfaceC5670cr1
    public final RootTelemetryConfiguration I0() {
        return this.X;
    }

    @KeepForSdk
    public int m0() {
        return this.Z0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.S(parcel, 1, this.X, i, false);
        SafeParcelWriter.g(parcel, 2, G0());
        SafeParcelWriter.g(parcel, 3, H0());
        SafeParcelWriter.G(parcel, 4, B0(), false);
        SafeParcelWriter.F(parcel, 5, m0());
        SafeParcelWriter.G(parcel, 6, E0(), false);
        SafeParcelWriter.b(parcel, a);
    }
}

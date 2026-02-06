package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "ConnectionInfoCreator")
/* loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field(id = 1)
    public Bundle X;
    @SafeParcelable.Field(id = 2)
    public Feature[] Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 4)
    public ConnectionTelemetryConfiguration Y0;
    @SafeParcelable.Field(defaultValue = "0", id = 3)
    public int Z;

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) Feature[] featureArr, @SafeParcelable.Param(id = 3) int i, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.X = bundle;
        this.Y = featureArr;
        this.Z = i;
        this.Y0 = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.X, false);
        SafeParcelWriter.c0(parcel, 2, this.Y, i, false);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.S(parcel, 4, this.Y0, i, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zzk() {
    }
}

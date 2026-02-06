package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RequestConfigurationParcelCreator")
/* loaded from: classes2.dex */
public final class zzfr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfr> CREATOR = new zzfs();
    @SafeParcelable.Field(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final int Y;

    @SafeParcelable.Constructor
    public zzfr(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.X = i;
        this.Y = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.b(parcel, a);
    }

    public zzfr(RequestConfiguration requestConfiguration) {
        this.X = requestConfiguration.c();
        this.Y = requestConfiguration.d();
    }
}

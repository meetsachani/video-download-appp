package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TriggerUriParcelCreator")
/* loaded from: classes3.dex */
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new zzmk();
    @SafeParcelable.Field(id = 1)
    public final String X;
    @SafeParcelable.Field(id = 2)
    public final long Y;
    @SafeParcelable.Field(id = 3)
    public final int Z;

    @SafeParcelable.Constructor
    public zzmh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) int i) {
        this.X = str;
        this.Y = j;
        this.Z = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, this.X, false);
        SafeParcelWriter.K(parcel, 2, this.Y);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.b(parcel, a);
    }
}

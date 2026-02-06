package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "InitializationParamsCreator")
/* loaded from: classes3.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzdg();
    @SafeParcelable.Field(id = 1)
    public final long X;
    @SafeParcelable.Field(id = 2)
    public final long Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 4)
    public final String Y0;
    @SafeParcelable.Field(id = 3)
    public final boolean Z;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 5)
    public final String Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 6)
    public final String a1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 7)
    public final Bundle b1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 8)
    public final String c1;

    @SafeParcelable.Constructor
    public zzdd(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) boolean z, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) String str, @InterfaceC11300zs1 @SafeParcelable.Param(id = 5) String str2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 6) String str3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 7) Bundle bundle, @InterfaceC11300zs1 @SafeParcelable.Param(id = 8) String str4) {
        this.X = j;
        this.Y = j2;
        this.Z = z;
        this.Y0 = str;
        this.Z0 = str2;
        this.a1 = str3;
        this.b1 = bundle;
        this.c1 = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.K(parcel, 1, this.X);
        SafeParcelWriter.K(parcel, 2, this.Y);
        SafeParcelWriter.g(parcel, 3, this.Z);
        SafeParcelWriter.Y(parcel, 4, this.Y0, false);
        SafeParcelWriter.Y(parcel, 5, this.Z0, false);
        SafeParcelWriter.Y(parcel, 6, this.a1, false);
        SafeParcelWriter.k(parcel, 7, this.b1, false);
        SafeParcelWriter.Y(parcel, 8, this.c1, false);
        SafeParcelWriter.b(parcel, a);
    }
}

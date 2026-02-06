package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "AdapterResponseInfoParcelCreator")
/* loaded from: classes2.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();
    @SafeParcelable.Field(id = 1)
    public final String X;
    @SafeParcelable.Field(id = 2)
    public long Y;
    @SafeParcelable.Field(id = 4)
    public final Bundle Y0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 3)
    public zze Z;
    @SafeParcelable.Field(id = 5)
    public final String Z0;
    @SafeParcelable.Field(id = 6)
    public final String a1;
    @SafeParcelable.Field(id = 7)
    public final String b1;
    @SafeParcelable.Field(id = 8)
    public final String c1;

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) long j, @InterfaceC11300zs1 @SafeParcelable.Param(id = 3) zze zzeVar, @SafeParcelable.Param(id = 4) Bundle bundle, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) String str4, @SafeParcelable.Param(id = 8) String str5) {
        this.X = str;
        this.Y = j;
        this.Z = zzeVar;
        this.Y0 = bundle;
        this.Z0 = str2;
        this.a1 = str3;
        this.b1 = str4;
        this.c1 = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.K(parcel, 2, this.Y);
        SafeParcelWriter.S(parcel, 3, this.Z, i, false);
        SafeParcelWriter.k(parcel, 4, this.Y0, false);
        SafeParcelWriter.Y(parcel, 5, this.Z0, false);
        SafeParcelWriter.Y(parcel, 6, this.a1, false);
        SafeParcelWriter.Y(parcel, 7, this.b1, false);
        SafeParcelWriter.Y(parcel, 8, this.c1, false);
        SafeParcelWriter.b(parcel, a);
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
/* loaded from: classes3.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzag();
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 2)
    public String X;
    @SafeParcelable.Field(id = 3)
    public String Y;
    @SafeParcelable.Field(id = 5)
    public long Y0;
    @SafeParcelable.Field(id = 4)
    public zznc Z;
    @SafeParcelable.Field(id = 6)
    public boolean Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 7)
    public String a1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 8)
    public zzbg b1;
    @SafeParcelable.Field(id = 9)
    public long c1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 10)
    public zzbg d1;
    @SafeParcelable.Field(id = 11)
    public long e1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 12)
    public zzbg f1;

    public zzad(zzad zzadVar) {
        Preconditions.r(zzadVar);
        this.X = zzadVar.X;
        this.Y = zzadVar.Y;
        this.Z = zzadVar.Z;
        this.Y0 = zzadVar.Y0;
        this.Z0 = zzadVar.Z0;
        this.a1 = zzadVar.a1;
        this.b1 = zzadVar.b1;
        this.c1 = zzadVar.c1;
        this.d1 = zzadVar.d1;
        this.e1 = zzadVar.e1;
        this.f1 = zzadVar.f1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 2, this.X, false);
        SafeParcelWriter.Y(parcel, 3, this.Y, false);
        SafeParcelWriter.S(parcel, 4, this.Z, i, false);
        SafeParcelWriter.K(parcel, 5, this.Y0);
        SafeParcelWriter.g(parcel, 6, this.Z0);
        SafeParcelWriter.Y(parcel, 7, this.a1, false);
        SafeParcelWriter.S(parcel, 8, this.b1, i, false);
        SafeParcelWriter.K(parcel, 9, this.c1);
        SafeParcelWriter.S(parcel, 10, this.d1, i, false);
        SafeParcelWriter.K(parcel, 11, this.e1);
        SafeParcelWriter.S(parcel, 12, this.f1, i, false);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzad(@InterfaceC11300zs1 @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zznc zzncVar, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) boolean z, @InterfaceC11300zs1 @SafeParcelable.Param(id = 7) String str3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 8) zzbg zzbgVar, @SafeParcelable.Param(id = 9) long j2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 10) zzbg zzbgVar2, @SafeParcelable.Param(id = 11) long j3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 12) zzbg zzbgVar3) {
        this.X = str;
        this.Y = str2;
        this.Z = zzncVar;
        this.Y0 = j;
        this.Z0 = z;
        this.a1 = str3;
        this.b1 = zzbgVar;
        this.c1 = j2;
        this.d1 = zzbgVar2;
        this.e1 = j3;
        this.f1 = zzbgVar3;
    }
}

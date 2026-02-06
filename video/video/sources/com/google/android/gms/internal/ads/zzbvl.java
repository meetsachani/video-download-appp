package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
/* loaded from: classes2.dex */
public final class zzbvl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvl> CREATOR = new zzbvm();
    @SafeParcelable.Field(id = 1)
    public final Bundle X;
    @SafeParcelable.Field(id = 2)
    public final VersionInfoParcel Y;
    @SafeParcelable.Field(id = 4)
    public final String Y0;
    @SafeParcelable.Field(id = 3)
    public final ApplicationInfo Z;
    @SafeParcelable.Field(id = 5)
    public final List Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 6)
    public final PackageInfo a1;
    @SafeParcelable.Field(id = 7)
    public final String b1;
    @SafeParcelable.Field(id = 9)
    public final String c1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 10)
    public zzfej d1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 11)
    public String e1;
    @SafeParcelable.Field(id = 12)
    public final boolean f1;
    @SafeParcelable.Field(id = 13)
    public final boolean g1;
    @SafeParcelable.Field(id = 14)
    public final Bundle h1;
    @SafeParcelable.Field(id = 15)
    public final Bundle i1;
    @SafeParcelable.Field(id = 16)
    public final int j1;

    @SafeParcelable.Constructor
    public zzbvl(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) List list, @InterfaceC11300zs1 @SafeParcelable.Param(id = 6) PackageInfo packageInfo, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) zzfej zzfejVar, @SafeParcelable.Param(id = 11) String str4, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) boolean z2, @SafeParcelable.Param(id = 14) Bundle bundle2, @SafeParcelable.Param(id = 15) Bundle bundle3, @SafeParcelable.Param(id = 16) int i) {
        this.X = bundle;
        this.Y = versionInfoParcel;
        this.Y0 = str;
        this.Z = applicationInfo;
        this.Z0 = list;
        this.a1 = packageInfo;
        this.b1 = str2;
        this.c1 = str3;
        this.d1 = zzfejVar;
        this.e1 = str4;
        this.f1 = z;
        this.g1 = z2;
        this.h1 = bundle2;
        this.i1 = bundle3;
        this.j1 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, bundle, false);
        SafeParcelWriter.S(parcel, 2, this.Y, i, false);
        SafeParcelWriter.S(parcel, 3, this.Z, i, false);
        SafeParcelWriter.Y(parcel, 4, this.Y0, false);
        SafeParcelWriter.a0(parcel, 5, this.Z0, false);
        SafeParcelWriter.S(parcel, 6, this.a1, i, false);
        SafeParcelWriter.Y(parcel, 7, this.b1, false);
        SafeParcelWriter.Y(parcel, 9, this.c1, false);
        SafeParcelWriter.S(parcel, 10, this.d1, i, false);
        SafeParcelWriter.Y(parcel, 11, this.e1, false);
        SafeParcelWriter.g(parcel, 12, this.f1);
        SafeParcelWriter.g(parcel, 13, this.g1);
        SafeParcelWriter.k(parcel, 14, this.h1, false);
        SafeParcelWriter.k(parcel, 15, this.i1, false);
        SafeParcelWriter.F(parcel, 16, this.j1);
        SafeParcelWriter.b(parcel, a);
    }
}

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "AdRequestInfoParcelCreator")
/* loaded from: classes2.dex */
public final class zzbur extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbur> CREATOR = new zzbus();
    @SafeParcelable.Field(id = 37)
    public final boolean A1;
    @SafeParcelable.Field(id = 39)
    public final String B1;
    @SafeParcelable.Field(id = 40)
    public final boolean C1;
    @SafeParcelable.Field(id = 41)
    public final String D1;
    @SafeParcelable.Field(id = 42)
    public final boolean E1;
    @SafeParcelable.Field(id = 43)
    public final int F1;
    @SafeParcelable.Field(id = 44)
    public final Bundle G1;
    @SafeParcelable.Field(id = 45)
    public final String H1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 46)
    public final com.google.android.gms.ads.internal.client.zzee I1;
    @SafeParcelable.Field(id = 47)
    public final boolean J1;
    @SafeParcelable.Field(id = 48)
    public final Bundle K1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 49)
    public final String L1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 50)
    public final String M1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 51)
    public final String N1;
    @SafeParcelable.Field(id = 52)
    public final boolean O1;
    @SafeParcelable.Field(id = 53)
    public final List P1;
    @SafeParcelable.Field(id = 54)
    public final String Q1;
    @SafeParcelable.Field(id = 55)
    public final List R1;
    @SafeParcelable.Field(id = 56)
    public final int S1;
    @SafeParcelable.Field(id = 57)
    public final boolean T1;
    @SafeParcelable.Field(id = 58)
    public final boolean U1;
    @SafeParcelable.Field(id = 59)
    public final boolean V1;
    @SafeParcelable.Field(id = 60)
    public final ArrayList W1;
    @SafeParcelable.Field(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 61)
    public final String X1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 2)
    public final Bundle Y;
    @SafeParcelable.Field(id = 4)
    public final com.google.android.gms.ads.internal.client.zzr Y0;
    @SafeParcelable.Field(id = 63)
    public final zzbmg Y1;
    @SafeParcelable.Field(id = 3)
    public final com.google.android.gms.ads.internal.client.zzm Z;
    @SafeParcelable.Field(id = 5)
    public final String Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 64)
    public final String Z1;
    @SafeParcelable.Field(id = 6)
    public final ApplicationInfo a1;
    @SafeParcelable.Field(id = 65)
    public final Bundle a2;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 7)
    public final PackageInfo b1;
    @SafeParcelable.Field(id = 8)
    public final String c1;
    @SafeParcelable.Field(id = 9)
    public final String d1;
    @SafeParcelable.Field(id = 10)
    public final String e1;
    @SafeParcelable.Field(id = 11)
    public final VersionInfoParcel f1;
    @SafeParcelable.Field(id = 12)
    public final Bundle g1;
    @SafeParcelable.Field(id = 13)
    public final int h1;
    @SafeParcelable.Field(id = 14)
    public final List i1;
    @SafeParcelable.Field(id = 15)
    public final Bundle j1;
    @SafeParcelable.Field(id = 16)
    public final boolean k1;
    @SafeParcelable.Field(id = 18)
    public final int l1;
    @SafeParcelable.Field(id = 19)
    public final int m1;
    @SafeParcelable.Field(id = 20)
    public final float n1;
    @SafeParcelable.Field(id = 21)
    public final String o1;
    @SafeParcelable.Field(id = 25)
    public final long p1;
    @SafeParcelable.Field(id = 26)
    public final String q1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 27)
    public final List r1;
    @SafeParcelable.Field(id = 28)
    public final String s1;
    @SafeParcelable.Field(id = 29)
    public final zzbfv t1;
    @SafeParcelable.Field(id = 30)
    public final List u1;
    @SafeParcelable.Field(id = 31)
    public final long v1;
    @SafeParcelable.Field(id = 33)
    public final String w1;
    @SafeParcelable.Field(id = 34)
    public final float x1;
    @SafeParcelable.Field(id = 35)
    public final int y1;
    @SafeParcelable.Field(id = 36)
    public final int z1;

    @SafeParcelable.Constructor
    public zzbur(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) com.google.android.gms.ads.internal.client.zzm zzmVar, @SafeParcelable.Param(id = 4) com.google.android.gms.ads.internal.client.zzr zzrVar, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 7) PackageInfo packageInfo, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) String str4, @SafeParcelable.Param(id = 11) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(id = 12) Bundle bundle2, @SafeParcelable.Param(id = 13) int i2, @SafeParcelable.Param(id = 14) List list, @SafeParcelable.Param(id = 15) Bundle bundle3, @SafeParcelable.Param(id = 16) boolean z, @SafeParcelable.Param(id = 18) int i3, @SafeParcelable.Param(id = 19) int i4, @SafeParcelable.Param(id = 20) float f, @SafeParcelable.Param(id = 21) String str5, @SafeParcelable.Param(id = 25) long j, @SafeParcelable.Param(id = 26) String str6, @SafeParcelable.Param(id = 27) List list2, @SafeParcelable.Param(id = 28) String str7, @SafeParcelable.Param(id = 29) zzbfv zzbfvVar, @SafeParcelable.Param(id = 30) List list3, @SafeParcelable.Param(id = 31) long j2, @SafeParcelable.Param(id = 33) String str8, @SafeParcelable.Param(id = 34) float f2, @SafeParcelable.Param(id = 40) boolean z2, @SafeParcelable.Param(id = 35) int i5, @SafeParcelable.Param(id = 36) int i6, @SafeParcelable.Param(id = 37) boolean z3, @SafeParcelable.Param(id = 39) String str9, @SafeParcelable.Param(id = 41) String str10, @SafeParcelable.Param(id = 42) boolean z4, @SafeParcelable.Param(id = 43) int i7, @SafeParcelable.Param(id = 44) Bundle bundle4, @SafeParcelable.Param(id = 45) String str11, @SafeParcelable.Param(id = 46) com.google.android.gms.ads.internal.client.zzee zzeeVar, @SafeParcelable.Param(id = 47) boolean z5, @SafeParcelable.Param(id = 48) Bundle bundle5, @InterfaceC11300zs1 @SafeParcelable.Param(id = 49) String str12, @InterfaceC11300zs1 @SafeParcelable.Param(id = 50) String str13, @InterfaceC11300zs1 @SafeParcelable.Param(id = 51) String str14, @SafeParcelable.Param(id = 52) boolean z6, @SafeParcelable.Param(id = 53) List list4, @SafeParcelable.Param(id = 54) String str15, @SafeParcelable.Param(id = 55) List list5, @SafeParcelable.Param(id = 56) int i8, @SafeParcelable.Param(id = 57) boolean z7, @SafeParcelable.Param(id = 58) boolean z8, @SafeParcelable.Param(id = 59) boolean z9, @SafeParcelable.Param(id = 60) ArrayList arrayList, @SafeParcelable.Param(id = 61) String str16, @SafeParcelable.Param(id = 63) zzbmg zzbmgVar, @InterfaceC11300zs1 @SafeParcelable.Param(id = 64) String str17, @SafeParcelable.Param(id = 65) Bundle bundle6) {
        List unmodifiableList;
        List unmodifiableList2;
        this.X = i;
        this.Y = bundle;
        this.Z = zzmVar;
        this.Y0 = zzrVar;
        this.Z0 = str;
        this.a1 = applicationInfo;
        this.b1 = packageInfo;
        this.c1 = str2;
        this.d1 = str3;
        this.e1 = str4;
        this.f1 = versionInfoParcel;
        this.g1 = bundle2;
        this.h1 = i2;
        this.i1 = list;
        if (list3 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(list3);
        }
        this.u1 = unmodifiableList;
        this.j1 = bundle3;
        this.k1 = z;
        this.l1 = i3;
        this.m1 = i4;
        this.n1 = f;
        this.o1 = str5;
        this.p1 = j;
        this.q1 = str6;
        if (list2 == null) {
            unmodifiableList2 = Collections.EMPTY_LIST;
        } else {
            unmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.r1 = unmodifiableList2;
        this.s1 = str7;
        this.t1 = zzbfvVar;
        this.v1 = j2;
        this.w1 = str8;
        this.x1 = f2;
        this.C1 = z2;
        this.y1 = i5;
        this.z1 = i6;
        this.A1 = z3;
        this.B1 = str9;
        this.D1 = str10;
        this.E1 = z4;
        this.F1 = i7;
        this.G1 = bundle4;
        this.H1 = str11;
        this.I1 = zzeeVar;
        this.J1 = z5;
        this.K1 = bundle5;
        this.L1 = str12;
        this.M1 = str13;
        this.N1 = str14;
        this.O1 = z6;
        this.P1 = list4;
        this.Q1 = str15;
        this.R1 = list5;
        this.S1 = i8;
        this.T1 = z7;
        this.U1 = z8;
        this.V1 = z9;
        this.W1 = arrayList;
        this.X1 = str16;
        this.Y1 = zzbmgVar;
        this.Z1 = str17;
        this.a2 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.k(parcel, 2, this.Y, false);
        SafeParcelWriter.S(parcel, 3, this.Z, i, false);
        SafeParcelWriter.S(parcel, 4, this.Y0, i, false);
        SafeParcelWriter.Y(parcel, 5, this.Z0, false);
        SafeParcelWriter.S(parcel, 6, this.a1, i, false);
        SafeParcelWriter.S(parcel, 7, this.b1, i, false);
        SafeParcelWriter.Y(parcel, 8, this.c1, false);
        SafeParcelWriter.Y(parcel, 9, this.d1, false);
        SafeParcelWriter.Y(parcel, 10, this.e1, false);
        SafeParcelWriter.S(parcel, 11, this.f1, i, false);
        SafeParcelWriter.k(parcel, 12, this.g1, false);
        SafeParcelWriter.F(parcel, 13, this.h1);
        SafeParcelWriter.a0(parcel, 14, this.i1, false);
        SafeParcelWriter.k(parcel, 15, this.j1, false);
        SafeParcelWriter.g(parcel, 16, this.k1);
        SafeParcelWriter.F(parcel, 18, this.l1);
        SafeParcelWriter.F(parcel, 19, this.m1);
        SafeParcelWriter.w(parcel, 20, this.n1);
        SafeParcelWriter.Y(parcel, 21, this.o1, false);
        SafeParcelWriter.K(parcel, 25, this.p1);
        SafeParcelWriter.Y(parcel, 26, this.q1, false);
        SafeParcelWriter.a0(parcel, 27, this.r1, false);
        SafeParcelWriter.Y(parcel, 28, this.s1, false);
        SafeParcelWriter.S(parcel, 29, this.t1, i, false);
        SafeParcelWriter.a0(parcel, 30, this.u1, false);
        SafeParcelWriter.K(parcel, 31, this.v1);
        SafeParcelWriter.Y(parcel, 33, this.w1, false);
        SafeParcelWriter.w(parcel, 34, this.x1);
        SafeParcelWriter.F(parcel, 35, this.y1);
        SafeParcelWriter.F(parcel, 36, this.z1);
        SafeParcelWriter.g(parcel, 37, this.A1);
        SafeParcelWriter.Y(parcel, 39, this.B1, false);
        SafeParcelWriter.g(parcel, 40, this.C1);
        SafeParcelWriter.Y(parcel, 41, this.D1, false);
        SafeParcelWriter.g(parcel, 42, this.E1);
        SafeParcelWriter.F(parcel, 43, this.F1);
        SafeParcelWriter.k(parcel, 44, this.G1, false);
        SafeParcelWriter.Y(parcel, 45, this.H1, false);
        SafeParcelWriter.S(parcel, 46, this.I1, i, false);
        SafeParcelWriter.g(parcel, 47, this.J1);
        SafeParcelWriter.k(parcel, 48, this.K1, false);
        SafeParcelWriter.Y(parcel, 49, this.L1, false);
        SafeParcelWriter.Y(parcel, 50, this.M1, false);
        SafeParcelWriter.Y(parcel, 51, this.N1, false);
        SafeParcelWriter.g(parcel, 52, this.O1);
        SafeParcelWriter.H(parcel, 53, this.P1, false);
        SafeParcelWriter.Y(parcel, 54, this.Q1, false);
        SafeParcelWriter.a0(parcel, 55, this.R1, false);
        SafeParcelWriter.F(parcel, 56, this.S1);
        SafeParcelWriter.g(parcel, 57, this.T1);
        SafeParcelWriter.g(parcel, 58, this.U1);
        SafeParcelWriter.g(parcel, 59, this.V1);
        SafeParcelWriter.a0(parcel, 60, this.W1, false);
        SafeParcelWriter.Y(parcel, 61, this.X1, false);
        SafeParcelWriter.S(parcel, 63, this.Y1, i, false);
        SafeParcelWriter.Y(parcel, 64, this.Z1, false);
        SafeParcelWriter.k(parcel, 65, this.a2, false);
        SafeParcelWriter.b(parcel, a);
    }
}

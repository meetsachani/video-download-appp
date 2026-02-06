package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import o.C3855Oo;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 17, 20, 33})
/* loaded from: classes3.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzq();
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 2)
    public final String X;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 3)
    public final String Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 5)
    public final String Y0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 4)
    public final String Z;
    @SafeParcelable.Field(id = 6)
    public final long Z0;
    @SafeParcelable.Field(id = 7)
    public final long a1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 8)
    public final String b1;
    @SafeParcelable.Field(defaultValue = "true", id = 9)
    public final boolean c1;
    @SafeParcelable.Field(id = 10)
    public final boolean d1;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long e1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 12)
    public final String f1;
    @SafeParcelable.Field(id = 13)
    @Deprecated
    public final long g1;
    @SafeParcelable.Field(id = 14)
    public final long h1;
    @SafeParcelable.Field(id = 15)
    public final int i1;
    @SafeParcelable.Field(defaultValue = "true", id = 16)
    public final boolean j1;
    @SafeParcelable.Field(id = 18)
    public final boolean k1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 19)
    public final String l1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 21)
    public final Boolean m1;
    @SafeParcelable.Field(id = 22)
    public final long n1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 23)
    public final List<String> o1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 24)
    public final String p1;
    @SafeParcelable.Field(defaultValue = "", id = 25)
    public final String q1;
    @SafeParcelable.Field(defaultValue = "", id = 26)
    public final String r1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 27)
    public final String s1;
    @SafeParcelable.Field(defaultValue = C3855Oo.a, id = 28)
    public final boolean t1;
    @SafeParcelable.Field(id = 29)
    public final long u1;
    @SafeParcelable.Field(defaultValue = "100", id = 30)
    public final int v1;
    @SafeParcelable.Field(defaultValue = "", id = 31)
    public final String w1;
    @SafeParcelable.Field(id = 32)
    public final int x1;
    @SafeParcelable.Field(id = 34)
    public final long y1;

    public zzo(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, long j, @InterfaceC11300zs1 String str4, long j2, long j3, @InterfaceC11300zs1 String str5, boolean z, boolean z2, @InterfaceC11300zs1 String str6, long j4, long j5, int i, boolean z3, boolean z4, @InterfaceC11300zs1 String str7, @InterfaceC11300zs1 Boolean bool, long j6, @InterfaceC11300zs1 List<String> list, @InterfaceC11300zs1 String str8, String str9, String str10, @InterfaceC11300zs1 String str11, boolean z5, long j7, int i2, String str12, int i3, long j8) {
        Preconditions.l(str);
        this.X = str;
        this.Y = TextUtils.isEmpty(str2) ? null : str2;
        this.Z = str3;
        this.e1 = j;
        this.Y0 = str4;
        this.Z0 = j2;
        this.a1 = j3;
        this.b1 = str5;
        this.c1 = z;
        this.d1 = z2;
        this.f1 = str6;
        this.g1 = j4;
        this.h1 = j5;
        this.i1 = i;
        this.j1 = z3;
        this.k1 = z4;
        this.l1 = str7;
        this.m1 = bool;
        this.n1 = j6;
        this.o1 = list;
        this.p1 = null;
        this.q1 = str9;
        this.r1 = str10;
        this.s1 = str11;
        this.t1 = z5;
        this.u1 = j7;
        this.v1 = i2;
        this.w1 = str12;
        this.x1 = i3;
        this.y1 = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 2, this.X, false);
        SafeParcelWriter.Y(parcel, 3, this.Y, false);
        SafeParcelWriter.Y(parcel, 4, this.Z, false);
        SafeParcelWriter.Y(parcel, 5, this.Y0, false);
        SafeParcelWriter.K(parcel, 6, this.Z0);
        SafeParcelWriter.K(parcel, 7, this.a1);
        SafeParcelWriter.Y(parcel, 8, this.b1, false);
        SafeParcelWriter.g(parcel, 9, this.c1);
        SafeParcelWriter.g(parcel, 10, this.d1);
        SafeParcelWriter.K(parcel, 11, this.e1);
        SafeParcelWriter.Y(parcel, 12, this.f1, false);
        SafeParcelWriter.K(parcel, 13, this.g1);
        SafeParcelWriter.K(parcel, 14, this.h1);
        SafeParcelWriter.F(parcel, 15, this.i1);
        SafeParcelWriter.g(parcel, 16, this.j1);
        SafeParcelWriter.g(parcel, 18, this.k1);
        SafeParcelWriter.Y(parcel, 19, this.l1, false);
        SafeParcelWriter.j(parcel, 21, this.m1, false);
        SafeParcelWriter.K(parcel, 22, this.n1);
        SafeParcelWriter.a0(parcel, 23, this.o1, false);
        SafeParcelWriter.Y(parcel, 24, this.p1, false);
        SafeParcelWriter.Y(parcel, 25, this.q1, false);
        SafeParcelWriter.Y(parcel, 26, this.r1, false);
        SafeParcelWriter.Y(parcel, 27, this.s1, false);
        SafeParcelWriter.g(parcel, 28, this.t1);
        SafeParcelWriter.K(parcel, 29, this.u1);
        SafeParcelWriter.F(parcel, 30, this.v1);
        SafeParcelWriter.Y(parcel, 31, this.w1, false);
        SafeParcelWriter.F(parcel, 32, this.x1);
        SafeParcelWriter.K(parcel, 34, this.y1);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzo(@InterfaceC11300zs1 @SafeParcelable.Param(id = 2) String str, @InterfaceC11300zs1 @SafeParcelable.Param(id = 3) String str2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) String str3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) long j, @SafeParcelable.Param(id = 7) long j2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) boolean z, @SafeParcelable.Param(id = 10) boolean z2, @SafeParcelable.Param(id = 11) long j3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 12) String str6, @SafeParcelable.Param(id = 13) long j4, @SafeParcelable.Param(id = 14) long j5, @SafeParcelable.Param(id = 15) int i, @SafeParcelable.Param(id = 16) boolean z3, @SafeParcelable.Param(id = 18) boolean z4, @InterfaceC11300zs1 @SafeParcelable.Param(id = 19) String str7, @InterfaceC11300zs1 @SafeParcelable.Param(id = 21) Boolean bool, @SafeParcelable.Param(id = 22) long j6, @InterfaceC11300zs1 @SafeParcelable.Param(id = 23) List<String> list, @InterfaceC11300zs1 @SafeParcelable.Param(id = 24) String str8, @SafeParcelable.Param(id = 25) String str9, @SafeParcelable.Param(id = 26) String str10, @SafeParcelable.Param(id = 27) String str11, @SafeParcelable.Param(id = 28) boolean z5, @SafeParcelable.Param(id = 29) long j7, @SafeParcelable.Param(id = 30) int i2, @SafeParcelable.Param(id = 31) String str12, @SafeParcelable.Param(id = 32) int i3, @SafeParcelable.Param(id = 34) long j8) {
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.e1 = j3;
        this.Y0 = str4;
        this.Z0 = j;
        this.a1 = j2;
        this.b1 = str5;
        this.c1 = z;
        this.d1 = z2;
        this.f1 = str6;
        this.g1 = j4;
        this.h1 = j5;
        this.i1 = i;
        this.j1 = z3;
        this.k1 = z4;
        this.l1 = str7;
        this.m1 = bool;
        this.n1 = j6;
        this.o1 = list;
        this.p1 = str8;
        this.q1 = str9;
        this.r1 = str10;
        this.s1 = str11;
        this.t1 = z5;
        this.u1 = j7;
        this.v1 = i2;
        this.w1 = str12;
        this.x1 = i3;
        this.y1 = j8;
    }
}

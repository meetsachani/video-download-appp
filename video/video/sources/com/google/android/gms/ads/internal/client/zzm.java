package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "AdRequestParcelCreator")
/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();
    @SafeParcelable.Field(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    @Deprecated
    public final long Y;
    @SafeParcelable.Field(id = 4)
    @Deprecated
    public final int Y0;
    @SafeParcelable.Field(id = 3)
    public final Bundle Z;
    @SafeParcelable.Field(id = 5)
    public final List Z0;
    @SafeParcelable.Field(id = 6)
    public final boolean a1;
    @SafeParcelable.Field(id = 7)
    public final int b1;
    @SafeParcelable.Field(id = 8)
    public final boolean c1;
    @SafeParcelable.Field(id = 9)
    public final String d1;
    @SafeParcelable.Field(id = 10)
    public final zzft e1;
    @SafeParcelable.Field(id = 11)
    public final Location f1;
    @SafeParcelable.Field(id = 12)
    public final String g1;
    @SafeParcelable.Field(id = 13)
    public final Bundle h1;
    @SafeParcelable.Field(id = 14)
    public final Bundle i1;
    @SafeParcelable.Field(id = 15)
    public final List j1;
    @SafeParcelable.Field(id = 16)
    public final String k1;
    @SafeParcelable.Field(id = 17)
    public final String l1;
    @SafeParcelable.Field(id = 18)
    @Deprecated
    public final boolean m1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 19)
    public final zzc n1;
    @SafeParcelable.Field(id = 20)
    public final int o1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 21)
    public final String p1;
    @SafeParcelable.Field(id = 22)
    public final List q1;
    @SafeParcelable.Field(id = 23)
    public final int r1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 24)
    public final String s1;
    @SafeParcelable.Field(id = 25)
    public final int t1;
    @SafeParcelable.Field(id = 26)
    public final long u1;

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) Bundle bundle, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) int i3, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) String str, @SafeParcelable.Param(id = 10) zzft zzftVar, @SafeParcelable.Param(id = 11) Location location, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 13) Bundle bundle2, @SafeParcelable.Param(id = 14) Bundle bundle3, @SafeParcelable.Param(id = 15) List list2, @SafeParcelable.Param(id = 16) String str3, @SafeParcelable.Param(id = 17) String str4, @SafeParcelable.Param(id = 18) boolean z3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 19) zzc zzcVar, @SafeParcelable.Param(id = 20) int i4, @InterfaceC11300zs1 @SafeParcelable.Param(id = 21) String str5, @SafeParcelable.Param(id = 22) List list3, @SafeParcelable.Param(id = 23) int i5, @InterfaceC11300zs1 @SafeParcelable.Param(id = 24) String str6, @SafeParcelable.Param(id = 25) int i6, @SafeParcelable.Param(id = 26) long j2) {
        this.X = i;
        this.Y = j;
        this.Z = bundle == null ? new Bundle() : bundle;
        this.Y0 = i2;
        this.Z0 = list;
        this.a1 = z;
        this.b1 = i3;
        this.c1 = z2;
        this.d1 = str;
        this.e1 = zzftVar;
        this.f1 = location;
        this.g1 = str2;
        this.h1 = bundle2 == null ? new Bundle() : bundle2;
        this.i1 = bundle3;
        this.j1 = list2;
        this.k1 = str3;
        this.l1 = str4;
        this.m1 = z3;
        this.n1 = zzcVar;
        this.o1 = i4;
        this.p1 = str5;
        this.q1 = list3 == null ? new ArrayList() : list3;
        this.r1 = i5;
        this.s1 = str6;
        this.t1 = i6;
        this.u1 = j2;
    }

    public final boolean B0() {
        return this.Z.getBoolean("is_sdk_preload", false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        if (!m0(obj) || this.u1 != zzmVar.u1) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.c(Integer.valueOf(this.X), Long.valueOf(this.Y), this.Z, Integer.valueOf(this.Y0), this.Z0, Boolean.valueOf(this.a1), Integer.valueOf(this.b1), Boolean.valueOf(this.c1), this.d1, this.e1, this.f1, this.g1, this.h1, this.i1, this.j1, this.k1, this.l1, Boolean.valueOf(this.m1), Integer.valueOf(this.o1), this.p1, this.q1, Integer.valueOf(this.r1), this.s1, Integer.valueOf(this.t1), Long.valueOf(this.u1));
    }

    public final boolean m0(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        if (this.X != zzmVar.X || this.Y != zzmVar.Y || !com.google.android.gms.ads.internal.util.client.zzp.a(this.Z, zzmVar.Z) || this.Y0 != zzmVar.Y0 || !Objects.b(this.Z0, zzmVar.Z0) || this.a1 != zzmVar.a1 || this.b1 != zzmVar.b1 || this.c1 != zzmVar.c1 || !Objects.b(this.d1, zzmVar.d1) || !Objects.b(this.e1, zzmVar.e1) || !Objects.b(this.f1, zzmVar.f1) || !Objects.b(this.g1, zzmVar.g1) || !com.google.android.gms.ads.internal.util.client.zzp.a(this.h1, zzmVar.h1) || !com.google.android.gms.ads.internal.util.client.zzp.a(this.i1, zzmVar.i1) || !Objects.b(this.j1, zzmVar.j1) || !Objects.b(this.k1, zzmVar.k1) || !Objects.b(this.l1, zzmVar.l1) || this.m1 != zzmVar.m1 || this.o1 != zzmVar.o1 || !Objects.b(this.p1, zzmVar.p1) || !Objects.b(this.q1, zzmVar.q1) || this.r1 != zzmVar.r1 || !Objects.b(this.s1, zzmVar.s1) || this.t1 != zzmVar.t1) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.K(parcel, 2, this.Y);
        SafeParcelWriter.k(parcel, 3, this.Z, false);
        SafeParcelWriter.F(parcel, 4, this.Y0);
        SafeParcelWriter.a0(parcel, 5, this.Z0, false);
        SafeParcelWriter.g(parcel, 6, this.a1);
        SafeParcelWriter.F(parcel, 7, this.b1);
        SafeParcelWriter.g(parcel, 8, this.c1);
        SafeParcelWriter.Y(parcel, 9, this.d1, false);
        SafeParcelWriter.S(parcel, 10, this.e1, i, false);
        SafeParcelWriter.S(parcel, 11, this.f1, i, false);
        SafeParcelWriter.Y(parcel, 12, this.g1, false);
        SafeParcelWriter.k(parcel, 13, this.h1, false);
        SafeParcelWriter.k(parcel, 14, this.i1, false);
        SafeParcelWriter.a0(parcel, 15, this.j1, false);
        SafeParcelWriter.Y(parcel, 16, this.k1, false);
        SafeParcelWriter.Y(parcel, 17, this.l1, false);
        SafeParcelWriter.g(parcel, 18, this.m1);
        SafeParcelWriter.S(parcel, 19, this.n1, i, false);
        SafeParcelWriter.F(parcel, 20, this.o1);
        SafeParcelWriter.Y(parcel, 21, this.p1, false);
        SafeParcelWriter.a0(parcel, 22, this.q1, false);
        SafeParcelWriter.F(parcel, 23, this.r1);
        SafeParcelWriter.Y(parcel, 24, this.s1, false);
        SafeParcelWriter.F(parcel, 25, this.t1);
        SafeParcelWriter.K(parcel, 26, this.u1);
        SafeParcelWriter.b(parcel, a);
    }
}

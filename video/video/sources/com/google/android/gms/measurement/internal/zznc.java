package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* loaded from: classes3.dex */
public final class zznc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznc> CREATOR = new zznb();
    @SafeParcelable.Field(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final String Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 4)
    public final Long Y0;
    @SafeParcelable.Field(id = 3)
    public final long Z;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 5)
    public final Float Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 6)
    public final String a1;
    @SafeParcelable.Field(id = 7)
    public final String b1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 8)
    public final Double c1;

    public zznc(zzne zzneVar) {
        this(zzneVar.c, zzneVar.d, zzneVar.e, zzneVar.b);
    }

    @InterfaceC11300zs1
    public final Object m0() {
        Long l = this.Y0;
        if (l != null) {
            return l;
        }
        Double d = this.c1;
        if (d != null) {
            return d;
        }
        String str = this.a1;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.K(parcel, 3, this.Z);
        SafeParcelWriter.N(parcel, 4, this.Y0, false);
        SafeParcelWriter.z(parcel, 5, null, false);
        SafeParcelWriter.Y(parcel, 6, this.a1, false);
        SafeParcelWriter.Y(parcel, 7, this.b1, false);
        SafeParcelWriter.u(parcel, 8, this.c1, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zznc(String str, long j, @InterfaceC11300zs1 Object obj, String str2) {
        Preconditions.l(str);
        this.X = 2;
        this.Y = str;
        this.Z = j;
        this.b1 = str2;
        if (obj == null) {
            this.Y0 = null;
            this.Z0 = null;
            this.c1 = null;
            this.a1 = null;
        } else if (obj instanceof Long) {
            this.Y0 = (Long) obj;
            this.Z0 = null;
            this.c1 = null;
            this.a1 = null;
        } else if (obj instanceof String) {
            this.Y0 = null;
            this.Z0 = null;
            this.c1 = null;
            this.a1 = (String) obj;
        } else if (obj instanceof Double) {
            this.Y0 = null;
            this.Z0 = null;
            this.c1 = (Double) obj;
            this.a1 = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    @SafeParcelable.Constructor
    public zznc(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) Float f, @InterfaceC11300zs1 @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 8) Double d) {
        this.X = i;
        this.Y = str;
        this.Z = j;
        this.Y0 = l;
        this.Z0 = null;
        if (i == 1) {
            this.c1 = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.c1 = d;
        }
        this.a1 = str2;
        this.b1 = str3;
    }
}

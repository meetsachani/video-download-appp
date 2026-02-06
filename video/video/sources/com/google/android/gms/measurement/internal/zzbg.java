package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new zzbf();
    @SafeParcelable.Field(id = 2)
    public final String X;
    @SafeParcelable.Field(id = 3)
    public final zzbb Y;
    @SafeParcelable.Field(id = 5)
    public final long Y0;
    @SafeParcelable.Field(id = 4)
    public final String Z;

    public zzbg(zzbg zzbgVar, long j) {
        Preconditions.r(zzbgVar);
        this.X = zzbgVar.X;
        this.Y = zzbgVar.Y;
        this.Z = zzbgVar.Z;
        this.Y0 = j;
    }

    public final String toString() {
        String str = this.Z;
        String str2 = this.X;
        String valueOf = String.valueOf(this.Y);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 2, this.X, false);
        SafeParcelWriter.S(parcel, 3, this.Y, i, false);
        SafeParcelWriter.Y(parcel, 4, this.Z, false);
        SafeParcelWriter.K(parcel, 5, this.Y0);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzbg(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzbb zzbbVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j) {
        this.X = str;
        this.Y = zzbbVar;
        this.Z = str2;
        this.Y0 = j;
    }
}

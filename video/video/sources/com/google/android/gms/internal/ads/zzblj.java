package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HttpResponseParcelCreator")
/* loaded from: classes2.dex */
public final class zzblj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblj> CREATOR = new zzblk();
    @SafeParcelable.Field(id = 1)
    public final boolean X;
    @SafeParcelable.Field(id = 2)
    public final String Y;
    @SafeParcelable.Field(id = 4)
    public final byte[] Y0;
    @SafeParcelable.Field(id = 3)
    public final int Z;
    @SafeParcelable.Field(id = 5)
    public final String[] Z0;
    @SafeParcelable.Field(id = 6)
    public final String[] a1;
    @SafeParcelable.Field(id = 7)
    public final boolean b1;
    @SafeParcelable.Field(id = 8)
    public final long c1;

    @SafeParcelable.Constructor
    public zzblj(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) String[] strArr, @SafeParcelable.Param(id = 6) String[] strArr2, @SafeParcelable.Param(id = 7) boolean z2, @SafeParcelable.Param(id = 8) long j) {
        this.X = z;
        this.Y = str;
        this.Z = i;
        this.Y0 = bArr;
        this.Z0 = strArr;
        this.a1 = strArr2;
        this.b1 = z2;
        this.c1 = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 1, z);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.m(parcel, 4, this.Y0, false);
        SafeParcelWriter.Z(parcel, 5, this.Z0, false);
        SafeParcelWriter.Z(parcel, 6, this.a1, false);
        SafeParcelWriter.g(parcel, 7, this.b1);
        SafeParcelWriter.K(parcel, 8, this.c1);
        SafeParcelWriter.b(parcel, a);
    }
}

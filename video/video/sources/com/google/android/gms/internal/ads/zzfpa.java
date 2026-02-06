package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassEventParcelCreator")
/* loaded from: classes2.dex */
public final class zzfpa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpa> CREATOR = new zzfpb();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final byte[] Y;

    @SafeParcelable.Constructor
    public zzfpa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.X = i;
        this.Y = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.m(parcel, 2, this.Y, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zzfpa(byte[] bArr) {
        this(1, bArr);
    }
}

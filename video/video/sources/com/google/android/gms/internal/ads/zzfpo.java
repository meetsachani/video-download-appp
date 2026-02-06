package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "ProgramResponseCreator")
/* loaded from: classes2.dex */
public final class zzfpo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpo> CREATOR = new zzfpp();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final byte[] Y;
    @SafeParcelable.Field(id = 3)
    public final int Z;

    @SafeParcelable.Constructor
    public zzfpo(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) int i2) {
        this.X = i;
        this.Y = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.Z = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.m(parcel, 2, this.Y, false);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.b(parcel, a);
    }

    public zzfpo(byte[] bArr, int i) {
        this(1, null, 1);
    }
}

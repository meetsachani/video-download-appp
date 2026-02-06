package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ProgramRequestCreator")
/* loaded from: classes2.dex */
public final class zzfpm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpm> CREATOR = new zzfpn();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final int Y;
    @SafeParcelable.Field(id = 4)
    public final String Y0;
    @SafeParcelable.Field(id = 3)
    public final String Z;
    @SafeParcelable.Field(id = 5)
    public final int Z0;

    @SafeParcelable.Constructor
    public zzfpm(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        this.X = i;
        this.Y = i2;
        this.Z = str;
        this.Y0 = str2;
        this.Z0 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.Y(parcel, 3, this.Z, false);
        SafeParcelWriter.Y(parcel, 4, this.Y0, false);
        SafeParcelWriter.F(parcel, 5, this.Z0);
        SafeParcelWriter.b(parcel, a);
    }

    public zzfpm(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }
}

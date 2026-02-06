package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassRequestParcelCreator")
/* loaded from: classes2.dex */
public final class zzfpd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpd> CREATOR = new zzfpe();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final String Y;
    @SafeParcelable.Field(id = 3)
    public final String Z;

    @SafeParcelable.Constructor
    public zzfpd(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.X = i;
        this.Y = str;
        this.Z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.Y(parcel, 3, this.Z, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zzfpd(String str, String str2) {
        this(1, str, str2);
    }
}

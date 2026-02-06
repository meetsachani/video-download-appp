package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdapterStatusParcelCreator")
/* loaded from: classes2.dex */
public final class zzblu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblu> CREATOR = new zzblv();
    @SafeParcelable.Field(id = 1)
    public final String X;
    @SafeParcelable.Field(id = 2)
    public final boolean Y;
    @SafeParcelable.Field(id = 4)
    public final String Y0;
    @SafeParcelable.Field(id = 3)
    public final int Z;

    @SafeParcelable.Constructor
    public zzblu(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) String str2) {
        this.X = str;
        this.Y = z;
        this.Z = i;
        this.Y0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.g(parcel, 2, this.Y);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.Y(parcel, 4, this.Y0, false);
        SafeParcelWriter.b(parcel, a);
    }
}

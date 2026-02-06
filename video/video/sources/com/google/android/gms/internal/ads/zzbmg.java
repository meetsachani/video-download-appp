package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
/* loaded from: classes2.dex */
public final class zzbmg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbmg> CREATOR = new zzbmh();
    @SafeParcelable.VersionField(id = 1000)
    public final int X;
    @SafeParcelable.Field(id = 1)
    public final int Y;
    @SafeParcelable.Field(id = 3)
    public final int Y0;
    @SafeParcelable.Field(id = 2)
    public final String Z;

    @SafeParcelable.Constructor
    public zzbmg(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i3) {
        this.X = i;
        this.Y = i2;
        this.Z = str;
        this.Y0 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.Y;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.Y(parcel, 2, this.Z, false);
        SafeParcelWriter.F(parcel, 3, this.Y0);
        SafeParcelWriter.F(parcel, 1000, this.X);
        SafeParcelWriter.b(parcel, a);
    }
}

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InterstitialAdParameterParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    @SafeParcelable.Field(id = 2)
    public final boolean X;
    @SafeParcelable.Field(id = 3)
    public final boolean Y;
    @SafeParcelable.Field(id = 5)
    public final boolean Y0;
    @SafeParcelable.Field(id = 4)
    public final String Z;
    @SafeParcelable.Field(id = 6)
    public final float Z0;
    @SafeParcelable.Field(id = 7)
    public final int a1;
    @SafeParcelable.Field(id = 8)
    public final boolean b1;
    @SafeParcelable.Field(id = 9)
    public final boolean c1;
    @SafeParcelable.Field(id = 10)
    public final boolean d1;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) boolean z5, @SafeParcelable.Param(id = 10) boolean z6) {
        this.X = z;
        this.Y = z2;
        this.Z = str;
        this.Y0 = z3;
        this.Z0 = f;
        this.a1 = i;
        this.b1 = z4;
        this.c1 = z5;
        this.d1 = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 2, z);
        SafeParcelWriter.g(parcel, 3, this.Y);
        SafeParcelWriter.Y(parcel, 4, this.Z, false);
        SafeParcelWriter.g(parcel, 5, this.Y0);
        SafeParcelWriter.w(parcel, 6, this.Z0);
        SafeParcelWriter.F(parcel, 7, this.a1);
        SafeParcelWriter.g(parcel, 8, this.b1);
        SafeParcelWriter.g(parcel, 9, this.c1);
        SafeParcelWriter.g(parcel, 10, this.d1);
        SafeParcelWriter.b(parcel, a);
    }

    public zzl(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}

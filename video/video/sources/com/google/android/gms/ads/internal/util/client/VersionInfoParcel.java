package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.C2638Cg0;
import o.InterfaceC5670cr1;
import o.UE;

@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 2)
    public String X;
    @SafeParcelable.Field(id = 3)
    public int Y;
    @SafeParcelable.Field(id = 5)
    public boolean Y0;
    @SafeParcelable.Field(id = 4)
    public int Z;
    @SafeParcelable.Field(id = 6)
    public boolean Z0;

    public VersionInfoParcel(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    @InterfaceC5670cr1
    public static VersionInfoParcel m0() {
        return new VersionInfoParcel(GooglePlayServicesUtilLight.a, GooglePlayServicesUtilLight.a, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 2, this.X, false);
        SafeParcelWriter.F(parcel, 3, this.Y);
        SafeParcelWriter.F(parcel, 4, this.Z);
        SafeParcelWriter.g(parcel, 5, this.Y0);
        SafeParcelWriter.g(parcel, 6, this.Z0);
        SafeParcelWriter.b(parcel, a);
    }

    public VersionInfoParcel(int i, int i2, boolean z, boolean z2) {
        this(i, i2, z, false, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VersionInfoParcel(int i, int i2, boolean z, boolean z2, boolean z3) {
        this("afma-sdk-a-v" + i + UE.h + i2 + UE.h + r12, i, i2, z, z3);
        String str;
        if (z) {
            str = "0";
        } else {
            str = z2 ? C2638Cg0.Y4 : "1";
        }
    }

    @SafeParcelable.Constructor
    public VersionInfoParcel(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.X = str;
        this.Y = i;
        this.Z = i2;
        this.Y0 = z;
        this.Z0 = z2;
    }
}

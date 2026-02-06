package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC10571ws1;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field(getter = "getResult", id = 1)
    public final boolean X;
    @SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    @InterfaceC10571ws1
    public final String Y;
    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", id = 4)
    public final int Y0;
    @SafeParcelable.Field(getter = "getStatusValue", id = 3)
    public final int Z;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2) {
        this.X = z;
        this.Y = str;
        this.Z = zzy.a(i) - 1;
        this.Y0 = zzd.a(i2) - 1;
    }

    public final boolean B0() {
        return this.X;
    }

    public final int E0() {
        return zzd.a(this.Y0);
    }

    public final int G0() {
        return zzy.a(this.Z);
    }

    @InterfaceC10571ws1
    public final String m0() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 1, this.X);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.F(parcel, 4, this.Y0);
        SafeParcelWriter.b(parcel, a);
    }
}

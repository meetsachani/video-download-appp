package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import o.InterfaceC5940dy1;
import o.UE;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "RtbVersionInfoParcelCreator")
/* loaded from: classes2.dex */
public final class zzbrz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrz> CREATOR = new zzbsa();
    @SafeParcelable.Field(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final int Y;
    @SafeParcelable.Field(id = 3)
    public final int Z;

    @SafeParcelable.Constructor
    public zzbrz(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
    }

    public static zzbrz m0(VersionInfo versionInfo) {
        return new zzbrz(versionInfo.a(), versionInfo.c(), versionInfo.b());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbrz)) {
            zzbrz zzbrzVar = (zzbrz) obj;
            if (zzbrzVar.Z == this.Z && zzbrzVar.Y == this.Y && zzbrzVar.X == this.X) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.X, this.Y, this.Z});
    }

    public final String toString() {
        return this.X + UE.h + this.Y + UE.h + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.b(parcel, a);
    }
}

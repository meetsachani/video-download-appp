package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "PreloadConfigurationParcelCreator")
/* loaded from: classes2.dex */
public final class zzfp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfp> CREATOR = new zzfq();
    @SafeParcelable.Field(id = 1)
    public final String X;
    @SafeParcelable.Field(id = 2)
    public final int Y;
    @SafeParcelable.Field(id = 4)
    public final int Y0;
    @SafeParcelable.Field(id = 3)
    public final zzm Z;

    @SafeParcelable.Constructor
    public zzfp(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) zzm zzmVar, @SafeParcelable.Param(id = 4) int i2) {
        this.X = str;
        this.Y = i;
        this.Z = zzmVar;
        this.Y0 = i2;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfp) {
            zzfp zzfpVar = (zzfp) obj;
            if (this.X.equals(zzfpVar.X) && this.Y == zzfpVar.Y && this.Z.m0(zzfpVar.Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.X, Integer.valueOf(this.Y), this.Z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.S(parcel, 3, this.Z, i, false);
        SafeParcelWriter.F(parcel, 4, this.Y0);
        SafeParcelWriter.b(parcel, a);
    }
}

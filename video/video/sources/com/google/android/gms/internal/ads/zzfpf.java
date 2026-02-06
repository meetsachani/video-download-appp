package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes2.dex */
public final class zzfpf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpf> CREATOR = new zzfpg();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = a0.v)
    public zzath Y = null;
    public byte[] Z;

    @SafeParcelable.Constructor
    public zzfpf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.X = i;
        this.Z = bArr;
        b();
    }

    public final void b() {
        zzath zzathVar = this.Y;
        if (zzathVar != null || this.Z == null) {
            if (zzathVar != null && this.Z == null) {
                return;
            }
            if (zzathVar != null && this.Z != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (zzathVar == null && this.Z == null) {
                throw new IllegalStateException("Invalid internal representation - empty");
            }
            throw new IllegalStateException("Impossible");
        }
    }

    public final zzath m0() {
        if (this.Y == null) {
            try {
                this.Y = zzath.i3(this.Z, zzgyc.a());
                this.Z = null;
            } catch (zzgzh | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        b();
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        byte[] bArr = this.Z;
        if (bArr == null) {
            bArr = this.Y.b1();
        }
        SafeParcelWriter.m(parcel, 2, bArr, false);
        SafeParcelWriter.b(parcel, a);
    }
}

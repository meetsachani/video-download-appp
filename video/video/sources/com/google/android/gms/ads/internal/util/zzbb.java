package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzfdq;
import com.google.android.gms.internal.ads.zzfvt;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "ExceptionParcelCreator")
/* loaded from: classes2.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    @SafeParcelable.Field(id = 1)
    public final String X;
    @SafeParcelable.Field(id = 2)
    public final int Y;

    @SafeParcelable.Constructor
    public zzbb(@InterfaceC11300zs1 @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i) {
        this.X = str == null ? "" : str;
        this.Y = i;
    }

    public static zzbb B0(Throwable th) {
        String message;
        com.google.android.gms.ads.internal.client.zze a = zzfdq.a(th);
        if (zzfvt.d(th.getMessage())) {
            message = a.Y;
        } else {
            message = th.getMessage();
        }
        return new zzbb(message, a.X);
    }

    public final zzba m0() {
        return new zzba(this.X, this.Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.b(parcel, a);
    }
}

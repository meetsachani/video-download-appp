package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzbf implements Parcelable.Creator<zzbg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbg createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        String str = null;
        zzbb zzbbVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 2) {
                if (O != 3) {
                    if (O != 4) {
                        if (O != 5) {
                            SafeParcelReader.h0(parcel, X);
                        } else {
                            j = SafeParcelReader.c0(parcel, X);
                        }
                    } else {
                        str2 = SafeParcelReader.G(parcel, X);
                    }
                } else {
                    zzbbVar = (zzbb) SafeParcelReader.C(parcel, X, zzbb.CREATOR);
                }
            } else {
                str = SafeParcelReader.G(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbg(str, zzbbVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbg[] newArray(int i) {
        return new zzbg[i];
    }
}

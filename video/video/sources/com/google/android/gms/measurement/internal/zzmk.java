package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzmk implements Parcelable.Creator<zzmh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmh createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        SafeParcelReader.h0(parcel, X);
                    } else {
                        i = SafeParcelReader.Z(parcel, X);
                    }
                } else {
                    j = SafeParcelReader.c0(parcel, X);
                }
            } else {
                str = SafeParcelReader.G(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzmh(str, j, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmh[] newArray(int i) {
        return new zzmh[i];
    }
}

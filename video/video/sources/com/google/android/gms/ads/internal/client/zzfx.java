package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzfx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 2) {
                if (O != 3) {
                    if (O != 4) {
                        SafeParcelReader.h0(parcel, X);
                    } else {
                        z3 = SafeParcelReader.P(parcel, X);
                    }
                } else {
                    z2 = SafeParcelReader.P(parcel, X);
                }
            } else {
                z = SafeParcelReader.P(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzfw(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfw[i];
    }
}

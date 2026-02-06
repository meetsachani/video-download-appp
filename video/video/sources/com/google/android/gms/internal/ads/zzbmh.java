package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbmh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        if (O != 1000) {
                            SafeParcelReader.h0(parcel, X);
                        } else {
                            i = SafeParcelReader.Z(parcel, X);
                        }
                    } else {
                        i2 = SafeParcelReader.Z(parcel, X);
                    }
                } else {
                    str = SafeParcelReader.G(parcel, X);
                }
            } else {
                i3 = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbmg(i, i3, str, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbmg[i];
    }
}

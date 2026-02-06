package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzfpn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        if (O != 4) {
                            if (O != 5) {
                                SafeParcelReader.h0(parcel, X);
                            } else {
                                i3 = SafeParcelReader.Z(parcel, X);
                            }
                        } else {
                            str2 = SafeParcelReader.G(parcel, X);
                        }
                    } else {
                        str = SafeParcelReader.G(parcel, X);
                    }
                } else {
                    i2 = SafeParcelReader.Z(parcel, X);
                }
            } else {
                i = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzfpm(i, i2, i3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfpm[i];
    }
}

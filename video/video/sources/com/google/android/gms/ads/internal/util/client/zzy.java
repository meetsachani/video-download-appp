package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 2) {
                if (O != 3) {
                    if (O != 4) {
                        if (O != 5) {
                            if (O != 6) {
                                SafeParcelReader.h0(parcel, X);
                            } else {
                                z2 = SafeParcelReader.P(parcel, X);
                            }
                        } else {
                            z = SafeParcelReader.P(parcel, X);
                        }
                    } else {
                        i2 = SafeParcelReader.Z(parcel, X);
                    }
                } else {
                    i = SafeParcelReader.Z(parcel, X);
                }
            } else {
                str = SafeParcelReader.G(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new VersionInfoParcel(str, i, i2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VersionInfoParcel[i];
    }
}

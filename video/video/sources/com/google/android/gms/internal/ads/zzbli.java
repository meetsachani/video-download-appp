package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbli implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        SafeParcelReader.h0(parcel, X);
                    } else {
                        strArr2 = SafeParcelReader.H(parcel, X);
                    }
                } else {
                    strArr = SafeParcelReader.H(parcel, X);
                }
            } else {
                str = SafeParcelReader.G(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzblh(str, strArr, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzblh[i];
    }
}

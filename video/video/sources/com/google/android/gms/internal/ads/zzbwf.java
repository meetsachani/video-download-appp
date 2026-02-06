package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbwf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        String str = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 2) {
                if (O != 3) {
                    SafeParcelReader.h0(parcel, X);
                } else {
                    str = SafeParcelReader.G(parcel, X);
                }
            } else {
                zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.C(parcel, X, com.google.android.gms.ads.internal.client.zzm.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbwe(zzmVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbwe[i];
    }
}

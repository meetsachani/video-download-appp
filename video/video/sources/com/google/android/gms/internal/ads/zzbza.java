package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        String str = null;
        String str2 = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 2:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 3:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) SafeParcelReader.C(parcel, X, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 4:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.C(parcel, X, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 5:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 6:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbyz(str, str2, zzrVar, zzmVar, i, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbyz[i];
    }
}

package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        String str = null;
        zze zzeVar = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 2:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
                case 3:
                    zzeVar = (zze) SafeParcelReader.C(parcel, X, zze.CREATOR);
                    break;
                case 4:
                    bundle = SafeParcelReader.g(parcel, X);
                    break;
                case 5:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 6:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 7:
                    str4 = SafeParcelReader.G(parcel, X);
                    break;
                case 8:
                    str5 = SafeParcelReader.G(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzv(str, j, zzeVar, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzv[i];
    }
}

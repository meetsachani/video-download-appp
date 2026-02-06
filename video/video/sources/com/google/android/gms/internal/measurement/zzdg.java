package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzdg implements Parcelable.Creator<zzdd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
                case 2:
                    j2 = SafeParcelReader.c0(parcel, X);
                    break;
                case 3:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 4:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 5:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 6:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 7:
                    bundle = SafeParcelReader.g(parcel, X);
                    break;
                case 8:
                    str4 = SafeParcelReader.G(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzdd(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd[] newArray(int i) {
        return new zzdd[i];
    }
}

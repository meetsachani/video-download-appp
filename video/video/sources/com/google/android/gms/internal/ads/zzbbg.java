package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 2:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 3:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
                case 4:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 5:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 6:
                    str4 = SafeParcelReader.G(parcel, X);
                    break;
                case 7:
                    bundle = SafeParcelReader.g(parcel, X);
                    break;
                case 8:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 9:
                    j2 = SafeParcelReader.c0(parcel, X);
                    break;
                case 10:
                    str5 = SafeParcelReader.G(parcel, X);
                    break;
                case 11:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbbf(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbbf[i];
    }
}

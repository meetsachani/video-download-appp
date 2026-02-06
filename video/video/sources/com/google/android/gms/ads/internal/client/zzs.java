package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        String str = null;
        zzr[] zzrVarArr = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 2:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 3:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 4:
                    i2 = SafeParcelReader.Z(parcel, X);
                    break;
                case 5:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 6:
                    i3 = SafeParcelReader.Z(parcel, X);
                    break;
                case 7:
                    i4 = SafeParcelReader.Z(parcel, X);
                    break;
                case 8:
                    zzrVarArr = (zzr[]) SafeParcelReader.K(parcel, X, zzr.CREATOR);
                    break;
                case 9:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 10:
                    z3 = SafeParcelReader.P(parcel, X);
                    break;
                case 11:
                    z4 = SafeParcelReader.P(parcel, X);
                    break;
                case 12:
                    z5 = SafeParcelReader.P(parcel, X);
                    break;
                case 13:
                    z6 = SafeParcelReader.P(parcel, X);
                    break;
                case 14:
                    z7 = SafeParcelReader.P(parcel, X);
                    break;
                case 15:
                    z8 = SafeParcelReader.P(parcel, X);
                    break;
                case 16:
                    z9 = SafeParcelReader.P(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzr(str, i, i2, z, i3, i4, zzrVarArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}

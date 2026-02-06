package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzag implements Parcelable.Creator<zzad> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        String str = null;
        String str2 = null;
        zznc zzncVar = null;
        String str3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 2:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 3:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 4:
                    zzncVar = (zznc) SafeParcelReader.C(parcel, X, zznc.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
                case 6:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 7:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 8:
                    zzbgVar = (zzbg) SafeParcelReader.C(parcel, X, zzbg.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.c0(parcel, X);
                    break;
                case 10:
                    zzbgVar2 = (zzbg) SafeParcelReader.C(parcel, X, zzbg.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.c0(parcel, X);
                    break;
                case 12:
                    zzbgVar3 = (zzbg) SafeParcelReader.C(parcel, X, zzbg.CREATOR);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzad(str, str2, zzncVar, j, z, str3, zzbgVar, j2, zzbgVar2, j3, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad[] newArray(int i) {
        return new zzad[i];
    }
}

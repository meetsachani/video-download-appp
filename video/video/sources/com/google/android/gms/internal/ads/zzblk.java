package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzblk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 2:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 3:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 4:
                    bArr = SafeParcelReader.h(parcel, X);
                    break;
                case 5:
                    strArr = SafeParcelReader.H(parcel, X);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.H(parcel, X);
                    break;
                case 7:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 8:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzblj(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzblj[i];
    }
}

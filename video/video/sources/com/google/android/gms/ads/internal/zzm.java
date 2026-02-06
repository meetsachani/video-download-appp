package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        float f = 0.0f;
        String str = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 2:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 3:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 4:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 5:
                    z3 = SafeParcelReader.P(parcel, X);
                    break;
                case 6:
                    f = SafeParcelReader.V(parcel, X);
                    break;
                case 7:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 8:
                    z4 = SafeParcelReader.P(parcel, X);
                    break;
                case 9:
                    z5 = SafeParcelReader.P(parcel, X);
                    break;
                case 10:
                    z6 = SafeParcelReader.P(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzl(z, z2, str, z3, f, i, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}

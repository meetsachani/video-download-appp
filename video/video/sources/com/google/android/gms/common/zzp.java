package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 2:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 3:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 4:
                    iBinder = SafeParcelReader.Y(parcel, X);
                    break;
                case 5:
                    z3 = SafeParcelReader.P(parcel, X);
                    break;
                case 6:
                    z4 = SafeParcelReader.P(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzo(str, z, z2, iBinder, z3, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}

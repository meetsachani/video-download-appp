package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbmf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    SafeParcelReader.h0(parcel, X);
                } else {
                    bundle = SafeParcelReader.g(parcel, X);
                }
            } else {
                str = SafeParcelReader.G(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbme(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbme[i];
    }
}

package com.google.android.gms.ads.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        boolean z = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X) != 1) {
                SafeParcelReader.h0(parcel, X);
            } else {
                z = SafeParcelReader.P(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new AdManagerAdViewOptions(z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdManagerAdViewOptions[i];
    }
}

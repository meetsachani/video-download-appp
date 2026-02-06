package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        IBinder iBinder = null;
        boolean z = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        SafeParcelReader.h0(parcel, X);
                    } else {
                        iBinder2 = SafeParcelReader.Y(parcel, X);
                    }
                } else {
                    iBinder = SafeParcelReader.Y(parcel, X);
                }
            } else {
                z = SafeParcelReader.P(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new PublisherAdViewOptions(z, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}

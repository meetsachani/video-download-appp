package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbvk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X) != 2) {
                SafeParcelReader.h0(parcel, X);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.C(parcel, X, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbvj(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbvj[i];
    }
}

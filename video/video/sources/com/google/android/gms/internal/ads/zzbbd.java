package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbbd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        long j = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 2) {
                if (O != 3) {
                    if (O != 4) {
                        if (O != 5) {
                            if (O != 6) {
                                SafeParcelReader.h0(parcel, X);
                            } else {
                                z3 = SafeParcelReader.P(parcel, X);
                            }
                        } else {
                            j = SafeParcelReader.c0(parcel, X);
                        }
                    } else {
                        z2 = SafeParcelReader.P(parcel, X);
                    }
                } else {
                    z = SafeParcelReader.P(parcel, X);
                }
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.C(parcel, X, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbbc(parcelFileDescriptor, z, z2, j, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbbc[i];
    }
}

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zaa implements Parcelable.Creator<ClientIdentity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClientIdentity createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    SafeParcelReader.h0(parcel, X);
                } else {
                    str = SafeParcelReader.G(parcel, X);
                }
            } else {
                i = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new ClientIdentity(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ClientIdentity[] newArray(int i) {
        return new ClientIdentity[i];
    }
}

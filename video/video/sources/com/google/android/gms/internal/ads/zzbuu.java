package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbuu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        ArrayList<String> arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 2) {
                if (O != 3) {
                    SafeParcelReader.h0(parcel, X);
                } else {
                    arrayList = SafeParcelReader.I(parcel, X);
                }
            } else {
                z = SafeParcelReader.P(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbut(z, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbut[i];
    }
}

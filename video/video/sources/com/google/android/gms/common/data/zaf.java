package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zaf implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        int i2 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        if (O != 4) {
                            if (O != 1000) {
                                SafeParcelReader.h0(parcel, X);
                            } else {
                                i = SafeParcelReader.Z(parcel, X);
                            }
                        } else {
                            bundle = SafeParcelReader.g(parcel, X);
                        }
                    } else {
                        i2 = SafeParcelReader.Z(parcel, X);
                    }
                } else {
                    cursorWindowArr = (CursorWindow[]) SafeParcelReader.K(parcel, X, CursorWindow.CREATOR);
                }
            } else {
                strArr = SafeParcelReader.H(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.M1();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}

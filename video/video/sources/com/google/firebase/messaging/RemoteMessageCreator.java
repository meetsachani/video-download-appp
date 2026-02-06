package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    public static final int a = 0;

    public static void c(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 2, remoteMessage.X, false);
        SafeParcelWriter.b(parcel, a2);
    }

    @Override // android.os.Parcelable.Creator
    @InterfaceC11300zs1
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X) != 2) {
                SafeParcelReader.h0(parcel, X);
            } else {
                bundle = SafeParcelReader.g(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    @InterfaceC11300zs1
    /* renamed from: b */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}

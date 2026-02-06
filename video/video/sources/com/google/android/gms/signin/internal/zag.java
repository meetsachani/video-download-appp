package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
/* loaded from: classes3.dex */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zah();
    @SafeParcelable.Field(getter = "getGrantedScopes", id = 1)
    public final List<String> X;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getToken", id = 2)
    public final String Y;

    @SafeParcelable.Constructor
    public zag(@SafeParcelable.Param(id = 1) List<String> list, @InterfaceC11300zs1 @SafeParcelable.Param(id = 2) String str) {
        this.X = list;
        this.Y = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status h() {
        if (this.Y != null) {
            return Status.a1;
        }
        return Status.e1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.a0(parcel, 1, this.X, false);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.b(parcel, a);
    }
}

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ValidateAccountRequestCreator")
@Deprecated
/* loaded from: classes2.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();
    @SafeParcelable.VersionField(id = 1)
    public final int X;

    @SafeParcelable.Constructor
    public zzak(@SafeParcelable.Param(id = 1) int i) {
        this.X = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.b(parcel, a);
    }
}

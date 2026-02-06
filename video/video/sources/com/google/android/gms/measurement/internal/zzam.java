package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConsentParcelCreator")
/* loaded from: classes3.dex */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new zzal();
    @SafeParcelable.Field(id = 1)
    public final Bundle X;

    @SafeParcelable.Constructor
    public zzam(@SafeParcelable.Param(id = 1) Bundle bundle) {
        this.X = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.X, false);
        SafeParcelWriter.b(parcel, a);
    }
}

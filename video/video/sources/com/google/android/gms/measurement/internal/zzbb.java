package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import o.W12;

@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzbb extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbd();
    @SafeParcelable.Field(getter = W12.r, id = 2)
    public final Bundle X;

    @SafeParcelable.Constructor
    public zzbb(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.X = bundle;
    }

    public final Double E0(String str) {
        return Double.valueOf(this.X.getDouble(str));
    }

    public final Bundle G0() {
        return new Bundle(this.X);
    }

    public final Long H0(String str) {
        return Long.valueOf(this.X.getLong(str));
    }

    public final Object I0(String str) {
        return this.X.get(str);
    }

    public final String O0(String str) {
        return this.X.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzbe(this);
    }

    public final int m0() {
        return this.X.size();
    }

    public final String toString() {
        return this.X.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 2, G0(), false);
        SafeParcelWriter.b(parcel, a);
    }
}

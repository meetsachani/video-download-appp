package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@SafeParcelable.Class(creator = "ScopeCreator")
/* loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<Scope> CREATOR = new zza();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getScopeUri", id = 2)
    public final String Y;

    @SafeParcelable.Constructor
    public Scope(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        Preconditions.m(str, "scopeUri must not be null or empty");
        this.X = i;
        this.Y = str;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.Y.equals(((Scope) obj).Y);
    }

    public int hashCode() {
        return this.Y.hashCode();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String m0() {
        return this.Y;
    }

    @InterfaceC5670cr1
    public String toString() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.Y(parcel, 2, m0(), false);
        SafeParcelWriter.b(parcel, a);
    }

    public Scope(@InterfaceC5670cr1 String str) {
        this(1, str);
    }
}

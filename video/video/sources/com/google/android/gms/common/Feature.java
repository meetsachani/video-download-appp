package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getName", id = 1)
    public final String X;
    @SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @Deprecated
    public final int Y;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", id = 3)
    public final long Z;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(id = 1) @InterfaceC5670cr1 String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) long j) {
        this.X = str;
        this.Y = i;
        this.Z = j;
    }

    @KeepForSdk
    public long B0() {
        long j = this.Z;
        return j == -1 ? this.Y : j;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((m0() != null && m0().equals(feature.m0())) || (m0() == null && feature.m0() == null)) && B0() == feature.B0()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.c(m0(), Long.valueOf(B0()));
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String m0() {
        return this.X;
    }

    @InterfaceC5670cr1
    public final String toString() {
        Objects.ToStringHelper d = Objects.d(this);
        d.a("name", m0());
        d.a("version", Long.valueOf(B0()));
        return d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, m0(), false);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.K(parcel, 3, B0());
        SafeParcelWriter.b(parcel, a);
    }

    @KeepForSdk
    public Feature(@InterfaceC5670cr1 String str, long j) {
        this.X = str;
        this.Z = j;
        this.Y = -1;
    }
}

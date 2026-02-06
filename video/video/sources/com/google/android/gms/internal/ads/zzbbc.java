package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbbc> CREATOR = new zzbbd();
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getContentFileDescriptor", id = 2)
    public ParcelFileDescriptor X;
    @SafeParcelable.Field(getter = "hasAdditionalMetadataFromReadV2", id = 3)
    public final boolean Y;
    @SafeParcelable.Field(getter = "getCachedBytes", id = 5)
    public final long Y0;
    @SafeParcelable.Field(getter = "isDownloaded", id = 4)
    public final boolean Z;
    @SafeParcelable.Field(getter = "isGcacheHit", id = 6)
    public final boolean Z0;

    public zzbbc() {
        this(null, false, false, 0L, false);
    }

    public final synchronized ParcelFileDescriptor B0() {
        return this.X;
    }

    @InterfaceC11300zs1
    public final synchronized InputStream E0() {
        if (this.X == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.X);
        this.X = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean G0() {
        return this.Y;
    }

    public final synchronized boolean H0() {
        return this.X != null;
    }

    public final synchronized boolean I0() {
        return this.Z;
    }

    public final synchronized boolean O0() {
        return this.Z0;
    }

    public final synchronized long m0() {
        return this.Y0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.S(parcel, 2, B0(), i, false);
        SafeParcelWriter.g(parcel, 3, G0());
        SafeParcelWriter.g(parcel, 4, I0());
        SafeParcelWriter.K(parcel, 5, m0());
        SafeParcelWriter.g(parcel, 6, O0());
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzbbc(@InterfaceC11300zs1 @SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) boolean z3) {
        this.X = parcelFileDescriptor;
        this.Y = z;
        this.Z = z2;
        this.Y0 = j;
        this.Z0 = z3;
    }
}

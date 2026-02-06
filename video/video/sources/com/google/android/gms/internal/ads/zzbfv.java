package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
/* loaded from: classes2.dex */
public final class zzbfv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfv> CREATOR = new zzbfw();
    @SafeParcelable.Field(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final boolean Y;
    @SafeParcelable.Field(id = 4)
    public final boolean Y0;
    @SafeParcelable.Field(id = 3)
    public final int Z;
    @SafeParcelable.Field(id = 5)
    public final int Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 6)
    public final com.google.android.gms.ads.internal.client.zzfw a1;
    @SafeParcelable.Field(id = 7)
    public final boolean b1;
    @SafeParcelable.Field(id = 8)
    public final int c1;
    @SafeParcelable.Field(id = 9)
    public final int d1;
    @SafeParcelable.Field(id = 10)
    public final boolean e1;
    @SafeParcelable.Field(id = 11)
    public final int f1;

    @SafeParcelable.Constructor
    public zzbfv(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) com.google.android.gms.ads.internal.client.zzfw zzfwVar, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) int i4, @SafeParcelable.Param(id = 9) int i5, @SafeParcelable.Param(id = 10) boolean z4, @SafeParcelable.Param(id = 11) int i6) {
        this.X = i;
        this.Y = z;
        this.Z = i2;
        this.Y0 = z2;
        this.Z0 = i3;
        this.a1 = zzfwVar;
        this.b1 = z3;
        this.c1 = i4;
        this.e1 = z4;
        this.d1 = i5;
        this.f1 = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1 == 1) goto L15;
     */
    @InterfaceC5670cr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NativeAdOptions m0(@InterfaceC11300zs1 zzbfv zzbfvVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbfvVar == null) {
            return builder.a();
        }
        int i = zzbfvVar.X;
        int i2 = 2;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.e(zzbfvVar.b1);
                    builder.d(zzbfvVar.c1);
                    builder.b(zzbfvVar.d1, zzbfvVar.e1);
                    int i3 = zzbfvVar.f1;
                    if (i3 != 0) {
                        if (i3 == 2) {
                            i2 = 3;
                        }
                        builder.q(i2);
                    }
                    i2 = 1;
                    builder.q(i2);
                }
                builder.g(zzbfvVar.Y);
                builder.f(zzbfvVar.Y0);
                return builder.a();
            }
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbfvVar.a1;
            if (zzfwVar != null) {
                builder.h(new VideoOptions(zzfwVar));
            }
        }
        builder.c(zzbfvVar.Z0);
        builder.g(zzbfvVar.Y);
        builder.f(zzbfvVar.Y0);
        return builder.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.g(parcel, 2, this.Y);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.g(parcel, 4, this.Y0);
        SafeParcelWriter.F(parcel, 5, this.Z0);
        SafeParcelWriter.S(parcel, 6, this.a1, i, false);
        SafeParcelWriter.g(parcel, 7, this.b1);
        SafeParcelWriter.F(parcel, 8, this.c1);
        SafeParcelWriter.F(parcel, 9, this.d1);
        SafeParcelWriter.g(parcel, 10, this.e1);
        SafeParcelWriter.F(parcel, 11, this.f1);
        SafeParcelWriter.b(parcel, a);
    }

    @Deprecated
    public zzbfv(@InterfaceC5670cr1 com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.f(), nativeAdOptions.b(), nativeAdOptions.e(), nativeAdOptions.a(), nativeAdOptions.d() != null ? new com.google.android.gms.ads.internal.client.zzfw(nativeAdOptions.d()) : null, nativeAdOptions.g(), nativeAdOptions.c(), 0, false, 0);
    }
}

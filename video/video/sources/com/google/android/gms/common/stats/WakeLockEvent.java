package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
/* loaded from: classes2.dex */
public final class WakeLockEvent extends StatsEvent {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    public final long Y;
    @SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    public final String Y0;
    @SafeParcelable.Field(getter = "getEventType", id = 11)
    public final int Z;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    public final String Z0;
    @SafeParcelable.Field(getter = "getCodePackage", id = 17)
    public final String a1;
    @SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    public final int b1;
    @SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    @InterfaceC10571ws1
    public final List c1;
    @SafeParcelable.Field(getter = "getEventKey", id = 12)
    public final String d1;
    @SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    public final long e1;
    @SafeParcelable.Field(getter = "getDeviceState", id = 14)
    public final int f1;
    @SafeParcelable.Field(getter = "getHostPackage", id = 13)
    public final String g1;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    public final float h1;
    @SafeParcelable.Field(getter = "getTimeout", id = 16)
    public final long i1;
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    public final boolean j1;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) @InterfaceC10571ws1 List list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 14) int i4, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f, @SafeParcelable.Param(id = 16) long j3, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
        this.X = i;
        this.Y = j;
        this.Z = i2;
        this.Y0 = str;
        this.Z0 = str3;
        this.a1 = str5;
        this.b1 = i3;
        this.c1 = list;
        this.d1 = str2;
        this.e1 = j2;
        this.f1 = i4;
        this.g1 = str4;
        this.h1 = f;
        this.i1 = j3;
        this.j1 = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @InterfaceC5670cr1
    public final String B0() {
        String join;
        List list = this.c1;
        String str = "";
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(",", list);
        }
        int i = this.f1;
        String str2 = this.Z0;
        String str3 = this.g1;
        float f = this.h1;
        String str4 = this.a1;
        int i2 = this.b1;
        String str5 = this.Y0;
        boolean z = this.j1;
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("\t");
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        if (str4 != null) {
            str = str4;
        }
        sb.append(str);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long b() {
        return this.Y;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int m0() {
        return this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.K(parcel, 2, this.Y);
        SafeParcelWriter.Y(parcel, 4, this.Y0, false);
        SafeParcelWriter.F(parcel, 5, this.b1);
        SafeParcelWriter.a0(parcel, 6, this.c1, false);
        SafeParcelWriter.K(parcel, 8, this.e1);
        SafeParcelWriter.Y(parcel, 10, this.Z0, false);
        SafeParcelWriter.F(parcel, 11, this.Z);
        SafeParcelWriter.Y(parcel, 12, this.d1, false);
        SafeParcelWriter.Y(parcel, 13, this.g1, false);
        SafeParcelWriter.F(parcel, 14, this.f1);
        SafeParcelWriter.w(parcel, 15, this.h1);
        SafeParcelWriter.K(parcel, 16, this.i1);
        SafeParcelWriter.Y(parcel, 17, this.a1, false);
        SafeParcelWriter.g(parcel, 18, this.j1);
        SafeParcelWriter.b(parcel, a);
    }
}

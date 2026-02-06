package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.C3855Oo;
import o.InterfaceC10571ws1;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    public final String X;
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    @InterfaceC10571ws1
    public final zzj Y;
    @SafeParcelable.Field(defaultValue = C3855Oo.a, getter = "getIgnoreTestKeysOverride", id = 4)
    public final boolean Y0;
    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    public final boolean Z;

    public zzs(String str, @InterfaceC10571ws1 zzj zzjVar, boolean z, boolean z2) {
        this.X = str;
        this.Y = zzjVar;
        this.Z = z;
        this.Y0 = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        zzj zzjVar = this.Y;
        if (zzjVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzjVar = null;
        }
        SafeParcelWriter.B(parcel, 2, zzjVar, false);
        SafeParcelWriter.g(parcel, 3, this.Z);
        SafeParcelWriter.g(parcel, 4, this.Y0);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @InterfaceC10571ws1 IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2) {
        this.X = str;
        zzk zzkVar = null;
        if (iBinder != null) {
            try {
                IObjectWrapper f = com.google.android.gms.common.internal.zzz.g1(iBinder).f();
                byte[] bArr = f == null ? null : (byte[]) ObjectWrapper.o1(f);
                if (bArr != null) {
                    zzkVar = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.Y = zzkVar;
        this.Z = z;
        this.Y0 = z2;
    }
}

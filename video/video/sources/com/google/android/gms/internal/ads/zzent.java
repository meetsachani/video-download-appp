package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzent implements zzetv {
    public final zzgdj a;
    public final VersionInfoParcel b;

    public zzent(VersionInfoParcel versionInfoParcel, zzgdj zzgdjVar) {
        this.b = versionInfoParcel;
        this.a = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzens
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzenu a;
                a = zzenu.a(zzent.this.b);
                return a;
            }
        });
    }
}

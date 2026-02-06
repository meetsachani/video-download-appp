package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzchs implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzchs(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            return Wrappers.a(((zzchi) this.a).a()).f(((ApplicationInfo) this.b.b()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}

package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmr implements zzfx {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzmp b;

    public zzmr(zzmp zzmpVar, String str) {
        this.b = zzmpVar;
        this.a = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzfx
    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.I(true, i, th, bArr, this.a);
    }
}

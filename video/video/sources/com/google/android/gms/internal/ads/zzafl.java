package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import o.C4126Rj;

/* loaded from: classes2.dex */
final class zzafl implements zzafb {
    public final String a;

    public zzafl(String str) {
        this.a = str;
    }

    public static zzafl b(zzek zzekVar) {
        return new zzafl(zzekVar.b(zzekVar.u(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final int a() {
        return C4126Rj.C;
    }
}

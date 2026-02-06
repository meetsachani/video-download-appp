package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzavb implements zzfpq {
    public final /* synthetic */ zzfns a;

    public zzavb(zzavd zzavdVar, zzfns zzfnsVar) {
        this.a = zzfnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpq
    public final boolean a(File file) {
        try {
            return this.a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}

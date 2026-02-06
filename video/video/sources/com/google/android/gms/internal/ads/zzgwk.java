package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgwk extends ThreadLocal {
    public final /* synthetic */ zzgwl a;

    public zzgwk(zzgwl zzgwlVar) {
        this.a = zzgwlVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: a */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgvx zzgvxVar = zzgvx.c;
            zzgwl zzgwlVar = this.a;
            str = zzgwlVar.b;
            Mac mac = (Mac) zzgvxVar.a(str);
            key = zzgwlVar.c;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}

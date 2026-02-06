package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzgng {
    public static final zzgng b = new zzgng();
    public final AtomicReference a = new AtomicReference(new zzgog(new zzgod(null), null));

    public static zzgng a() {
        return b;
    }

    public final Object b(zzgek zzgekVar, Class cls) throws GeneralSecurityException {
        return ((zzgog) this.a.get()).b(zzgekVar, cls);
    }

    public final synchronized void c(zzgob zzgobVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.a;
        zzgod zzgodVar = new zzgod((zzgog) atomicReference.get(), null);
        zzgodVar.a(zzgobVar);
        atomicReference.set(new zzgog(zzgodVar, null));
    }

    public final synchronized void d(zzgoh zzgohVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.a;
        zzgod zzgodVar = new zzgod((zzgog) atomicReference.get(), null);
        zzgodVar.b(zzgohVar);
        atomicReference.set(new zzgog(zzgodVar, null));
    }
}

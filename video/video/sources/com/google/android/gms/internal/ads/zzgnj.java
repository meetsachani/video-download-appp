package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgnj {
    public static final zzgnj b = (zzgnj) zzgot.a(new zzgos() { // from class: com.google.android.gms.internal.ads.zzgnh
        @Override // com.google.android.gms.internal.ads.zzgos
        public final Object a() {
            zzgnj zzgnjVar = new zzgnj();
            zzgnjVar.g(new zzgmf(zzgmo.class, zzgoi.class, new zzgmg() { // from class: com.google.android.gms.internal.ads.zzgni
                @Override // com.google.android.gms.internal.ads.zzgmg
                public final zzgom a(zzgek zzgekVar, zzgey zzgeyVar) {
                    return ((zzgmo) zzgekVar).b(zzgeyVar);
                }
            }));
            return zzgnjVar;
        }
    });
    public final AtomicReference a = new AtomicReference(new zzgor(new zzgon(), null));

    public static zzgnj c() {
        return b;
    }

    public final zzgek a(zzgom zzgomVar, @InterfaceC10571ws1 zzgey zzgeyVar) throws GeneralSecurityException {
        return ((zzgor) this.a.get()).a(zzgomVar, zzgeyVar);
    }

    public final zzgex b(zzgom zzgomVar) throws GeneralSecurityException {
        return ((zzgor) this.a.get()).b(zzgomVar);
    }

    public final zzgom d(zzgek zzgekVar, Class cls, @InterfaceC10571ws1 zzgey zzgeyVar) throws GeneralSecurityException {
        return ((zzgor) this.a.get()).c(zzgekVar, cls, zzgeyVar);
    }

    public final zzgom e(zzgex zzgexVar, Class cls) throws GeneralSecurityException {
        return ((zzgor) this.a.get()).d(zzgexVar, cls);
    }

    public final synchronized void f(zzgme zzgmeVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.a;
        zzgon zzgonVar = new zzgon((zzgor) atomicReference.get());
        zzgonVar.a(zzgmeVar);
        atomicReference.set(new zzgor(zzgonVar, null));
    }

    public final synchronized void g(zzgmi zzgmiVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.a;
        zzgon zzgonVar = new zzgon((zzgor) atomicReference.get());
        zzgonVar.b(zzgmiVar);
        atomicReference.set(new zzgor(zzgonVar, null));
    }

    public final synchronized void h(zzgno zzgnoVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.a;
        zzgon zzgonVar = new zzgon((zzgor) atomicReference.get());
        zzgonVar.c(zzgnoVar);
        atomicReference.set(new zzgor(zzgonVar, null));
    }

    public final synchronized void i(zzgns zzgnsVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.a;
        zzgon zzgonVar = new zzgon((zzgor) atomicReference.get());
        zzgonVar.d(zzgnsVar);
        atomicReference.set(new zzgor(zzgonVar, null));
    }

    public final boolean j(zzgom zzgomVar) {
        return ((zzgor) this.a.get()).i(zzgomVar);
    }

    public final boolean k(zzgom zzgomVar) {
        return ((zzgor) this.a.get()).j(zzgomVar);
    }
}

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxm extends zzayb {
    public final zzavr h;
    public final long i;
    public final long j;

    public zzaxm(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, zzavr zzavrVar, long j, long j2) {
        super(zzawoVar, "Q2alXHIIp2vvtZN4ZNw4W3dXvS5FZxkSx8F3noC2XP6gq0/XB0ulYQV32h8ZSW0i", "bHzouddPHTqhUNsOeni/FRK++KVVMe5yU+yUqilZ/gg=", zzaskVar, i, 11);
        this.h = zzavrVar;
        this.i = j;
        this.j = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        zzavr zzavrVar = this.h;
        if (zzavrVar != null) {
            zzavp zzavpVar = new zzavp((String) this.e.invoke(null, zzavrVar.b(), Long.valueOf(this.i), Long.valueOf(this.j)));
            zzask zzaskVar = this.d;
            synchronized (zzaskVar) {
                try {
                    zzaskVar.b3(zzavpVar.b.longValue());
                    if (zzavpVar.c.longValue() >= 0) {
                        zzaskVar.o2(zzavpVar.c.longValue());
                    }
                    if (zzavpVar.d.longValue() >= 0) {
                        zzaskVar.J2(zzavpVar.d.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

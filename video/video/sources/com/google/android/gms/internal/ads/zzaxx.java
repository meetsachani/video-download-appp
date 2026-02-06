package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxx extends zzayb {
    public zzaxx(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2) {
        super(zzawoVar, "1BnW1+pN8ACAA5SCwHeu4aDyUa+GdAsZQaTQjOE/fWA7hyCouT0ju5bDmhkUNXUI", "kp4jwXczzGPw0lGC8OB8RleYASbnnNEZzgNaMBT0Bfw=", zzaskVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        zzask zzaskVar = this.d;
        zzaskVar.E2(3);
        boolean booleanValue = ((Boolean) this.e.invoke(null, this.a.b())).booleanValue();
        synchronized (zzaskVar) {
            try {
                if (booleanValue) {
                    zzaskVar.E2(2);
                } else {
                    zzaskVar.E2(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

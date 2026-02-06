package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxp extends zzayb {
    public zzaxp(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2) {
        super(zzawoVar, "+T/U1hw7+KZ4U7a2mmAOu7BJ15632T6q77fmzX/Xgjcy3uK841Ng+VsVpINIYuXP", "GzjxqsxzxT+aATwD+mE+LGwR24OtaI/aqws6qGNlH18=", zzaskVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f3);
        bool.booleanValue();
        zzavu zzavuVar = new zzavu((String) this.e.invoke(null, this.a.b(), bool));
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzaskVar.N2(zzavuVar.b);
            zzaskVar.Y1(zzavuVar.c);
        }
    }
}

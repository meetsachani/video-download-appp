package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxa extends zzayb {
    public zzaxa(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2) {
        super(zzawoVar, "WQkp0526ddrUi1BRkagos9QKSJQ1uugrJcxnlXdGVtysNEwcyhf7H4AuLi1Daa/J", "bIxRlixcWzGpKi+RzORPGFA/CCK1ebxNEgd5yxb9Upc=", zzaskVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        zzask zzaskVar = this.d;
        zzaskVar.y2(3);
        try {
            int i = 1;
            if (true == ((Boolean) this.e.invoke(null, this.a.b())).booleanValue()) {
                i = 2;
            }
            zzaskVar.y2(i);
        } catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof Settings.SettingNotFoundException) {
                return;
            }
            throw e;
        }
    }
}

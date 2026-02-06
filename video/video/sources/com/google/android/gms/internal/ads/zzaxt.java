package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxt extends zzayb {
    public final StackTraceElement[] h;

    public zzaxt(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzawoVar, "UtW7g7feJqOHsjIRMP7TbkL8M4VYsmVrsaULCIKJGwvBOELKcxTQZfT6AHg6wl4V", "3s4OpKjyDjUzqtut1o8wCVCKFRdtRePXWRu+sqk/xG8=", zzaskVar, i, 45);
        this.h = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.h;
        if (stackTraceElementArr != null) {
            zzawf zzawfVar = new zzawf((String) this.e.invoke(null, stackTraceElementArr));
            zzask zzaskVar = this.d;
            synchronized (zzaskVar) {
                try {
                    zzaskVar.b2(zzawfVar.b.longValue());
                    if (zzawfVar.c.booleanValue()) {
                        int i = 1;
                        if (true != zzawfVar.d.booleanValue()) {
                            i = 2;
                        }
                        zzaskVar.z2(i);
                    } else {
                        zzaskVar.z2(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

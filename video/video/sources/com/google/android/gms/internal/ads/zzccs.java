package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzccs {
    public long a;

    public final long a(ByteBuffer byteBuffer) {
        zzark zzarkVar;
        zzarj zzarjVar;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzarf(new zzccr(duplicate), zzccv.c).h().iterator();
            while (true) {
                zzarkVar = null;
                if (it.hasNext()) {
                    zzarh zzarhVar = (zzarh) it.next();
                    if (zzarhVar instanceof zzarj) {
                        zzarjVar = (zzarj) zzarhVar;
                        break;
                    }
                } else {
                    zzarjVar = null;
                    break;
                }
            }
            Iterator it2 = zzarjVar.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzarh zzarhVar2 = (zzarh) it2.next();
                if (zzarhVar2 instanceof zzark) {
                    zzarkVar = (zzark) zzarhVar2;
                    break;
                }
            }
            long h = (zzarkVar.h() * 1000) / zzarkVar.i();
            this.a = h;
            return h;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}

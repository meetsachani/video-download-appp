package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import o.BR0;

/* loaded from: classes2.dex */
final class zzsq extends zzhp {
    public long i;
    public int j;
    public int k;

    public zzsq() {
        super(2, 0);
        this.k = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzhj
    public final void b() {
        super.b();
        this.j = 0;
    }

    public final int n() {
        return this.j;
    }

    public final long o() {
        return this.i;
    }

    public final void p(@BR0(from = 1) int i) {
        this.k = i;
    }

    public final boolean q(zzhp zzhpVar) {
        ByteBuffer byteBuffer;
        zzdc.d(!zzhpVar.d(1073741824));
        zzdc.d(!zzhpVar.d(268435456));
        zzdc.d(!zzhpVar.d(4));
        if (r()) {
            if (this.j < this.k) {
                ByteBuffer byteBuffer2 = zzhpVar.d;
                if (byteBuffer2 != null && (byteBuffer = this.d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                    return false;
                }
            } else {
                return false;
            }
        }
        int i = this.j;
        this.j = i + 1;
        if (i == 0) {
            this.f = zzhpVar.f;
            if (zzhpVar.d(1)) {
                c(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhpVar.d;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.i = zzhpVar.f;
        return true;
    }

    public final boolean r() {
        return this.j > 0;
    }
}

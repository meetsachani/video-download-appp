package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import o.InterfaceC11300zs1;
import o.InterfaceC8557od0;

/* loaded from: classes2.dex */
public class zzhp extends zzhj {
    @InterfaceC11300zs1
    public zzz b;
    public final zzhm c = new zzhm();
    @InterfaceC11300zs1
    public ByteBuffer d;
    public boolean e;
    public long f;
    @InterfaceC11300zs1
    public ByteBuffer g;
    public final int h;

    static {
        zzaq.b("media3.decoder");
    }

    public zzhp(int i, int i2) {
        this.h = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    @InterfaceC8557od0({"data"})
    public final void j(int i) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = m(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer m = m(i2);
        m.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m.put(byteBuffer);
        }
        this.d = m;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean l() {
        return d(1073741824);
    }

    public final ByteBuffer m(int i) {
        int capacity;
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new zzho(capacity, i);
    }
}

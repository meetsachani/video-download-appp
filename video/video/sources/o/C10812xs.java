package o;

import java.nio.ByteBuffer;

@Deprecated
/* renamed from: o.xs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10812xs {
    public static final long d = 529;
    public static final String e = "C2Mp3TimestampTracker";
    public long a;
    public long b;
    public boolean c;

    public final long a(long j) {
        return this.a + Math.max(0L, ((this.b - 529) * 1000000) / j);
    }

    public long b(C10833xx0 c10833xx0) {
        return a(c10833xx0.u1);
    }

    public void c() {
        this.a = 0L;
        this.b = 0L;
        this.c = false;
    }

    public long d(C10833xx0 c10833xx0, C9267rW c9267rW) {
        if (this.b == 0) {
            this.a = c9267rW.a1;
        }
        if (this.c) {
            return c9267rW.a1;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C9542sf.g(c9267rW.Y0);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int m = C3062Gl1.m(i);
        if (m == -1) {
            this.c = true;
            this.b = 0L;
            this.a = c9267rW.a1;
            I31.n(e, "MPEG audio header is invalid.");
            return c9267rW.a1;
        }
        long a = a(c10833xx0.u1);
        this.b += m;
        return a;
    }
}

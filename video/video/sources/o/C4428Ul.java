package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ul  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4428Ul {
    public int a;
    public int b;
    public int c;
    public ByteBuffer d;

    public int a(int i) {
        return this.a + (i * this.c);
    }

    public void b(int i, int i2, ByteBuffer byteBuffer) {
        this.d = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            this.b = byteBuffer.getInt(i - 4);
            this.c = i2;
            return;
        }
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public void e() {
        b(0, 0, null);
    }
}

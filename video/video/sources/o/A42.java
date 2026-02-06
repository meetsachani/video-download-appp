package o;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class A42 extends C4428Ul {
    public A42 f(int i, ByteBuffer byteBuffer) {
        b(i, 2, byteBuffer);
        return this;
    }

    public short g(int i) {
        return this.d.getShort(a(i));
    }

    public int h(int i) {
        return g(i) & Xx2.Y0;
    }
}

package o;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class JR0 extends C4428Ul {
    public JR0 f(int i, ByteBuffer byteBuffer) {
        b(i, 4, byteBuffer);
        return this;
    }

    public int g(int i) {
        return this.d.getInt(a(i));
    }

    public long h(int i) {
        return g(i) & 4294967295L;
    }
}

package o;

import java.nio.ByteBuffer;

/* renamed from: o.qs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9102qs extends C4428Ul {
    public C9102qs f(int i, ByteBuffer byteBuffer) {
        b(i, 1, byteBuffer);
        return this;
    }

    public byte g(int i) {
        return this.d.get(a(i));
    }

    public int h(int i) {
        return g(i) & 255;
    }
}

package o;

import java.nio.ByteBuffer;

/* renamed from: o.Rf2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4113Rf2 {
    public int a;
    public ByteBuffer b;

    public void a() {
        b(0, null);
    }

    public void b(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
        } else {
            this.a = 0;
        }
    }
}

package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.Xr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4743Xr {
    public static ByteBuffer a(int i) {
        return b(ByteBuffer.allocate(i));
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static ByteBuffer c(byte[] bArr) {
        return b(ByteBuffer.wrap(bArr));
    }
}

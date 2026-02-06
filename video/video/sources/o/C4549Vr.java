package o;

import java.nio.ByteBuffer;

/* renamed from: o.Vr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4549Vr {
    public static int a(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}

package o;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: o.ub0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10013ub0 extends AutoCloseable {
    boolean A1();

    ByteBuffer X();

    @Override // java.lang.AutoCloseable
    void close();

    MediaCodec.BufferInfo o1();

    long r2();

    long size();

    InterfaceFutureC8411o11<Void> z4();
}

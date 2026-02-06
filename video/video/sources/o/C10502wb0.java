package o;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C3679Mt;

/* renamed from: o.wb0 */
/* loaded from: classes.dex */
public class C10502wb0 implements InterfaceC10013ub0 {
    public final MediaCodec X;
    public final MediaCodec.BufferInfo Y;
    public final ByteBuffer Y0;
    public final int Z;
    public final InterfaceFutureC8411o11<Void> Z0;
    public final C3679Mt.a<Void> a1;
    public final AtomicBoolean b1 = new AtomicBoolean(false);

    public C10502wb0(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) throws MediaCodec.CodecException {
        this.X = (MediaCodec) C10907yF1.l(mediaCodec);
        this.Z = i;
        this.Y0 = mediaCodec.getOutputBuffer(i);
        this.Y = (MediaCodec.BufferInfo) C10907yF1.l(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.Z0 = C3679Mt.a(new C3679Mt.c() { // from class: o.vb0
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C10502wb0.a(atomicReference, aVar);
            }
        });
        this.a1 = (C3679Mt.a) C10907yF1.l((C3679Mt.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, C3679Mt.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    @Override // o.InterfaceC10013ub0
    public boolean A1() {
        if ((this.Y.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10013ub0
    public ByteBuffer X() {
        d();
        this.Y0.position(this.Y.offset);
        ByteBuffer byteBuffer = this.Y0;
        MediaCodec.BufferInfo bufferInfo = this.Y;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.Y0;
    }

    @Override // o.InterfaceC10013ub0, java.lang.AutoCloseable
    public void close() {
        if (this.b1.getAndSet(true)) {
            return;
        }
        try {
            this.X.releaseOutputBuffer(this.Z, false);
            this.a1.c(null);
        } catch (IllegalStateException e) {
            this.a1.f(e);
        }
    }

    public final void d() {
        if (!this.b1.get()) {
            return;
        }
        throw new IllegalStateException("encoded data is closed.");
    }

    @Override // o.InterfaceC10013ub0
    public MediaCodec.BufferInfo o1() {
        return this.Y;
    }

    @Override // o.InterfaceC10013ub0
    public long r2() {
        return this.Y.presentationTimeUs;
    }

    @Override // o.InterfaceC10013ub0
    public long size() {
        return this.Y.size;
    }

    @Override // o.InterfaceC10013ub0
    public InterfaceFutureC8411o11<Void> z4() {
        return C7221jC0.i(this.Z0);
    }
}

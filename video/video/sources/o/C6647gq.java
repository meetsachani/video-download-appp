package o;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import o.C3679Mt;

/* renamed from: o.gq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6647gq implements InterfaceC10013ub0 {
    public final ByteBuffer X;
    public final MediaCodec.BufferInfo Y;
    public final C3679Mt.a<Void> Y0;
    public final InterfaceFutureC8411o11<Void> Z;

    public C6647gq(InterfaceC10013ub0 interfaceC10013ub0) {
        this.Y = f(interfaceC10013ub0);
        this.X = d(interfaceC10013ub0);
        final AtomicReference atomicReference = new AtomicReference();
        this.Z = C3679Mt.a(new C3679Mt.c() { // from class: o.fq
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C6647gq.a(atomicReference, aVar);
            }
        });
        this.Y0 = (C3679Mt.a) C10907yF1.l((C3679Mt.a) atomicReference.get());
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
        return this.X;
    }

    @Override // o.InterfaceC10013ub0, java.lang.AutoCloseable
    public void close() {
        this.Y0.c(null);
    }

    public final ByteBuffer d(InterfaceC10013ub0 interfaceC10013ub0) {
        ByteBuffer X = interfaceC10013ub0.X();
        MediaCodec.BufferInfo o1 = interfaceC10013ub0.o1();
        X.position(o1.offset);
        X.limit(o1.offset + o1.size);
        ByteBuffer allocate = ByteBuffer.allocate(o1.size);
        allocate.order(X.order());
        allocate.put(X);
        allocate.flip();
        return allocate;
    }

    public final MediaCodec.BufferInfo f(InterfaceC10013ub0 interfaceC10013ub0) {
        MediaCodec.BufferInfo o1 = interfaceC10013ub0.o1();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, o1.size, o1.presentationTimeUs, o1.flags);
        return bufferInfo;
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
        return C7221jC0.i(this.Z);
    }
}

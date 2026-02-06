package o;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C3679Mt;

/* renamed from: o.bQ0 */
/* loaded from: classes.dex */
public class C5325bQ0 implements ZP0 {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final InterfaceFutureC8411o11<Void> d;
    public final C3679Mt.a<Void> e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;

    public C5325bQ0(MediaCodec mediaCodec, int i) throws MediaCodec.CodecException {
        this.a = (MediaCodec) C10907yF1.l(mediaCodec);
        this.b = C10907yF1.i(i);
        this.c = mediaCodec.getInputBuffer(i);
        final AtomicReference atomicReference = new AtomicReference();
        this.d = C3679Mt.a(new C3679Mt.c() { // from class: o.aQ0
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C5325bQ0.e(atomicReference, aVar);
            }
        });
        this.e = (C3679Mt.a) C10907yF1.l((C3679Mt.a) atomicReference.get());
    }

    public static /* synthetic */ Object e(AtomicReference atomicReference, C3679Mt.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    @Override // o.ZP0
    public ByteBuffer X() {
        f();
        return this.c;
    }

    @Override // o.ZP0
    public void a(boolean z) {
        f();
        this.h = z;
    }

    @Override // o.ZP0
    public boolean b() {
        int i;
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            MediaCodec mediaCodec = this.a;
            int i2 = this.b;
            int position = this.c.position();
            int limit = this.c.limit();
            long j = this.g;
            if (this.h) {
                i = 4;
            } else {
                i = 0;
            }
            mediaCodec.queueInputBuffer(i2, position, limit, j, i);
            this.e.c(null);
            return true;
        } catch (IllegalStateException e) {
            this.e.f(e);
            return false;
        }
    }

    @Override // o.ZP0
    public void c(long j) {
        boolean z;
        f();
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.a(z);
        this.g = j;
    }

    @Override // o.ZP0
    public boolean cancel() {
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            this.a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            this.e.c(null);
        } catch (IllegalStateException e) {
            this.e.f(e);
        }
        return true;
    }

    @Override // o.ZP0
    public InterfaceFutureC8411o11<Void> d() {
        return C7221jC0.i(this.d);
    }

    public final void f() {
        if (!this.f.get()) {
            return;
        }
        throw new IllegalStateException("The buffer is submitted or canceled.");
    }
}

package o;

@Deprecated
/* renamed from: o.pW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8775pW {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public void a(long j) {
        b(j, 1);
    }

    public final void b(long j, int i) {
        this.k += j;
        this.l += i;
    }

    public synchronized void c() {
    }

    public void d(C8775pW c8775pW) {
        this.a += c8775pW.a;
        this.b += c8775pW.b;
        this.c += c8775pW.c;
        this.d += c8775pW.d;
        this.e += c8775pW.e;
        this.f += c8775pW.f;
        this.g += c8775pW.g;
        this.h += c8775pW.h;
        this.i = Math.max(this.i, c8775pW.i);
        this.j += c8775pW.j;
        b(c8775pW.k, c8775pW.l);
    }

    public String toString() {
        return TD2.M("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Long.valueOf(this.k), Integer.valueOf(this.l));
    }
}

package o;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.InterfaceC2827Ee1;

@Deprecated
/* renamed from: o.dk2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5886dk2 implements InterfaceC2827Ee1 {
    public final MediaCodec a;
    @InterfaceC11300zs1
    public ByteBuffer[] b;
    @InterfaceC11300zs1
    public ByteBuffer[] c;

    /* renamed from: o.dk2$b */
    /* loaded from: classes2.dex */
    public static class b implements InterfaceC2827Ee1.b {
        @Override // o.InterfaceC2827Ee1.b
        public InterfaceC2827Ee1 a(InterfaceC2827Ee1.a aVar) throws IOException {
            MediaCodec mediaCodec = null;
            try {
                MediaCodec b = b(aVar);
                try {
                    C7624kr2.a("configureCodec");
                    b.configure(aVar.b, aVar.d, aVar.e, aVar.f);
                    C7624kr2.c();
                    C7624kr2.a("startCodec");
                    b.start();
                    C7624kr2.c();
                    return new C5886dk2(b);
                } catch (IOException | RuntimeException e) {
                    e = e;
                    mediaCodec = b;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
        }

        public MediaCodec b(InterfaceC2827Ee1.a aVar) throws IOException {
            C9542sf.g(aVar.a);
            String str = aVar.a.a;
            C7624kr2.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C7624kr2.c();
            return createByCodecName;
        }
    }

    public static /* synthetic */ void q(C5886dk2 c5886dk2, InterfaceC2827Ee1.c cVar, MediaCodec mediaCodec, long j, long j2) {
        c5886dk2.getClass();
        cVar.a(c5886dk2, j, j2);
    }

    @Override // o.InterfaceC2827Ee1
    public MediaFormat a() {
        return this.a.getOutputFormat();
    }

    @Override // o.InterfaceC2827Ee1
    @ES1(26)
    public PersistableBundle b() {
        return C3721Nf.a(this.a);
    }

    @Override // o.InterfaceC2827Ee1
    @ES1(23)
    public void c(final InterfaceC2827Ee1.c cVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o.ck2
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C5886dk2.q(C5886dk2.this, cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // o.InterfaceC2827Ee1
    @InterfaceC11300zs1
    public ByteBuffer d(int i) {
        if (TD2.a >= 21) {
            return this.a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) TD2.o(this.b))[i];
    }

    @Override // o.InterfaceC2827Ee1
    public void e(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // o.InterfaceC2827Ee1
    @ES1(23)
    public void f(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // o.InterfaceC2827Ee1
    public void flush() {
        this.a.flush();
    }

    @Override // o.InterfaceC2827Ee1
    public void g() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // o.InterfaceC2827Ee1
    public void h(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // o.InterfaceC2827Ee1
    public boolean i() {
        return false;
    }

    @Override // o.InterfaceC2827Ee1
    @ES1(19)
    public void j(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // o.InterfaceC2827Ee1
    @ES1(21)
    public void k(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // o.InterfaceC2827Ee1
    public int l() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // o.InterfaceC2827Ee1
    public int m(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && TD2.a < 21) {
                this.c = this.a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // o.InterfaceC2827Ee1
    public void n(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // o.InterfaceC2827Ee1
    public void o(int i, int i2, C7766lR c7766lR, long j, int i3) {
        this.a.queueSecureInputBuffer(i, i2, c7766lR.a(), j, i3);
    }

    @Override // o.InterfaceC2827Ee1
    @InterfaceC11300zs1
    public ByteBuffer p(int i) {
        if (TD2.a >= 21) {
            return this.a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) TD2.o(this.c))[i];
    }

    public C5886dk2(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (TD2.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }
}

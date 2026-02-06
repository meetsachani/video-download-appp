package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.C3916Pf;
import o.InterfaceC2827Ee1;

@ES1(23)
@Deprecated
/* renamed from: o.Pf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3916Pf implements InterfaceC2827Ee1 {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public final MediaCodec a;
    public final C4404Uf b;
    public final C4210Sf c;
    public final boolean d;
    public boolean e;
    public int f;

    /* renamed from: o.Pf$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC2827Ee1.b {
        public final InterfaceC8331nh2<HandlerThread> b;
        public final InterfaceC8331nh2<HandlerThread> c;
        public final boolean d;

        public b(final int i, boolean z) {
            this(new InterfaceC8331nh2() { // from class: o.Qf
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return C3916Pf.b.b(i);
                }
            }, new InterfaceC8331nh2() { // from class: o.Rf
                @Override // o.InterfaceC8331nh2
                public final Object get() {
                    return C3916Pf.b.c(i);
                }
            }, z);
        }

        public static /* synthetic */ HandlerThread b(int i) {
            return new HandlerThread(C3916Pf.u(i));
        }

        public static /* synthetic */ HandlerThread c(int i) {
            return new HandlerThread(C3916Pf.v(i));
        }

        @Override // o.InterfaceC2827Ee1.b
        /* renamed from: d */
        public C3916Pf a(InterfaceC2827Ee1.a aVar) throws IOException {
            Exception exc;
            MediaCodec mediaCodec;
            String str = aVar.a.a;
            C3916Pf c3916Pf = null;
            try {
                C7624kr2.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    C3916Pf c3916Pf2 = new C3916Pf(mediaCodec, this.b.get(), this.c.get(), this.d);
                    try {
                        C7624kr2.c();
                        c3916Pf2.x(aVar.b, aVar.d, aVar.e, aVar.f);
                        return c3916Pf2;
                    } catch (Exception e) {
                        exc = e;
                        c3916Pf = c3916Pf2;
                        if (c3916Pf == null) {
                            if (mediaCodec != null) {
                                mediaCodec.release();
                            }
                        } else {
                            c3916Pf.g();
                        }
                        throw exc;
                    }
                } catch (Exception e2) {
                    exc = e2;
                }
            } catch (Exception e3) {
                exc = e3;
                mediaCodec = null;
            }
        }

        @InterfaceC5056aJ2
        public b(InterfaceC8331nh2<HandlerThread> interfaceC8331nh2, InterfaceC8331nh2<HandlerThread> interfaceC8331nh22, boolean z) {
            this.b = interfaceC8331nh2;
            this.c = interfaceC8331nh22;
            this.d = z;
        }
    }

    public static /* synthetic */ void q(C3916Pf c3916Pf, InterfaceC2827Ee1.c cVar, MediaCodec mediaCodec, long j, long j2) {
        c3916Pf.getClass();
        cVar.a(c3916Pf, j, j2);
    }

    public static String u(int i2) {
        return w(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String v(int i2) {
        return w(i2, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String w(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(C9811tl1.d);
        }
        return sb.toString();
    }

    @InterfaceC5056aJ2
    public void A(MediaFormat mediaFormat) {
        this.b.onOutputFormatChanged(this.a, mediaFormat);
    }

    @Override // o.InterfaceC2827Ee1
    public MediaFormat a() {
        return this.b.g();
    }

    @Override // o.InterfaceC2827Ee1
    @ES1(26)
    public PersistableBundle b() {
        y();
        return C3721Nf.a(this.a);
    }

    @Override // o.InterfaceC2827Ee1
    public void c(final InterfaceC2827Ee1.c cVar, Handler handler) {
        y();
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o.Of
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C3916Pf.q(C3916Pf.this, cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // o.InterfaceC2827Ee1
    @InterfaceC11300zs1
    public ByteBuffer d(int i2) {
        return this.a.getInputBuffer(i2);
    }

    @Override // o.InterfaceC2827Ee1
    public void e(int i2) {
        y();
        this.a.setVideoScalingMode(i2);
    }

    @Override // o.InterfaceC2827Ee1
    public void f(Surface surface) {
        y();
        this.a.setOutputSurface(surface);
    }

    @Override // o.InterfaceC2827Ee1
    public void flush() {
        this.c.i();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    @Override // o.InterfaceC2827Ee1
    public void g() {
        try {
            if (this.f == 1) {
                this.c.q();
                this.b.o();
            }
            this.f = 2;
            if (!this.e) {
                this.a.release();
                this.e = true;
            }
        } catch (Throwable th) {
            if (!this.e) {
                this.a.release();
                this.e = true;
            }
            throw th;
        }
    }

    @Override // o.InterfaceC2827Ee1
    public void h(int i2, int i3, int i4, long j, int i5) {
        this.c.m(i2, i3, i4, j, i5);
    }

    @Override // o.InterfaceC2827Ee1
    public boolean i() {
        return false;
    }

    @Override // o.InterfaceC2827Ee1
    public void j(Bundle bundle) {
        y();
        this.a.setParameters(bundle);
    }

    @Override // o.InterfaceC2827Ee1
    public void k(int i2, long j) {
        this.a.releaseOutputBuffer(i2, j);
    }

    @Override // o.InterfaceC2827Ee1
    public int l() {
        this.c.l();
        return this.b.c();
    }

    @Override // o.InterfaceC2827Ee1
    public int m(MediaCodec.BufferInfo bufferInfo) {
        this.c.l();
        return this.b.d(bufferInfo);
    }

    @Override // o.InterfaceC2827Ee1
    public void n(int i2, boolean z) {
        this.a.releaseOutputBuffer(i2, z);
    }

    @Override // o.InterfaceC2827Ee1
    public void o(int i2, int i3, C7766lR c7766lR, long j, int i4) {
        this.c.n(i2, i3, c7766lR, j, i4);
    }

    @Override // o.InterfaceC2827Ee1
    @InterfaceC11300zs1
    public ByteBuffer p(int i2) {
        return this.a.getOutputBuffer(i2);
    }

    public final void x(@InterfaceC11300zs1 MediaFormat mediaFormat, @InterfaceC11300zs1 Surface surface, @InterfaceC11300zs1 MediaCrypto mediaCrypto, int i2) {
        this.b.h(this.a);
        C7624kr2.a("configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, i2);
        C7624kr2.c();
        this.c.r();
        C7624kr2.a("startCodec");
        this.a.start();
        C7624kr2.c();
        this.f = 1;
    }

    public final void y() {
        if (this.d) {
            try {
                this.c.s();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @InterfaceC5056aJ2
    public void z(MediaCodec.CodecException codecException) {
        this.b.onError(this.a, codecException);
    }

    public C3916Pf(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.a = mediaCodec;
        this.b = new C4404Uf(handlerThread);
        this.c = new C4210Sf(mediaCodec, handlerThread2);
        this.d = z;
        this.f = 0;
    }
}

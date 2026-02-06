package o;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

@ES1(23)
@Deprecated
/* renamed from: o.Uf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4404Uf extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    @InterfaceC8710pF0("lock")
    @InterfaceC11300zs1
    public MediaFormat h;
    @InterfaceC8710pF0("lock")
    @InterfaceC11300zs1
    public MediaFormat i;
    @InterfaceC8710pF0("lock")
    @InterfaceC11300zs1
    public MediaCodec.CodecException j;
    @InterfaceC8710pF0("lock")
    public long k;
    @InterfaceC8710pF0("lock")
    public boolean l;
    @InterfaceC8710pF0("lock")
    @InterfaceC11300zs1
    public IllegalStateException m;
    public final Object a = new Object();
    @InterfaceC8710pF0("lock")
    public final C6554gR0 d = new C6554gR0();
    @InterfaceC8710pF0("lock")
    public final C6554gR0 e = new C6554gR0();
    @InterfaceC8710pF0("lock")
    public final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();
    @InterfaceC8710pF0("lock")
    public final ArrayDeque<MediaFormat> g = new ArrayDeque<>();

    public C4404Uf(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    @InterfaceC8710pF0("lock")
    public final void b(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.a) {
            try {
                j();
                int i = -1;
                if (i()) {
                    return -1;
                }
                if (!this.d.e()) {
                    i = this.d.f();
                }
                return i;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.e.e()) {
                    return -1;
                }
                int f = this.e.f();
                if (f >= 0) {
                    C9542sf.k(this.h);
                    MediaCodec.BufferInfo remove = this.f.remove();
                    bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                } else if (f == -2) {
                    this.h = this.g.remove();
                }
                return f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.a) {
            this.k++;
            ((Handler) TD2.o(this.c)).post(new Runnable() { // from class: o.Tf
                @Override // java.lang.Runnable
                public final void run() {
                    C4404Uf.this.m();
                }
            });
        }
    }

    @InterfaceC8710pF0("lock")
    public final void f() {
        if (!this.g.isEmpty()) {
            this.i = this.g.getLast();
        }
        this.d.c();
        this.e.c();
        this.f.clear();
        this.g.clear();
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            try {
                mediaFormat = this.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        boolean z;
        if (this.c == null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    @InterfaceC8710pF0("lock")
    public final boolean i() {
        if (this.k <= 0 && !this.l) {
            return false;
        }
        return true;
    }

    @InterfaceC8710pF0("lock")
    public final void j() {
        k();
        l();
    }

    @InterfaceC8710pF0("lock")
    public final void k() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    @InterfaceC8710pF0("lock")
    public final void l() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    public final void m() {
        synchronized (this.a) {
            try {
                if (this.l) {
                    return;
                }
                long j = this.k - 1;
                this.k = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    n(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.m = illegalStateException;
        }
    }

    public void o() {
        synchronized (this.a) {
            this.l = true;
            this.b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            b(mediaFormat);
            this.i = null;
        }
    }
}

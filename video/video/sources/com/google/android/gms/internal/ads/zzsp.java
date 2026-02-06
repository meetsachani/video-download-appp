package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import o.ES1;
import o.HC;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
@ES1(23)
/* loaded from: classes2.dex */
public final class zzsp extends MediaCodec.Callback {
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
    @InterfaceC11300zs1
    public MediaCodec.CryptoException k;
    @InterfaceC8710pF0("lock")
    public long l;
    @InterfaceC8710pF0("lock")
    public boolean m;
    @InterfaceC8710pF0("lock")
    @InterfaceC11300zs1
    public IllegalStateException n;
    @InterfaceC8710pF0("lock")
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public zzsy f295o;
    public final Object a = new Object();
    @InterfaceC8710pF0("lock")
    public final HC d = new HC();
    @InterfaceC8710pF0("lock")
    public final HC e = new HC();
    @InterfaceC8710pF0("lock")
    public final ArrayDeque f = new ArrayDeque();
    @InterfaceC8710pF0("lock")
    public final ArrayDeque g = new ArrayDeque();

    public zzsp(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public static /* synthetic */ void d(zzsp zzspVar) {
        Object obj = zzspVar.a;
        synchronized (obj) {
            try {
                if (zzspVar.m) {
                    return;
                }
                long j = zzspVar.l - 1;
                zzspVar.l = j;
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i > 0) {
                    return;
                }
                if (i < 0) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    synchronized (obj) {
                        zzspVar.n = illegalStateException;
                    }
                    return;
                }
                zzspVar.j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        synchronized (this.a) {
            try {
                k();
                int i = -1;
                if (l()) {
                    return -1;
                }
                HC hc = this.d;
                if (!hc.h()) {
                    i = hc.i();
                }
                return i;
            } finally {
            }
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                k();
                if (l()) {
                    return -1;
                }
                HC hc = this.e;
                if (hc.h()) {
                    return -1;
                }
                int i = hc.i();
                if (i >= 0) {
                    zzdc.b(this.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i == -2) {
                    this.h = (MediaFormat) this.g.remove();
                    i = -2;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat c() {
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

    public final void e() {
        synchronized (this.a) {
            this.l++;
            Handler handler = this.c;
            String str = zzeu.a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzso
                @Override // java.lang.Runnable
                public final void run() {
                    zzsp.d(zzsp.this);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        boolean z;
        if (this.c == null) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public final void g(zzsy zzsyVar) {
        synchronized (this.a) {
            this.f295o = zzsyVar;
        }
    }

    public final void h() {
        synchronized (this.a) {
            this.m = true;
            this.b.quit();
            j();
        }
    }

    @InterfaceC8710pF0("lock")
    public final void i(MediaFormat mediaFormat) {
        this.e.b(-2);
        this.g.add(mediaFormat);
    }

    @InterfaceC8710pF0("lock")
    public final void j() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        this.d.c();
        this.e.c();
        this.f.clear();
        arrayDeque.clear();
    }

    @InterfaceC8710pF0("lock")
    public final void k() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.k;
                if (cryptoException == null) {
                    return;
                }
                this.k = null;
                throw cryptoException;
            }
            this.j = null;
            throw codecException;
        }
        this.n = null;
        throw illegalStateException;
    }

    @InterfaceC8710pF0("lock")
    public final boolean l() {
        return this.l > 0 || this.m;
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        zzlu zzluVar;
        zzlu zzluVar2;
        synchronized (this.a) {
            try {
                this.d.b(i);
                zzsy zzsyVar = this.f295o;
                if (zzsyVar != null) {
                    zztj zztjVar = ((zztg) zzsyVar).a;
                    zzluVar = zztjVar.z1;
                    if (zzluVar != null) {
                        zzluVar2 = zztjVar.z1;
                        zzluVar2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        zzlu zzluVar;
        zzlu zzluVar2;
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    i(mediaFormat);
                    this.i = null;
                }
                this.e.b(i);
                this.f.add(bufferInfo);
                zzsy zzsyVar = this.f295o;
                if (zzsyVar != null) {
                    zztj zztjVar = ((zztg) zzsyVar).a;
                    zzluVar = zztjVar.z1;
                    if (zzluVar != null) {
                        zzluVar2 = zztjVar.z1;
                        zzluVar2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            i(mediaFormat);
            this.i = null;
        }
    }
}

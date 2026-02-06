package o;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

@ES1(23)
@Deprecated
/* renamed from: o.Sf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4210Sf {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    @InterfaceC8710pF0("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<b> j = new ArrayDeque<>();
    public static final Object k = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public Handler c;
    public final AtomicReference<RuntimeException> d;
    public final CJ e;
    public boolean f;

    /* renamed from: o.Sf$a */
    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C4210Sf.this.f(message);
        }
    }

    /* renamed from: o.Sf$b */
    /* loaded from: classes2.dex */
    public static class b {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        public void a(int i, int i2, int i3, long j, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.e = j;
            this.f = i4;
        }
    }

    public C4210Sf(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new CJ());
    }

    public static void c(C7766lR c7766lR, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c7766lR.f;
        cryptoInfo.numBytesOfClearData = e(c7766lR.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(c7766lR.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C9542sf.g(d(c7766lR.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C9542sf.g(d(c7766lR.a, cryptoInfo.iv));
        cryptoInfo.mode = c7766lR.c;
        if (TD2.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c7766lR.g, c7766lR.h));
        }
    }

    @InterfaceC11300zs1
    public static byte[] d(@InterfaceC11300zs1 byte[] bArr, @InterfaceC11300zs1 byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    @InterfaceC11300zs1
    public static int[] e(@InterfaceC11300zs1 int[] iArr, @InterfaceC11300zs1 int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public static b k() {
        ArrayDeque<b> arrayDeque = j;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void o(b bVar) {
        ArrayDeque<b> arrayDeque = j;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public final void b() throws InterruptedException {
        this.e.d();
        ((Handler) C9542sf.g(this.c)).obtainMessage(2).sendToTarget();
        this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Message message) {
        b bVar;
        b bVar2;
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 != 1) {
                bVar2 = null;
                if (i2 != 2) {
                    C6515gH1.a(this.d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    this.e.f();
                }
                if (bVar2 == null) {
                    o(bVar2);
                    return;
                }
                return;
            }
            bVar = (b) message.obj;
            h(bVar.a, bVar.b, bVar.d, bVar.e, bVar.f);
        } else {
            bVar = (b) message.obj;
            g(bVar.a, bVar.b, bVar.c, bVar.e, bVar.f);
        }
        bVar2 = bVar;
        if (bVar2 == null) {
        }
    }

    public final void g(int i2, int i3, int i4, long j2, int i5) {
        try {
            this.a.queueInputBuffer(i2, i3, i4, j2, i5);
        } catch (RuntimeException e) {
            C6515gH1.a(this.d, null, e);
        }
    }

    public final void h(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j2, int i4) {
        try {
            synchronized (k) {
                this.a.queueSecureInputBuffer(i2, i3, cryptoInfo, j2, i4);
            }
        } catch (RuntimeException e) {
            C6515gH1.a(this.d, null, e);
        }
    }

    public void i() {
        if (this.f) {
            try {
                j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void j() throws InterruptedException {
        ((Handler) C9542sf.g(this.c)).removeCallbacksAndMessages(null);
        b();
    }

    public void l() {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet == null) {
            return;
        }
        throw andSet;
    }

    public void m(int i2, int i3, int i4, long j2, int i5) {
        l();
        b k2 = k();
        k2.a(i2, i3, i4, j2, i5);
        ((Handler) TD2.o(this.c)).obtainMessage(0, k2).sendToTarget();
    }

    public void n(int i2, int i3, C7766lR c7766lR, long j2, int i4) {
        l();
        b k2 = k();
        k2.a(i2, i3, 0, j2, i4);
        c(c7766lR, k2.d);
        ((Handler) TD2.o(this.c)).obtainMessage(1, k2).sendToTarget();
    }

    @InterfaceC5056aJ2(otherwise = 5)
    public void p(RuntimeException runtimeException) {
        this.d.set(runtimeException);
    }

    public void q() {
        if (this.f) {
            i();
            this.b.quit();
        }
        this.f = false;
    }

    public void r() {
        if (!this.f) {
            this.b.start();
            this.c = new a(this.b.getLooper());
            this.f = true;
        }
    }

    public void s() throws InterruptedException {
        b();
    }

    @InterfaceC5056aJ2
    public C4210Sf(MediaCodec mediaCodec, HandlerThread handlerThread, CJ cj) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = cj;
        this.d = new AtomicReference<>();
    }
}

package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import o.ES1;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* JADX INFO: Access modifiers changed from: package-private */
@ES1(23)
/* loaded from: classes2.dex */
public final class zzsn implements zzta {
    @InterfaceC8710pF0("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public Handler c;
    public final AtomicReference d;
    public final zzdj e;
    public boolean f;

    public zzsn(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdj zzdjVar = new zzdj(zzdg.a);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = zzdjVar;
        this.d = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* bridge */ /* synthetic */ void f(zzsn zzsnVar, Message message) {
        zzsm zzsmVar;
        int i = message.what;
        zzsm zzsmVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        zzsk.a(zzsnVar.d, null, new IllegalStateException(String.valueOf(message.what)));
                    } else {
                        try {
                            zzsnVar.a.setParameters((Bundle) message.obj);
                        } catch (RuntimeException e) {
                            zzsk.a(zzsnVar.d, null, e);
                        }
                    }
                } else {
                    zzsnVar.e.f();
                }
                if (zzsmVar2 == null) {
                    ArrayDeque arrayDeque = g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzsmVar2);
                    }
                    return;
                }
                return;
            }
            zzsmVar = (zzsm) message.obj;
            int i2 = zzsmVar.a;
            MediaCodec.CryptoInfo cryptoInfo = zzsmVar.d;
            long j = zzsmVar.e;
            int i3 = zzsmVar.f;
            try {
                synchronized (h) {
                    zzsnVar.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                }
            } catch (RuntimeException e2) {
                zzsk.a(zzsnVar.d, null, e2);
            }
        } else {
            zzsmVar = (zzsm) message.obj;
            try {
                zzsnVar.a.queueInputBuffer(zzsmVar.a, 0, zzsmVar.c, zzsmVar.e, zzsmVar.f);
            } catch (RuntimeException e3) {
                zzsk.a(zzsnVar.d, null, e3);
            }
        }
        zzsmVar2 = zzsmVar;
        if (zzsmVar2 == null) {
        }
    }

    public static zzsm i() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzsm();
                }
                return (zzsm) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC11300zs1
    public static byte[] j(@InterfaceC11300zs1 byte[] bArr, @InterfaceC11300zs1 byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= (length = bArr.length)) {
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    @InterfaceC11300zs1
    public static int[] k(@InterfaceC11300zs1 int[] iArr, @InterfaceC11300zs1 int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= (length = iArr.length)) {
            System.arraycopy(iArr, 0, iArr2, 0, length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzta
    public final void a(int i, int i2, zzhm zzhmVar, long j, int i3) {
        c();
        zzsm i4 = i();
        i4.a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = i4.d;
        cryptoInfo.numSubSamples = zzhmVar.f;
        cryptoInfo.numBytesOfClearData = k(zzhmVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = k(zzhmVar.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] j2 = j(zzhmVar.b, cryptoInfo.key);
        j2.getClass();
        cryptoInfo.key = j2;
        byte[] j3 = j(zzhmVar.a, cryptoInfo.iv);
        j3.getClass();
        cryptoInfo.iv = j3;
        cryptoInfo.mode = zzhmVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhmVar.g, zzhmVar.h));
        Handler handler = this.c;
        String str = zzeu.a;
        handler.obtainMessage(2, i4).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzta
    public final void b() {
        if (this.f) {
            try {
                Handler handler = this.c;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    zzdj zzdjVar = this.e;
                    zzdjVar.d();
                    Handler handler2 = this.c;
                    if (handler2 != null) {
                        handler2.obtainMessage(3).sendToTarget();
                        zzdjVar.a();
                        return;
                    }
                    throw null;
                }
                throw null;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzta
    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override // com.google.android.gms.internal.ads.zzta
    public final void d(Bundle bundle) {
        c();
        Handler handler = this.c;
        String str = zzeu.a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzta
    public final void e(int i, int i2, int i3, long j, int i4) {
        c();
        zzsm i5 = i();
        i5.a(i, 0, i3, j, i4);
        Handler handler = this.c;
        String str = zzeu.a;
        handler.obtainMessage(1, i5).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzta
    public final void g() {
        if (this.f) {
            b();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzta
    public final void h() {
        if (!this.f) {
            HandlerThread handlerThread = this.b;
            handlerThread.start();
            this.c = new zzsl(this, handlerThread.getLooper());
            this.f = true;
        }
    }
}

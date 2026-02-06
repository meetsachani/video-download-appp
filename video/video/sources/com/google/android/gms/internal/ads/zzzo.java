package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import o.C10323vs;
import o.InterfaceC11300zs1;
import o.R11;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zzzo extends Handler implements Runnable {
    public final zzzp X;
    public final long Y;
    @InterfaceC11300zs1
    public IOException Y0;
    @InterfaceC11300zs1
    public zzzm Z;
    public int Z0;
    @InterfaceC11300zs1
    public Thread a1;
    public boolean b1;
    public volatile boolean c1;
    public final /* synthetic */ zzzu d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzo(zzzu zzzuVar, Looper looper, zzzp zzzpVar, zzzm zzzmVar, int i, long j) {
        super(looper);
        this.d1 = zzzuVar;
        this.X = zzzpVar;
        this.Z = zzzmVar;
        this.Y = j;
    }

    public final void a(boolean z) {
        this.c1 = z;
        this.Y0 = null;
        if (hasMessages(1)) {
            this.b1 = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.b1 = true;
                    this.X.g();
                    Thread thread = this.a1;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.d1.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzzm zzzmVar = this.Z;
            zzzmVar.getClass();
            zzzmVar.l(this.X, elapsedRealtime, elapsedRealtime - this.Y, true);
            this.Z = null;
        }
    }

    public final void b(int i) throws IOException {
        IOException iOException = this.Y0;
        if (iOException != null && this.Z0 > i) {
            throw iOException;
        }
    }

    public final void c(long j) {
        zzzo zzzoVar;
        boolean z;
        zzzu zzzuVar = this.d1;
        zzzoVar = zzzuVar.b;
        if (zzzoVar == null) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        zzzuVar.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            d();
        }
    }

    public final void d() {
        zzaac zzaacVar;
        zzzo zzzoVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.Y;
        zzzm zzzmVar = this.Z;
        zzzmVar.getClass();
        zzzmVar.n(this.X, elapsedRealtime, j, this.Z0);
        this.Y0 = null;
        zzzu zzzuVar = this.d1;
        zzaacVar = zzzuVar.a;
        zzzoVar = zzzuVar.b;
        zzzoVar.getClass();
        zzaacVar.execute(zzzoVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        long min;
        if (!this.c1) {
            int i4 = message.what;
            if (i4 == 1) {
                d();
            } else if (i4 != 4) {
                zzzu zzzuVar = this.d1;
                zzzuVar.b = null;
                long j2 = this.Y;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - j2;
                zzzm zzzmVar = this.Z;
                zzzmVar.getClass();
                if (this.b1) {
                    zzzmVar.l(this.X, elapsedRealtime, j3, false);
                    return;
                }
                int i5 = message.what;
                if (i5 != 2) {
                    if (i5 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.Y0 = iOException;
                        int i6 = this.Z0 + 1;
                        this.Z0 = i6;
                        zzzn h = zzzmVar.h(this.X, elapsedRealtime, j3, iOException, i6);
                        i = h.a;
                        if (i == 3) {
                            zzzuVar.c = this.Y0;
                            return;
                        }
                        i2 = h.a;
                        if (i2 != 2) {
                            i3 = h.a;
                            if (i3 == 1) {
                                this.Z0 = 1;
                            }
                            j = h.b;
                            if (j != C10323vs.b) {
                                min = h.b;
                            } else {
                                min = Math.min((this.Z0 - 1) * 1000, 5000);
                            }
                            c(min);
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    zzzmVar.i(this.X, elapsedRealtime, j3);
                } catch (RuntimeException e) {
                    zzdx.d(R11.d.f1, "Unexpected exception handling load completed", e);
                    this.d1.c = new zzzs(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.b1;
                this.a1 = Thread.currentThread();
            }
            if (!z) {
                zzzp zzzpVar = this.X;
                String simpleName = zzzpVar.getClass().getSimpleName();
                Trace.beginSection("load:" + simpleName);
                try {
                    zzzpVar.h();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.a1 = null;
                Thread.interrupted();
            }
            if (!this.c1) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.c1) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.c1) {
                zzdx.d(R11.d.f1, "Unexpected exception loading stream", e2);
                obtainMessage(3, new zzzs(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.c1) {
                zzdx.d(R11.d.f1, "OutOfMemory error loading stream", e3);
                obtainMessage(3, new zzzs(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.c1) {
                zzdx.d(R11.d.f1, "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}

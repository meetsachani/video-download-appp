package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o.C10323vs;
import o.C3307Iz;
import o.C4128Rj1;
import o.C5594cY;
import o.C6079eY;
import o.C6322fY;
import o.C9811tl1;
import o.ES1;
import o.I3;
import o.InterfaceC11300zs1;
import o.InterfaceC8557od0;
import o.InterfaceC8710pF0;
import o.ZX;

/* loaded from: classes2.dex */
public final class zzri implements zzqi {
    public static final Object a0 = new Object();
    @InterfaceC8710pF0("releaseExecutorLock")
    @InterfaceC11300zs1
    public static ScheduledExecutorService b0;
    @InterfaceC8710pF0("releaseExecutorLock")
    public static int c0;
    public long A;
    public long B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public float G;
    @InterfaceC11300zs1
    public ByteBuffer H;
    public int I;
    @InterfaceC11300zs1
    public ByteBuffer J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public zzf P;
    @InterfaceC11300zs1
    public zzpk Q;
    public long R;
    public boolean S;
    public boolean T;
    @InterfaceC11300zs1
    public Looper U;
    public long V;
    public long W;
    public Handler X;
    public final zzqy Y;
    public final zzqo Z;
    @InterfaceC11300zs1
    public final Context a;
    public final zzqn b;
    public final zzrs c;
    public final zzfyc d;
    public final zzfyc e;
    public final zzqm f;
    public final ArrayDeque g;
    public zzrg h;
    public final zzrc i;
    public final zzrc j;
    @InterfaceC11300zs1
    public zzpc k;
    @InterfaceC11300zs1
    public zzqf l;
    @InterfaceC11300zs1
    public zzqx m;
    public zzqx n;

    /* renamed from: o  reason: collision with root package name */
    public zzck f292o;
    @InterfaceC11300zs1
    public AudioTrack p;
    public zzpe q;
    public zzpj r;
    @InterfaceC11300zs1
    public zzrb s;
    public zze t;
    @InterfaceC11300zs1
    public zzqz u;
    public zzqz v;
    public zzbb w;
    public boolean x;
    public long y;
    public long z;

    public /* synthetic */ zzri(zzqw zzqwVar, zzrh zzrhVar) {
        Context context;
        Context context2;
        Context applicationContext;
        zzpe zzpeVar;
        zzqy zzqyVar;
        zzqo zzqoVar;
        context = zzqwVar.a;
        if (context != null) {
            context2 = zzqwVar.a;
            applicationContext = context2.getApplicationContext();
        } else {
            applicationContext = null;
        }
        this.a = applicationContext;
        this.t = zze.b;
        if (applicationContext == null) {
            zzpeVar = zzqwVar.b;
        } else {
            zzpeVar = null;
        }
        this.q = zzpeVar;
        zzqyVar = zzqwVar.f;
        this.Y = zzqyVar;
        zzqoVar = zzqwVar.g;
        zzqoVar.getClass();
        this.Z = zzqoVar;
        this.f = new zzqm(new zzrd(this, null));
        zzqn zzqnVar = new zzqn();
        this.b = zzqnVar;
        zzrs zzrsVar = new zzrs();
        this.c = zzrsVar;
        this.d = zzfyc.J(new zzcr(), zzqnVar, zzrsVar);
        this.e = zzfyc.J(new zzrr(), zzqnVar, zzrsVar);
        this.G = 1.0f;
        this.O = 0;
        this.P = new zzf(0, 0.0f);
        zzbb zzbbVar = zzbb.d;
        this.v = new zzqz(zzbbVar, 0L, 0L, null);
        this.w = zzbbVar;
        this.x = false;
        this.g = new ArrayDeque();
        this.i = new zzrc();
        this.j = new zzrc();
    }

    public static /* synthetic */ void E(zzri zzriVar) {
        if (zzriVar.W >= 300000) {
            ((zzrm) zzriVar.l).a.I2 = true;
            zzriVar.W = 0L;
        }
    }

    public static /* synthetic */ void G(AudioTrack audioTrack, final zzqf zzqfVar, Handler handler, final zzqc zzqcVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzqfVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqa zzqaVar;
                        zzqaVar = ((zzrm) zzqf.this).a.x2;
                        zzqaVar.p(zzqcVar);
                    }
                });
            }
            synchronized (a0) {
                try {
                    int i = c0 - 1;
                    c0 = i;
                    if (i == 0) {
                        b0.shutdown();
                        b0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (zzqfVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqa zzqaVar;
                        zzqaVar = ((zzrm) zzqf.this).a.x2;
                        zzqaVar.p(zzqcVar);
                    }
                });
            }
            synchronized (a0) {
                try {
                    int i2 = c0 - 1;
                    c0 = i2;
                    if (i2 == 0) {
                        b0.shutdown();
                        b0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean I() {
        boolean z;
        synchronized (a0) {
            if (c0 > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static boolean a0(AudioTrack audioTrack) {
        if (Build.VERSION.SDK_INT >= 29 && ZX.a(audioTrack)) {
            return true;
        }
        return false;
    }

    public static final AudioTrack c0(zzqc zzqcVar, zze zzeVar, int i, zzz zzzVar) throws zzqe {
        zzz zzzVar2;
        Exception exc;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzeVar.a().a).setAudioFormat(zzeu.S(zzqcVar.b, zzqcVar.c, zzqcVar.a)).setTransferMode(1).setBufferSizeInBytes(zzqcVar.e).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    C6322fY.a(sessionId, zzqcVar.d);
                } catch (IllegalArgumentException | UnsupportedOperationException e) {
                    exc = e;
                    zzzVar2 = zzzVar;
                    throw new zzqe(0, zzqcVar.b, zzqcVar.c, zzqcVar.a, zzqcVar.e, zzzVar2, zzqcVar.d, exc);
                }
            }
            AudioTrack build = sessionId.build();
            int state = build.getState();
            if (state == 1) {
                return build;
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzqe(state, zzqcVar.b, zzqcVar.c, zzqcVar.a, zzqcVar.e, zzzVar, zzqcVar.d, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            zzzVar2 = zzzVar;
            exc = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final boolean C() {
        if (!Z()) {
            return true;
        }
        if (this.K && !w()) {
            return true;
        }
        return false;
    }

    public final void H(zzpe zzpeVar) {
        String name;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.U;
        if (looper != myLooper) {
            String str = "null";
            if (looper == null) {
                name = "null";
            } else {
                name = looper.getThread().getName();
            }
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + str + ") is not the playback looper (" + name + C9811tl1.d);
        }
        zzpe zzpeVar2 = this.q;
        if (zzpeVar2 != null && !zzpeVar.equals(zzpeVar2)) {
            this.q = zzpeVar;
            zzqf zzqfVar = this.l;
            if (zzqfVar != null) {
                ((zzrm) zzqfVar).a.A();
            }
        }
    }

    public final long J() {
        zzqx zzqxVar = this.n;
        if (zzqxVar.c == 0) {
            return this.y / zzqxVar.b;
        }
        return this.z;
    }

    public final long K() {
        zzqx zzqxVar = this.n;
        if (zzqxVar.c == 0) {
            long j = this.A;
            long j2 = zzqxVar.d;
            String str = zzeu.a;
            return ((j + j2) - 1) / j2;
        }
        return this.B;
    }

    public final AudioTrack L(zzqx zzqxVar) throws zzqe {
        try {
            return c0(zzqxVar.a(), this.t, this.O, zzqxVar.a);
        } catch (zzqe e) {
            zzqf zzqfVar = this.l;
            if (zzqfVar != null) {
                zzqfVar.a(e);
            }
            throw e;
        }
    }

    public final void M(long j) {
        zzbb zzbbVar;
        boolean z;
        zzqa zzqaVar;
        if (b0()) {
            zzqy zzqyVar = this.Y;
            zzbbVar = this.w;
            zzqyVar.c(zzbbVar);
        } else {
            zzbbVar = zzbb.d;
        }
        zzbb zzbbVar2 = zzbbVar;
        this.w = zzbbVar2;
        if (b0()) {
            zzqy zzqyVar2 = this.Y;
            z = this.x;
            zzqyVar2.d(z);
        } else {
            z = false;
        }
        this.x = z;
        this.g.add(new zzqz(zzbbVar2, Math.max(0L, j), zzeu.O(K(), this.n.e), null));
        X();
        zzqf zzqfVar = this.l;
        if (zzqfVar != null) {
            boolean z2 = this.x;
            zzqaVar = ((zzrm) zzqfVar).a.x2;
            zzqaVar.w(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void N(boolean z) {
        this.x = z;
        U(this.w);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(long j) throws zzqh {
        zzqf zzqfVar;
        zzqh zzqhVar;
        zzqf zzqfVar2;
        if (this.J != null) {
            zzrc zzrcVar = this.j;
            if (!zzrcVar.c()) {
                int remaining = this.J.remaining();
                boolean z = true;
                int write = this.p.write(this.J, remaining, 1);
                this.R = SystemClock.elapsedRealtime();
                if (write < 0) {
                    if (write == -6 || write == -32) {
                        if (K() <= 0) {
                            if (a0(this.p)) {
                                P();
                            }
                        }
                        zzqhVar = new zzqh(write, this.n.a, z);
                        zzqfVar2 = this.l;
                        if (zzqfVar2 != null) {
                            zzqfVar2.a(zzqhVar);
                        }
                        if (!zzqhVar.Y && this.a != null) {
                            this.q = zzpe.c;
                            throw zzqhVar;
                        } else {
                            zzrcVar.b(zzqhVar);
                            return;
                        }
                    }
                    z = false;
                    zzqhVar = new zzqh(write, this.n.a, z);
                    zzqfVar2 = this.l;
                    if (zzqfVar2 != null) {
                    }
                    if (!zzqhVar.Y) {
                    }
                    zzrcVar.b(zzqhVar);
                    return;
                }
                zzrcVar.a();
                if (a0(this.p)) {
                    if (this.B > 0) {
                        this.T = false;
                    }
                    if (this.N && (zzqfVar = this.l) != null && write < remaining) {
                        zzrm zzrmVar = (zzrm) zzqfVar;
                    }
                }
                int i = this.n.c;
                if (i == 0) {
                    this.A += write;
                }
                if (write == remaining) {
                    if (i != 0) {
                        if (this.J != this.H) {
                            z = false;
                        }
                        zzdc.f(z);
                        this.B += this.C * this.I;
                    }
                    this.J = null;
                }
            }
        }
    }

    public final void P() {
        if (this.n.c == 1) {
            this.S = true;
        }
    }

    @InterfaceC8557od0({"audioCapabilities"})
    public final void Q() {
        Context context;
        if (this.r == null && (context = this.a) != null) {
            this.U = Looper.myLooper();
            zzpj zzpjVar = new zzpj(context, new zzqs(this), this.t, this.Q);
            this.r = zzpjVar;
            this.q = zzpjVar.c();
        }
        this.q.getClass();
    }

    public final void R() {
        if (!this.L) {
            this.L = true;
            this.f.b(K());
            if (a0(this.p)) {
                this.M = false;
            }
            this.p.stop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        r0 = r2.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r0.hasRemaining() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        r2.f292o.e(r2.H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(long j) throws zzqh {
        O(j);
        if (this.J == null) {
            if (this.f292o.h()) {
                while (!this.f292o.g()) {
                    while (true) {
                        ByteBuffer b = this.f292o.b();
                        if (!b.hasRemaining()) {
                            break;
                        }
                        V(b);
                        O(j);
                        if (this.J != null) {
                            return;
                        }
                    }
                }
                return;
            }
            ByteBuffer byteBuffer = this.H;
            if (byteBuffer != null) {
                V(byteBuffer);
                O(j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final boolean T(zzz zzzVar) {
        if (a(zzzVar) != 0) {
            return true;
        }
        return false;
    }

    public final void U(zzbb zzbbVar) {
        zzqz zzqzVar = new zzqz(zzbbVar, C10323vs.b, C10323vs.b, null);
        if (Z()) {
            this.u = zzqzVar;
        } else {
            this.v = zzqzVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.J == null) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        if (byteBuffer.hasRemaining()) {
            if (this.n.c == 0) {
                int K = (int) zzeu.K(zzeu.N(20L), this.n.e);
                long K2 = K();
                long j = K;
                if (K2 < j) {
                    zzqx zzqxVar = this.n;
                    int i11 = zzqxVar.g;
                    int i12 = zzqxVar.d;
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i13 = (int) K2;
                    while (byteBuffer.hasRemaining() && i13 < K) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 21) {
                                        if (i11 != 22) {
                                            if (i11 != 268435456) {
                                                if (i11 != 1342177280) {
                                                    if (i11 == 1610612736) {
                                                        i7 = (byteBuffer.get() & 255) << 24;
                                                        i8 = (byteBuffer.get() & 255) << 16;
                                                        i9 = (byteBuffer.get() & 255) << 8;
                                                        i10 = byteBuffer.get() & 255;
                                                    } else {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    i4 = (byteBuffer.get() & 255) << 24;
                                                    i5 = (byteBuffer.get() & 255) << 16;
                                                    i6 = (byteBuffer.get() & 255) << 8;
                                                }
                                            } else {
                                                i = (byteBuffer.get() & 255) << 24;
                                                i2 = (byteBuffer.get() & 255) << 16;
                                            }
                                        } else {
                                            i7 = byteBuffer.get() & 255;
                                            i8 = (byteBuffer.get() & 255) << 8;
                                            i9 = (byteBuffer.get() & 255) << 16;
                                            i10 = (byteBuffer.get() & 255) << 24;
                                        }
                                        i3 = i7 | i8 | i9 | i10;
                                    } else {
                                        i4 = (byteBuffer.get() & 255) << 8;
                                        i5 = (byteBuffer.get() & 255) << 16;
                                        i6 = (byteBuffer.get() & 255) << 24;
                                    }
                                    i3 = i4 | i5 | i6;
                                } else {
                                    float max = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                    if (max < 0.0f) {
                                        f = (-max) * (-2.1474836E9f);
                                    } else {
                                        f = max * 2.1474836E9f;
                                    }
                                    i3 = (int) f;
                                }
                            } else {
                                i3 = (byteBuffer.get() & 255) << 24;
                            }
                            int i14 = (int) ((i3 * i13) / j);
                            if (i11 == 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
                                        if (i11 != 21) {
                                            if (i11 != 22) {
                                                if (i11 != 268435456) {
                                                    if (i11 != 1342177280) {
                                                        if (i11 == 1610612736) {
                                                            order.put((byte) (i14 >> 24));
                                                            order.put((byte) (i14 >> 16));
                                                            order.put((byte) (i14 >> 8));
                                                            order.put((byte) i14);
                                                        } else {
                                                            throw new IllegalStateException();
                                                        }
                                                    } else {
                                                        order.put((byte) (i14 >> 24));
                                                        order.put((byte) (i14 >> 16));
                                                        order.put((byte) (i14 >> 8));
                                                    }
                                                } else {
                                                    order.put((byte) (i14 >> 24));
                                                    order.put((byte) (i14 >> 16));
                                                }
                                            } else {
                                                order.put((byte) i14);
                                                order.put((byte) (i14 >> 8));
                                                order.put((byte) (i14 >> 16));
                                                order.put((byte) (i14 >> 24));
                                            }
                                        } else {
                                            order.put((byte) (i14 >> 8));
                                            order.put((byte) (i14 >> 16));
                                            order.put((byte) (i14 >> 24));
                                        }
                                    } else if (i14 < 0) {
                                        order.putFloat((-i14) / (-2.1474836E9f));
                                    } else {
                                        order.putFloat(i14 / 2.1474836E9f);
                                    }
                                } else {
                                    order.put((byte) (i14 >> 24));
                                }
                            } else {
                                order.put((byte) (i14 >> 16));
                                order.put((byte) (i14 >> 24));
                            }
                            if (byteBuffer.position() != position + i12) {
                                i13++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        int i142 = (int) ((i3 * i13) / j);
                        if (i11 == 2) {
                        }
                        if (byteBuffer.position() != position + i12) {
                        }
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.J = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.J = byteBuffer2;
        }
    }

    public final void W() {
        if (Z()) {
            this.p.setVolume(this.G);
        }
    }

    public final void X() {
        zzck zzckVar = this.n.i;
        this.f292o = zzckVar;
        zzckVar.c();
    }

    public final boolean Y() throws zzqh {
        if (!this.f292o.h()) {
            O(Long.MIN_VALUE);
            if (this.J != null) {
                return false;
            }
            return true;
        }
        this.f292o.d();
        S(Long.MIN_VALUE);
        if (!this.f292o.g()) {
            return false;
        }
        ByteBuffer byteBuffer = this.J;
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            return false;
        }
        return true;
    }

    public final boolean Z() {
        return this.p != null;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final int a(zzz zzzVar) {
        Q();
        if (C4128Rj1.N.equals(zzzVar.f301o)) {
            int i = zzzVar.G;
            if (!zzeu.k(i)) {
                zzdx.f(C5594cY.B0, "Invalid PCM encoding: " + i);
                return 0;
            } else if (i == 2) {
                return 2;
            } else {
                return 1;
            }
        } else if (this.q.b(zzzVar, this.t) == null) {
            return 0;
        } else {
            return 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void b(int i) {
        if (this.O != i) {
            this.O = i;
            e();
        }
    }

    public final boolean b0() {
        zzqx zzqxVar = this.n;
        if (zzqxVar.c == 0) {
            int i = zzqxVar.a.G;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final zzbb c() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @ES1(29)
    public final void d(int i, int i2) {
        AudioTrack audioTrack = this.p;
        if (audioTrack != null) {
            a0(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void e() {
        if (Z()) {
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.T = false;
            this.C = 0;
            this.v = new zzqz(this.w, 0L, 0L, null);
            this.F = 0L;
            this.u = null;
            this.g.clear();
            this.H = null;
            this.I = 0;
            this.J = null;
            this.L = false;
            this.K = false;
            this.M = false;
            this.c.p();
            X();
            zzqm zzqmVar = this.f;
            if (zzqmVar.h()) {
                this.p.pause();
            }
            if (a0(this.p)) {
                zzrg zzrgVar = this.h;
                zzrgVar.getClass();
                zzrgVar.b(this.p);
            }
            final zzqc a = this.n.a();
            zzqx zzqxVar = this.m;
            if (zzqxVar != null) {
                this.n = zzqxVar;
                this.m = null;
            }
            zzqmVar.c();
            zzrb zzrbVar = this.s;
            if (zzrbVar != null) {
                zzrbVar.b();
                this.s = null;
            }
            final AudioTrack audioTrack = this.p;
            final zzqf zzqfVar = this.l;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (a0) {
                try {
                    if (b0 == null) {
                        String str = zzeu.a;
                        b0 = Executors.newSingleThreadScheduledExecutor(new ThreadFactory("ExoPlayer:AudioTrackReleaseThread") { // from class: com.google.android.gms.internal.ads.zzet
                            public final /* synthetic */ String a = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                String str2 = zzeu.a;
                                return new Thread(runnable, this.a);
                            }
                        });
                    }
                    c0++;
                    b0.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqp
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzri.G(audioTrack, zzqfVar, handler, a);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.p = null;
        }
        this.j.a();
        this.i.a();
        this.V = 0L;
        this.W = 0L;
        Handler handler2 = this.X;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void f(float f) {
        if (this.G != f) {
            this.G = f;
            W();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void g() {
        this.D = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void h() {
        this.N = false;
        if (Z()) {
            if (this.f.k() || a0(this.p)) {
                this.p.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void i() {
        this.N = true;
        if (Z()) {
            this.f.f();
            this.p.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void j() throws zzqh {
        if (!this.K && Z() && Y()) {
            R();
            this.K = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void k() {
        zzpj zzpjVar = this.r;
        if (zzpjVar != null) {
            zzpjVar.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void l() {
        e();
        zzfyc zzfycVar = this.d;
        int size = zzfycVar.size();
        for (int i = 0; i < size; i++) {
            ((zzcn) zzfycVar.get(i)).e();
        }
        zzfyc zzfycVar2 = this.e;
        int size2 = zzfycVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzcn) zzfycVar2.get(i2)).e();
        }
        zzck zzckVar = this.f292o;
        if (zzckVar != null) {
            zzckVar.f();
        }
        this.N = false;
        this.S = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final long m(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (Z() && !this.E) {
            long min = Math.min(this.f.a(), zzeu.O(K(), this.n.e));
            while (true) {
                arrayDeque = this.g;
                if (arrayDeque.isEmpty() || min < ((zzqz) arrayDeque.getFirst()).c) {
                    break;
                }
                this.v = (zzqz) arrayDeque.remove();
            }
            zzqz zzqzVar = this.v;
            long j2 = min - zzqzVar.c;
            long L = zzeu.L(j2, zzqzVar.a.a);
            if (arrayDeque.isEmpty()) {
                long a = this.Y.a(j2);
                zzqz zzqzVar2 = this.v;
                j = zzqzVar2.b + a;
                zzqzVar2.d = a - L;
            } else {
                zzqz zzqzVar3 = this.v;
                j = zzqzVar3.b + L + zzqzVar3.d;
            }
            long b = this.Y.b();
            long O = j + zzeu.O(b, this.n.e);
            long j3 = this.V;
            if (b > j3) {
                long O2 = zzeu.O(b - j3, this.n.e);
                this.V = b;
                this.W += O2;
                if (this.X == null) {
                    this.X = new Handler(Looper.myLooper());
                }
                this.X.removeCallbacksAndMessages(null);
                this.X.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzri.E(zzri.this);
                    }
                }, 100L);
            }
            return O;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void n(zzz zzzVar, int i, @InterfaceC11300zs1 int[] iArr) throws zzqd {
        zzck zzckVar;
        int i2;
        int i3;
        int i4;
        int intValue;
        int i5;
        int i6;
        boolean z;
        int i7;
        Q();
        if (C4128Rj1.N.equals(zzzVar.f301o)) {
            int i8 = zzzVar.G;
            zzdc.d(zzeu.k(i8));
            int i9 = zzzVar.E;
            i4 = zzeu.F(i8) * i9;
            zzfxz zzfxzVar = new zzfxz();
            zzfxzVar.i(this.d);
            zzfxzVar.h(this.Y.e());
            zzckVar = new zzck(zzfxzVar.j());
            if (zzckVar.equals(this.f292o)) {
                zzckVar = this.f292o;
            }
            this.c.q(zzzVar.H, zzzVar.I);
            this.b.o(iArr);
            try {
                zzcl a = zzckVar.a(new zzcl(zzzVar.F, i9, i8));
                int i10 = a.c;
                i2 = a.a;
                int i11 = a.b;
                int D = zzeu.D(i11);
                int F = zzeu.F(i10) * i11;
                i3 = 0;
                intValue = D;
                i5 = i10;
                i6 = F;
            } catch (zzcm e) {
                throw new zzqd(e, zzzVar);
            }
        } else {
            zzckVar = new zzck(zzfyc.F());
            i2 = zzzVar.F;
            zzpn zzpnVar = zzpn.d;
            Pair b = this.q.b(zzzVar, this.t);
            if (b != null) {
                int intValue2 = ((Integer) b.first).intValue();
                i3 = 2;
                i4 = -1;
                intValue = ((Integer) b.second).intValue();
                i5 = intValue2;
                i6 = -1;
            } else {
                throw new zzqd("Unable to configure passthrough for: ".concat(String.valueOf(zzzVar)), zzzVar);
            }
        }
        int i12 = i2;
        if (i5 != 0) {
            if (intValue != 0) {
                int i13 = zzzVar.j;
                if (C4128Rj1.X.equals(zzzVar.f301o) && i13 == -1) {
                    i13 = I3.b;
                }
                int i14 = i13;
                int minBufferSize = AudioTrack.getMinBufferSize(i12, intValue, i5);
                if (minBufferSize != -2) {
                    z = true;
                } else {
                    z = false;
                }
                zzdc.f(z);
                if (i6 != -1) {
                    i7 = i6;
                } else {
                    i7 = 1;
                }
                int i15 = i5;
                int b2 = zzrk.b(minBufferSize, i15, i3, i7, i12, i14);
                int i16 = i7;
                this.S = false;
                zzqx zzqxVar = new zzqx(zzzVar, i4, i3, i6, i12, intValue, i15, (((Math.max(minBufferSize, b2) + i16) - 1) / i16) * i16, zzckVar, false, false, false);
                if (Z()) {
                    this.m = zzqxVar;
                    return;
                } else {
                    this.n = zzqxVar;
                    return;
                }
            }
            throw new zzqd("Invalid output channel config (mode=" + i3 + ") for: " + String.valueOf(zzzVar), zzzVar);
        }
        throw new zzqd("Invalid output encoding (mode=" + i3 + ") for: " + String.valueOf(zzzVar), zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final zzpn o(zzz zzzVar) {
        if (this.S) {
            return zzpn.d;
        }
        return this.Z.a(zzzVar, this.t);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0261  */
    @Override // com.google.android.gms.internal.ads.zzqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(ByteBuffer byteBuffer, long j, int i) throws zzqe, zzqh {
        boolean z;
        AudioTrack L;
        boolean z2;
        zzqa zzqaVar;
        zzpc zzpcVar;
        LogSessionId logSessionId;
        boolean equals;
        zzqx zzqxVar;
        boolean z3;
        boolean z4;
        int b;
        int i2;
        int i3;
        byte b2;
        int i4;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.H;
        if (byteBuffer2 == null || byteBuffer == byteBuffer2) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        if (this.m != null) {
            if (!Y()) {
                return false;
            }
            zzqx zzqxVar2 = this.m;
            zzqx zzqxVar3 = this.n;
            if (zzqxVar3.c == zzqxVar2.c && zzqxVar3.g == zzqxVar2.g && zzqxVar3.e == zzqxVar2.e && zzqxVar3.f == zzqxVar2.f && zzqxVar3.d == zzqxVar2.d) {
                this.n = zzqxVar2;
                this.m = null;
                AudioTrack audioTrack = this.p;
                if (audioTrack != null && a0(audioTrack)) {
                    boolean z5 = this.n.k;
                }
            } else {
                R();
                if (w()) {
                    return false;
                }
                e();
            }
            M(j);
        }
        if (!Z()) {
            try {
                if (this.i.c()) {
                    return false;
                }
                try {
                    zzqxVar = this.n;
                } catch (zzqe e) {
                    zzqx zzqxVar4 = this.n;
                    if (zzqxVar4.h > 1000000) {
                        zzqx zzqxVar5 = new zzqx(zzqxVar4.a, zzqxVar4.b, zzqxVar4.c, zzqxVar4.d, zzqxVar4.e, zzqxVar4.f, zzqxVar4.g, 1000000, zzqxVar4.i, false, false, false);
                        try {
                            L = L(zzqxVar5);
                            this.n = zzqxVar5;
                        } catch (zzqe e2) {
                            e.addSuppressed(e2);
                            P();
                            throw e;
                        }
                    }
                    P();
                    throw e;
                }
                if (zzqxVar != null) {
                    L = L(zzqxVar);
                    this.p = L;
                    if (a0(L)) {
                        AudioTrack audioTrack2 = this.p;
                        if (this.h == null) {
                            this.h = new zzrg(this);
                        }
                        this.h.a(audioTrack2);
                        boolean z6 = this.n.k;
                    }
                    if (Build.VERSION.SDK_INT >= 31 && (zzpcVar = this.k) != null) {
                        AudioTrack audioTrack3 = this.p;
                        LogSessionId a = zzpcVar.a();
                        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                        equals = a.equals(logSessionId);
                        if (!equals) {
                            C6079eY.a(audioTrack3, a);
                        }
                    }
                    this.O = this.p.getAudioSessionId();
                    zzqm zzqmVar = this.f;
                    AudioTrack audioTrack4 = this.p;
                    zzqx zzqxVar6 = this.n;
                    if (zzqxVar6.c == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzqmVar.d(audioTrack4, z2, zzqxVar6.g, zzqxVar6.d, zzqxVar6.h);
                    W();
                    int i7 = this.P.a;
                    zzpk zzpkVar = this.Q;
                    if (zzpkVar != null) {
                        zzqt.a(this.p, zzpkVar);
                        zzpj zzpjVar = this.r;
                        if (zzpjVar != null) {
                            zzpjVar.h(this.Q.a);
                        }
                    }
                    zzpj zzpjVar2 = this.r;
                    if (zzpjVar2 != null) {
                        this.s = new zzrb(this.p, zzpjVar2);
                    }
                    this.E = true;
                    zzqf zzqfVar = this.l;
                    if (zzqfVar != null) {
                        zzqc a2 = this.n.a();
                        zzqaVar = ((zzrm) zzqfVar).a.x2;
                        zzqaVar.o(a2);
                    }
                } else {
                    throw null;
                }
            } catch (zzqe e3) {
                if (!e3.Y) {
                    this.i.b(e3);
                    return false;
                }
                throw e3;
            }
        }
        this.i.a();
        if (this.E) {
            this.F = Math.max(0L, j);
            this.D = false;
            this.E = false;
            M(j);
            if (this.N) {
                i();
            }
        }
        zzqm zzqmVar2 = this.f;
        zzqmVar2.j(K());
        if (this.H == null) {
            if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                z3 = true;
            } else {
                z3 = false;
            }
            zzdc.d(z3);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzqx zzqxVar7 = this.n;
            if (zzqxVar7.c != 0 && this.C == 0) {
                int i8 = zzqxVar7.g;
                if (i8 != 20) {
                    if (i8 != 30) {
                        switch (i8) {
                            case 5:
                            case 6:
                                b = zzacn.a(byteBuffer);
                                z4 = true;
                                break;
                            case 7:
                            case 8:
                                break;
                            case 9:
                                b = zzaeg.c(zzeu.E(byteBuffer, byteBuffer.position()));
                                if (b == -1) {
                                    throw new IllegalArgumentException();
                                }
                                z4 = true;
                                break;
                            case 10:
                                b = 1024;
                                z4 = true;
                                break;
                            case 11:
                            case 12:
                                b = 2048;
                                z4 = true;
                                break;
                            default:
                                switch (i8) {
                                    case 14:
                                        int i9 = zzacn.g;
                                        int position = byteBuffer.position();
                                        int limit = byteBuffer.limit() - 10;
                                        int i10 = position;
                                        while (true) {
                                            if (i10 <= limit) {
                                                if ((zzeu.E(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                                                    i5 = i10 - position;
                                                } else {
                                                    i10++;
                                                }
                                            } else {
                                                i5 = -1;
                                            }
                                        }
                                        if (i5 == -1) {
                                            b = 0;
                                            break;
                                        } else {
                                            int i11 = byteBuffer.get(byteBuffer.position() + i5 + 7) & 255;
                                            int position2 = byteBuffer.position() + i5;
                                            if (i11 == 187) {
                                                i6 = 9;
                                            } else {
                                                i6 = 8;
                                            }
                                            b = (40 << ((byteBuffer.get(position2 + i6) >> 4) & 7)) * 16;
                                            break;
                                        }
                                    case 15:
                                        b = 512;
                                        break;
                                    case 16:
                                        break;
                                    case 17:
                                        int i12 = zzacr.b;
                                        byte[] bArr = new byte[16];
                                        int position3 = byteBuffer.position();
                                        byteBuffer.get(bArr);
                                        byteBuffer.position(position3);
                                        b = zzacr.b(new zzej(bArr, 16)).c;
                                        break;
                                    case 18:
                                        break;
                                    default:
                                        throw new IllegalStateException("Unexpected audio encoding: " + i8);
                                }
                                z4 = true;
                                break;
                        }
                    }
                    int i13 = zzadm.j;
                    if (byteBuffer.getInt(0) != -233094848) {
                        if (byteBuffer.getInt(0) != -398277519) {
                            if (byteBuffer.getInt(0) == 622876772) {
                                b = 4096;
                                z4 = true;
                            } else {
                                int position4 = byteBuffer.position();
                                byte b3 = byteBuffer.get(position4);
                                if (b3 != -2) {
                                    if (b3 != -1) {
                                        if (b3 != 31) {
                                            i3 = (byteBuffer.get(position4 + 4) & 1) << 6;
                                            i4 = byteBuffer.get(position4 + 5) & C3307Iz.T;
                                            i2 = (i4 >> 2) | i3;
                                            z4 = true;
                                        } else {
                                            i3 = (byteBuffer.get(position4 + 5) & 7) << 4;
                                            b2 = byteBuffer.get(position4 + 6);
                                        }
                                    } else {
                                        i3 = (byteBuffer.get(position4 + 4) & 7) << 4;
                                        b2 = byteBuffer.get(position4 + 7);
                                    }
                                    i4 = b2 & 60;
                                    i2 = (i4 >> 2) | i3;
                                    z4 = true;
                                } else {
                                    z4 = true;
                                    i2 = ((byteBuffer.get(position4 + 5) & 1) << 6) | ((byteBuffer.get(position4 + 4) & C3307Iz.T) >> 2);
                                }
                                b = (i2 + 1) * 32;
                            }
                        }
                        b = 1024;
                        z4 = true;
                    } else {
                        z4 = true;
                        b = 1024;
                    }
                } else {
                    z4 = true;
                    b = zzaei.b(byteBuffer);
                }
                this.C = b;
                if (b == 0) {
                    return z4;
                }
            }
            if (this.u != null) {
                if (!Y()) {
                    return false;
                }
                M(j);
                this.u = null;
            }
            long O = this.F + zzeu.O(J() - this.c.o(), this.n.a.F);
            if (!this.D && Math.abs(O - j) > 200000) {
                zzqf zzqfVar2 = this.l;
                if (zzqfVar2 != null) {
                    zzqfVar2.a(new zzqg(j, O));
                }
                this.D = true;
            }
            if (this.D) {
                if (!Y()) {
                    return false;
                }
                long j2 = j - O;
                this.F += j2;
                this.D = false;
                M(j);
                zzqf zzqfVar3 = this.l;
                if (zzqfVar3 != null && j2 != 0) {
                    ((zzrm) zzqfVar3).a.U0();
                }
            }
            if (this.n.c == 0) {
                this.y += byteBuffer.remaining();
            } else {
                this.z += this.C * i;
            }
            this.H = byteBuffer;
            this.I = i;
        }
        S(j);
        if (!this.H.hasRemaining()) {
            this.H = null;
            this.I = 0;
            return true;
        } else if (!zzqmVar2.i(K())) {
            return false;
        } else {
            zzdx.f(C5594cY.B0, "Resetting stalled audio track");
            e();
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void q(zzbb zzbbVar) {
        float f = zzbbVar.a;
        String str = zzeu.a;
        this.w = new zzbb(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzbbVar.b, 8.0f)));
        U(zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void r(zzdg zzdgVar) {
        this.f.e(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @ES1(23)
    public final void s(@InterfaceC11300zs1 AudioDeviceInfo audioDeviceInfo) {
        zzpk zzpkVar;
        if (audioDeviceInfo == null) {
            zzpkVar = null;
        } else {
            zzpkVar = new zzpk(audioDeviceInfo);
        }
        this.Q = zzpkVar;
        zzpj zzpjVar = this.r;
        if (zzpjVar != null) {
            zzpjVar.h(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.p;
        if (audioTrack != null) {
            zzqt.a(audioTrack, this.Q);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void t(zzf zzfVar) {
        if (this.P.equals(zzfVar)) {
            return;
        }
        if (this.p != null) {
            int i = this.P.a;
        }
        this.P = zzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void u(zzqf zzqfVar) {
        this.l = zzqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void v(zze zzeVar) {
        if (this.t.equals(zzeVar)) {
            return;
        }
        this.t = zzeVar;
        zzpj zzpjVar = this.r;
        if (zzpjVar != null) {
            zzpjVar.g(zzeVar);
        }
        e();
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final boolean w() {
        if (Z()) {
            if ((Build.VERSION.SDK_INT < 29 || !ZX.a(this.p) || !this.M) && this.f.g(K())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    public final void x(@InterfaceC11300zs1 zzpc zzpcVar) {
        this.k = zzpcVar;
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzcdo extends zzcdi implements zzhg {
    public static final AtomicInteger j1 = new AtomicInteger(0);
    public String Y0;
    public final zzcbv Z0;
    public boolean a1;
    public final zzcdn b1;
    public final zzccs c1;
    public ByteBuffer d1;
    public boolean e1;
    public final Object f1;
    public final String g1;
    public final int h1;
    public boolean i1;

    public zzcdo(zzcbw zzcbwVar, zzcbv zzcbvVar) {
        super(zzcbwVar);
        String str;
        int i;
        this.Z0 = zzcbvVar;
        this.b1 = new zzcdn();
        this.c1 = new zzccs();
        this.f1 = new Object();
        if (zzcbwVar != null) {
            str = zzcbwVar.x();
        } else {
            str = null;
        }
        this.g1 = (String) zzfva.d(str).b("");
        if (zzcbwVar != null) {
            i = zzcbwVar.e();
        } else {
            i = 0;
        }
        this.h1 = i;
        j1.incrementAndGet();
    }

    public static final String D(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.l(str)));
    }

    public static int z() {
        return j1.get();
    }

    public final String A() {
        return this.Y0;
    }

    public final ByteBuffer B() {
        synchronized (this.f1) {
            try {
                ByteBuffer byteBuffer = this.d1;
                if (byteBuffer != null && !this.e1) {
                    byteBuffer.flip();
                    this.e1 = true;
                }
                this.a1 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.d1;
    }

    public final boolean C() {
        return this.i1;
    }

    public final void E() {
        boolean z;
        int a = (int) this.b1.a();
        int a2 = (int) this.c1.a(this.d1);
        int position = this.d1.position();
        int round = Math.round(a2 * (position / a));
        int O = zzcbn.O();
        int Q = zzcbn.Q();
        String str = this.Y0;
        String D = D(str);
        long j = round;
        if (round > 0) {
            z = true;
        } else {
            z = false;
        }
        p(str, D, position, a, j, a2, z, O, Q);
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void f(zzgg zzggVar, zzgl zzglVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdi, com.google.android.gms.common.api.Releasable
    public final void g() {
        j1.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void h(zzgg zzggVar, zzgl zzglVar, boolean z) {
        if (zzggVar instanceof zzgt) {
            this.b1.b((zzgt) zzggVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void i(zzgg zzggVar, zzgl zzglVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void j(zzgg zzggVar, zzgl zzglVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final void l() {
        this.a1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:
        r23.i1 = true;
        o(r24, r4, (int) r23.c1.a(r23.d1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:? -> B:23:0x00cf). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(String str) {
        String str2;
        String str3;
        this.Y0 = str;
        String str4 = "error";
        String D = D(str);
        int i = 0;
        try {
            zzgo zzgoVar = new zzgo();
            zzgoVar.f(this.Y);
            zzcbv zzcbvVar = this.Z0;
            zzgoVar.c(zzcbvVar.d);
            zzgoVar.d(zzcbvVar.e);
            zzgoVar.b(true);
            zzgoVar.e(this);
            zzgg a = zzgoVar.a();
            if (zzcbvVar.i) {
                a = new zzccq(this.X, a, this.g1, this.h1, null, null);
            }
            a.a(new zzgl(Uri.parse(str), 0L, -1L, null));
            zzcbw zzcbwVar = (zzcbw) this.Z.get();
            if (zzcbwVar != null) {
                zzcbwVar.z(D, this);
            }
            Clock d = com.google.android.gms.ads.internal.zzv.d();
            long a2 = d.a();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N)).longValue();
            this.d1 = ByteBuffer.allocate(zzcbvVar.c);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = a2;
            while (true) {
                int D2 = a.D(bArr, i, Math.min(this.d1.remaining(), i2));
                if (D2 == -1) {
                    break;
                }
                synchronized (this.f1) {
                    try {
                        if (!this.a1) {
                            str2 = str4;
                            try {
                                this.d1.put(bArr, 0, D2);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } else {
                            str2 = str4;
                        }
                        try {
                            if (this.d1.remaining() <= 0) {
                                E();
                                break;
                            }
                            str3 = this.a1;
                            try {
                                if (str3 == 0) {
                                    long a3 = d.a();
                                    if (a3 - j >= longValue) {
                                        E();
                                        j = a3;
                                    }
                                    if (a3 - a2 <= 1000 * longValue2) {
                                        str4 = str2;
                                        i = 0;
                                        i2 = 8192;
                                    } else {
                                        throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                    }
                                } else {
                                    throw new IOException("Precache abort at " + this.d1.limit() + " bytes");
                                }
                            } catch (Exception e) {
                                e = e;
                                String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.g("Failed to preload url " + str + " Exception: " + str5);
                                m(str, D, str3, str5);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String str52 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            int i32 = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.g("Failed to preload url " + str + " Exception: " + str52);
                            m(str, D, str3, str52);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str4;
        }
    }
}

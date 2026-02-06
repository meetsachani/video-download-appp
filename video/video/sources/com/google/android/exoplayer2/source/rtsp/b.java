package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.source.rtsp.a;
import java.io.IOException;
import o.C10323vs;
import o.C5105aW1;
import o.C9542sf;
import o.CU;
import o.EV1;
import o.InterfaceC11300zs1;
import o.InterfaceC4421Uj0;
import o.InterfaceC4518Vj0;
import o.KE1;
import o.NU;
import o.R11;
import o.TD2;
import o.WY;

@Deprecated
/* loaded from: classes2.dex */
public final class b implements R11.e {
    public final int a;
    public final C5105aW1 b;
    public final a c;
    public final InterfaceC4518Vj0 d;
    public final a.InterfaceC0095a f;
    @InterfaceC11300zs1
    public com.google.android.exoplayer2.source.rtsp.a g;
    public EV1 h;
    public WY i;
    public volatile boolean j;
    public volatile long l;
    public final Handler e = TD2.C();
    public volatile long k = C10323vs.b;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, com.google.android.exoplayer2.source.rtsp.a aVar);
    }

    public b(int i, C5105aW1 c5105aW1, a aVar, InterfaceC4518Vj0 interfaceC4518Vj0, a.InterfaceC0095a interfaceC0095a) {
        this.a = i;
        this.b = c5105aW1;
        this.c = aVar;
        this.d = interfaceC4518Vj0;
        this.f = interfaceC0095a;
    }

    @Override // o.R11.e
    public void a() throws IOException {
        if (this.j) {
            this.j = false;
        }
        try {
            if (this.g == null) {
                com.google.android.exoplayer2.source.rtsp.a a2 = this.f.a(this.a);
                this.g = a2;
                final String d = a2.d();
                final com.google.android.exoplayer2.source.rtsp.a aVar = this.g;
                this.e.post(new Runnable() { // from class: o.DV1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.rtsp.b.this.c.a(d, aVar);
                    }
                });
                this.i = new WY((CU) C9542sf.g(this.g), 0L, -1L);
                EV1 ev1 = new EV1(this.b.a, this.a);
                this.h = ev1;
                ev1.b(this.d);
            }
            while (!this.j) {
                if (this.k != C10323vs.b) {
                    ((EV1) C9542sf.g(this.h)).a(this.l, this.k);
                    this.k = C10323vs.b;
                }
                if (((EV1) C9542sf.g(this.h)).j((InterfaceC4421Uj0) C9542sf.g(this.i), new KE1()) == -1) {
                    break;
                }
            }
            this.j = false;
            if (((com.google.android.exoplayer2.source.rtsp.a) C9542sf.g(this.g)).l()) {
                NU.a(this.g);
                this.g = null;
            }
        } catch (Throwable th) {
            if (((com.google.android.exoplayer2.source.rtsp.a) C9542sf.g(this.g)).l()) {
                NU.a(this.g);
                this.g = null;
            }
            throw th;
        }
    }

    @Override // o.R11.e
    public void c() {
        this.j = true;
    }

    public void d() {
        ((EV1) C9542sf.g(this.h)).f();
    }

    public void e(long j, long j2) {
        this.k = j;
        this.l = j2;
    }

    public void f(int i) {
        if (!((EV1) C9542sf.g(this.h)).e()) {
            this.h.h(i);
        }
    }

    public void g(long j) {
        if (j != C10323vs.b && !((EV1) C9542sf.g(this.h)).e()) {
            this.h.i(j);
        }
    }
}

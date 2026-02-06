package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.source.rtsp.f;
import java.io.IOException;
import javax.net.SocketFactory;
import o.AbstractC10541wl;
import o.AbstractC3696My0;
import o.AbstractC7373jp2;
import o.BR0;
import o.C10323vs;
import o.C6361fi0;
import o.C6816hW1;
import o.C8322nf1;
import o.C9419s82;
import o.C9542sf;
import o.InterfaceC10877y8;
import o.InterfaceC11300zs1;
import o.InterfaceC4261Sr2;
import o.InterfaceC4410Ug1;
import o.InterfaceC5056aJ2;
import o.InterfaceC6181ey;
import o.InterfaceC7583kh1;
import o.InterfaceC9552sh1;
import o.InterfaceC9656t70;
import o.M11;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class RtspMediaSource extends AbstractC10541wl {
    public static final long m1 = 8000;
    public final C8322nf1 c1;
    public final a.InterfaceC0095a d1;
    public final String e1;
    public final Uri f1;
    public final SocketFactory g1;
    public final boolean h1;
    public boolean j1;
    public boolean k1;
    public long i1 = C10323vs.b;
    public boolean l1 = true;

    /* loaded from: classes2.dex */
    public class a implements f.c {
        public a() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.f.c
        public void a() {
            RtspMediaSource.this.j1 = false;
            RtspMediaSource.this.y0();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.f.c
        public void b(C6816hW1 c6816hW1) {
            RtspMediaSource.this.i1 = TD2.j1(c6816hW1.a());
            RtspMediaSource.this.j1 = !c6816hW1.c();
            RtspMediaSource.this.k1 = c6816hW1.c();
            RtspMediaSource.this.l1 = false;
            RtspMediaSource.this.y0();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends AbstractC3696My0 {
        public b(AbstractC7373jp2 abstractC7373jp2) {
            super(abstractC7373jp2);
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            super.l(i, bVar, z);
            bVar.a1 = true;
            return bVar;
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            super.v(i, dVar, j);
            dVar.g1 = true;
            return dVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends IOException {
        public c(String str) {
            super(str);
        }

        public c(Throwable th) {
            super(th);
        }

        public c(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends c {
        public d(String str) {
            super(str);
        }
    }

    static {
        C6361fi0.a("goog.exo.rtsp");
    }

    @InterfaceC5056aJ2
    public RtspMediaSource(C8322nf1 c8322nf1, a.InterfaceC0095a interfaceC0095a, String str, SocketFactory socketFactory, boolean z) {
        this.c1 = c8322nf1;
        this.d1 = interfaceC0095a;
        this.e1 = str;
        this.f1 = ((C8322nf1.h) C9542sf.g(c8322nf1.Y)).X;
        this.g1 = socketFactory;
        this.h1 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() {
        AbstractC7373jp2 c9419s82 = new C9419s82(this.i1, this.j1, false, this.k1, (Object) null, this.c1);
        if (this.l1) {
            c9419s82 = new b(c9419s82);
        }
        p0(c9419s82);
    }

    @Override // o.InterfaceC7583kh1
    public void Q() {
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        return new f(interfaceC10877y8, this.d1, this.f1, new a(), this.e1, this.g1, this.h1);
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.c1;
    }

    @Override // o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        y0();
    }

    @Override // o.AbstractC10541wl
    public void q0() {
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        ((f) interfaceC4410Ug1).Y();
    }

    /* loaded from: classes2.dex */
    public static final class Factory implements InterfaceC9552sh1 {
        public long c = RtspMediaSource.m1;
        public String d = C6361fi0.c;
        public SocketFactory e = SocketFactory.getDefault();
        public boolean f;
        public boolean g;

        @Override // o.InterfaceC7583kh1.a
        public int[] b() {
            return new int[]{3};
        }

        @Override // o.InterfaceC7583kh1.a
        /* renamed from: f */
        public RtspMediaSource e(C8322nf1 c8322nf1) {
            a.InterfaceC0095a mVar;
            C9542sf.g(c8322nf1.Y);
            if (this.f) {
                mVar = new k(this.c);
            } else {
                mVar = new m(this.c);
            }
            return new RtspMediaSource(c8322nf1, mVar, this.d, this.e, this.g);
        }

        @InterfaceC6181ey
        public Factory g(boolean z) {
            this.g = z;
            return this;
        }

        @InterfaceC6181ey
        public Factory i(boolean z) {
            this.f = z;
            return this;
        }

        @InterfaceC6181ey
        public Factory k(SocketFactory socketFactory) {
            this.e = socketFactory;
            return this;
        }

        @InterfaceC6181ey
        public Factory l(@BR0(from = 1) long j) {
            boolean z;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.c = j;
            return this;
        }

        @InterfaceC6181ey
        public Factory m(String str) {
            this.d = str;
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        /* renamed from: h */
        public Factory d(InterfaceC9656t70 interfaceC9656t70) {
            return this;
        }

        @Override // o.InterfaceC7583kh1.a
        /* renamed from: j */
        public Factory a(M11 m11) {
            return this;
        }
    }
}

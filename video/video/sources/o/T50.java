package o;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.AbstractC3283Ir2;
import o.AbstractC7373jp2;
import o.AbstractC7692l81;
import o.C5972e60;
import o.C7177j10;
import o.C8322nf1;
import o.FU;
import o.InterfaceC3643Mk;
import o.InterfaceC4410Ug1;
import o.InterfaceC6859hi0;
import o.InterfaceC7583kh1;
import o.T50;

@Deprecated
/* loaded from: classes2.dex */
public final class T50 {

    /* renamed from: o  reason: collision with root package name */
    public static final C7177j10.d f614o = C7177j10.d.p2.B().L(true).c1(false).B();
    public final C8322nf1.h a;
    @InterfaceC11300zs1
    public final InterfaceC7583kh1 b;
    public final C7177j10 c;
    public final InterfaceC10712xR1[] d;
    public final SparseIntArray e;
    public final Handler f;
    public final AbstractC7373jp2.d g;
    public boolean h;
    public c i;
    public g j;
    public C10079ur2[] k;
    public AbstractC7692l81.a[] l;
    public List<InterfaceC6859hi0>[][] m;
    public List<InterfaceC6859hi0>[][] n;

    /* loaded from: classes2.dex */
    public class a implements NG2 {
    }

    /* loaded from: classes2.dex */
    public class b implements InterfaceC8085mh {
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(T50 t50, IOException iOException);

        void b(T50 t50);
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC3643Mk {
        public e() {
        }

        @Override // o.InterfaceC3643Mk
        @InterfaceC11300zs1
        public InterfaceC4261Sr2 e() {
            return null;
        }

        @Override // o.InterfaceC3643Mk
        public long g() {
            return 0L;
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // o.InterfaceC3643Mk
        public void c(InterfaceC3643Mk.a aVar) {
        }

        @Override // o.InterfaceC3643Mk
        public void a(Handler handler, InterfaceC3643Mk.a aVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static class f extends IOException {
    }

    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC7583kh1.c, InterfaceC4410Ug1.a, Handler.Callback {
        public static final int f1 = 0;
        public static final int g1 = 1;
        public static final int h1 = 2;
        public static final int i1 = 3;
        public static final int j1 = 0;
        public static final int k1 = 1;
        public final InterfaceC7583kh1 X;
        public final T50 Y;
        public final HandlerThread a1;
        public final Handler b1;
        public AbstractC7373jp2 c1;
        public InterfaceC4410Ug1[] d1;
        public boolean e1;
        public final InterfaceC10877y8 Z = new CW(true, 65536);
        public final ArrayList<InterfaceC4410Ug1> Y0 = new ArrayList<>();
        public final Handler Z0 = TD2.F(new Handler.Callback() { // from class: o.U50
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean b;
                b = T50.g.this.b(message);
                return b;
            }
        });

        public g(InterfaceC7583kh1 interfaceC7583kh1, T50 t50) {
            this.X = interfaceC7583kh1;
            this.Y = t50;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.a1 = handlerThread;
            handlerThread.start();
            Handler B = TD2.B(handlerThread.getLooper(), this);
            this.b1 = B;
            B.sendEmptyMessage(0);
        }

        @Override // o.InterfaceC7583kh1.c
        public void L(InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2) {
            InterfaceC4410Ug1[] interfaceC4410Ug1Arr;
            if (this.c1 == null) {
                if (abstractC7373jp2.u(0, new AbstractC7373jp2.d()).k()) {
                    this.Z0.obtainMessage(1, new f()).sendToTarget();
                    return;
                }
                this.c1 = abstractC7373jp2;
                this.d1 = new InterfaceC4410Ug1[abstractC7373jp2.n()];
                int i = 0;
                while (true) {
                    interfaceC4410Ug1Arr = this.d1;
                    if (i >= interfaceC4410Ug1Arr.length) {
                        break;
                    }
                    InterfaceC4410Ug1 h = this.X.h(new InterfaceC7583kh1.b(abstractC7373jp2.t(i)), this.Z, 0L);
                    this.d1[i] = h;
                    this.Y0.add(h);
                    i++;
                }
                for (InterfaceC4410Ug1 interfaceC4410Ug1 : interfaceC4410Ug1Arr) {
                    interfaceC4410Ug1.o(this, 0L);
                }
            }
        }

        public final boolean b(Message message) {
            if (this.e1) {
                return false;
            }
            int i = message.what;
            if (i == 0) {
                try {
                    this.Y.J();
                } catch (C3824Og0 e) {
                    this.Z0.obtainMessage(1, new IOException(e)).sendToTarget();
                }
                return true;
            } else if (i != 1) {
                return false;
            } else {
                d();
                this.Y.I((IOException) TD2.o(message.obj));
                return true;
            }
        }

        @Override // o.G02.a
        /* renamed from: c */
        public void l(InterfaceC4410Ug1 interfaceC4410Ug1) {
            if (this.Y0.contains(interfaceC4410Ug1)) {
                this.b1.obtainMessage(2, interfaceC4410Ug1).sendToTarget();
            }
        }

        public void d() {
            if (this.e1) {
                return;
            }
            this.e1 = true;
            this.b1.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                int i2 = 0;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        InterfaceC4410Ug1[] interfaceC4410Ug1Arr = this.d1;
                        if (interfaceC4410Ug1Arr != null) {
                            int length = interfaceC4410Ug1Arr.length;
                            while (i2 < length) {
                                this.X.s(interfaceC4410Ug1Arr[i2]);
                                i2++;
                            }
                        }
                        this.X.u(this);
                        this.b1.removeCallbacksAndMessages(null);
                        this.a1.quit();
                        return true;
                    }
                    InterfaceC4410Ug1 interfaceC4410Ug1 = (InterfaceC4410Ug1) message.obj;
                    if (this.Y0.contains(interfaceC4410Ug1)) {
                        interfaceC4410Ug1.d(0L);
                    }
                    return true;
                }
                try {
                    if (this.d1 == null) {
                        this.X.Q();
                    } else {
                        while (i2 < this.Y0.size()) {
                            this.Y0.get(i2).m();
                            i2++;
                        }
                    }
                    this.b1.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e) {
                    this.Z0.obtainMessage(1, e).sendToTarget();
                }
                return true;
            }
            this.X.G(this, null, ND1.b);
            this.b1.sendEmptyMessage(1);
            return true;
        }

        @Override // o.InterfaceC4410Ug1.a
        public void j(InterfaceC4410Ug1 interfaceC4410Ug1) {
            this.Y0.remove(interfaceC4410Ug1);
            if (this.Y0.isEmpty()) {
                this.b1.removeMessages(1);
                this.Z0.sendEmptyMessage(0);
            }
        }
    }

    public T50(C8322nf1 c8322nf1, @InterfaceC11300zs1 InterfaceC7583kh1 interfaceC7583kh1, C2989Fr2 c2989Fr2, InterfaceC10712xR1[] interfaceC10712xR1Arr) {
        this.a = (C8322nf1.h) C9542sf.g(c8322nf1.Y);
        this.b = interfaceC7583kh1;
        C7177j10 c7177j10 = new C7177j10(c2989Fr2, new d.a(null));
        this.c = c7177j10;
        this.d = interfaceC10712xR1Arr;
        this.e = new SparseIntArray();
        c7177j10.e(new AbstractC3283Ir2.a() { // from class: o.O50
            @Override // o.AbstractC3283Ir2.a
            public final void b() {
                T50.d();
            }
        }, new e(null));
        this.f = TD2.E();
        this.g = new AbstractC7373jp2.d();
    }

    public static InterfaceC10712xR1[] D(InterfaceC11198zR1 interfaceC11198zR1) {
        InterfaceC10469wR1[] a2 = interfaceC11198zR1.a(TD2.E(), new a(), new b(), new InterfaceC3850Om2() { // from class: o.Q50
            @Override // o.InterfaceC3850Om2
            public final void G(C8274nS c8274nS) {
                T50.a(c8274nS);
            }
        }, new InterfaceC6864hj1() { // from class: o.R50
            @Override // o.InterfaceC6864hj1
            public final void s(C4224Si1 c4224Si1) {
                T50.e(c4224Si1);
            }
        });
        InterfaceC10712xR1[] interfaceC10712xR1Arr = new InterfaceC10712xR1[a2.length];
        for (int i = 0; i < a2.length; i++) {
            interfaceC10712xR1Arr[i] = a2[i].x();
        }
        return interfaceC10712xR1Arr;
    }

    public static boolean H(C8322nf1.h hVar) {
        if (TD2.P0(hVar.X, hVar.Y) == 4) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void a(C8274nS c8274nS) {
    }

    public static /* synthetic */ InterfaceC9170r70 b(InterfaceC9170r70 interfaceC9170r70, C8322nf1 c8322nf1) {
        return interfaceC9170r70;
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e(C4224Si1 c4224Si1) {
    }

    public static /* synthetic */ void f(T50 t50, c cVar) {
        t50.getClass();
        cVar.b(t50);
    }

    public static InterfaceC7583kh1 q(C5972e60 c5972e60, FU.a aVar) {
        return r(c5972e60, aVar, null);
    }

    public static InterfaceC7583kh1 r(C5972e60 c5972e60, FU.a aVar, @InterfaceC11300zs1 InterfaceC9170r70 interfaceC9170r70) {
        return s(c5972e60.d(), aVar, interfaceC9170r70);
    }

    public static InterfaceC7583kh1 s(C8322nf1 c8322nf1, FU.a aVar, @InterfaceC11300zs1 final InterfaceC9170r70 interfaceC9170r70) {
        JZ jz = new JZ(aVar, InterfaceC4809Yj0.a);
        if (interfaceC9170r70 != null) {
            jz.d(new InterfaceC9656t70() { // from class: o.M50
                @Override // o.InterfaceC9656t70
                public final InterfaceC9170r70 a(C8322nf1 c8322nf12) {
                    return T50.b(InterfaceC9170r70.this, c8322nf12);
                }
            });
        }
        return jz.e(c8322nf1);
    }

    public static T50 t(Context context, C8322nf1 c8322nf1) {
        C9542sf.a(H((C8322nf1.h) C9542sf.g(c8322nf1.Y)));
        return w(c8322nf1, x(context), null, null, null);
    }

    public static T50 u(Context context, C8322nf1 c8322nf1, @InterfaceC11300zs1 InterfaceC11198zR1 interfaceC11198zR1, @InterfaceC11300zs1 FU.a aVar) {
        return w(c8322nf1, x(context), interfaceC11198zR1, aVar, null);
    }

    public static T50 v(C8322nf1 c8322nf1, C2989Fr2 c2989Fr2, @InterfaceC11300zs1 InterfaceC11198zR1 interfaceC11198zR1, @InterfaceC11300zs1 FU.a aVar) {
        return w(c8322nf1, c2989Fr2, interfaceC11198zR1, aVar, null);
    }

    public static T50 w(C8322nf1 c8322nf1, C2989Fr2 c2989Fr2, @InterfaceC11300zs1 InterfaceC11198zR1 interfaceC11198zR1, @InterfaceC11300zs1 FU.a aVar, @InterfaceC11300zs1 InterfaceC9170r70 interfaceC9170r70) {
        boolean z;
        InterfaceC7583kh1 s;
        InterfaceC10712xR1[] interfaceC10712xR1Arr;
        boolean H = H((C8322nf1.h) C9542sf.g(c8322nf1.Y));
        if (!H && aVar == null) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        if (H) {
            s = null;
        } else {
            s = s(c8322nf1, (FU.a) TD2.o(aVar), interfaceC9170r70);
        }
        if (interfaceC11198zR1 != null) {
            interfaceC10712xR1Arr = D(interfaceC11198zR1);
        } else {
            interfaceC10712xR1Arr = new InterfaceC10712xR1[0];
        }
        return new T50(c8322nf1, s, c2989Fr2, interfaceC10712xR1Arr);
    }

    public static C7177j10.d x(Context context) {
        return C7177j10.d.L(context).B().L(true).c1(false).B();
    }

    @InterfaceC11300zs1
    public Object A() {
        if (this.b == null) {
            return null;
        }
        o();
        if (this.j.c1.w() <= 0) {
            return null;
        }
        return this.j.c1.u(0, this.g).Y0;
    }

    public AbstractC7692l81.a B(int i) {
        o();
        return this.l[i];
    }

    public int C() {
        if (this.b == null) {
            return 0;
        }
        o();
        return this.k.length;
    }

    public C10079ur2 E(int i) {
        o();
        return this.k[i];
    }

    public List<InterfaceC6859hi0> F(int i, int i2) {
        o();
        return this.n[i][i2];
    }

    public C3773Nr2 G(int i) {
        o();
        return C3087Gr2.a(this.l[i], this.n[i]);
    }

    public final void I(final IOException iOException) {
        ((Handler) C9542sf.g(this.f)).post(new Runnable() { // from class: o.N50
            @Override // java.lang.Runnable
            public final void run() {
                ((T50.c) C9542sf.g(r0.i)).a(T50.this, iOException);
            }
        });
    }

    public final void J() throws C3824Og0 {
        C9542sf.g(this.j);
        C9542sf.g(this.j.d1);
        C9542sf.g(this.j.c1);
        int length = this.j.d1.length;
        int length2 = this.d.length;
        this.m = (List[][]) Array.newInstance(List.class, length, length2);
        this.n = (List[][]) Array.newInstance(List.class, length, length2);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                this.m[i][i2] = new ArrayList();
                this.n[i][i2] = Collections.unmodifiableList(this.m[i][i2]);
            }
        }
        this.k = new C10079ur2[length];
        this.l = new AbstractC7692l81.a[length];
        for (int i3 = 0; i3 < length; i3++) {
            this.k[i3] = this.j.d1[i3].q();
            this.c.i(N(i3).e);
            this.l[i3] = (AbstractC7692l81.a) C9542sf.g(this.c.o());
        }
        O();
        ((Handler) C9542sf.g(this.f)).post(new Runnable() { // from class: o.S50
            @Override // java.lang.Runnable
            public final void run() {
                ((T50.c) C9542sf.g(r0.i)).b(T50.this);
            }
        });
    }

    public void K(final c cVar) {
        boolean z;
        if (this.i == null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        this.i = cVar;
        InterfaceC7583kh1 interfaceC7583kh1 = this.b;
        if (interfaceC7583kh1 != null) {
            this.j = new g(interfaceC7583kh1, this);
        } else {
            this.f.post(new Runnable() { // from class: o.P50
                @Override // java.lang.Runnable
                public final void run() {
                    T50.f(T50.this, cVar);
                }
            });
        }
    }

    public void L() {
        g gVar = this.j;
        if (gVar != null) {
            gVar.d();
        }
        this.c.j();
    }

    public void M(int i, C2989Fr2 c2989Fr2) {
        try {
            o();
            p(i);
            n(i, c2989Fr2);
        } catch (C3824Og0 e2) {
            throw new IllegalStateException(e2);
        }
    }

    @HS1({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    public final C3381Jr2 N(int i) throws C3824Og0 {
        C3381Jr2 k = this.c.k(this.d, this.k[i], new InterfaceC7583kh1.b(this.j.c1.t(i)), this.j.c1);
        for (int i2 = 0; i2 < k.a; i2++) {
            InterfaceC6859hi0 interfaceC6859hi0 = k.c[i2];
            if (interfaceC6859hi0 != null) {
                List<InterfaceC6859hi0> list = this.m[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        InterfaceC6859hi0 interfaceC6859hi02 = list.get(i3);
                        if (interfaceC6859hi02.n().equals(interfaceC6859hi0.n())) {
                            this.e.clear();
                            for (int i4 = 0; i4 < interfaceC6859hi02.length(); i4++) {
                                this.e.put(interfaceC6859hi02.g(i4), 0);
                            }
                            for (int i5 = 0; i5 < interfaceC6859hi0.length(); i5++) {
                                this.e.put(interfaceC6859hi0.g(i5), 0);
                            }
                            int[] iArr = new int[this.e.size()];
                            for (int i6 = 0; i6 < this.e.size(); i6++) {
                                iArr[i6] = this.e.keyAt(i6);
                            }
                            list.set(i3, new d(interfaceC6859hi02.n(), iArr));
                        } else {
                            i3++;
                        }
                    } else {
                        list.add(interfaceC6859hi0);
                        break;
                    }
                }
            }
        }
        return k;
    }

    @HS1({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    public final void O() {
        this.h = true;
    }

    public void j(String... strArr) {
        boolean z;
        try {
            o();
            C7177j10.d.a B = f614o.B();
            B.L(true);
            for (InterfaceC10712xR1 interfaceC10712xR1 : this.d) {
                int d2 = interfaceC10712xR1.d();
                if (d2 != 1) {
                    z = true;
                } else {
                    z = false;
                }
                B.m0(d2, z);
            }
            int C = C();
            for (String str : strArr) {
                C2989Fr2 B2 = B.Y(str).B();
                for (int i = 0; i < C; i++) {
                    n(i, B2);
                }
            }
        } catch (C3824Og0 e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void k(boolean z, String... strArr) {
        boolean z2;
        try {
            o();
            C7177j10.d.a B = f614o.B();
            B.l0(z);
            B.L(true);
            for (InterfaceC10712xR1 interfaceC10712xR1 : this.d) {
                int d2 = interfaceC10712xR1.d();
                if (d2 != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                B.m0(d2, z2);
            }
            int C = C();
            for (String str : strArr) {
                C2989Fr2 B2 = B.d0(str).B();
                for (int i = 0; i < C; i++) {
                    n(i, B2);
                }
            }
        } catch (C3824Og0 e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void l(int i, C2989Fr2 c2989Fr2) {
        try {
            o();
            n(i, c2989Fr2);
        } catch (C3824Og0 e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void m(int i, int i2, C7177j10.d dVar, List<C7177j10.f> list) {
        boolean z;
        try {
            o();
            C7177j10.d.a B = dVar.B();
            for (int i3 = 0; i3 < this.l[i].d(); i3++) {
                if (i3 != i2) {
                    z = true;
                } else {
                    z = false;
                }
                B.H1(i3, z);
            }
            if (list.isEmpty()) {
                n(i, B.B());
                return;
            }
            C10079ur2 h = this.l[i].h(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                B.J1(i2, h, list.get(i4));
                n(i, B.B());
            }
        } catch (C3824Og0 e2) {
            throw new IllegalStateException(e2);
        }
    }

    @HS1({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    public final void n(int i, C2989Fr2 c2989Fr2) throws C3824Og0 {
        this.c.m(c2989Fr2);
        N(i);
        AbstractC6237fB2<C2782Dr2> it = c2989Fr2.t1.values().iterator();
        while (it.hasNext()) {
            this.c.m(c2989Fr2.B().X(it.next()).B());
            N(i);
        }
    }

    @InterfaceC8557od0({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    public final void o() {
        C9542sf.i(this.h);
    }

    public void p(int i) {
        o();
        for (int i2 = 0; i2 < this.d.length; i2++) {
            this.m[i][i2].clear();
        }
    }

    public C5972e60 y(String str, @InterfaceC11300zs1 byte[] bArr) {
        byte[] bArr2;
        C5972e60.b e2 = new C5972e60.b(str, this.a.X).e(this.a.Y);
        C8322nf1.f fVar = this.a.Z;
        if (fVar != null) {
            bArr2 = fVar.f();
        } else {
            bArr2 = null;
        }
        C5972e60.b c2 = e2.d(bArr2).b(this.a.a1).c(bArr);
        if (this.b == null) {
            return c2.a();
        }
        o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            arrayList2.clear();
            int length2 = this.m[i].length;
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.addAll(this.m[i][i2]);
            }
            arrayList.addAll(this.j.d1[i].h(arrayList2));
        }
        return c2.f(arrayList).a();
    }

    public C5972e60 z(@InterfaceC11300zs1 byte[] bArr) {
        return y(this.a.X.toString(), bArr);
    }

    /* loaded from: classes2.dex */
    public static final class d extends AbstractC4037Ql {

        /* loaded from: classes2.dex */
        public static final class a implements InterfaceC6859hi0.b {
            public a() {
            }

            @Override // o.InterfaceC6859hi0.b
            public InterfaceC6859hi0[] a(InterfaceC6859hi0.a[] aVarArr, InterfaceC3643Mk interfaceC3643Mk, InterfaceC7583kh1.b bVar, AbstractC7373jp2 abstractC7373jp2) {
                d dVar;
                InterfaceC6859hi0[] interfaceC6859hi0Arr = new InterfaceC6859hi0[aVarArr.length];
                for (int i = 0; i < aVarArr.length; i++) {
                    InterfaceC6859hi0.a aVar = aVarArr[i];
                    if (aVar == null) {
                        dVar = null;
                    } else {
                        dVar = new d(aVar.a, aVar.b);
                    }
                    interfaceC6859hi0Arr[i] = dVar;
                }
                return interfaceC6859hi0Arr;
            }

            public /* synthetic */ a(a aVar) {
                this();
            }
        }

        public d(C9593sr2 c9593sr2, int[] iArr) {
            super(c9593sr2, iArr);
        }

        @Override // o.InterfaceC6859hi0
        public int f() {
            return 0;
        }

        @Override // o.InterfaceC6859hi0
        @InterfaceC11300zs1
        public Object j() {
            return null;
        }

        @Override // o.InterfaceC6859hi0
        public int u() {
            return 0;
        }

        @Override // o.InterfaceC6859hi0
        public void l(long j, long j2, long j3, List<? extends AbstractC2533Be1> list, InterfaceC2631Ce1[] interfaceC2631Ce1Arr) {
        }
    }
}

package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.C4086Qy1;
import o.C6161et;
import o.SZ1;

@Deprecated
/* renamed from: o.dU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5825dU extends SZ1<C6067eU> {
    public final C4331Tl n;

    /* renamed from: o.dU$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableFutureC8290nW1<C6979iC, IOException> {
        public final /* synthetic */ FU c1;
        public final /* synthetic */ int d1;
        public final /* synthetic */ ZR1 e1;

        public a(FU fu, int i, ZR1 zr1) {
            this.c1 = fu;
            this.d1 = i;
            this.e1 = zr1;
        }

        @Override // o.AbstractRunnableFutureC8290nW1
        /* renamed from: f */
        public C6979iC d() throws IOException {
            return C7535kU.e(this.c1, this.d1, this.e1);
        }
    }

    public C5825dU(C8322nf1 c8322nf1, C6161et.d dVar) {
        this(c8322nf1, dVar, new D6());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(FU fu, C8190n7 c8190n7, long j, long j2, boolean z, ArrayList<SZ1.c> arrayList) throws IOException, InterruptedException {
        InterfaceC7292jU n;
        C5825dU c5825dU = this;
        int i = 0;
        while (i < c8190n7.c.size()) {
            ZR1 zr1 = c8190n7.c.get(i);
            try {
                try {
                    n = c5825dU.n(fu, c8190n7.b, zr1, z);
                } catch (IOException e) {
                    e = e;
                    if (!z) {
                        i++;
                        c5825dU = this;
                    } else {
                        throw e;
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (n != null) {
                long i2 = n.i(j2);
                if (i2 != -1) {
                    String str = ((C4134Rl) TD2.o(c5825dU.n.j(zr1.d))).a;
                    XN1 n2 = zr1.n();
                    if (n2 != null) {
                        arrayList.add(c5825dU.m(zr1, str, j, n2));
                    }
                    XN1 m = zr1.m();
                    if (m != null) {
                        arrayList.add(m(zr1, str, j, m));
                    }
                    long k = n.k();
                    long j3 = (i2 + k) - 1;
                    while (k <= j3) {
                        arrayList.add(m(zr1, str, j + n.c(k), n.g(k)));
                        k++;
                    }
                    i++;
                    c5825dU = this;
                } else {
                    throw new J50("Unbounded segment index");
                }
            } else {
                try {
                    throw new J50("Missing segment index");
                    break;
                } catch (IOException e3) {
                    e = e3;
                    if (!z) {
                    }
                }
            }
        }
    }

    public final SZ1.c m(ZR1 zr1, String str, long j, XN1 xn1) {
        return new SZ1.c(j, C7535kU.b(zr1, str, xn1, 0, AbstractC6044eO0.u()));
    }

    @InterfaceC11300zs1
    public final InterfaceC7292jU n(FU fu, int i, ZR1 zr1, boolean z) throws IOException, InterruptedException {
        InterfaceC7292jU b = zr1.b();
        if (b != null) {
            return b;
        }
        C6979iC c6979iC = (C6979iC) e(new a(fu, i, zr1), z);
        if (c6979iC == null) {
            return null;
        }
        return new C7778lU(c6979iC, zr1.e);
    }

    @Override // o.SZ1
    /* renamed from: o */
    public List<SZ1.c> h(FU fu, C6067eU c6067eU, boolean z) throws IOException, InterruptedException {
        ArrayList<SZ1.c> arrayList = new ArrayList<>();
        for (int i = 0; i < c6067eU.e(); i++) {
            CC1 d = c6067eU.d(i);
            long j1 = TD2.j1(d.b);
            long g = c6067eU.g(i);
            List<C8190n7> list = d.c;
            for (int i2 = 0; i2 < list.size(); i2++) {
                l(fu, list.get(i2), j1, g, z, arrayList);
            }
        }
        return arrayList;
    }

    public C5825dU(C8322nf1 c8322nf1, C6161et.d dVar, Executor executor) {
        this(c8322nf1, new C6310fU(), dVar, executor, 20000L);
    }

    @Deprecated
    public C5825dU(C8322nf1 c8322nf1, C4086Qy1.a<C6067eU> aVar, C6161et.d dVar, Executor executor) {
        this(c8322nf1, aVar, dVar, executor, 20000L);
    }

    public C5825dU(C8322nf1 c8322nf1, C4086Qy1.a<C6067eU> aVar, C6161et.d dVar, Executor executor, long j) {
        super(c8322nf1, aVar, dVar, executor, j);
        this.n = new C4331Tl();
    }
}

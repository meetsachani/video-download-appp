package o;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o.C4086Qy1;
import o.C6161et;
import o.C8863pt;
import o.FH1;
import o.InterfaceC4651Ws0;
import o.InterfaceC8187n60;
import o.OU;

@Deprecated
/* loaded from: classes2.dex */
public abstract class SZ1<M extends InterfaceC4651Ws0<M>> implements InterfaceC8187n60 {
    public static final long l = 20000;
    public static final int m = 131072;
    public final OU a;
    public final C4086Qy1.a<M> b;
    public final ArrayList<C3031Gd2> c;
    public final C6161et.d d;
    public final InterfaceC4844Ys e;
    public final InterfaceC7872lt f;
    @InterfaceC11300zs1
    public final FH1 g;
    public final Executor h;
    public final long i;
    public final ArrayList<AbstractRunnableFutureC8290nW1<?, ?>> j;
    public volatile boolean k;

    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableFutureC8290nW1<M, IOException> {
        public final /* synthetic */ FU c1;
        public final /* synthetic */ OU d1;

        public a(FU fu, OU ou) {
            this.c1 = fu;
            this.d1 = ou;
        }

        @Override // o.AbstractRunnableFutureC8290nW1
        /* renamed from: f */
        public M d() throws IOException {
            return (M) C4086Qy1.h(this.c1, SZ1.this.b, this.d1, 4);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements C8863pt.a {
        public final InterfaceC8187n60.a a;
        public final long b;
        public final int c;
        public long d;
        public int e;

        public b(InterfaceC8187n60.a aVar, long j, int i, long j2, int i2) {
            this.a = aVar;
            this.b = j;
            this.c = i;
            this.d = j2;
            this.e = i2;
        }

        @Override // o.C8863pt.a
        public void a(long j, long j2, long j3) {
            long j4 = this.d + j3;
            this.d = j4;
            this.a.a(this.b, j4, b());
        }

        public final float b() {
            long j = this.b;
            if (j != -1 && j != 0) {
                return (((float) this.d) * 100.0f) / ((float) j);
            }
            int i = this.c;
            if (i != 0) {
                return (this.e * 100.0f) / i;
            }
            return -1.0f;
        }

        public void c() {
            this.e++;
            this.a.a(this.b, this.d, b());
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements Comparable<c> {
        public final long X;
        public final OU Y;

        public c(long j, OU ou) {
            this.X = j;
            this.Y = ou;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(c cVar) {
            return TD2.u(this.X, cVar.X);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends AbstractRunnableFutureC8290nW1<Void, IOException> {
        public final c c1;
        public final C6161et d1;
        @InterfaceC11300zs1
        public final b e1;
        public final byte[] f1;
        public final C8863pt g1;

        public d(c cVar, C6161et c6161et, @InterfaceC11300zs1 b bVar, byte[] bArr) {
            this.c1 = cVar;
            this.d1 = c6161et;
            this.e1 = bVar;
            this.f1 = bArr;
            this.g1 = new C8863pt(c6161et, cVar.Y, bArr, bVar);
        }

        @Override // o.AbstractRunnableFutureC8290nW1
        public void c() {
            this.g1.b();
        }

        @Override // o.AbstractRunnableFutureC8290nW1
        /* renamed from: f */
        public Void d() throws IOException {
            this.g1.a();
            b bVar = this.e1;
            if (bVar != null) {
                bVar.c();
                return null;
            }
            return null;
        }
    }

    @Deprecated
    public SZ1(C8322nf1 c8322nf1, C4086Qy1.a<M> aVar, C6161et.d dVar, Executor executor) {
        this(c8322nf1, aVar, dVar, executor, 20000L);
    }

    public static boolean d(OU ou, OU ou2) {
        if (ou.a.equals(ou2.a)) {
            long j = ou.h;
            if (j != -1 && ou.g + j == ou2.g && TD2.g(ou.i, ou2.i) && ou.j == ou2.j && ou.c == ou2.c && ou.e.equals(ou2.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static OU f(Uri uri) {
        return new OU.b().j(uri).c(1).a();
    }

    public static void i(List<c> list, InterfaceC7872lt interfaceC7872lt, long j) {
        c cVar;
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar2 = list.get(i2);
            String a2 = interfaceC7872lt.a(cVar2.Y);
            Integer num = (Integer) hashMap.get(a2);
            if (num == null) {
                cVar = null;
            } else {
                cVar = list.get(num.intValue());
            }
            if (cVar != null && cVar2.X <= cVar.X + j && d(cVar.Y, cVar2.Y)) {
                long j2 = cVar2.Y.h;
                long j3 = -1;
                if (j2 != -1) {
                    j3 = cVar.Y.h + j2;
                }
                list.set(((Integer) C9542sf.g(num)).intValue(), new c(cVar.X, cVar.Y.f(0L, j3)));
            } else {
                hashMap.put(a2, Integer.valueOf(i));
                list.set(i, cVar2);
                i++;
            }
        }
        TD2.z1(list, i, list.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8187n60
    public final void a(@InterfaceC11300zs1 InterfaceC8187n60.a aVar) throws IOException, InterruptedException {
        b bVar;
        C6161et d2;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        FH1 fh1 = this.g;
        if (fh1 != null) {
            fh1.a(-1000);
        }
        try {
            C6161et d3 = this.d.d();
            InterfaceC4651Ws0 g = g(d3, this.a, false);
            if (!this.c.isEmpty()) {
                g = (InterfaceC4651Ws0) g.a(this.c);
            }
            List<c> h = h(d3, g, false);
            Collections.sort(h);
            i(h, this.f, this.i);
            int size = h.size();
            int i = 0;
            long j = 0;
            long j2 = 0;
            for (int size2 = h.size() - 1; size2 >= 0; size2--) {
                OU ou = h.get(size2).Y;
                String a2 = this.f.a(ou);
                long j3 = ou.h;
                if (j3 == -1) {
                    long g2 = InterfaceC6278fM.g(this.e.d(a2));
                    if (g2 != -1) {
                        j3 = g2 - ou.g;
                    }
                }
                long j4 = j3;
                long e = this.e.e(a2, ou.g, j4);
                j2 += e;
                if (j4 != -1) {
                    if (j4 == e) {
                        i++;
                        h.remove(size2);
                    }
                    if (j != -1) {
                        j += j4;
                    }
                } else {
                    j = -1;
                }
            }
            if (aVar != null) {
                bVar = new b(aVar, j, size, j2, i);
            } else {
                bVar = null;
            }
            arrayDeque.addAll(h);
            while (!this.k && !arrayDeque.isEmpty()) {
                FH1 fh12 = this.g;
                if (fh12 != null) {
                    fh12.b(-1000);
                }
                if (!arrayDeque2.isEmpty()) {
                    d dVar = (d) arrayDeque2.removeFirst();
                    d2 = dVar.d1;
                    bArr = dVar.f1;
                } else {
                    d2 = this.d.d();
                    bArr = new byte[131072];
                }
                d dVar2 = new d((c) arrayDeque.removeFirst(), d2, bVar, bArr);
                c(dVar2);
                this.h.execute(dVar2);
                for (int size3 = this.j.size() - 1; size3 >= 0; size3--) {
                    d dVar3 = (d) this.j.get(size3);
                    if (arrayDeque.isEmpty() || dVar3.isDone()) {
                        try {
                            dVar3.get();
                            j(size3);
                            arrayDeque2.addLast(dVar3);
                        } catch (ExecutionException e2) {
                            Throwable th = (Throwable) C9542sf.g(e2.getCause());
                            if (th instanceof FH1.a) {
                                arrayDeque.addFirst(dVar3.c1);
                                j(size3);
                                arrayDeque2.addLast(dVar3);
                            } else if (!(th instanceof IOException)) {
                                TD2.H1(th);
                            } else {
                                throw ((IOException) th);
                            }
                        }
                    }
                }
                dVar2.b();
            }
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                this.j.get(i2).cancel(true);
            }
            for (int size4 = this.j.size() - 1; size4 >= 0; size4--) {
                this.j.get(size4).a();
                j(size4);
            }
            FH1 fh13 = this.g;
            if (fh13 != null) {
                fh13.e(-1000);
            }
        } catch (Throwable th2) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                this.j.get(i3).cancel(true);
            }
            for (int size5 = this.j.size() - 1; size5 >= 0; size5--) {
                this.j.get(size5).a();
                j(size5);
            }
            FH1 fh14 = this.g;
            if (fh14 != null) {
                fh14.e(-1000);
            }
            throw th2;
        }
    }

    public final <T> void c(AbstractRunnableFutureC8290nW1<T, ?> abstractRunnableFutureC8290nW1) throws InterruptedException {
        synchronized (this.j) {
            try {
                if (!this.k) {
                    this.j.add(abstractRunnableFutureC8290nW1);
                } else {
                    throw new InterruptedException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC8187n60
    public void cancel() {
        synchronized (this.j) {
            try {
                this.k = true;
                for (int i = 0; i < this.j.size(); i++) {
                    this.j.get(i).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|28|29|(2:34|(2:36|37)(3:38|39|40))(2:31|32)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r0 = (java.lang.Throwable) o.C9542sf.g(r4.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        if ((r0 instanceof o.FH1.a) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        if ((r0 instanceof java.io.IOException) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
        o.TD2.H1(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        throw ((java.io.IOException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        r3.a();
        k(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T e(AbstractRunnableFutureC8290nW1<T, ?> abstractRunnableFutureC8290nW1, boolean z) throws InterruptedException, IOException {
        if (z) {
            abstractRunnableFutureC8290nW1.run();
            try {
                return abstractRunnableFutureC8290nW1.get();
            } catch (ExecutionException e) {
                Throwable th = (Throwable) C9542sf.g(e.getCause());
                if (!(th instanceof IOException)) {
                    TD2.H1(e);
                } else {
                    throw ((IOException) th);
                }
            }
        }
        while (!this.k) {
            FH1 fh1 = this.g;
            if (fh1 != null) {
                fh1.b(-1000);
            }
            c(abstractRunnableFutureC8290nW1);
            this.h.execute(abstractRunnableFutureC8290nW1);
            return abstractRunnableFutureC8290nW1.get();
        }
        throw new InterruptedException();
    }

    public final M g(FU fu, OU ou, boolean z) throws InterruptedException, IOException {
        return (M) e(new a(fu, ou), z);
    }

    public abstract List<c> h(FU fu, M m2, boolean z) throws IOException, InterruptedException;

    public final void j(int i) {
        synchronized (this.j) {
            this.j.remove(i);
        }
    }

    public final void k(AbstractRunnableFutureC8290nW1<?, ?> abstractRunnableFutureC8290nW1) {
        synchronized (this.j) {
            this.j.remove(abstractRunnableFutureC8290nW1);
        }
    }

    @Override // o.InterfaceC8187n60
    public final void remove() {
        C6161et e = this.d.e();
        try {
            try {
                List<c> h = h(e, g(e, this.a, true), true);
                for (int i = 0; i < h.size(); i++) {
                    this.e.p(this.f.a(h.get(i).Y));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            this.e.p(this.f.a(this.a));
        }
    }

    public SZ1(C8322nf1 c8322nf1, C4086Qy1.a<M> aVar, C6161et.d dVar, Executor executor, long j) {
        C9542sf.g(c8322nf1.Y);
        this.a = f(c8322nf1.Y.X);
        this.b = aVar;
        this.c = new ArrayList<>(c8322nf1.Y.Z0);
        this.d = dVar;
        this.h = executor;
        this.e = (InterfaceC4844Ys) C9542sf.g(dVar.g());
        this.f = dVar.h();
        this.g = dVar.i();
        this.j = new ArrayList<>();
        this.i = TD2.j1(j);
    }
}

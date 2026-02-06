package o;

import java.util.Comparator;
import java.util.TreeSet;

@Deprecated
/* renamed from: o.kZ0 */
/* loaded from: classes2.dex */
public final class C7551kZ0 implements InterfaceC6659gt {
    public final long a;
    public final TreeSet<C8376nt> b = new TreeSet<>(new Comparator() { // from class: o.jZ0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C7551kZ0.g((C8376nt) obj, (C8376nt) obj2);
        }
    });
    public long c;

    public C7551kZ0(long j) {
        this.a = j;
    }

    public static /* synthetic */ int g(C8376nt c8376nt, C8376nt c8376nt2) {
        return h(c8376nt, c8376nt2);
    }

    public static int h(C8376nt c8376nt, C8376nt c8376nt2) {
        long j = c8376nt.a1;
        long j2 = c8376nt2.a1;
        if (j - j2 == 0) {
            return c8376nt.compareTo(c8376nt2);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    @Override // o.InterfaceC4844Ys.b
    public void a(InterfaceC4844Ys interfaceC4844Ys, C8376nt c8376nt) {
        this.b.remove(c8376nt);
        this.c -= c8376nt.Z;
    }

    @Override // o.InterfaceC6659gt
    public boolean b() {
        return true;
    }

    @Override // o.InterfaceC6659gt
    public void c(InterfaceC4844Ys interfaceC4844Ys, String str, long j, long j2) {
        if (j2 != -1) {
            i(interfaceC4844Ys, j2);
        }
    }

    @Override // o.InterfaceC4844Ys.b
    public void d(InterfaceC4844Ys interfaceC4844Ys, C8376nt c8376nt, C8376nt c8376nt2) {
        a(interfaceC4844Ys, c8376nt);
        e(interfaceC4844Ys, c8376nt2);
    }

    @Override // o.InterfaceC4844Ys.b
    public void e(InterfaceC4844Ys interfaceC4844Ys, C8376nt c8376nt) {
        this.b.add(c8376nt);
        this.c += c8376nt.Z;
        i(interfaceC4844Ys, 0L);
    }

    public final void i(InterfaceC4844Ys interfaceC4844Ys, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            interfaceC4844Ys.j(this.b.first());
        }
    }

    @Override // o.InterfaceC6659gt
    public void f() {
    }
}

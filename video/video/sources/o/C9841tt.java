package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import o.InterfaceC4844Ys;

@Deprecated
/* renamed from: o.tt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9841tt implements InterfaceC4844Ys.b {
    public static final String f = "CachedRegionTracker";
    public static final int g = -1;
    public static final int h = -2;
    public final InterfaceC4844Ys a;
    public final String b;
    public final C6979iC c;
    public final TreeSet<a> d = new TreeSet<>();
    public final a e = new a(0, 0);

    /* renamed from: o.tt$a */
    /* loaded from: classes2.dex */
    public static class a implements Comparable<a> {
        public long X;
        public long Y;
        public int Z;

        public a(long j, long j2) {
            this.X = j;
            this.Y = j2;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(a aVar) {
            return TD2.u(this.X, aVar.X);
        }
    }

    public C9841tt(InterfaceC4844Ys interfaceC4844Ys, String str, C6979iC c6979iC) {
        this.a = interfaceC4844Ys;
        this.b = str;
        this.c = c6979iC;
        synchronized (this) {
            try {
                Iterator<C8376nt> descendingIterator = interfaceC4844Ys.r(str, this).descendingIterator();
                while (descendingIterator.hasNext()) {
                    h(descendingIterator.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC4844Ys.b
    public synchronized void a(InterfaceC4844Ys interfaceC4844Ys, C8376nt c8376nt) {
        long j = c8376nt.Y;
        a aVar = new a(j, c8376nt.Z + j);
        a floor = this.d.floor(aVar);
        if (floor == null) {
            I31.d(f, "Removed a span we were not aware of");
            return;
        }
        this.d.remove(floor);
        long j2 = floor.X;
        long j3 = aVar.X;
        if (j2 < j3) {
            a aVar2 = new a(j2, j3);
            int binarySearch = Arrays.binarySearch(this.c.f, aVar2.Y);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            aVar2.Z = binarySearch;
            this.d.add(aVar2);
        }
        long j4 = floor.Y;
        long j5 = aVar.Y;
        if (j4 > j5) {
            a aVar3 = new a(j5 + 1, j4);
            aVar3.Z = floor.Z;
            this.d.add(aVar3);
        }
    }

    @Override // o.InterfaceC4844Ys.b
    public synchronized void e(InterfaceC4844Ys interfaceC4844Ys, C8376nt c8376nt) {
        h(c8376nt);
    }

    public synchronized int g(long j) {
        int i;
        a aVar = this.e;
        aVar.X = j;
        a floor = this.d.floor(aVar);
        if (floor != null) {
            long j2 = floor.Y;
            if (j <= j2 && (i = floor.Z) != -1) {
                C6979iC c6979iC = this.c;
                if (i == c6979iC.d - 1) {
                    if (j2 == c6979iC.f[i] + c6979iC.e[i]) {
                        return -2;
                    }
                }
                return (int) ((c6979iC.h[i] + ((c6979iC.g[i] * (j2 - c6979iC.f[i])) / c6979iC.e[i])) / 1000);
            }
        }
        return -1;
    }

    public final void h(C8376nt c8376nt) {
        long j = c8376nt.Y;
        a aVar = new a(j, c8376nt.Z + j);
        a floor = this.d.floor(aVar);
        a ceiling = this.d.ceiling(aVar);
        boolean i = i(floor, aVar);
        if (i(aVar, ceiling)) {
            if (i) {
                floor.Y = ceiling.Y;
                floor.Z = ceiling.Z;
            } else {
                aVar.Y = ceiling.Y;
                aVar.Z = ceiling.Z;
                this.d.add(aVar);
            }
            this.d.remove(ceiling);
        } else if (i) {
            floor.Y = aVar.Y;
            int i2 = floor.Z;
            while (true) {
                C6979iC c6979iC = this.c;
                if (i2 >= c6979iC.d - 1) {
                    break;
                }
                int i3 = i2 + 1;
                if (c6979iC.f[i3] > floor.Y) {
                    break;
                }
                i2 = i3;
            }
            floor.Z = i2;
        } else {
            int binarySearch = Arrays.binarySearch(this.c.f, aVar.Y);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            aVar.Z = binarySearch;
            this.d.add(aVar);
        }
    }

    public final boolean i(@InterfaceC11300zs1 a aVar, @InterfaceC11300zs1 a aVar2) {
        if (aVar != null && aVar2 != null && aVar.Y == aVar2.X) {
            return true;
        }
        return false;
    }

    public void j() {
        this.a.c(this.b, this);
    }

    @Override // o.InterfaceC4844Ys.b
    public void d(InterfaceC4844Ys interfaceC4844Ys, C8376nt c8376nt, C8376nt c8376nt2) {
    }
}

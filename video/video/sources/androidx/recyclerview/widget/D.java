package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import o.C5484c51;
import o.C9654t62;
import o.FE1;

/* loaded from: classes.dex */
public class D {
    public static final boolean c = false;
    public final C9654t62<RecyclerView.H, a> a = new C9654t62<>();
    public final C5484c51<RecyclerView.H> b = new C5484c51<>();

    /* loaded from: classes.dex */
    public static class a {
        public static final int d = 1;
        public static final int e = 2;
        public static final int f = 4;
        public static final int g = 8;
        public static final int h = 3;
        public static final int i = 12;
        public static final int j = 14;
        public static FE1.a<a> k = new FE1.b(20);
        public int a;
        public RecyclerView.m.d b;
        public RecyclerView.m.d c;

        public static void a() {
            do {
            } while (k.a() != null);
        }

        public static a b() {
            a a = k.a();
            if (a == null) {
                return new a();
            }
            return a;
        }

        public static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            k.b(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.H h, RecyclerView.m.d dVar, RecyclerView.m.d dVar2);

        void b(RecyclerView.H h);

        void c(RecyclerView.H h, RecyclerView.m.d dVar, RecyclerView.m.d dVar2);

        void d(RecyclerView.H h, RecyclerView.m.d dVar, RecyclerView.m.d dVar2);
    }

    public void a(RecyclerView.H h, RecyclerView.m.d dVar) {
        a aVar = this.a.get(h);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(h, aVar);
        }
        aVar.a |= 2;
        aVar.b = dVar;
    }

    public void b(RecyclerView.H h) {
        a aVar = this.a.get(h);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(h, aVar);
        }
        aVar.a |= 1;
    }

    public void c(long j, RecyclerView.H h) {
        this.b.n(j, h);
    }

    public void d(RecyclerView.H h, RecyclerView.m.d dVar) {
        a aVar = this.a.get(h);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(h, aVar);
        }
        aVar.c = dVar;
        aVar.a |= 8;
    }

    public void e(RecyclerView.H h, RecyclerView.m.d dVar) {
        a aVar = this.a.get(h);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(h, aVar);
        }
        aVar.b = dVar;
        aVar.a |= 4;
    }

    public void f() {
        this.a.clear();
        this.b.c();
    }

    public RecyclerView.H g(long j) {
        return this.b.h(j);
    }

    public boolean h(RecyclerView.H h) {
        a aVar = this.a.get(h);
        if (aVar != null && (aVar.a & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean i(RecyclerView.H h) {
        a aVar = this.a.get(h);
        if (aVar != null && (aVar.a & 4) != 0) {
            return true;
        }
        return false;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.H h) {
        p(h);
    }

    public final RecyclerView.m.d l(RecyclerView.H h, int i) {
        a l;
        RecyclerView.m.d dVar;
        int e = this.a.e(h);
        if (e >= 0 && (l = this.a.l(e)) != null) {
            int i2 = l.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                l.a = i3;
                if (i == 4) {
                    dVar = l.b;
                } else if (i == 8) {
                    dVar = l.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.j(e);
                    a.c(l);
                }
                return dVar;
            }
        }
        return null;
    }

    public RecyclerView.m.d m(RecyclerView.H h) {
        return l(h, 8);
    }

    public RecyclerView.m.d n(RecyclerView.H h) {
        return l(h, 4);
    }

    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.H g = this.a.g(size);
            a j = this.a.j(size);
            int i = j.a;
            if ((i & 3) == 3) {
                bVar.b(g);
            } else if ((i & 1) != 0) {
                RecyclerView.m.d dVar = j.b;
                if (dVar == null) {
                    bVar.b(g);
                } else {
                    bVar.c(g, dVar, j.c);
                }
            } else if ((i & 14) == 14) {
                bVar.a(g, j.b, j.c);
            } else if ((i & 12) == 12) {
                bVar.d(g, j.b, j.c);
            } else if ((i & 4) != 0) {
                bVar.c(g, j.b, null);
            } else if ((i & 8) != 0) {
                bVar.a(g, j.b, j.c);
            }
            a.c(j);
        }
    }

    public void p(RecyclerView.H h) {
        a aVar = this.a.get(h);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public void q(RecyclerView.H h) {
        int w = this.b.w() - 1;
        while (true) {
            if (w < 0) {
                break;
            } else if (h == this.b.x(w)) {
                this.b.s(w);
                break;
            } else {
                w--;
            }
        }
        a remove = this.a.remove(h);
        if (remove != null) {
            a.c(remove);
        }
    }
}

package o;

import java.util.Queue;

/* renamed from: o.jk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7352jk1<A, B> {
    public static final int b = 250;
    public final X61<b<A>, B> a;

    /* renamed from: o.jk1$a */
    /* loaded from: classes.dex */
    public class a extends X61<b<A>, B> {
        public a(long j) {
            super(j);
        }

        @Override // o.X61
        /* renamed from: r */
        public void n(b<A> bVar, B b) {
            bVar.c();
        }
    }

    /* renamed from: o.jk1$b */
    /* loaded from: classes.dex */
    public static final class b<A> {
        public static final Queue<b<?>> d = SD2.g(0);
        public int a;
        public int b;
        public A c;

        public static <A> b<A> a(A a, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = d;
            synchronized (queue) {
                bVar = (b<A>) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a, i, i2);
            return bVar;
        }

        public final void b(A a, int i, int i2) {
            this.c = a;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            Queue<b<?>> queue = d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public C7352jk1() {
        this(250L);
    }

    public void a() {
        this.a.b();
    }

    public B b(A a2, int i, int i2) {
        b<A> a3 = b.a(a2, i, i2);
        B k = this.a.k(a3);
        a3.c();
        return k;
    }

    public void c(A a2, int i, int i2, B b2) {
        this.a.o(b.a(a2, i, i2), b2);
    }

    public C7352jk1(long j) {
        this.a = new a(j);
    }
}

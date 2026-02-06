package o;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import java.util.List;
import java.util.Queue;

/* renamed from: o.f11  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6196f11<T> implements AbsListView.OnScrollListener {
    public final int a;
    public final d b;
    public final ComponentCallbacks2C7772lS1 c;
    public final a<T> d;
    public final b<T> e;
    public int f;
    public int g;
    public int i;
    public int h = -1;
    public boolean j = true;

    /* renamed from: o.f11$a */
    /* loaded from: classes.dex */
    public interface a<U> {
        List<U> a(int i);

        C5576cS1<?> b(U u);
    }

    /* renamed from: o.f11$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        int[] a(T t, int i, int i2);
    }

    /* renamed from: o.f11$d */
    /* loaded from: classes.dex */
    public static final class d {
        public final Queue<c> a;

        public d(int i) {
            this.a = SD2.g(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.a.offer(new c());
            }
        }

        public c a(int i, int i2) {
            c poll = this.a.poll();
            this.a.offer(poll);
            poll.Y = i;
            poll.X = i2;
            return poll;
        }
    }

    public C6196f11(ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1, a<T> aVar, b<T> bVar, int i) {
        this.c = componentCallbacks2C7772lS1;
        this.d = aVar;
        this.e = bVar;
        this.a = i;
        this.b = new d(i + 1);
    }

    public final void a() {
        for (int i = 0; i < this.b.a.size(); i++) {
            this.c.z(this.b.a(0, 0));
        }
    }

    public final void b(int i, int i2) {
        int min;
        int i3;
        if (i < i2) {
            i3 = Math.max(this.f, i);
            min = i2;
        } else {
            min = Math.min(this.g, i);
            i3 = i2;
        }
        int min2 = Math.min(this.i, min);
        int min3 = Math.min(this.i, Math.max(0, i3));
        if (i < i2) {
            for (int i4 = min3; i4 < min2; i4++) {
                d(this.d.a(i4), i4, true);
            }
        } else {
            for (int i5 = min2 - 1; i5 >= min3; i5--) {
                d(this.d.a(i5), i5, false);
            }
        }
        this.g = min3;
        this.f = min2;
    }

    public final void c(int i, boolean z) {
        int i2;
        if (this.j != z) {
            this.j = z;
            a();
        }
        if (z) {
            i2 = this.a;
        } else {
            i2 = -this.a;
        }
        b(i, i2 + i);
    }

    public final void d(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                e(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            e(list.get(i3), i, i3);
        }
    }

    public final void e(T t, int i, int i2) {
        int[] a2;
        C5576cS1<?> b2;
        if (t == null || (a2 = this.e.a(t, i, i2)) == null || (b2 = this.d.b(t)) == null) {
            return;
        }
        b2.z1(this.b.a(a2[0], a2[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.i == 0 && i3 == 0) {
            return;
        }
        this.i = i3;
        int i4 = this.h;
        if (i > i4) {
            c(i2 + i, true);
        } else if (i < i4) {
            c(i, false);
        }
        this.h = i;
    }

    /* renamed from: o.f11$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC2856El2<Object> {
        public int X;
        public int Y;
        public InterfaceC5334bS1 Z;

        @Override // o.InterfaceC2856El2
        public void h(U82 u82) {
            u82.d(this.Y, this.X);
        }

        @Override // o.InterfaceC2856El2
        public InterfaceC5334bS1 j() {
            return this.Z;
        }

        @Override // o.InterfaceC2856El2
        public void q(InterfaceC5334bS1 interfaceC5334bS1) {
            this.Z = interfaceC5334bS1;
        }

        @Override // o.IZ0
        public void onDestroy() {
        }

        @Override // o.IZ0
        public void onStart() {
        }

        @Override // o.IZ0
        public void onStop() {
        }

        @Override // o.InterfaceC2856El2
        public void e(U82 u82) {
        }

        @Override // o.InterfaceC2856El2
        public void i(Drawable drawable) {
        }

        @Override // o.InterfaceC2856El2
        public void k(Drawable drawable) {
        }

        @Override // o.InterfaceC2856El2
        public void m(Drawable drawable) {
        }

        @Override // o.InterfaceC2856El2
        public void o(Object obj, InterfaceC8136mt2<? super Object> interfaceC8136mt2) {
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}

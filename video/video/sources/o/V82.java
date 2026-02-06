package o;

import android.graphics.Bitmap;
import java.util.NavigableMap;

/* loaded from: classes.dex */
public final class V82 implements InterfaceC5492c71 {
    public static final int d = 8;
    public final b a = new b();
    public final TE0<a, Bitmap> b = new TE0<>();
    public final NavigableMap<Integer, Integer> c = new RG1();

    /* loaded from: classes.dex */
    public static final class a implements InterfaceC11146zE1 {
        public final b a;
        public int b;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // o.InterfaceC11146zE1
        public void a() {
            this.a.c(this);
        }

        public void b(int i) {
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || this.b != ((a) obj).b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return V82.g(this.b);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AbstractC7597kl<a> {
        @Override // o.AbstractC7597kl
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i) {
            a aVar = (a) super.b();
            aVar.b(i);
            return aVar;
        }
    }

    public static String g(int i) {
        return C6566gU0.f + i + C6566gU0.g;
    }

    private static String h(Bitmap bitmap) {
        return g(SD2.i(bitmap));
    }

    @Override // o.InterfaceC5492c71
    public String a(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // o.InterfaceC5492c71
    public String b(int i, int i2, Bitmap.Config config) {
        return g(SD2.h(i, i2, config));
    }

    @Override // o.InterfaceC5492c71
    public int c(Bitmap bitmap) {
        return SD2.i(bitmap);
    }

    @Override // o.InterfaceC5492c71
    public void d(Bitmap bitmap) {
        a e = this.a.e(SD2.i(bitmap));
        this.b.d(e, bitmap);
        Integer num = this.c.get(Integer.valueOf(e.b));
        NavigableMap<Integer, Integer> navigableMap = this.c;
        Integer valueOf = Integer.valueOf(e.b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        navigableMap.put(valueOf, Integer.valueOf(i));
    }

    public final void e(Integer num) {
        Integer num2 = this.c.get(num);
        if (num2.intValue() == 1) {
            this.c.remove(num);
        } else {
            this.c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Override // o.InterfaceC5492c71
    public Bitmap f(int i, int i2, Bitmap.Config config) {
        int h = SD2.h(i, i2, config);
        a e = this.a.e(h);
        Integer ceilingKey = this.c.ceilingKey(Integer.valueOf(h));
        if (ceilingKey != null && ceilingKey.intValue() != h && ceilingKey.intValue() <= h * 8) {
            this.a.c(e);
            e = this.a.e(ceilingKey.intValue());
        }
        Bitmap a2 = this.b.a(e);
        if (a2 != null) {
            a2.reconfigure(i, i2, config);
            e(ceilingKey);
        }
        return a2;
    }

    @Override // o.InterfaceC5492c71
    public Bitmap removeLast() {
        Bitmap f = this.b.f();
        if (f != null) {
            e(Integer.valueOf(SD2.i(f)));
        }
        return f;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.b + "\n  SortedSizes" + this.c;
    }
}

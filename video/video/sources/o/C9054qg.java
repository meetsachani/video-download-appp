package o;

import android.graphics.Bitmap;

/* renamed from: o.qg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9054qg implements InterfaceC5492c71 {
    public final b a = new b();
    public final TE0<a, Bitmap> b = new TE0<>();

    /* renamed from: o.qg$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC11146zE1 {
        public final b a;
        public int b;
        public int c;
        public Bitmap.Config d;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // o.InterfaceC11146zE1
        public void a() {
            this.a.c(this);
        }

        public void b(int i, int i2, Bitmap.Config config) {
            this.b = i;
            this.c = i2;
            this.d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = ((this.b * 31) + this.c) * 31;
            Bitmap.Config config = this.d;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return C9054qg.e(this.b, this.c, this.d);
        }
    }

    /* renamed from: o.qg$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC7597kl<a> {
        @Override // o.AbstractC7597kl
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i, int i2, Bitmap.Config config) {
            a b = b();
            b.b(i, i2, config);
            return b;
        }
    }

    public static String e(int i, int i2, Bitmap.Config config) {
        return C6566gU0.f + i + "x" + i2 + "], " + config;
    }

    public static String g(Bitmap bitmap) {
        return e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // o.InterfaceC5492c71
    public String a(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // o.InterfaceC5492c71
    public String b(int i, int i2, Bitmap.Config config) {
        return e(i, i2, config);
    }

    @Override // o.InterfaceC5492c71
    public int c(Bitmap bitmap) {
        return SD2.i(bitmap);
    }

    @Override // o.InterfaceC5492c71
    public void d(Bitmap bitmap) {
        this.b.d(this.a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // o.InterfaceC5492c71
    public Bitmap f(int i, int i2, Bitmap.Config config) {
        return this.b.a(this.a.e(i, i2, config));
    }

    @Override // o.InterfaceC5492c71
    public Bitmap removeLast() {
        return this.b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.b;
    }
}

package o;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.DT1;

/* renamed from: o.cN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5555cN0 {
    public final C9006qS1 a;
    public final f c;
    public Runnable g;
    public int b = 100;
    public final HashMap<String, e> d = new HashMap<>();
    public final HashMap<String, e> e = new HashMap<>();
    public final Handler f = new Handler(Looper.getMainLooper());

    /* renamed from: o.cN0$a */
    /* loaded from: classes.dex */
    public class a implements h {
        public final /* synthetic */ int X;
        public final /* synthetic */ ImageView Y;
        public final /* synthetic */ int Z;

        public a(int i, ImageView imageView, int i2) {
            this.X = i;
            this.Y = imageView;
            this.Z = i2;
        }

        @Override // o.DT1.a
        public void a(C6524gJ2 c6524gJ2) {
            int i = this.X;
            if (i != 0) {
                this.Y.setImageResource(i);
            }
        }

        @Override // o.C5555cN0.h
        public void c(g gVar, boolean z) {
            if (gVar.d() != null) {
                this.Y.setImageBitmap(gVar.d());
                return;
            }
            int i = this.Z;
            if (i != 0) {
                this.Y.setImageResource(i);
            }
        }
    }

    /* renamed from: o.cN0$b */
    /* loaded from: classes.dex */
    public class b implements DT1.b<Bitmap> {
        public final /* synthetic */ String X;

        public b(String str) {
            this.X = str;
        }

        @Override // o.DT1.b
        /* renamed from: a */
        public void b(Bitmap bitmap) {
            C5555cN0.this.n(this.X, bitmap);
        }
    }

    /* renamed from: o.cN0$c */
    /* loaded from: classes.dex */
    public class c implements DT1.a {
        public final /* synthetic */ String X;

        public c(String str) {
            this.X = str;
        }

        @Override // o.DT1.a
        public void a(C6524gJ2 c6524gJ2) {
            C5555cN0.this.m(this.X, c6524gJ2);
        }
    }

    /* renamed from: o.cN0$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : C5555cN0.this.e.values()) {
                for (g gVar : eVar.d) {
                    if (gVar.b != null) {
                        if (eVar.e() == null) {
                            gVar.a = eVar.b;
                            gVar.b.c(gVar, false);
                        } else {
                            gVar.b.a(eVar.e());
                        }
                    }
                }
            }
            C5555cN0.this.e.clear();
            C5555cN0.this.g = null;
        }
    }

    /* renamed from: o.cN0$e */
    /* loaded from: classes.dex */
    public static class e {
        public final AbstractC5091aS1<?> a;
        public Bitmap b;
        public C6524gJ2 c;
        public final List<g> d;

        public e(AbstractC5091aS1<?> abstractC5091aS1, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            this.a = abstractC5091aS1;
            arrayList.add(gVar);
        }

        public void d(g gVar) {
            this.d.add(gVar);
        }

        public C6524gJ2 e() {
            return this.c;
        }

        public boolean f(g gVar) {
            this.d.remove(gVar);
            if (this.d.size() == 0) {
                this.a.h();
                return true;
            }
            return false;
        }

        public void g(C6524gJ2 c6524gJ2) {
            this.c = c6524gJ2;
        }
    }

    /* renamed from: o.cN0$f */
    /* loaded from: classes.dex */
    public interface f {
        void a(String str, Bitmap bitmap);

        Bitmap b(String str);
    }

    /* renamed from: o.cN0$g */
    /* loaded from: classes.dex */
    public class g {
        public Bitmap a;
        public final h b;
        public final String c;
        public final String d;

        public g(Bitmap bitmap, String str, String str2, h hVar) {
            this.a = bitmap;
            this.d = str;
            this.c = str2;
            this.b = hVar;
        }

        public void c() {
            C5659co2.a();
            if (this.b != null) {
                e eVar = (e) C5555cN0.this.d.get(this.c);
                if (eVar != null) {
                    if (eVar.f(this)) {
                        C5555cN0.this.d.remove(this.c);
                        return;
                    }
                    return;
                }
                e eVar2 = (e) C5555cN0.this.e.get(this.c);
                if (eVar2 != null) {
                    eVar2.f(this);
                    if (eVar2.d.size() == 0) {
                        C5555cN0.this.e.remove(this.c);
                    }
                }
            }
        }

        public Bitmap d() {
            return this.a;
        }

        public String e() {
            return this.d;
        }
    }

    /* renamed from: o.cN0$h */
    /* loaded from: classes.dex */
    public interface h extends DT1.a {
        void c(g gVar, boolean z);
    }

    public C5555cN0(C9006qS1 c9006qS1, f fVar) {
        this.a = c9006qS1;
        this.c = fVar;
    }

    public static String h(String str, int i, int i2, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    public static h i(ImageView imageView, int i, int i2) {
        return new a(i2, imageView, i);
    }

    public final void d(String str, e eVar) {
        this.e.put(str, eVar);
        if (this.g == null) {
            d dVar = new d();
            this.g = dVar;
            this.f.postDelayed(dVar, this.b);
        }
    }

    public g e(String str, h hVar) {
        return f(str, hVar, 0, 0);
    }

    public g f(String str, h hVar, int i, int i2) {
        return g(str, hVar, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    public g g(String str, h hVar, int i, int i2, ImageView.ScaleType scaleType) {
        C5659co2.a();
        String h2 = h(str, i, i2, scaleType);
        Bitmap b2 = this.c.b(h2);
        if (b2 != null) {
            g gVar = new g(b2, str, null, null);
            hVar.c(gVar, true);
            return gVar;
        }
        g gVar2 = new g(null, str, h2, hVar);
        hVar.c(gVar2, true);
        e eVar = this.d.get(h2);
        if (eVar == null) {
            eVar = this.e.get(h2);
        }
        if (eVar != null) {
            eVar.d(gVar2);
            return gVar2;
        }
        AbstractC5091aS1<Bitmap> l = l(str, i, i2, scaleType, h2);
        this.a.a(l);
        this.d.put(h2, new e(l, gVar2));
        return gVar2;
    }

    public boolean j(String str, int i, int i2) {
        return k(str, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    public boolean k(String str, int i, int i2, ImageView.ScaleType scaleType) {
        C5659co2.a();
        if (this.c.b(h(str, i, i2, scaleType)) != null) {
            return true;
        }
        return false;
    }

    public AbstractC5091aS1<Bitmap> l(String str, int i, int i2, ImageView.ScaleType scaleType, String str2) {
        return new C9234rN0(str, new b(str2), i, i2, scaleType, Bitmap.Config.RGB_565, new c(str2));
    }

    public void m(String str, C6524gJ2 c6524gJ2) {
        e remove = this.d.remove(str);
        if (remove != null) {
            remove.g(c6524gJ2);
            d(str, remove);
        }
    }

    public void n(String str, Bitmap bitmap) {
        this.c.a(str, bitmap);
        e remove = this.d.remove(str);
        if (remove != null) {
            remove.b = bitmap;
            d(str, remove);
        }
    }

    public void o(int i) {
        this.b = i;
    }
}

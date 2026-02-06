package o;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.Rw0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4176Rw0 {
    public final AssetManager d;
    public C4079Qw0 e;
    public final C2765Dn1<String> a = new C2765Dn1<>();
    public final Map<C2765Dn1<String>, Typeface> b = new HashMap();
    public final Map<String, Typeface> c = new HashMap();
    public String f = ".ttf";

    public C4176Rw0(Drawable.Callback callback, C4079Qw0 c4079Qw0) {
        this.e = c4079Qw0;
        if (!(callback instanceof View)) {
            C7190j41.e("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }

    public final Typeface a(C3982Pw0 c3982Pw0) {
        Typeface typeface;
        String b = c3982Pw0.b();
        Typeface typeface2 = this.c.get(b);
        if (typeface2 != null) {
            return typeface2;
        }
        String d = c3982Pw0.d();
        String c = c3982Pw0.c();
        C4079Qw0 c4079Qw0 = this.e;
        if (c4079Qw0 != null) {
            typeface = c4079Qw0.b(b, d, c);
            if (typeface == null) {
                typeface = this.e.a(b);
            }
        } else {
            typeface = null;
        }
        C4079Qw0 c4079Qw02 = this.e;
        if (c4079Qw02 != null && typeface == null) {
            String d2 = c4079Qw02.d(b, d, c);
            if (d2 == null) {
                d2 = this.e.c(b);
            }
            if (d2 != null) {
                typeface = Typeface.createFromAsset(this.d, d2);
            }
        }
        if (c3982Pw0.e() != null) {
            return c3982Pw0.e();
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.d, "fonts/" + b + this.f);
        }
        this.c.put(b, typeface);
        return typeface;
    }

    public Typeface b(C3982Pw0 c3982Pw0) {
        this.a.b(c3982Pw0.b(), c3982Pw0.d());
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e = e(a(c3982Pw0), c3982Pw0.d());
        this.b.put(this.a, e);
        return e;
    }

    public void c(String str) {
        this.f = str;
    }

    public void d(C4079Qw0 c4079Qw0) {
        this.e = c4079Qw0;
    }

    public final Typeface e(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }
}

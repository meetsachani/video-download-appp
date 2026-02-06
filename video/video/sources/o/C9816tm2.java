package o;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.tm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9816tm2 {
    public final Map<String, String> a;
    public final LottieAnimationView b;
    public final C8431o61 c;
    public boolean d;

    public C9816tm2() {
        this.a = new HashMap();
        this.d = true;
        this.b = null;
        this.c = null;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    public final String c(String str, String str2) {
        if (this.d && this.a.containsKey(str2)) {
            return this.a.get(str2);
        }
        String b = b(str, str2);
        if (this.d) {
            this.a.put(str2, b);
        }
        return b;
    }

    public final void d() {
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        C8431o61 c8431o61 = this.c;
        if (c8431o61 != null) {
            c8431o61.invalidateSelf();
        }
    }

    public void e() {
        this.a.clear();
        d();
    }

    public void f(String str) {
        this.a.remove(str);
        d();
    }

    public void g(boolean z) {
        this.d = z;
    }

    public void h(String str, String str2) {
        this.a.put(str, str2);
        d();
    }

    public C9816tm2(LottieAnimationView lottieAnimationView) {
        this.a = new HashMap();
        this.d = true;
        this.b = lottieAnimationView;
        this.c = null;
    }

    public C9816tm2(C8431o61 c8431o61) {
        this.a = new HashMap();
        this.d = true;
        this.c = c8431o61;
        this.b = null;
    }

    public String a(String str) {
        return str;
    }
}

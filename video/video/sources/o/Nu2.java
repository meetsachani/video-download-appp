package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C10229vT;
import o.Lu2;

/* loaded from: classes.dex */
public class Nu2 {
    public static final String i = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    public static final String j = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
    public static final String k = "androidx.browser.trusted.extra.SHARE_TARGET";
    public static final String l = "androidx.browser.trusted.extra.SHARE_DATA";
    public static final String m = "androidx.browser.trusted.extra.DISPLAY_MODE";
    public static final String n = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
    public final Uri a;
    public List<String> c;
    public Bundle d;
    public C10374w32 e;
    public Q32 f;
    public final C10229vT.i b = new C10229vT.i();
    public Lu2 g = new Lu2.a();
    public int h = 0;

    public Nu2(Uri uri) {
        this.a = uri;
    }

    public Mu2 a(CT ct) {
        if (ct != null) {
            this.b.J(ct);
            Intent intent = this.b.d().a;
            intent.setData(this.a);
            intent.putExtra(Su2.a, true);
            if (this.c != null) {
                intent.putExtra(j, new ArrayList(this.c));
            }
            Bundle bundle = this.d;
            if (bundle != null) {
                intent.putExtra(i, bundle);
            }
            List<Uri> list = Collections.EMPTY_LIST;
            Q32 q32 = this.f;
            if (q32 != null && this.e != null) {
                intent.putExtra(k, q32.b());
                intent.putExtra(l, this.e.b());
                List<Uri> list2 = this.e.c;
                if (list2 != null) {
                    list = list2;
                }
            }
            intent.putExtra(m, this.g.e());
            intent.putExtra(n, this.h);
            return new Mu2(intent, list);
        }
        throw new NullPointerException("CustomTabsSession is required for launching a TWA");
    }

    public C10229vT b() {
        return this.b.d();
    }

    public Lu2 c() {
        return this.g;
    }

    public Uri d() {
        return this.a;
    }

    public Nu2 e(List<String> list) {
        this.c = list;
        return this;
    }

    public Nu2 f(int i2) {
        this.b.q(i2);
        return this;
    }

    public Nu2 g(int i2, C9257rT c9257rT) {
        this.b.r(i2, c9257rT);
        return this;
    }

    public Nu2 h(C9257rT c9257rT) {
        this.b.t(c9257rT);
        return this;
    }

    public Nu2 i(Lu2 lu2) {
        this.g = lu2;
        return this;
    }

    @Deprecated
    public Nu2 j(int i2) {
        this.b.C(i2);
        return this;
    }

    @Deprecated
    public Nu2 k(int i2) {
        this.b.D(i2);
        return this;
    }

    public Nu2 l(int i2) {
        this.h = i2;
        return this;
    }

    public Nu2 m(Q32 q32, C10374w32 c10374w32) {
        this.f = q32;
        this.e = c10374w32;
        return this;
    }

    public Nu2 n(Bundle bundle) {
        this.d = bundle;
        return this;
    }

    @Deprecated
    public Nu2 o(int i2) {
        this.b.Q(i2);
        return this;
    }
}

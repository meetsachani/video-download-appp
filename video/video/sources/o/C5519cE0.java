package o;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: o.cE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5519cE0 implements InterfaceC6575gX0 {
    public static final String j = "@#&=*+-_.,:!?()/~'%;$[]";
    public final InterfaceC5774dH0 c;
    public final URL d;
    public final String e;
    public String f;
    public URL g;
    public volatile byte[] h;
    public int i;

    public C5519cE0(URL url) {
        this(url, InterfaceC5774dH0.b);
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        return ((URL) C10175vF1.e(this.d)).toString();
    }

    public final byte[] d() {
        if (this.h == null) {
            this.h = c().getBytes(InterfaceC6575gX0.b);
        }
        return this.h;
    }

    public Map<String, String> e() {
        return this.c.a();
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C5519cE0) {
            C5519cE0 c5519cE0 = (C5519cE0) obj;
            if (c().equals(c5519cE0.c()) && this.c.equals(c5519cE0.c)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f)) {
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C10175vF1.e(this.d)).toString();
            }
            this.f = Uri.encode(str, j);
        }
        return this.f;
    }

    public final URL g() throws MalformedURLException {
        if (this.g == null) {
            this.g = new URL(f());
        }
        return this.g;
    }

    public String h() {
        return f();
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        if (this.i == 0) {
            int hashCode = c().hashCode();
            this.i = hashCode;
            this.i = (hashCode * 31) + this.c.hashCode();
        }
        return this.i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public C5519cE0(String str) {
        this(str, InterfaceC5774dH0.b);
    }

    public C5519cE0(URL url, InterfaceC5774dH0 interfaceC5774dH0) {
        this.d = (URL) C10175vF1.e(url);
        this.e = null;
        this.c = (InterfaceC5774dH0) C10175vF1.e(interfaceC5774dH0);
    }

    public C5519cE0(String str, InterfaceC5774dH0 interfaceC5774dH0) {
        this.d = null;
        this.e = C10175vF1.c(str);
        this.c = (InterfaceC5774dH0) C10175vF1.e(interfaceC5774dH0);
    }
}

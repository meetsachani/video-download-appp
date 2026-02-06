package o;

import android.net.Uri;

/* loaded from: classes3.dex */
public class JK2 {
    public String a;
    public String b;
    public Uri c;

    public JK2(Uri uri, String str, String str2) {
        this.c = uri;
        this.b = str;
        this.a = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public Uri c() {
        return this.c;
    }

    public void d(String str) {
        this.a = str;
    }

    public void e(String str) {
        this.b = str;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        JK2 jk2 = (JK2) obj;
        if (this.b == null || jk2.b() == null || !this.b.equals(jk2.b())) {
            return false;
        }
        return true;
    }

    public void f(Uri uri) {
        this.c = uri;
    }
}

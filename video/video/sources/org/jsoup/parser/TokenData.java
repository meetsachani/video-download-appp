package org.jsoup.parser;

import org.jsoup.internal.StringUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class TokenData {
    public String a;
    public StringBuilder b;

    public void a(char c) {
        StringBuilder sb = this.b;
        if (sb != null) {
            sb.append(c);
        } else if (this.a != null) {
            d();
            this.b.append(c);
        } else {
            this.a = String.valueOf(c);
        }
    }

    public void b(String str) {
        StringBuilder sb = this.b;
        if (sb != null) {
            sb.append(str);
        } else if (this.a != null) {
            d();
            this.b.append(str);
        } else {
            this.a = str;
        }
    }

    public void c(int i) {
        StringBuilder sb = this.b;
        if (sb != null) {
            sb.appendCodePoint(i);
        } else if (this.a != null) {
            d();
            this.b.appendCodePoint(i);
        } else {
            this.a = String.valueOf(Character.toChars(i));
        }
    }

    public final void d() {
        StringBuilder e = StringUtil.e();
        this.b = e;
        e.append(this.a);
        this.a = null;
    }

    public boolean e() {
        if (this.b == null && this.a == null) {
            return false;
        }
        return true;
    }

    public void f() {
        StringBuilder sb = this.b;
        if (sb != null) {
            StringUtil.y(sb);
            this.b = null;
        }
        this.a = null;
    }

    public void g(String str) {
        f();
        this.a = str;
    }

    public String h() {
        StringBuilder sb = this.b;
        if (sb != null) {
            this.a = sb.toString();
            StringUtil.x(this.b);
            this.b = null;
            return this.a;
        }
        String str = this.a;
        if (str != null) {
            return str;
        }
        return "";
    }

    public String toString() {
        StringBuilder sb = this.b;
        if (sb != null) {
            return sb.toString();
        }
        String str = this.a;
        if (str != null) {
            return str;
        }
        return "";
    }
}

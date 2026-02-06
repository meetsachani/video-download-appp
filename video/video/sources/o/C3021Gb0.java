package o;

import java.nio.charset.StandardCharsets;

/* renamed from: o.Gb0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3021Gb0 {
    public final String a;
    public EnumC8096mj2 b;
    public C9883u30 c;
    public C9883u30 d;
    public final StringBuilder e;
    public int f;
    public int g;
    public C7835lj2 h;
    public int i;

    public C3021Gb0(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = EnumC8096mj2.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    public int a() {
        return this.e.length();
    }

    public StringBuilder b() {
        return this.e;
    }

    public char c() {
        return this.a.charAt(this.f);
    }

    public char d() {
        return this.a.charAt(this.f);
    }

    public String e() {
        return this.a;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return i() - this.f;
    }

    public C7835lj2 h() {
        return this.h;
    }

    public final int i() {
        return this.a.length() - this.i;
    }

    public boolean j() {
        if (this.f < i()) {
            return true;
        }
        return false;
    }

    public void k() {
        this.g = -1;
    }

    public void l() {
        this.h = null;
    }

    public void m(C9883u30 c9883u30, C9883u30 c9883u302) {
        this.c = c9883u30;
        this.d = c9883u302;
    }

    public void n(int i) {
        this.i = i;
    }

    public void o(EnumC8096mj2 enumC8096mj2) {
        this.b = enumC8096mj2;
    }

    public void p(int i) {
        this.g = i;
    }

    public void q() {
        r(a());
    }

    public void r(int i) {
        C7835lj2 c7835lj2 = this.h;
        if (c7835lj2 != null && i <= c7835lj2.b()) {
            return;
        }
        this.h = C7835lj2.o(i, this.b, this.c, this.d, true);
    }

    public void s(char c) {
        this.e.append(c);
    }

    public void t(String str) {
        this.e.append(str);
    }
}

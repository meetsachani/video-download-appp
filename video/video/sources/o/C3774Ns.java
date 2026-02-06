package o;

import java.util.Locale;

/* renamed from: o.Ns  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3774Ns {
    public char a = ',';
    public char b = '\"';
    public char c = '\\';
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public EnumC4456Us g = EnumC4456Us.NEITHER;
    public Locale h = Locale.getDefault();

    public C3675Ms a() {
        return new C3675Ms(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public char b() {
        return this.c;
    }

    public char c() {
        return this.b;
    }

    public char d() {
        return this.a;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.d;
    }

    public EnumC4456Us h() {
        return this.g;
    }

    public C3774Ns i(Locale locale) {
        this.h = (Locale) C11304zt1.t(locale, Locale.getDefault());
        return this;
    }

    public C3774Ns j(char c) {
        this.c = c;
        return this;
    }

    public C3774Ns k(EnumC4456Us enumC4456Us) {
        this.g = enumC4456Us;
        return this;
    }

    public C3774Ns l(boolean z) {
        this.e = z;
        return this;
    }

    public C3774Ns m(boolean z) {
        this.f = z;
        return this;
    }

    public C3774Ns n(char c) {
        this.b = c;
        return this;
    }

    public C3774Ns o(char c) {
        this.a = c;
        return this;
    }

    public C3774Ns p(boolean z) {
        this.d = z;
        return this;
    }
}

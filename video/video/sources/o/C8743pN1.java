package o;

/* renamed from: o.pN1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8743pN1 {
    public char a = ',';
    public char b = '\"';
    public EnumC4456Us c = EnumC4456Us.NEITHER;

    public C8500oN1 a() {
        return new C8500oN1(this.b, this.a, this.c);
    }

    public char b() {
        return this.b;
    }

    public char c() {
        return this.a;
    }

    public EnumC4456Us d() {
        return this.c;
    }

    public C8743pN1 e(EnumC4456Us enumC4456Us) {
        this.c = enumC4456Us;
        return this;
    }

    public C8743pN1 f(char c) {
        this.b = c;
        return this;
    }

    public C8743pN1 g(char c) {
        this.a = c;
        return this;
    }
}

package o;

import java.io.Writer;

/* renamed from: o.Ws  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4650Ws {
    public final Writer a;
    public UI0 b;
    public Character c;
    public Character d;
    public Character e;
    public InterfaceC5584cU1 f;
    public String g = "\n";

    public C4650Ws(Writer writer) {
        this.a = writer;
    }

    public VI0 a() {
        if (this.b != null) {
            return b();
        }
        return c();
    }

    public final VI0 b() {
        return new C3871Os(this.a, this.b, this.g);
    }

    public final VI0 c() {
        if (this.c == null) {
            this.c = ',';
        }
        if (this.d == null) {
            this.d = '\"';
        }
        if (this.e == null) {
            this.e = '\"';
        }
        C4553Vs c4553Vs = new C4553Vs(this.a, this.c.charValue(), this.d.charValue(), this.e.charValue(), this.g);
        InterfaceC5584cU1 interfaceC5584cU1 = this.f;
        if (interfaceC5584cU1 != null) {
            c4553Vs.b4(interfaceC5584cU1);
        }
        return c4553Vs;
    }

    public C4650Ws d(char c) {
        if (this.b == null) {
            this.e = Character.valueOf(c);
            return this;
        }
        throw new IllegalArgumentException("You cannot set the escape character in the builder if you have a ICSVParser set.  Set the escape character in the parser instead.");
    }

    public C4650Ws e(String str) {
        this.g = str;
        return this;
    }

    public C4650Ws f(UI0 ui0) {
        if (this.c == null && this.d == null && this.e == null) {
            this.b = ui0;
            return this;
        }
        throw new IllegalArgumentException("You cannot set the parser in the builder if you have set the separator, quote, or escape character");
    }

    public C4650Ws g(char c) {
        if (this.b == null) {
            this.d = Character.valueOf(c);
            return this;
        }
        throw new IllegalArgumentException("You cannot set the quote character in the builder if you have a ICSVParser set.  Set the quote character in the parser instead.");
    }

    public C4650Ws h(InterfaceC5584cU1 interfaceC5584cU1) {
        this.f = interfaceC5584cU1;
        return this;
    }

    public C4650Ws i(char c) {
        if (this.b == null) {
            this.c = Character.valueOf(c);
            return this;
        }
        throw new IllegalArgumentException("You cannot set the separator in the builder if you have a ICSVParser set.  Set the separator in the parser instead.");
    }
}

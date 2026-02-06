package o;

import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6584ga0
/* renamed from: o.ae  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5131ae extends PA {
    public final char[][] c;
    public final int d;
    public final char e;
    public final char f;

    public AbstractC5131ae(Map<Character, String> map, char c, char c2) {
        this(C5374be.a(map), c, c2);
    }

    @Override // o.PA, o.AbstractC10514we0
    public final String b(String str) {
        C10664xF1.E(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.d && this.c[charAt] != null) || charAt > this.f || charAt < this.e) {
                return d(str, i);
            }
        }
        return str;
    }

    @Override // o.PA
    @MB
    public final char[] c(char c) {
        char[] cArr;
        if (c < this.d && (cArr = this.c[c]) != null) {
            return cArr;
        }
        if (c >= this.e && c <= this.f) {
            return null;
        }
        return f(c);
    }

    @MB
    public abstract char[] f(char c);

    public AbstractC5131ae(C5374be c5374be, char c, char c2) {
        C10664xF1.E(c5374be);
        char[][] c3 = c5374be.c();
        this.c = c3;
        this.d = c3.length;
        if (c2 < c) {
            c2 = 0;
            c = 65535;
        }
        this.e = c;
        this.f = c2;
    }
}

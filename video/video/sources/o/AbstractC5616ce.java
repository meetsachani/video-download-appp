package o;

import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6584ga0
/* renamed from: o.ce  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5616ce extends Wz2 {
    public final char[][] c;
    public final int d;
    public final int e;
    public final int f;
    public final char g;
    public final char h;

    public AbstractC5616ce(Map<Character, String> map, int i, int i2, String str) {
        this(C5374be.a(map), i, i2, str);
    }

    @Override // o.Wz2, o.AbstractC10514we0
    public final String b(String str) {
        C10664xF1.E(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.d && this.c[charAt] != null) || charAt > this.h || charAt < this.g) {
                return e(str, i);
            }
        }
        return str;
    }

    @Override // o.Wz2
    @MB
    public final char[] d(int i) {
        char[] cArr;
        if (i < this.d && (cArr = this.c[i]) != null) {
            return cArr;
        }
        if (i >= this.e && i <= this.f) {
            return null;
        }
        return h(i);
    }

    @Override // o.Wz2
    public final int g(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if ((charAt < this.d && this.c[charAt] != null) || charAt > this.h || charAt < this.g) {
                break;
            }
            i++;
        }
        return i;
    }

    @MB
    public abstract char[] h(int i);

    public AbstractC5616ce(C5374be c5374be, int i, int i2, String str) {
        C10664xF1.E(c5374be);
        char[][] c = c5374be.c();
        this.c = c;
        this.d = c.length;
        if (i2 < i) {
            i2 = -1;
            i = Integer.MAX_VALUE;
        }
        this.e = i;
        this.f = i2;
        if (i >= 55296) {
            this.g = (char) 65535;
            this.h = (char) 0;
            return;
        }
        this.g = (char) i;
        this.h = (char) Math.min(i2, 55295);
    }
}

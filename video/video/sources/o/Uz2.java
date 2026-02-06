package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* loaded from: classes4.dex */
public class Uz2 extends IE {
    public final int b;
    public final int c;
    public final boolean d;

    public Uz2() {
        this(0, Integer.MAX_VALUE, true);
    }

    public static Uz2 g(int i) {
        return j(0, i);
    }

    public static Uz2 h(int i) {
        return j(i, Integer.MAX_VALUE);
    }

    public static Uz2 i(int i, int i2) {
        return new Uz2(i, i2, true);
    }

    public static Uz2 j(int i, int i2) {
        return new Uz2(i, i2, false);
    }

    @Override // o.IE
    public boolean f(int i, Writer writer) throws IOException {
        if (this.d) {
            if (i < this.b || i > this.c) {
                return false;
            }
        } else if (i >= this.b && i <= this.c) {
            return false;
        }
        if (i > 65535) {
            writer.write(k(i));
            return true;
        }
        writer.write("\\u");
        char[] cArr = AbstractC6234fB.a;
        writer.write(cArr[(i >> 12) & 15]);
        writer.write(cArr[(i >> 8) & 15]);
        writer.write(cArr[(i >> 4) & 15]);
        writer.write(cArr[i & 15]);
        return true;
    }

    public String k(int i) {
        return "\\u" + AbstractC6234fB.a(i);
    }

    public Uz2(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}

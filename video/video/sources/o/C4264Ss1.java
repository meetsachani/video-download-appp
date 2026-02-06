package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* renamed from: o.Ss1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4264Ss1 extends IE {
    public final int b;
    public final int c;
    public final boolean d;

    public C4264Ss1(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public static C4264Ss1 g(int i) {
        return j(0, i);
    }

    public static C4264Ss1 h(int i) {
        return j(i, Integer.MAX_VALUE);
    }

    public static C4264Ss1 i(int i, int i2) {
        return new C4264Ss1(i, i2, true);
    }

    public static C4264Ss1 j(int i, int i2) {
        return new C4264Ss1(i, i2, false);
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
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }

    public C4264Ss1() {
        this(0, Integer.MAX_VALUE, true);
    }
}

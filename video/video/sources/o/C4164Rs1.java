package o;

import java.io.IOException;
import java.io.Writer;

/* renamed from: o.Rs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4164Rs1 extends HE {
    public final boolean b;
    public final QN1<Integer> c;

    public C4164Rs1() {
        this(0, Integer.MAX_VALUE, true);
    }

    public static C4164Rs1 g(int i) {
        return j(0, i);
    }

    public static C4164Rs1 h(int i) {
        return j(i, Integer.MAX_VALUE);
    }

    public static C4164Rs1 i(int i, int i2) {
        return new C4164Rs1(i, i2, true);
    }

    public static C4164Rs1 j(int i, int i2) {
        return new C4164Rs1(i, i2, false);
    }

    @Override // o.HE
    public boolean f(int i, Writer writer) throws IOException {
        if (this.b != this.c.c(Integer.valueOf(i))) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }

    public C4164Rs1(int i, int i2, boolean z) {
        this.c = QN1.a(Integer.valueOf(i), Integer.valueOf(i2));
        this.b = z;
    }
}

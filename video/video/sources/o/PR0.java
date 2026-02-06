package o;

import java.io.IOException;

/* loaded from: classes.dex */
public class PR0 implements GE2<Integer> {
    public static final PR0 a = new PR0();

    @Override // o.GE2
    /* renamed from: b */
    public Integer a(NV0 nv0, float f) throws IOException {
        return Integer.valueOf(Math.round(C5347bW0.g(nv0) * f));
    }
}

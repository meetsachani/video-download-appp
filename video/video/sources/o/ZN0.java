package o;

import android.graphics.Matrix;
import o.C2540Bg0;

/* loaded from: classes.dex */
public abstract class ZN0 implements YM0 {
    public static YM0 f(C4133Rk2 c4133Rk2, long j, int i, Matrix matrix) {
        return new C4122Ri(c4133Rk2, j, i, matrix);
    }

    @Override // o.YM0
    public abstract C4133Rk2 a();

    @Override // o.YM0
    public void b(C2540Bg0.b bVar) {
        bVar.n(e());
    }

    @Override // o.YM0
    public abstract long c();

    @Override // o.YM0
    public abstract Matrix d();

    @Override // o.YM0
    public abstract int e();
}

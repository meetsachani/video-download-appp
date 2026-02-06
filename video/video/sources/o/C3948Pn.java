package o;

import android.graphics.Bitmap;
import java.util.Objects;

/* renamed from: o.Pn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3948Pn implements InterfaceC3493Kv1<AbstractC3401Jx1<Bitmap>, AbstractC3401Jx1<Bitmap>> {
    public final ES0 a;

    public C3948Pn(ES0 es0) {
        this.a = es0;
    }

    @Override // o.InterfaceC3493Kv1
    /* renamed from: a */
    public AbstractC3401Jx1<Bitmap> apply(AbstractC3401Jx1<Bitmap> abstractC3401Jx1) throws DM0 {
        androidx.camera.core.g a = this.a.c(new C7265jN0(new LU1(abstractC3401Jx1), 1)).a();
        Objects.requireNonNull(a);
        Bitmap e = C10206vN0.e(a.f3(), a.getWidth(), a.getHeight());
        C11251zg0 d = abstractC3401Jx1.d();
        Objects.requireNonNull(d);
        return AbstractC3401Jx1.j(e, d, abstractC3401Jx1.b(), abstractC3401Jx1.f(), abstractC3401Jx1.g(), abstractC3401Jx1.a());
    }
}

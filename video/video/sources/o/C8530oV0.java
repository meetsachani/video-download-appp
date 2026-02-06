package o;

import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;

/* renamed from: o.oV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8530oV0 implements InterfaceC3493Kv1<AbstractC3401Jx1<byte[]>, AbstractC3401Jx1<androidx.camera.core.g>> {
    public static final int a = 2;

    @Override // o.InterfaceC3493Kv1
    /* renamed from: a */
    public AbstractC3401Jx1<androidx.camera.core.g> apply(AbstractC3401Jx1<byte[]> abstractC3401Jx1) throws DM0 {
        androidx.camera.core.l lVar = new androidx.camera.core.l(C8985qN0.a(abstractC3401Jx1.h().getWidth(), abstractC3401Jx1.h().getHeight(), 256, 2));
        androidx.camera.core.g e = ImageProcessingUtil.e(lVar, abstractC3401Jx1.c());
        lVar.l();
        Objects.requireNonNull(e);
        C11251zg0 d = abstractC3401Jx1.d();
        Objects.requireNonNull(d);
        return AbstractC3401Jx1.k(e, d, abstractC3401Jx1.b(), abstractC3401Jx1.f(), abstractC3401Jx1.g(), abstractC3401Jx1.a());
    }
}

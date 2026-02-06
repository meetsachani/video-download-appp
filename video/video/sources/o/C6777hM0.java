package o;

import android.graphics.Rect;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
import o.C10206vN0;

/* renamed from: o.hM0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6777hM0 implements InterfaceC3493Kv1<a, AbstractC3401Jx1<byte[]>> {
    public final C9508sV0 a;

    /* renamed from: o.hM0$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static a c(AbstractC3401Jx1<androidx.camera.core.g> abstractC3401Jx1, int i) {
            return new C3928Pi(abstractC3401Jx1, i);
        }

        public abstract int a();

        public abstract AbstractC3401Jx1<androidx.camera.core.g> b();
    }

    public C6777hM0(C10931yL1 c10931yL1) {
        this.a = new C9508sV0(c10931yL1);
    }

    public static C11251zg0 b(byte[] bArr) throws DM0 {
        try {
            return C11251zg0.l(new ByteArrayInputStream(bArr));
        } catch (IOException e) {
            throw new DM0(0, "Failed to extract Exif from YUV-generated JPEG", e);
        }
    }

    @Override // o.InterfaceC3493Kv1
    /* renamed from: a */
    public AbstractC3401Jx1<byte[]> apply(a aVar) throws DM0 {
        AbstractC3401Jx1<byte[]> d;
        try {
            int e = aVar.b().e();
            if (e != 35) {
                if (e == 256) {
                    d = c(aVar);
                } else {
                    throw new IllegalArgumentException("Unexpected format: " + e);
                }
            } else {
                d = d(aVar);
            }
            return d;
        } finally {
            aVar.b().c().close();
        }
    }

    public final AbstractC3401Jx1<byte[]> c(a aVar) {
        AbstractC3401Jx1<androidx.camera.core.g> b = aVar.b();
        byte[] a2 = this.a.a(b.c());
        C11251zg0 d = b.d();
        Objects.requireNonNull(d);
        return AbstractC3401Jx1.m(a2, d, 256, b.h(), b.b(), b.f(), b.g(), b.a());
    }

    public final AbstractC3401Jx1<byte[]> d(a aVar) throws DM0 {
        AbstractC3401Jx1<androidx.camera.core.g> b = aVar.b();
        androidx.camera.core.g c = b.c();
        Rect b2 = b.b();
        try {
            byte[] t = C10206vN0.t(c, b2, aVar.a(), b.f());
            return AbstractC3401Jx1.m(t, b(t), 256, new Size(b2.width(), b2.height()), new Rect(0, 0, b2.width(), b2.height()), b.f(), C5433bs2.y(b.g(), b2), b.a());
        } catch (C10206vN0.a e) {
            throw new DM0(1, "Failed to encode the image to JPEG.", e);
        }
    }
}

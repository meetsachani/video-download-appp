package o;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* renamed from: o.Fn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2970Fn implements InterfaceC3493Kv1<a, AbstractC3401Jx1<byte[]>> {

    /* renamed from: o.Fn$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static a c(AbstractC3401Jx1<Bitmap> abstractC3401Jx1, int i) {
            return new C9554si(abstractC3401Jx1, i);
        }

        public abstract int a();

        public abstract AbstractC3401Jx1<Bitmap> b();
    }

    @Override // o.InterfaceC3493Kv1
    /* renamed from: a */
    public AbstractC3401Jx1<byte[]> apply(a aVar) throws DM0 {
        AbstractC3401Jx1<Bitmap> b = aVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b.c().compress(Bitmap.CompressFormat.JPEG, aVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C11251zg0 d = b.d();
        Objects.requireNonNull(d);
        return AbstractC3401Jx1.m(byteArray, d, 256, b.h(), b.b(), b.f(), b.g(), b.a());
    }
}

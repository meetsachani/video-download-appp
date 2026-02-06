package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* renamed from: o.mV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8043mV0 implements InterfaceC3493Kv1<AbstractC3401Jx1<byte[]>, AbstractC3401Jx1<Bitmap>> {
    @Override // o.InterfaceC3493Kv1
    /* renamed from: a */
    public AbstractC3401Jx1<Bitmap> apply(AbstractC3401Jx1<byte[]> abstractC3401Jx1) throws DM0 {
        Rect b = abstractC3401Jx1.b();
        Bitmap b2 = b(abstractC3401Jx1.c(), b);
        C11251zg0 d = abstractC3401Jx1.d();
        Objects.requireNonNull(d);
        return AbstractC3401Jx1.j(b2, d, new Rect(0, 0, b2.getWidth(), b2.getHeight()), abstractC3401Jx1.f(), C5433bs2.y(abstractC3401Jx1.g(), b), abstractC3401Jx1.a());
    }

    public final Bitmap b(byte[] bArr, Rect rect) throws DM0 {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e) {
            throw new DM0(1, "Failed to decode JPEG.", e);
        }
    }
}

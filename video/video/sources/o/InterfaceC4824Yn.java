package o;

import android.graphics.Bitmap;
import android.net.Uri;

@Deprecated
/* renamed from: o.Yn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4824Yn {
    InterfaceFutureC8411o11<Bitmap> a(Uri uri);

    InterfaceFutureC8411o11<Bitmap> b(byte[] bArr);

    @InterfaceC11300zs1
    default InterfaceFutureC8411o11<Bitmap> c(C11005yf1 c11005yf1) {
        byte[] bArr = c11005yf1.e1;
        if (bArr != null) {
            return b(bArr);
        }
        Uri uri = c11005yf1.g1;
        if (uri != null) {
            return a(uri);
        }
        return null;
    }
}

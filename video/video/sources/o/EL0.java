package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;

/* loaded from: classes.dex */
public final class EL0 {
    public static final Icon a(Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        return createWithAdaptiveBitmap;
    }

    public static final Icon b(Bitmap bitmap) {
        return Icon.createWithBitmap(bitmap);
    }

    public static final Icon c(Uri uri) {
        return Icon.createWithContentUri(uri);
    }

    public static final Icon d(byte[] bArr) {
        return Icon.createWithData(bArr, 0, bArr.length);
    }
}

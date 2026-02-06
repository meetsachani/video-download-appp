package o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* renamed from: o.kM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7503kM {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e) {
            if (e instanceof OperationCanceledException) {
                throw new C3590Lv1();
            }
            throw e;
        }
    }

    @Deprecated
    public static Cursor b(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C10593wy c10593wy) {
        CancellationSignal cancellationSignal;
        if (c10593wy != null) {
            cancellationSignal = (CancellationSignal) c10593wy.b();
        } else {
            cancellationSignal = null;
        }
        return a(contentResolver, uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}

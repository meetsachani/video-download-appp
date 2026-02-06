package o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public final class UG2 {
    public static final String a = "VideoUtil";

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(ContentResolver contentResolver, Uri uri) {
        Throwable th;
        Uri uri2;
        RuntimeException runtimeException;
        Cursor cursor = null;
        try {
            try {
                uri2 = uri;
                try {
                    cursor = contentResolver.query(uri2, new String[]{C7033iP1.m0}, null, null, null);
                    Cursor cursor2 = (Cursor) C10907yF1.l(cursor);
                    try {
                        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow(C7033iP1.m0);
                        cursor2.moveToFirst();
                        String string = cursor2.getString(columnIndexOrThrow);
                        cursor2.close();
                        return string;
                    } catch (RuntimeException e) {
                        runtimeException = e;
                        cursor = cursor2;
                        C7433k41.c(a, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
                        if (cursor != null) {
                        }
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    runtimeException = e;
                    C7433k41.c(a, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
                    if (cursor != null) {
                        cursor.close();
                    }
                    return "";
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (RuntimeException e3) {
            e = e3;
            uri2 = uri;
        }
    }
}

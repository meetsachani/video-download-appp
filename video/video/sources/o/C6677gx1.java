package o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;

/* renamed from: o.gx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6677gx1 {
    public static final String a = "OutputUtil";

    public static boolean a(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        if (parentFile.exists()) {
            return parentFile.isDirectory();
        }
        return parentFile.mkdirs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(ContentResolver contentResolver, Uri uri, String str) {
        Throwable th;
        Uri uri2;
        RuntimeException runtimeException;
        Cursor cursor;
        ?? r1 = 0;
        try {
            try {
                try {
                    uri2 = uri;
                    try {
                        cursor = contentResolver.query(uri2, new String[]{str}, null, null, null);
                        if (cursor == null) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        }
                        try {
                            int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
                            cursor.moveToFirst();
                            String string = cursor.getString(columnIndexOrThrow);
                            cursor.close();
                            return string;
                        } catch (RuntimeException e) {
                            runtimeException = e;
                            C7433k41.c(a, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
                            if (cursor != null) {
                            }
                            return null;
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        runtimeException = e;
                        cursor = null;
                        C7433k41.c(a, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r1 != 0) {
                    }
                    throw th;
                }
            } catch (RuntimeException e3) {
                e = e3;
                uri2 = uri;
            }
        } catch (Throwable th3) {
            th = th3;
            r1 = contentResolver;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }
}

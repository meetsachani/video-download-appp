package o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: o.vo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10310vo2 {
    public static final String f = "ThumbStreamOpener";
    public static final C10558wp0 g = new C10558wp0();
    public final C10558wp0 a;
    public final InterfaceC9824to2 b;
    public final InterfaceC2727De c;
    public final ContentResolver d;
    public final List<ImageHeaderParser> e;

    public C10310vo2(List<ImageHeaderParser> list, InterfaceC9824to2 interfaceC9824to2, InterfaceC2727De interfaceC2727De, ContentResolver contentResolver) {
        this(list, g, interfaceC9824to2, interfaceC2727De, contentResolver);
    }

    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.d.openInputStream(uri);
                int b = com.bumptech.glide.load.a.b(this.e, inputStream, this.c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b;
            } catch (IOException | NullPointerException e) {
                if (Log.isLoggable(f, 3)) {
                    Log.d(f, "Failed to open uri: " + uri, e);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return -1;
                    } catch (IOException unused2) {
                        return -1;
                    }
                }
                return -1;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:11:0x001b */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b(Uri uri) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        try {
            try {
                cursor = this.b.a(uri);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(0);
                            cursor.close();
                            return string;
                        }
                    } catch (SecurityException e) {
                        e = e;
                        if (Log.isLoggable(f, 3)) {
                            Log.d(f, "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (SecurityException e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (cursor3 != null) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor3 = cursor2;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    public final boolean c(File file) {
        if (this.a.a(file) && 0 < this.a.c(file)) {
            return true;
        }
        return false;
    }

    public InputStream d(Uri uri) throws FileNotFoundException {
        String b = b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.a.b(b);
        if (!c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + B8.d + fromFile).initCause(e));
        }
    }

    public C10310vo2(List<ImageHeaderParser> list, C10558wp0 c10558wp0, InterfaceC9824to2 interfaceC9824to2, InterfaceC2727De interfaceC2727De, ContentResolver contentResolver) {
        this.a = c10558wp0;
        this.b = interfaceC9824to2;
        this.c = interfaceC2727De;
        this.d = contentResolver;
        this.e = list;
    }
}

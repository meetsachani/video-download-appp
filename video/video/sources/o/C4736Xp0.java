package o;

import android.content.ContentResolver;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.Xp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4736Xp0 {
    public boolean a;

    public C6422fx1 a(ContentResolver contentResolver, Uri uri) throws IOException {
        InputStream openInputStream = contentResolver.openInputStream(uri);
        try {
            C6422fx1 c = c(openInputStream);
            if (openInputStream != null) {
                openInputStream.close();
            }
            return c;
        } catch (Throwable th) {
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C6422fx1 b(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C6422fx1 c = c(fileInputStream);
            fileInputStream.close();
            return c;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C6422fx1 c(InputStream inputStream) throws IOException {
        C11251zg0 l = C11251zg0.l(inputStream);
        Rect rect = new Rect(0, 0, l.x(), l.r());
        Matrix b = C5433bs2.b(rect);
        if (this.a) {
            b.postConcat(C5433bs2.a(l.u(), l.x(), l.r()));
        }
        return new C6422fx1(b, C5433bs2.m(rect));
    }

    public boolean d() {
        return this.a;
    }

    public void e(boolean z) {
        this.a = z;
    }
}

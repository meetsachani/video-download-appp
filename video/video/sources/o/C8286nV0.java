package o;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* renamed from: o.nV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8286nV0 implements InterfaceC3493Kv1<a, f.m> {
    public static final String a = "CameraX";
    public static final String b = ".tmp";
    public static final int c = 1024;
    public static final int d = 1;
    public static final int e = 0;

    /* renamed from: o.nV0$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static a c(AbstractC3401Jx1<byte[]> abstractC3401Jx1, f.l lVar) {
            return new C4319Ti(abstractC3401Jx1, lVar);
        }

        public abstract f.l a();

        public abstract AbstractC3401Jx1<byte[]> b();
    }

    public static Uri b(File file, File file2) throws DM0 {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new DM0(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    public static Uri c(File file, f.l lVar) throws DM0 {
        ContentValues contentValues;
        ContentResolver a2 = lVar.a();
        Objects.requireNonNull(a2);
        if (lVar.b() != null) {
            contentValues = new ContentValues(lVar.b());
        } else {
            contentValues = new ContentValues();
        }
        l(contentValues, 1);
        Uri uri = null;
        try {
            try {
                Uri insert = a2.insert(lVar.f(), contentValues);
                try {
                    if (insert != null) {
                        e(file, insert, a2);
                        n(insert, a2, 0);
                        return insert;
                    }
                    throw new DM0(1, "Failed to insert a MediaStore URI.", null);
                } catch (IOException e2) {
                    e = e2;
                    uri = insert;
                    throw new DM0(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (SecurityException e3) {
                    e = e3;
                    uri = insert;
                    throw new DM0(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (Throwable th) {
                    th = th;
                    uri = insert;
                    if (uri != null) {
                        n(uri, a2, 0);
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (SecurityException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void d(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void e(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                d(file, openOutputStream);
                openOutputStream.close();
                return;
            }
            throw new FileNotFoundException(uri + " cannot be resolved.");
        } catch (Throwable th) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static File f(f.l lVar) throws DM0 {
        try {
            File c2 = lVar.c();
            if (c2 != null) {
                String parent = c2.getParent();
                return new File(parent, "CameraX" + UUID.randomUUID().toString() + g(c2));
            }
            return File.createTempFile("CameraX", ".tmp");
        } catch (IOException e2) {
            throw new DM0(1, "Failed to create temp file.", e2);
        }
    }

    public static String g(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            return name.substring(lastIndexOf);
        }
        return "";
    }

    public static boolean h(f.l lVar) {
        if (lVar.c() != null) {
            return true;
        }
        return false;
    }

    public static boolean i(f.l lVar) {
        if (lVar.f() != null && lVar.a() != null && lVar.b() != null) {
            return true;
        }
        return false;
    }

    public static boolean j(f.l lVar) {
        if (lVar.e() != null) {
            return true;
        }
        return false;
    }

    public static Uri k(File file, f.l lVar) throws DM0 {
        Uri uri = null;
        try {
            try {
                if (i(lVar)) {
                    uri = c(file, lVar);
                } else if (j(lVar)) {
                    OutputStream e2 = lVar.e();
                    Objects.requireNonNull(e2);
                    d(file, e2);
                } else if (h(lVar)) {
                    File c2 = lVar.c();
                    Objects.requireNonNull(c2);
                    uri = b(file, c2);
                }
                file.delete();
                return uri;
            } catch (IOException unused) {
                throw new DM0(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    public static void l(ContentValues contentValues, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i));
        }
    }

    public static void m(File file, C11251zg0 c11251zg0, f.l lVar, int i) throws DM0 {
        try {
            C11251zg0 i2 = C11251zg0.i(file);
            c11251zg0.h(i2);
            if (i2.v() == 0 && i != 0) {
                i2.E(i);
            }
            f.i d2 = lVar.d();
            if (d2.b()) {
                i2.m();
            }
            if (d2.d()) {
                i2.n();
            }
            if (d2.a() != null) {
                i2.b(d2.a());
            }
            i2.F();
        } catch (IOException e2) {
            throw new DM0(1, "Failed to update Exif data", e2);
        }
    }

    public static void n(Uri uri, ContentResolver contentResolver, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            l(contentValues, i);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    public static void o(File file, byte[] bArr) throws DM0 {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr, 0, new C8766pT0().a(bArr));
            fileOutputStream.close();
        } catch (IOException e2) {
            throw new DM0(1, "Failed to write to temp file", e2);
        }
    }

    @Override // o.InterfaceC3493Kv1
    /* renamed from: a */
    public f.m apply(a aVar) throws DM0 {
        AbstractC3401Jx1<byte[]> b2 = aVar.b();
        f.l a2 = aVar.a();
        File f = f(a2);
        o(f, b2.c());
        C11251zg0 d2 = b2.d();
        Objects.requireNonNull(d2);
        m(f, d2, a2, b2.f());
        return new f.m(k(f, a2));
    }
}

package androidx.camera.core;

import android.content.ContentValues;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import o.C10206vN0;
import o.C10907yF1;
import o.C11251zg0;
import o.C3139Hg0;
import o.C7433k41;

/* loaded from: classes.dex */
public final class i implements Runnable {
    public static final String c1 = "ImageSaver";
    public static final String d1 = "CameraX";
    public static final String e1 = ".tmp";
    public static final int f1 = 1024;
    public static final int g1 = 1;
    public static final int h1 = 0;
    public final g X;
    public final int Y;
    public final f.l Y0;
    public final int Z;
    public final Executor Z0;
    public final b a1;
    public final Executor b1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C10206vN0.a.EnumC0348a.values().length];
            a = iArr;
            try {
                iArr[C10206vN0.a.EnumC0348a.ENCODE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C10206vN0.a.EnumC0348a.DECODE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C10206vN0.a.EnumC0348a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(f.m mVar);

        void b(c cVar, String str, Throwable th);
    }

    /* loaded from: classes.dex */
    public enum c {
        FILE_IO_FAILED,
        ENCODE_FAILED,
        CROP_FAILED,
        UNKNOWN
    }

    public i(g gVar, f.l lVar, int i, int i2, Executor executor, Executor executor2, b bVar) {
        this.X = gVar;
        this.Y0 = lVar;
        this.Y = i;
        this.Z = i2;
        this.a1 = bVar;
        this.Z0 = executor;
        this.b1 = executor2;
    }

    public static String g(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            return name.substring(lastIndexOf);
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(File file) {
        Uri uri;
        c cVar;
        String str;
        ContentValues contentValues;
        C10907yF1.l(file);
        Throwable e = null;
        try {
            try {
                if (j()) {
                    if (this.Y0.b() != null) {
                        contentValues = new ContentValues(this.Y0.b());
                    } else {
                        contentValues = new ContentValues();
                    }
                    o(contentValues, 1);
                    uri = this.Y0.a().insert(this.Y0.f(), contentValues);
                    try {
                        if (uri == null) {
                            cVar = c.FILE_IO_FAILED;
                            str = "Failed to insert URI.";
                        } else {
                            if (!f(file, uri)) {
                                cVar = c.FILE_IO_FAILED;
                                str = "Failed to save to URI.";
                            } else {
                                cVar = null;
                                str = null;
                            }
                            p(uri);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        cVar = c.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                        file.delete();
                        if (cVar != null) {
                        }
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        cVar = c.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                        file.delete();
                        if (cVar != null) {
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        cVar = c.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                        file.delete();
                        if (cVar != null) {
                        }
                    }
                } else {
                    if (k()) {
                        e(file, this.Y0.e());
                    } else if (i()) {
                        File c2 = this.Y0.c();
                        if (c2.exists()) {
                            c2.delete();
                        }
                        if (!file.renameTo(c2)) {
                            cVar = c.FILE_IO_FAILED;
                            str = "Failed to rename file.";
                        } else {
                            cVar = null;
                            str = null;
                        }
                        uri = Uri.fromFile(c2);
                    }
                    uri = null;
                    cVar = null;
                    str = null;
                }
            } catch (IOException e5) {
                e = e5;
                Throwable th = e;
                uri = null;
                e = th;
                cVar = c.FILE_IO_FAILED;
                str = "Failed to write destination file.";
                file.delete();
                if (cVar != null) {
                }
            } catch (IllegalArgumentException e6) {
                e = e6;
                Throwable th2 = e;
                uri = null;
                e = th2;
                cVar = c.FILE_IO_FAILED;
                str = "Failed to write destination file.";
                file.delete();
                if (cVar != null) {
                }
            } catch (SecurityException e7) {
                e = e7;
                Throwable th22 = e;
                uri = null;
                e = th22;
                cVar = c.FILE_IO_FAILED;
                str = "Failed to write destination file.";
                file.delete();
                if (cVar != null) {
                }
            }
            file.delete();
            if (cVar != null) {
                l(cVar, str, e);
            } else {
                m(uri);
            }
        } catch (Throwable th3) {
            file.delete();
            throw th3;
        }
    }

    public final void e(File file, OutputStream outputStream) throws IOException {
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

    public final boolean f(File file, Uri uri) throws IOException {
        OutputStream openOutputStream = this.Y0.a().openOutputStream(uri);
        if (openOutputStream == null) {
            if (openOutputStream != null) {
                openOutputStream.close();
            }
            return false;
        }
        try {
            e(file, openOutputStream);
            openOutputStream.close();
            return true;
        } catch (Throwable th) {
            try {
                openOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] h(g gVar, int i) throws C10206vN0.a {
        boolean r = C10206vN0.r(gVar);
        int format = gVar.getFormat();
        if (format == 256) {
            if (!r) {
                return C10206vN0.n(gVar);
            }
            return C10206vN0.o(gVar, gVar.L3(), i);
        }
        Rect rect = null;
        if (format == 35) {
            if (r) {
                rect = gVar.L3();
            }
            return C10206vN0.t(gVar, rect, i, 0);
        }
        C7433k41.p(c1, "Unrecognized image format: " + format);
        return null;
    }

    public final boolean i() {
        if (this.Y0.c() != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.Y0.f() != null && this.Y0.a() != null && this.Y0.b() != null) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.Y0.e() != null) {
            return true;
        }
        return false;
    }

    public final void l(final c cVar, final String str, final Throwable th) {
        try {
            this.Z0.execute(new Runnable() { // from class: o.sN0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.i.this.a1.b(cVar, str, th);
                }
            });
        } catch (RejectedExecutionException unused) {
            C7433k41.c(c1, "Application executor rejected executing OnImageSavedCallback.onError callback. Skipping.");
        }
    }

    public final void m(final Uri uri) {
        try {
            this.Z0.execute(new Runnable() { // from class: o.uN0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.i.this.a1.a(new f.m(uri));
                }
            });
        } catch (RejectedExecutionException unused) {
            C7433k41.c(c1, "Application executor rejected executing OnImageSavedCallback.onImageSaved callback. Skipping.");
        }
    }

    public final File n() {
        File createTempFile;
        c cVar;
        String str;
        OutOfMemoryError outOfMemoryError;
        g gVar;
        try {
            if (i()) {
                createTempFile = new File(this.Y0.c().getParent(), "CameraX" + UUID.randomUUID().toString() + g(this.Y0.c()));
            } else {
                createTempFile = File.createTempFile("CameraX", ".tmp");
            }
            try {
                gVar = this.X;
            } catch (IOException e) {
                e = e;
                cVar = c.FILE_IO_FAILED;
                str = "Failed to write temp file";
                outOfMemoryError = e;
            } catch (IllegalArgumentException e2) {
                e = e2;
                cVar = c.FILE_IO_FAILED;
                str = "Failed to write temp file";
                outOfMemoryError = e;
            } catch (OutOfMemoryError e3) {
                cVar = c.UNKNOWN;
                str = "Processing failed due to low memory.";
                outOfMemoryError = e3;
            } catch (C10206vN0.a e4) {
                int i = a.a[e4.a().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        cVar = c.UNKNOWN;
                        str = "Failed to transcode mImage";
                        outOfMemoryError = e4;
                    } else {
                        cVar = c.CROP_FAILED;
                        str = "Failed to crop mImage";
                        outOfMemoryError = e4;
                    }
                } else {
                    cVar = c.ENCODE_FAILED;
                    str = "Failed to encode mImage";
                    outOfMemoryError = e4;
                }
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(h(this.X, this.Z));
                C11251zg0 i2 = C11251zg0.i(createTempFile);
                C11251zg0.k(this.X).h(i2);
                if (!new C3139Hg0().b(this.X)) {
                    i2.E(this.Y);
                }
                f.i d = this.Y0.d();
                if (d.b()) {
                    i2.m();
                }
                if (d.d()) {
                    i2.n();
                }
                if (d.a() != null) {
                    i2.b(this.Y0.d().a());
                }
                i2.F();
                fileOutputStream.close();
                if (gVar != null) {
                    gVar.close();
                }
                outOfMemoryError = null;
                cVar = null;
                str = null;
                if (cVar != null) {
                    l(cVar, str, outOfMemoryError);
                    createTempFile.delete();
                    return null;
                }
                return createTempFile;
            } catch (Throwable th) {
                if (gVar != null) {
                    try {
                        gVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            l(c.FILE_IO_FAILED, "Failed to create temp file", e5);
            return null;
        }
    }

    public final void o(ContentValues contentValues, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i));
        }
    }

    public final void p(Uri uri) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            o(contentValues, 0);
            this.Y0.a().update(uri, contentValues, null, null);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        final File n = n();
        if (n != null) {
            this.b1.execute(new Runnable() { // from class: o.tN0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.i.this.d(n);
                }
            });
        }
    }
}

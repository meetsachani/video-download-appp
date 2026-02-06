package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;
import o.C3221Ic0;
import o.C5718d30;
import o.QI1;
import o.RI1;

/* loaded from: classes.dex */
public class b {
    public final AssetManager a;
    public final Executor b;
    public final c.d c;
    public final File e;
    public final String f;
    public final String g;
    public final String h;
    public C5718d30[] j;
    public byte[] k;
    public boolean i = false;
    public final byte[] d = d();

    public b(AssetManager assetManager, Executor executor, c.d dVar, String str, String str2, String str3, File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = dVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.e = file;
    }

    public static byte[] d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return RI1.a;
        }
        switch (i) {
            case 24:
            case 25:
                return RI1.e;
            case 26:
                return RI1.d;
            case 27:
                return RI1.c;
            case 28:
            case 29:
            case 30:
                return RI1.b;
            default:
                return null;
        }
    }

    public static boolean j() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || i == 24 || i == 25) {
            return true;
        }
        return false;
    }

    public final b b(C5718d30[] c5718d30Arr, byte[] bArr) {
        InputStream g;
        try {
            g = g(this.a, this.h);
        } catch (FileNotFoundException e) {
            this.c.a(9, e);
        } catch (IOException e2) {
            this.c.a(7, e2);
        } catch (IllegalStateException e3) {
            this.j = null;
            this.c.a(8, e3);
        }
        if (g != null) {
            try {
                this.j = QI1.r(g, QI1.p(g, QI1.i), bArr, c5718d30Arr);
                g.close();
                return this;
            } catch (Throwable th) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (g != null) {
            g.close();
        }
        return null;
    }

    public final void c() {
        if (this.i) {
            return;
        }
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    public boolean e() {
        if (this.d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.e.exists()) {
            if (!this.e.canWrite()) {
                k(4, null);
                return false;
            }
        } else {
            try {
                if (!this.e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        }
        this.i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.g);
        } catch (FileNotFoundException e) {
            this.c.a(6, e);
            return null;
        } catch (IOException e2) {
            this.c.a(7, e2);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.c.b(5, null);
            }
            return null;
        }
    }

    public b h() {
        b b;
        c();
        if (this.d != null) {
            InputStream f = f(this.a);
            if (f != null) {
                this.j = i(f);
            }
            C5718d30[] c5718d30Arr = this.j;
            if (c5718d30Arr != null && j() && (b = b(c5718d30Arr, this.d)) != null) {
                return b;
            }
        }
        return this;
    }

    public final C5718d30[] i(InputStream inputStream) {
        try {
            try {
                try {
                    C5718d30[] x = QI1.x(inputStream, QI1.p(inputStream, QI1.h), this.f);
                    try {
                        inputStream.close();
                        return x;
                    } catch (IOException e) {
                        this.c.a(7, e);
                        return x;
                    }
                } catch (IOException e2) {
                    this.c.a(7, e2);
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        this.c.a(7, e3);
                    }
                    return null;
                }
            } catch (IllegalStateException e4) {
                this.c.a(8, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.c.a(7, e5);
            }
            throw th;
        }
    }

    public final void k(final int i, final Object obj) {
        this.b.execute(new Runnable() { // from class: o.S20
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.b.this.c.a(i, obj);
            }
        });
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        C5718d30[] c5718d30Arr = this.j;
        byte[] bArr = this.d;
        if (c5718d30Arr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                this.c.a(7, e);
            } catch (IllegalStateException e2) {
                this.c.a(8, e2);
            }
            try {
                QI1.F(byteArrayOutputStream, bArr);
                if (!QI1.C(byteArrayOutputStream, bArr, c5718d30Arr)) {
                    this.c.a(5, null);
                    this.j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [byte[], o.d30[]] */
    public boolean m() {
        byte[] bArr = this.k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                    FileChannel channel = fileOutputStream.getChannel();
                    try {
                        FileLock tryLock = channel.tryLock();
                        C3221Ic0.l(byteArrayInputStream, fileOutputStream, tryLock);
                        k(1, null);
                        if (tryLock != null) {
                            tryLock.close();
                        }
                        channel.close();
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } catch (Throwable th) {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                k(6, e);
                return false;
            } catch (IOException e2) {
                k(7, e2);
                return false;
            }
        } finally {
            this.k = null;
            this.j = null;
        }
    }
}

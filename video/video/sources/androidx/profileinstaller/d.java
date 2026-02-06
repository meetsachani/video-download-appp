package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import o.InterfaceFutureC8411o11;
import o.ZS1;

/* loaded from: classes.dex */
public final class d {
    public static final String a = "/data/misc/profiles/ref/";
    public static final String b = "/data/misc/profiles/cur/0/";
    public static final String c = "primary.prof";
    public static final String d = "profileInstalled";
    public static final String g = "ProfileVerifier";
    public static final ZS1<c> e = ZS1.A();
    public static final Object f = new Object();
    public static c h = null;

    /* loaded from: classes.dex */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final int e = 1;
        public final int a;
        public final int b;
        public final long c;
        public final long d;

        public b(int i, int i2, long j, long j2) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = j2;
        }

        public static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.a);
                dataOutputStream.writeInt(this.b);
                dataOutputStream.writeLong(this.c);
                dataOutputStream.writeLong(this.d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.b == bVar.b && this.c == bVar.c && this.a == bVar.a && this.d == bVar.d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.a), Long.valueOf(this.d));
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static final int e = 16;
        public static final int f = 0;
        @Deprecated
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
        public static final int k = 65536;
        public static final int l = 131072;
        public static final int m = 196608;
        public static final int n = 262144;

        /* renamed from: o  reason: collision with root package name */
        public static final int f50o = 327680;
        public final int a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        public c(int i2, boolean z, boolean z2, boolean z3) {
            this.a = i2;
            this.c = z2;
            this.b = z;
            this.d = z3;
        }

        public boolean a() {
            return this.d;
        }

        public int b() {
            return this.a;
        }

        public boolean c() {
            return this.c;
        }

        public boolean d() {
            return this.b;
        }
    }

    public static InterfaceFutureC8411o11<c> a() {
        return e;
    }

    public static long b(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c c(int i, boolean z, boolean z2, boolean z3) {
        c cVar = new c(i, z, z2, z3);
        h = cVar;
        e.v(cVar);
        return h;
    }

    public static c d(Context context) {
        return e(context, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:23|(1:89)(1:27)|28|(1:88)(1:32)|33|34|35|(2:74|75)(1:37)|38|(8:45|(1:49)|(1:56)|57|(2:64|65)|61|62|63)|(1:71)(1:(1:73))|(1:49)|(3:51|54|56)|57|(1:59)|64|65|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c7, code lost:
        r5 = androidx.profileinstaller.d.c.f50o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00fa, code lost:
        r14 = androidx.profileinstaller.d.c.m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c e(Context context, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        b a2;
        b bVar;
        int i;
        AssetFileDescriptor openFd;
        c cVar;
        if (!z && (cVar = h) != null) {
            return cVar;
        }
        synchronized (f) {
            if (!z) {
                c cVar2 = h;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            int i2 = 0;
            try {
                openFd = context.getAssets().openFd(androidx.profileinstaller.c.a);
            } catch (IOException unused) {
                z2 = false;
            }
            try {
                if (openFd.getLength() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                openFd.close();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File(a, context.getPackageName()), "primary.prof");
                    long length = file.length();
                    if (file.exists() && length > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    File file2 = new File(new File(b, context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (file2.exists() && length2 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    try {
                        long b2 = b(context);
                        File file3 = new File(context.getFilesDir(), d);
                        if (file3.exists()) {
                            try {
                                a2 = b.a(file3);
                            } catch (IOException unused2) {
                                return c(131072, z3, z4, z2);
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.c == b2 && (i = a2.b) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (a2 != null && a2.b == 2 && i2 == 1 && length < a2.d) {
                                i2 = 3;
                            }
                            int i4 = i2;
                            bVar = new b(1, i4, b2, length2);
                            if (a2 != null || !a2.equals(bVar)) {
                                bVar.b(file3);
                            }
                            return c(i4, z3, z4, z2);
                        }
                        if (z3) {
                            i2 = 1;
                        } else if (z4) {
                            i2 = 2;
                        }
                        if (z) {
                            i2 = 2;
                        }
                        if (a2 != null) {
                            i2 = 3;
                        }
                        int i42 = i2;
                        bVar = new b(1, i42, b2, length2);
                        if (a2 != null) {
                        }
                        bVar.b(file3);
                        return c(i42, z3, z4, z2);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        return c(65536, z3, z4, z2);
                    }
                }
                return c(262144, false, false, z2);
            } catch (Throwable th) {
                if (openFd != null) {
                    try {
                        openFd.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }
}

package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.profileinstaller.c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import o.D6;

/* loaded from: classes.dex */
public class c {
    public static final int A = 14;
    public static final int B = 15;
    public static final int C = 16;
    public static final String a = "dexopt/baseline.prof";
    public static final String b = "ProfileInstaller";
    public static final String c = "/data/misc/profiles/cur/0";
    public static final String d = "primary.prof";
    public static final String e = "dexopt/baseline.profm";
    public static final String f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
    public static final d g = new a();
    public static final d h = new b();
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 1;

    /* renamed from: o */
    public static final int f49o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final int r = 5;
    public static final int s = 6;
    public static final int t = 7;
    public static final int u = 8;
    public static final int v = 9;
    public static final int w = 10;
    public static final int x = 11;
    public static final int y = 12;
    public static final int z = 13;

    /* loaded from: classes.dex */
    public class a implements d {
        @Override // androidx.profileinstaller.c.d
        public void a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.c.d
        public void b(int i, Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements d {
        public static final String a = "ProfileInstaller";

        @Override // androidx.profileinstaller.c.d
        public void a(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i != 6 && i != 7 && i != 8) {
                Log.d("ProfileInstaller", str);
            } else {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }

        @Override // androidx.profileinstaller.c.d
        public void b(int i, Object obj) {
            String str;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str = "";
                            } else {
                                str = "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
                            }
                        } else {
                            str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
                        }
                    } else {
                        str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
                    }
                } else {
                    str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
                }
            } else {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            }
            Log.d("ProfileInstaller", str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.profileinstaller.c$c */
    /* loaded from: classes.dex */
    public @interface InterfaceC0036c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i, Object obj);

        void b(int i, Object obj);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public static /* synthetic */ void a(d dVar, int i2, Object obj) {
        dVar.a(i2, obj);
    }

    public static /* synthetic */ void b(d dVar, int i2, Object obj) {
        dVar.b(i2, obj);
    }

    public static boolean c(File file) {
        return new File(file, f).delete();
    }

    public static void d(Context context, Executor executor, d dVar) {
        c(context.getFilesDir());
        h(executor, dVar, 11, null);
    }

    public static void e(Executor executor, final d dVar, final int i2, final Object obj) {
        executor.execute(new Runnable() { // from class: o.HI1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.b(c.d.this, i2, obj);
            }
        });
    }

    public static boolean f(PackageInfo packageInfo, File file, d dVar) {
        File file2 = new File(file, f);
        boolean z2 = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z2 = true;
            }
            if (z2) {
                dVar.a(2, null);
            }
            return z2;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void g(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f)));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void h(Executor executor, final d dVar, final int i2, final Object obj) {
        executor.execute(new Runnable() { // from class: o.GI1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.a(c.d.this, i2, obj);
            }
        });
    }

    public static boolean i(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, d dVar) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, dVar, str2, a, e, new File(new File(c, str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean m2 = bVar.h().l().m();
        if (m2) {
            g(packageInfo, file);
        }
        return m2;
    }

    public static void j(Context context) {
        k(context, new D6(), g);
    }

    public static void k(Context context, Executor executor, d dVar) {
        l(context, executor, dVar, false);
    }

    public static void l(Context context, Executor executor, d dVar, boolean z2) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z3 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2 && f(packageInfo, filesDir, dVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                androidx.profileinstaller.d.e(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (i(assets, packageName, packageInfo, filesDir, name, executor, dVar) && z2) {
                z3 = true;
            }
            androidx.profileinstaller.d.e(context, z3);
        } catch (PackageManager.NameNotFoundException e2) {
            dVar.a(7, e2);
            androidx.profileinstaller.d.e(context, false);
        }
    }

    public static void m(Context context, Executor executor, d dVar) {
        try {
            g(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            h(executor, dVar, 10, null);
        } catch (PackageManager.NameNotFoundException e2) {
            h(executor, dVar, 7, e2);
        }
    }
}

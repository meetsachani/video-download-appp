package o;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: o.aq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5179aq extends FileProvider {
    public static final String n1 = "BrowserServiceFP";
    public static final String o1 = ".image_provider";
    public static final String p1 = "content";
    public static final String q1 = "image_provider";
    public static final String r1 = "image_provider_images/";
    public static final String s1 = ".png";
    public static final String t1 = "image_provider_uris";
    public static final String u1 = "last_cleanup_time";
    public static Object v1 = new Object();

    /* renamed from: o.aq$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ ContentResolver X;
        public final /* synthetic */ Uri Y;
        public final /* synthetic */ ZS1 Z;

        public a(ContentResolver contentResolver, Uri uri, ZS1 zs1) {
            this.X = contentResolver;
            this.Y = uri;
            this.Z = zs1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ParcelFileDescriptor openFileDescriptor = this.X.openFileDescriptor(this.Y, "r");
                if (openFileDescriptor == null) {
                    this.Z.w(new FileNotFoundException());
                    return;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                openFileDescriptor.close();
                if (decodeFileDescriptor == null) {
                    this.Z.w(new IOException("File could not be decoded."));
                } else {
                    this.Z.v(decodeFileDescriptor);
                }
            } catch (IOException e) {
                this.Z.w(e);
            }
        }
    }

    /* renamed from: o.aq$b */
    /* loaded from: classes.dex */
    public static class b extends AsyncTask<Void, Void, Void> {
        public static final long b;
        public static final long c;
        public static final long d;
        public final Context a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            b = timeUnit.toMillis(7L);
            c = timeUnit.toMillis(7L);
            d = timeUnit.toMillis(1L);
        }

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        public static boolean b(File file) {
            return file.getName().endsWith("..png");
        }

        public static boolean c(SharedPreferences sharedPreferences) {
            if (System.currentTimeMillis() > sharedPreferences.getLong(C5179aq.u1, System.currentTimeMillis()) + c) {
                return true;
            }
            return false;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            long currentTimeMillis;
            SharedPreferences sharedPreferences = this.a.getSharedPreferences(this.a.getPackageName() + C5179aq.o1, 0);
            if (!c(sharedPreferences)) {
                return null;
            }
            synchronized (C5179aq.v1) {
                try {
                    File file = new File(this.a.getFilesDir(), C5179aq.q1);
                    if (!file.exists()) {
                        return null;
                    }
                    File[] listFiles = file.listFiles();
                    long currentTimeMillis2 = System.currentTimeMillis() - b;
                    boolean z = true;
                    for (File file2 : listFiles) {
                        if (b(file2) && file2.lastModified() < currentTimeMillis2 && !file2.delete()) {
                            Log.e(C5179aq.n1, "Fail to delete image: " + file2.getAbsoluteFile());
                            z = false;
                        }
                    }
                    if (z) {
                        currentTimeMillis = System.currentTimeMillis();
                    } else {
                        currentTimeMillis = (System.currentTimeMillis() - c) + d;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(C5179aq.u1, currentTimeMillis);
                    edit.apply();
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: o.aq$c */
    /* loaded from: classes.dex */
    public static class c extends AsyncTask<String, Void, Void> {
        public final Context a;
        public final String b;
        public final Bitmap c;
        public final Uri d;
        public final ZS1<Uri> e;

        public c(Context context, String str, Bitmap bitmap, Uri uri, ZS1<Uri> zs1) {
            this.a = context.getApplicationContext();
            this.b = str;
            this.c = bitmap;
            this.d = uri;
            this.e = zs1;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            d();
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Void r3) {
            new b(this.a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        public final void c(File file) {
            FileOutputStream fileOutputStream;
            C5867dg c5867dg = new C5867dg(file);
            try {
                fileOutputStream = c5867dg.h();
                try {
                    this.c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    c5867dg.c(fileOutputStream);
                    this.e.v(this.d);
                } catch (IOException e) {
                    e = e;
                    c5867dg.b(fileOutputStream);
                    this.e.w(e);
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
            }
        }

        public final void d() {
            File file = new File(this.a.getFilesDir(), C5179aq.q1);
            synchronized (C5179aq.v1) {
                try {
                    if (!file.exists() && !file.mkdir()) {
                        this.e.w(new IOException("Could not create file directory."));
                        return;
                    }
                    File file2 = new File(file, this.b + C5179aq.s1);
                    if (file2.exists()) {
                        this.e.v(this.d);
                    } else {
                        c(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Uri m(Context context, String str) {
        return new Uri.Builder().scheme("content").authority(context.getPackageName() + o1).path(r1 + str + s1).build();
    }

    public static void n(Intent intent, List<Uri> list, Context context) {
        if (list != null && list.size() != 0) {
            ContentResolver contentResolver = context.getContentResolver();
            intent.addFlags(1);
            ClipData newUri = ClipData.newUri(contentResolver, t1, list.get(0));
            for (int i = 1; i < list.size(); i++) {
                newUri.addItem(new ClipData.Item(list.get(i)));
            }
            intent.setClipData(newUri);
        }
    }

    public static InterfaceFutureC8411o11<Bitmap> o(ContentResolver contentResolver, Uri uri) {
        ZS1 A = ZS1.A();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(contentResolver, uri, A));
        return A;
    }

    public static ZS1<Uri> p(Context context, Bitmap bitmap, String str, int i) {
        String str2 = str + CrashlyticsReportPersistence.m + Integer.toString(i);
        Uri m = m(context, str2);
        ZS1<Uri> A = ZS1.A();
        new c(context, str2, bitmap, m, A).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return A;
    }
}

package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o.I7;

/* renamed from: o.aE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5036aE2 {
    public static String a = "video_folder_path";
    public static String b = "video_folder_name";
    public static String c = "hidden_file";
    public static boolean d = true;
    public static Dialog g;
    public static String h;
    public static File e = new File(Environment.getExternalStorageDirectory() + RemoteSettings.i + Environment.DIRECTORY_DOWNLOADS + RemoteSettings.i + BS2.a);
    public static String f = "Saved";
    public static String[] i = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    public static String[] j = {"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};

    /* renamed from: o.aE2$a */
    /* loaded from: classes3.dex */
    public class a implements I7.f {
        public final /* synthetic */ Activity a;

        /* renamed from: o.aE2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0257a implements Runnable {
            public RunnableC0257a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.finish();
            }
        }

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // o.I7.f
        public void a(boolean z) {
            new Handler().postDelayed(new RunnableC0257a(), 100L);
        }
    }

    public static void a(Activity activity) {
        I7.i(activity, new a(activity));
    }

    public static void b(Activity activity) {
        if (!C2723Dd.Y().equals("")) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C2723Dd.Y()));
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
                return;
            } else {
                Toast.makeText(activity, "No browser found to open the URL!", 0).show();
                return;
            }
        }
        Toast.makeText(activity, "Something went wrong!", 0).show();
    }

    public static void c(Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
        }
    }

    public static void d(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", R.string.app_name);
            intent.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=" + context.getPackageName() + "\n\n");
            context.startActivity(Intent.createChooser(intent, "choose one"));
        } catch (Exception unused) {
        }
    }

    public static void e(Activity activity, Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.SUBJECT", R.string.app_name);
        intent.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=" + activity.getPackageName() + "\n\n");
        activity.startActivity(Intent.createChooser(intent, "Share via"));
    }

    public static boolean f(Activity activity) {
        String[] p = p();
        if (C6968i90.a(activity, p)) {
            return true;
        }
        C6968i90.g(activity, activity.getString(R.string.rationale_storage), 21, p);
        return false;
    }

    public static String g(long j2) {
        String str;
        String str2;
        if (j2 > 3600000) {
            int i2 = (int) (j2 / 3600000);
            if (i2 < 10) {
                str = "0" + i2 + ":";
            } else {
                str = i2 + ":";
            }
        } else {
            str = "";
        }
        int i3 = ((int) (j2 / 60000)) % 60;
        if (i3 < 10) {
            str2 = str + "0" + i3 + ":";
        } else {
            str2 = str + i3 + ":";
        }
        int i4 = ((int) (j2 / 1000)) % 60;
        if (i4 < 10) {
            return str2 + "0" + i4;
        }
        return str2 + i4;
    }

    public static String h(long j2, String str) {
        return new SimpleDateFormat(str, Locale.ENGLISH).format(new Date(j2));
    }

    public static String i(long j2) {
        if (j2 < 1024) {
            return j2 + " B";
        } else if (j2 < 1048576) {
            return new DecimalFormat("##.## KB").format(((float) j2) / 1024.0f);
        } else {
            if (j2 < 1073741824) {
                return new DecimalFormat("##.## MB").format(((float) j2) / 1048576.0f);
            }
            return new DecimalFormat("##.## GB").format(((float) j2) / 1.0737418E9f);
        }
    }

    public static String j(String str) {
        String[] split = str.split("[^\\d]+");
        if (split.length >= 2) {
            String str2 = split[1];
            try {
                long parseLong = Long.parseLong(str2);
                if (parseLong < 240) {
                    return "144P";
                }
                if (parseLong < 360) {
                    return "240P";
                }
                if (parseLong < 480) {
                    return "360P";
                }
                if (parseLong < 720) {
                    return "480P";
                }
                if (parseLong < 1080) {
                    return "720P";
                }
                if (parseLong < 1440) {
                    return "1080P";
                }
                if (parseLong < 2160) {
                    return "1440P";
                }
                if (parseLong < 4320) {
                    return "4K";
                }
                return "8K";
            } catch (NumberFormatException unused) {
                return str2;
            }
        }
        if (split.length == 1) {
            String str3 = split[0];
        }
        return "720P";
    }

    public static String k(Context context) {
        File file;
        try {
            if (Environment.getExternalStorageState().equals("mounted")) {
                file = context.getExternalCacheDir();
                if (file == null || !file.exists()) {
                    file = n(context);
                }
            } else {
                file = null;
            }
            if (file == null && ((file = context.getCacheDir()) == null || !file.exists())) {
                file = l(context);
            }
            Log.w("binhnk08", "cache dir = " + file.getAbsolutePath());
            return file.getAbsolutePath();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static File l(Context context) {
        return new File("/data/data/" + context.getPackageName() + "/cache");
    }

    public static String m(Context context) {
        try {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (externalStoragePublicDirectory != null) {
                return externalStoragePublicDirectory.getAbsolutePath();
            }
            File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (externalStoragePublicDirectory2 != null) {
                return externalStoragePublicDirectory2.getAbsolutePath();
            }
            return k(context);
        } catch (Exception unused) {
            return k(context);
        }
    }

    public static File n(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (!file.exists()) {
            if (!file.mkdirs()) {
                Log.w("binhnk08", "Unable to create external cache directory");
                return null;
            }
            try {
                new File(file, ".nomedia").createNewFile();
                return file;
            } catch (IOException unused) {
                Log.i("binhnk08", "Can't create \".nomedia\" file in application external cache directory");
            }
        }
        return file;
    }

    public static String o(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public static String[] p() {
        if (Build.VERSION.SDK_INT >= 33) {
            return j;
        }
        return i;
    }

    public static void q(Activity activity) {
        Dialog dialog = g;
        if (dialog != null && dialog.isShowing()) {
            g.dismiss();
        }
    }

    public static void r(Context context) {
        try {
            h = m(context) + RemoteSettings.i + BS2.a;
            new File(h).mkdirs();
        } catch (Exception unused) {
        }
    }

    public static void t(Context context, boolean z) {
        Settings.System.putInt(context.getContentResolver(), "accelerometer_rotation", z ? 1 : 0);
    }

    public static void u(Context context, Uri uri, String str) {
        String str2 = context.getString(R.string.share_app_message) + "\nhttps://play.google.com/store/apps/details?id=" + context.getPackageName();
        Intent intent = new Intent("android.intent.action.SEND");
        if (str == null) {
            str = "*/*";
        }
        intent.setType(str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.addFlags(1);
        if (str2 != null && !str2.isEmpty()) {
            intent.putExtra("android.intent.extra.TEXT", str2);
        }
        context.startActivity(Intent.createChooser(intent, "Share Status"));
    }

    public static void v(Activity activity, File file) {
        if (!file.exists()) {
            Toast.makeText(activity, "File not found", 0).show();
            return;
        }
        Uri h2 = FileProvider.h(activity, activity.getPackageName() + ".fileprovider", file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(o(file.getAbsolutePath()));
        intent.putExtra("android.intent.extra.STREAM", h2);
        intent.putExtra("android.intent.extra.TEXT", activity.getString(R.string.share_app_message) + "\nhttps://play.google.com/store/apps/details?id=" + activity.getPackageName());
        intent.addFlags(1);
        activity.startActivity(Intent.createChooser(intent, "Share file using"));
    }

    public static void w(Activity activity) {
        System.out.println("Show");
        Dialog dialog = g;
        if (dialog != null) {
            dialog.dismiss();
            g = null;
        }
        Dialog dialog2 = new Dialog(activity);
        g = dialog2;
        dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Window window = g.getWindow();
        window.setLayout(-1, -2);
        window.setFlags(1024, 1024);
        window.getDecorView().setSystemUiVisibility(6);
        g.setContentView(g.getLayoutInflater().inflate(R.layout.custom_progressbar, (ViewGroup) null));
        g.getWindow().setGravity(17);
        g.getWindow().setLayout(-1, -2);
        g.setCancelable(true);
        g.setCanceledOnTouchOutside(false);
        if (!g.isShowing() && !activity.isFinishing()) {
            g.show();
        }
    }

    public static void s(Activity activity, String str, String str2) {
    }
}

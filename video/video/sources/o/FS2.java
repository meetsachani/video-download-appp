package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.appcompat.app.a;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public class FS2 {
    public static final String a = "com.whatsapp.w4b";
    public static String b = "primary:Android/media/com.whatsapp.w4b/WhatsApp Business/Media/.Statuses/";
    public static final String c = "com.whatsapp";
    public static String d = "primary:Android/media/com.whatsapp/WhatsApp/Media/.Statuses/";

    /* loaded from: classes3.dex */
    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ Context X;

        public a(Context context) {
            this.X = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            FS2.d(this.X, dialogInterface, i);
        }
    }

    public static void d(Context context, DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        e(context);
    }

    public static void e(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    public static void f(Context context) {
        new a.C0006a(context).setTitle(context.getString(R.string.need_permissions)).l(context.getString(R.string.this_app_needs_storage_)).y(context.getString(R.string.go_to_settings), new a(context)).p(context.getString(R.string.cancel), ES2.X).I();
    }

    public final HS2 a(Context context) {
        return HS2.b.a(context);
    }

    public final boolean b(Context context) {
        try {
            context.getPackageManager().getPackageInfo(a, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final boolean c(Context context) {
        try {
            context.getPackageManager().getPackageInfo(c, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}

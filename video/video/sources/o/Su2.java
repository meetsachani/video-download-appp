package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.FileProvider;
import java.io.File;

/* loaded from: classes.dex */
public class Su2 {
    public static final String a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
    public static final String b = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    public static boolean a(Context context, String str, String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent().setAction(AbstractServiceC10718xT.Z).setPackage(str), 64);
        if (resolveService != null && (intentFilter = resolveService.filter) != null) {
            return intentFilter.hasCategory(str2);
        }
        return false;
    }

    @Deprecated
    public static void b(Context context, C10229vT c10229vT, Uri uri) {
        if (c10229vT.a.getExtras().getBinder(C10229vT.d) != null) {
            c10229vT.a.putExtra(a, true);
            c10229vT.t(context, uri);
            return;
        }
        throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
    }

    public static void c(Context context, CT ct, Uri uri) {
        Intent intent = new Intent(b);
        intent.setPackage(ct.h().getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        bundle.putBinder(C10229vT.d, ct.g());
        intent.putExtras(bundle);
        PendingIntent i = ct.i();
        if (i != null) {
            intent.putExtra(C10229vT.e, i);
        }
        context.startActivity(intent);
    }

    public static boolean d(Context context, File file, String str, String str2, CT ct) {
        Uri h = FileProvider.h(context, str, file);
        context.grantUriPermission(str2, h, 1);
        return ct.m(h, 1, null);
    }
}

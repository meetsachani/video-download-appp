package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class zzbkh {
    @InterfaceC11300zs1
    public static final Intent a(Uri uri, Context context, zzavl zzavlVar, View view, zzfct zzfctVar) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final Intent b(Intent intent, ResolveInfo resolveInfo, Context context, zzavl zzavlVar, View view, zzfct zzfctVar) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    @InterfaceC5056aJ2
    public static final ResolveInfo c(Intent intent, Context context, zzavl zzavlVar, View view, zzfct zzfctVar) {
        return d(intent, new ArrayList(), context, zzavlVar, view, zzfctVar);
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static final ResolveInfo d(Intent intent, ArrayList arrayList, Context context, zzavl zzavlVar, View view, zzfct zzfctVar) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.t().x(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return resolveInfo;
        }
    }
}

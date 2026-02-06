package o;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import java.util.Locale;
import java.util.Set;

/* renamed from: o.Gd1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3030Gd1 {

    /* renamed from: o.Gd1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static CharSequence a(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            int i = 0;
            for (Locale locale : serviceInfo.getNamedContentLocales()) {
                strArr[i] = locale.toLanguageTag();
                i++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    public static CharSequence a(Context context, ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(context, serviceInfo);
        }
        return null;
    }
}

package o;

import android.content.Context;
import android.os.UserManager;

/* renamed from: o.tD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9682tD2 {

    /* renamed from: o.tD2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context) {
        return a.a(context);
    }
}

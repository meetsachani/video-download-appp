package o;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class BE0 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(Context context) {
            return b(context).getApplicationGrammaticalGender();
        }

        public static GrammaticalInflectionManager b(Context context) {
            return (GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class);
        }

        public static void c(Context context, int i) {
            b(context).setRequestedApplicationGrammaticalGender(i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static int a(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(context);
        }
        return 0;
    }

    public static void b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.c(context, i);
        }
    }
}

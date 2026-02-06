package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class H60 {
    public static volatile boolean a = true;

    public static Drawable a(Context context, int i, Resources.Theme theme) {
        return c(context, context, i, theme);
    }

    public static Drawable b(Context context, Context context2, int i) {
        return c(context, context2, i, null);
    }

    public static Drawable c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return e(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C10201vM.l(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i, theme);
    }

    public static Drawable d(Context context, int i, Resources.Theme theme) {
        return C10231vT1.g(context.getResources(), i, theme);
    }

    public static Drawable e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            BM bm = new BM(context, theme);
            bm.a(theme.getResources().getConfiguration());
            context = bm;
        }
        return C3220Ic.b(context, i);
    }
}

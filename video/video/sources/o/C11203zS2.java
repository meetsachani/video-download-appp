package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import java.util.regex.Pattern;

/* renamed from: o.zS2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11203zS2 {
    public static final String a = "^(https?:\\/\\/)?(www\\.)?(instagram\\.com|facebook\\.com)\\/[^ ]*$";

    public static String a(Context context) {
        ClipData primaryClip;
        ClipboardManager clipboardManager = (ClipboardManager) C10201vM.s(context, ClipboardManager.class);
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getText() != null) {
                return itemAt.getText().toString();
            }
            return "";
        }
        return "";
    }

    public static void b(Context context) {
        C11077yx1.g(context.getApplicationContext());
    }

    public static void c(Context context) {
        C11077yx1.h(context, C11320zx1.f().c(true).a());
    }

    public static boolean d(String str) {
        return Pattern.compile(CS2.a).matcher(str).matches();
    }

    public static boolean e(String str) {
        return Pattern.compile(CS2.c).matcher(str).matches();
    }

    public static boolean f(String str) {
        return Pattern.compile(CS2.e).matcher(str).matches();
    }

    public static boolean g(String str) {
        return Pattern.compile(CS2.f).matcher(str).matches();
    }

    public static boolean h(String str) {
        return Pattern.compile(CS2.g).matcher(str).matches();
    }

    public static boolean i(String str) {
        return Pattern.compile(CS2.b).matcher(str).matches();
    }

    public static boolean j(String str) {
        return Pattern.compile(CS2.h).matcher(str).matches();
    }

    public static boolean k(String str) {
        return Pattern.compile(CS2.i).matcher(str).matches();
    }

    public static boolean l(String str) {
        return Pattern.compile(a).matcher(str).matches();
    }

    public static String m(Context context) {
        ClipData primaryClip;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getText() != null) {
                return itemAt.getText().toString();
            }
            return "";
        }
        return "";
    }
}

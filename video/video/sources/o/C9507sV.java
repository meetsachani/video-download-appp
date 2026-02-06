package o;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import o.C7025iN1;

/* renamed from: o.sV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9507sV {
    public static C4377Tx1<String, String> a(@InterfaceC11300zs1 Long l, @InterfaceC11300zs1 Long l2) {
        return b(l, l2, null);
    }

    public static C4377Tx1<String, String> b(@InterfaceC11300zs1 Long l, @InterfaceC11300zs1 Long l2, @InterfaceC11300zs1 SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return C4377Tx1.a(null, null);
        }
        if (l == null) {
            return C4377Tx1.a(null, d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return C4377Tx1.a(d(l.longValue(), simpleDateFormat), null);
        }
        Calendar v = C11143zD2.v();
        Calendar x = C11143zD2.x();
        x.setTimeInMillis(l.longValue());
        Calendar x2 = C11143zD2.x();
        x2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return C4377Tx1.a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (x.get(1) == x2.get(1)) {
            if (x.get(1) == v.get(1)) {
                return C4377Tx1.a(g(l.longValue(), Locale.getDefault()), g(l2.longValue(), Locale.getDefault()));
            }
            return C4377Tx1.a(g(l.longValue(), Locale.getDefault()), n(l2.longValue(), Locale.getDefault()));
        } else {
            return C4377Tx1.a(n(l.longValue(), Locale.getDefault()), n(l2.longValue(), Locale.getDefault()));
        }
    }

    public static String c(long j) {
        return d(j, null);
    }

    public static String d(long j, @InterfaceC11300zs1 SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (q(j)) {
            return f(j);
        }
        return m(j);
    }

    public static String e(Context context, long j, boolean z, boolean z2, boolean z3) {
        String j2 = j(j);
        if (z) {
            j2 = String.format(context.getString(C7025iN1.m.mtrl_picker_today_description), j2);
        }
        if (z2) {
            return String.format(context.getString(C7025iN1.m.mtrl_picker_start_date_description), j2);
        }
        if (z3) {
            return String.format(context.getString(C7025iN1.m.mtrl_picker_end_date_description), j2);
        }
        return j2;
    }

    public static String f(long j) {
        return g(j, Locale.getDefault());
    }

    public static String g(long j, Locale locale) {
        return C11143zD2.c(locale).format(new Date(j));
    }

    public static String h(long j) {
        return i(j, Locale.getDefault());
    }

    public static String i(long j, Locale locale) {
        return C11143zD2.p(locale).format(new Date(j));
    }

    public static String j(long j) {
        if (q(j)) {
            return h(j);
        }
        return o(j);
    }

    public static String k(Context context, int i) {
        if (C11143zD2.v().get(1) == i) {
            return String.format(context.getString(C7025iN1.m.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i));
        }
        return String.format(context.getString(C7025iN1.m.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    public static String l(long j) {
        return C11143zD2.A(Locale.getDefault()).format(new Date(j));
    }

    public static String m(long j) {
        return n(j, Locale.getDefault());
    }

    public static String n(long j, Locale locale) {
        return C11143zD2.z(locale).format(new Date(j));
    }

    public static String o(long j) {
        return p(j, Locale.getDefault());
    }

    public static String p(long j, Locale locale) {
        return C11143zD2.B(locale).format(new Date(j));
    }

    public static boolean q(long j) {
        Calendar v = C11143zD2.v();
        Calendar x = C11143zD2.x();
        x.setTimeInMillis(j);
        if (v.get(1) == x.get(1)) {
            return true;
        }
        return false;
    }
}

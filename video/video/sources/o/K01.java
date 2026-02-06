package o;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.K01;

/* loaded from: classes.dex */
public final class K01 {
    public static final String[] a = new String[0];
    public static final Comparator<b> b = new Comparator() { // from class: o.J01
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return K01.a((K01.b) obj, (K01.b) obj2);
        }
    };

    /* loaded from: classes.dex */
    public static class a {
        public static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        public static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public URLSpan a;
        public String b;
        public int c;
        public int d;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        int i = bVar.c;
        int i2 = bVar2.c;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(bVar2.d, bVar.d);
    }

    public static void b(TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static void c(TextView textView, Pattern pattern, String str) {
        if (q()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            e(textView, pattern, str, null, null, null);
        }
    }

    public static void d(TextView textView, Pattern pattern, String str, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        if (q()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            e(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    public static void e(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        if (q()) {
            a.a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (i(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            b(textView);
        }
    }

    public static boolean f(Spannable spannable, int i) {
        Spannable spannable2;
        if (q()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            spannable2 = spannable;
            m(arrayList, spannable2, C7465kC1.w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        } else {
            spannable2 = spannable;
        }
        if ((i & 2) != 0) {
            m(arrayList, spannable2, C7465kC1.A, new String[]{C8192n71.b}, null, null);
        }
        if ((i & 8) != 0) {
            n(arrayList, spannable2);
        }
        p(arrayList, spannable2);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a == null) {
                k(bVar.b, bVar.c, bVar.d, spannable2);
            }
        }
        return true;
    }

    public static boolean g(Spannable spannable, Pattern pattern, String str) {
        if (q()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return i(spannable, pattern, str, null, null, null);
    }

    public static boolean h(Spannable spannable, Pattern pattern, String str, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        if (q()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return i(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    public static boolean i(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        boolean z;
        String lowerCase;
        if (q()) {
            return a.b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str2 = strArr[i];
            i++;
            if (str2 == null) {
                lowerCase = "";
            } else {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            }
            strArr2[i] = lowerCase;
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z2 = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter != null) {
                z = matchFilter.acceptMatch(spannable, start, end);
            } else {
                z = true;
            }
            if (z && group != null) {
                k(o(group, strArr2, matcher, transformFilter), start, end, spannable);
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean j(TextView textView, int i) {
        if (q()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (f((Spannable) text, i)) {
                b(textView);
                return true;
            }
        } else {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (f(valueOf, i)) {
                b(textView);
                textView.setText(valueOf);
                return true;
            }
        }
        return false;
    }

    public static void k(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    public static String l(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return C9356rt0.c(str);
    }

    public static void m(ArrayList<b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    b bVar = new b();
                    bVar.b = o(group, strArr, matcher, transformFilter);
                    bVar.c = start;
                    bVar.d = end;
                    arrayList.add(bVar);
                }
            }
        }
    }

    public static void n(ArrayList<b> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i = 0;
        while (true) {
            try {
                String l = l(obj);
                if (l != null && (indexOf = obj.indexOf(l)) >= 0) {
                    b bVar = new b();
                    int length = l.length() + indexOf;
                    bVar.c = indexOf + i;
                    i += length;
                    bVar.d = i;
                    obj = obj.substring(length);
                    try {
                        String encode = URLEncoder.encode(l, "UTF-8");
                        bVar.b = "geo:0,0?q=" + encode;
                        arrayList.add(bVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    public static String o(String str, String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        String str2 = str;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str3 = strArr[i];
                if (str2.regionMatches(true, 0, str3, 0, str3.length())) {
                    z = true;
                    if (!str2.regionMatches(false, 0, str3, 0, str3.length())) {
                        str2 = str3 + str2.substring(str3.length());
                    }
                } else {
                    i++;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z && strArr.length > 0) {
            return strArr[0] + str2;
        }
        return str2;
    }

    public static void p(ArrayList<b> arrayList, Spannable spannable) {
        URLSpan[] uRLSpanArr;
        int i;
        int i2;
        int i3 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            b bVar = new b();
            bVar.a = uRLSpan;
            bVar.c = spannable.getSpanStart(uRLSpan);
            bVar.d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, b);
        int size = arrayList.size();
        while (i3 < size - 1) {
            b bVar2 = arrayList.get(i3);
            int i4 = i3 + 1;
            b bVar3 = arrayList.get(i4);
            int i5 = bVar2.c;
            int i6 = bVar3.c;
            if (i5 <= i6 && (i = bVar2.d) > i6) {
                int i7 = bVar3.d;
                if (i7 <= i || i - i5 > i7 - i6) {
                    i2 = i4;
                } else if (i - i5 < i7 - i6) {
                    i2 = i3;
                } else {
                    i2 = -1;
                }
                if (i2 != -1) {
                    Object obj = arrayList.get(i2).a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i2);
                    size--;
                }
            }
            i3 = i4;
        }
    }

    public static boolean q() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}

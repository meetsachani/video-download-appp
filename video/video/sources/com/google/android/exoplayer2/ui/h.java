package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.ui.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import o.AbstractC6044eO0;
import o.C11034ym2;
import o.C5445bv2;
import o.C7300jW1;
import o.C7488kI0;
import o.C9214rI0;
import o.C9542sf;
import o.InterfaceC11300zs1;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class h {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    /* loaded from: classes2.dex */
    public static class b {
        public final String a;
        public final Map<String, String> b;

        public b(String str, Map<String, String> map) {
            this.a = str;
            this.b = map;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public static final Comparator<c> e = new Comparator() { // from class: o.wa2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h.c.a((h.c) obj, (h.c) obj2);
            }
        };
        public static final Comparator<c> f = new Comparator() { // from class: o.xa2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h.c.b((h.c) obj, (h.c) obj2);
            }
        };
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        public static /* synthetic */ int a(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.b, cVar.b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.c.compareTo(cVar2.c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar.d.compareTo(cVar2.d);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.a, cVar.a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.c.compareTo(cVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar2.d.compareTo(cVar.d);
        }

        public c(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public final List<c> a = new ArrayList();
        public final List<c> b = new ArrayList();
    }

    public static b a(@InterfaceC11300zs1 CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new b("", AbstractC6044eO0.u());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), AbstractC6044eO0.u());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer num : hashSet) {
            int intValue = num.intValue();
            hashMap.put(C9214rI0.a("bg_" + intValue), TD2.M("background-color:%s;", C9214rI0.b(intValue)));
        }
        SparseArray<d> c2 = c(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < c2.size()) {
            int keyAt = c2.keyAt(i);
            sb.append(b(spanned.subSequence(i2, keyAt)));
            d dVar = c2.get(keyAt);
            Collections.sort(dVar.b, c.f);
            for (c cVar : dVar.b) {
                sb.append(cVar.d);
            }
            Collections.sort(dVar.a, c.e);
            for (c cVar2 : dVar.a) {
                sb.append(cVar2.c);
            }
            i++;
            i2 = keyAt;
        }
        sb.append(b(spanned.subSequence(i2, spanned.length())));
        return new b(sb.toString(), hashMap);
    }

    public static String b(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static SparseArray<d> c(Spanned spanned, float f) {
        Object[] spans;
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e = e(obj, f);
            String d2 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e != null) {
                C9542sf.g(d2);
                c cVar = new c(spanStart, spanEnd, e, d2);
                f(sparseArray, spanStart).a.add(cVar);
                f(sparseArray, spanEnd).b.add(cVar);
            }
        }
        return sparseArray;
    }

    @InterfaceC11300zs1
    public static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C7488kI0) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof C11034ym2)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style != 1) {
                if (style != 2) {
                    if (style == 3) {
                        return "</i></b>";
                    }
                } else {
                    return "</i>";
                }
            } else {
                return "</b>";
            }
        } else if (obj instanceof C7300jW1) {
            return "<rt>" + b(((C7300jW1) obj).a) + "</rt></ruby>";
        } else if (obj instanceof UnderlineSpan) {
            return "</u>";
        }
        return null;
    }

    @InterfaceC11300zs1
    public static String e(Object obj, float f) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return TD2.M("<span style='color:%s;'>", C9214rI0.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return TD2.M("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof C7488kI0) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return TD2.M("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        } else if (obj instanceof RelativeSizeSpan) {
            return TD2.M("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family == null) {
                    return null;
                }
                return TD2.M("<span style='font-family:\"%s\";'>", family);
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style != 1) {
                    if (style != 2) {
                        if (style != 3) {
                            return null;
                        }
                        return "<b><i>";
                    }
                    return "<i>";
                }
                return "<b>";
            } else if (obj instanceof C7300jW1) {
                int i = ((C7300jW1) obj).b;
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return "<ruby style='ruby-position:under;'>";
                    }
                    return "<ruby style='ruby-position:over;'>";
                }
                return "<ruby style='ruby-position:unset;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (!(obj instanceof C11034ym2)) {
                    return null;
                }
                C11034ym2 c11034ym2 = (C11034ym2) obj;
                return TD2.M("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(c11034ym2.a, c11034ym2.b), g(c11034ym2.c));
            }
        }
    }

    public static d f(SparseArray<d> sparseArray, int i) {
        d dVar = sparseArray.get(i);
        if (dVar == null) {
            d dVar2 = new d();
            sparseArray.put(i, dVar2);
            return dVar2;
        }
        return dVar;
    }

    public static String g(int i) {
        if (i != 2) {
            return "over right";
        }
        return "under left";
    }

    public static String h(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 != 1) {
            if (i2 == 2) {
                sb.append("open ");
            }
        } else {
            sb.append("filled ");
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        sb.append("unset");
                    } else {
                        sb.append(C5445bv2.y0);
                    }
                } else {
                    sb.append(C5445bv2.x0);
                }
            } else {
                sb.append(C5445bv2.z0);
            }
        } else {
            sb.append("none");
        }
        return sb.toString();
    }
}

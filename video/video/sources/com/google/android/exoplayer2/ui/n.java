package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.exoplayer2.ui.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o.C3010Fy;
import o.C5146ah2;
import o.C5445bv2;
import o.C7284jS;
import o.C9214rI0;
import o.C9542sf;
import o.C9698tH2;
import o.InterfaceC11300zs1;
import o.KB;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class n extends FrameLayout implements SubtitleView.a {
    public static final float f1 = 1.2f;
    public static final String g1 = "default_bg";
    public final com.google.android.exoplayer2.ui.a Y0;
    public final WebView Z0;
    public List<C7284jS> a1;
    public C3010Fy b1;
    public float c1;
    public int d1;
    public float e1;

    /* loaded from: classes2.dex */
    public class a extends WebView {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(Context context) {
        this(context, null);
    }

    public static int b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    public static String c(@InterfaceC11300zs1 Layout.Alignment alignment) {
        if (alignment == null) {
            return C5445bv2.m0;
        }
        int i = b.a[alignment.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return C5445bv2.m0;
            }
            return "end";
        }
        return "start";
    }

    public static String d(C3010Fy c3010Fy) {
        int i = c3010Fy.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "unset";
                    }
                    return TD2.M("-0.05em -0.05em 0.15em %s", C9214rI0.b(c3010Fy.e));
                }
                return TD2.M("0.06em 0.08em 0.15em %s", C9214rI0.b(c3010Fy.e));
            }
            return TD2.M("0.1em 0.12em 0.15em %s", C9214rI0.b(c3010Fy.e));
        }
        return TD2.M("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C9214rI0.b(c3010Fy.e));
    }

    public static String f(int i) {
        if (i != 1) {
            if (i != 2) {
                return "horizontal-tb";
            }
            return "vertical-lr";
        }
        return "vertical-rl";
    }

    public static String h(C7284jS c7284jS) {
        String str;
        float f = c7284jS.l1;
        if (f != 0.0f) {
            int i = c7284jS.k1;
            if (i != 2 && i != 1) {
                str = "skewX";
            } else {
                str = "skewY";
            }
            return TD2.M("%s(%.2fdeg)", str, Float.valueOf(f));
        }
        return "";
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<C7284jS> list, C3010Fy c3010Fy, float f, int i, float f2) {
        this.b1 = c3010Fy;
        this.c1 = f;
        this.d1 = i;
        this.e1 = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C7284jS c7284jS = list.get(i2);
            if (c7284jS.Y0 != null) {
                arrayList.add(c7284jS);
            } else {
                arrayList2.add(c7284jS);
            }
        }
        if (!this.a1.isEmpty() || !arrayList2.isEmpty()) {
            this.a1 = arrayList2;
            i();
        }
        this.Y0.a(arrayList, c3010Fy, f, i, f2);
        invalidate();
    }

    public final String e(int i, float f) {
        float f2 = C5146ah2.f(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (f2 == -3.4028235E38f) {
            return "unset";
        }
        return TD2.M("%.2fpx", Float.valueOf(f2 / getContext().getResources().getDisplayMetrics().density));
    }

    public void g() {
        this.Z0.destroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0145, code lost:
        if (r10 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0148, code lost:
        r12 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014a, code lost:
        r21 = r12;
        r19 = o.C9698tH2.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014f, code lost:
        if (r10 != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        float f;
        float f2;
        String M;
        int i;
        boolean z;
        String str;
        float f3;
        String str2;
        int i2;
        int i3;
        String str3;
        Object obj;
        String str4;
        Layout.Alignment alignment;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        float f4 = 1.2f;
        sb.append(TD2.M("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", C9214rI0.b(this.b1.a), e(this.d1, this.c1), Float.valueOf(1.2f), d(this.b1)));
        HashMap hashMap = new HashMap();
        hashMap.put(C9214rI0.a(g1), TD2.M("background-color:%s;", C9214rI0.b(this.b1.b)));
        int i4 = 0;
        while (i4 < this.a1.size()) {
            C7284jS c7284jS = this.a1.get(i4);
            float f5 = c7284jS.c1;
            if (f5 != -3.4028235E38f) {
                f = f5 * 100.0f;
            } else {
                f = 50.0f;
            }
            int b2 = b(c7284jS.d1);
            float f6 = c7284jS.Z0;
            float f7 = f4;
            if (f6 != -3.4028235E38f) {
                if (c7284jS.a1 != 1) {
                    String M2 = TD2.M("%.2f%%", Float.valueOf(f6 * 100.0f));
                    if (c7284jS.k1 == 1) {
                        i = -b(c7284jS.b1);
                    } else {
                        i = b(c7284jS.b1);
                    }
                    f2 = -3.4028235E38f;
                    str = M2;
                    z = false;
                    f3 = c7284jS.e1;
                    if (f3 == f2) {
                        str2 = TD2.M("%.2f%%", Float.valueOf(f3 * 100.0f));
                    } else {
                        str2 = "fit-content";
                    }
                    String str5 = str2;
                    String c = c(c7284jS.Y);
                    String f8 = f(c7284jS.k1);
                    String e = e(c7284jS.i1, c7284jS.j1);
                    if (!c7284jS.g1) {
                        i2 = c7284jS.h1;
                    } else {
                        i2 = this.b1.c;
                    }
                    String b3 = C9214rI0.b(i2);
                    i3 = c7284jS.k1;
                    String str6 = C5445bv2.n0;
                    String str7 = C9698tH2.l;
                    if (i3 == 1) {
                        if (i3 != 2) {
                            if (z) {
                                str7 = "bottom";
                            }
                            str3 = str7;
                            obj = "left";
                        }
                    }
                    if (i3 == 2 && i3 != 1) {
                        str4 = "width";
                    } else {
                        str4 = "height";
                        int i5 = i;
                        i = b2;
                        b2 = i5;
                    }
                    String str8 = str4;
                    h.b a2 = h.a(c7284jS.X, getContext().getResources().getDisplayMetrics().density);
                    for (String str9 : hashMap.keySet()) {
                        String str10 = (String) hashMap.put(str9, (String) hashMap.get(str9));
                        if (str10 != null && !str10.equals(hashMap.get(str9))) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        C9542sf.i(z2);
                    }
                    sb.append(TD2.M("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i4), obj, Float.valueOf(f), str3, str, str8, str5, c, f8, e, b3, Integer.valueOf(b2), Integer.valueOf(i), h(c7284jS)));
                    sb.append(TD2.M("<span class='%s'>", g1));
                    alignment = c7284jS.Z;
                    if (alignment == null) {
                        sb.append(TD2.M("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                        sb.append(a2.a);
                        sb.append("</span>");
                    } else {
                        sb.append(a2.a);
                    }
                    sb.append("</span>");
                    sb.append("</div>");
                    i4++;
                    f4 = f7;
                } else {
                    f2 = -3.4028235E38f;
                    if (f6 >= 0.0f) {
                        M = TD2.M("%.2fem", Float.valueOf(f6 * f7));
                        z = false;
                        i = 0;
                    } else {
                        M = TD2.M("%.2fem", Float.valueOf(((-f6) - 1.0f) * f7));
                        i = 0;
                        z = true;
                    }
                }
            } else {
                f2 = -3.4028235E38f;
                M = TD2.M("%.2f%%", Float.valueOf((1.0f - this.e1) * 100.0f));
                i = -100;
                z = false;
            }
            str = M;
            f3 = c7284jS.e1;
            if (f3 == f2) {
            }
            String str52 = str2;
            String c2 = c(c7284jS.Y);
            String f82 = f(c7284jS.k1);
            String e2 = e(c7284jS.i1, c7284jS.j1);
            if (!c7284jS.g1) {
            }
            String b32 = C9214rI0.b(i2);
            i3 = c7284jS.k1;
            String str62 = C5445bv2.n0;
            String str72 = C9698tH2.l;
            if (i3 == 1) {
            }
            if (i3 == 2) {
            }
            str4 = "height";
            int i52 = i;
            i = b2;
            b2 = i52;
            String str82 = str4;
            h.b a22 = h.a(c7284jS.X, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
            }
            sb.append(TD2.M("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i4), obj, Float.valueOf(f), str3, str, str82, str52, c2, f82, e2, b32, Integer.valueOf(b2), Integer.valueOf(i), h(c7284jS)));
            sb.append(TD2.M("<span class='%s'>", g1));
            alignment = c7284jS.Z;
            if (alignment == null) {
            }
            sb.append("</span>");
            sb.append("</div>");
            i4++;
            f4 = f7;
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<html><head><style>");
        for (String str11 : hashMap.keySet()) {
            sb2.append(str11);
            sb2.append("{");
            sb2.append((String) hashMap.get(str11));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.Z0.loadData(Base64.encodeToString(sb.toString().getBytes(KB.c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.a1.isEmpty()) {
            i();
        }
    }

    public n(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a1 = Collections.EMPTY_LIST;
        this.b1 = C3010Fy.m;
        this.c1 = 0.0533f;
        this.d1 = 0;
        this.e1 = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.Y0 = aVar;
        a aVar2 = new a(context, attributeSet);
        this.Z0 = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}

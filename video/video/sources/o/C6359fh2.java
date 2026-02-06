package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.fh2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6359fh2 {
    @NotNull
    public static final C6359fh2 a = new C6359fh2();
    @NotNull
    public static final List<Class<? extends View>> b = C8222nF.O(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r5.isClickable() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        r3 = o.C9455sH2.a;
        r5 = o.C9455sH2.b(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r5.hasNext() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        r1.addAll(a(r5.next()));
     */
    @InterfaceC9511sW0
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<View> a(@NotNull View view) {
        if (SQ.e(C6359fh2.class)) {
            return null;
        }
        try {
            C6562gT0.p(view, C9698tH2.A);
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().isInstance(view)) {
                    break;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            SQ.c(th, C6359fh2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final JSONObject b(@NotNull View view, @NotNull View view2) {
        if (SQ.e(C6359fh2.class)) {
            return null;
        }
        try {
            C6562gT0.p(view, C9698tH2.A);
            C6562gT0.p(view2, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put(C9698tH2.y, true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            C9455sH2 c9455sH2 = C9455sH2.a;
            for (View view3 : C9455sH2.b(view)) {
                jSONArray.put(b(view3, view2));
            }
            jSONObject.put(C9698tH2.j, jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            SQ.c(th, C6359fh2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String d(@NotNull View view) {
        if (SQ.e(C6359fh2.class)) {
            return null;
        }
        try {
            C6562gT0.p(view, "hostView");
            C9455sH2 c9455sH2 = C9455sH2.a;
            String k = C9455sH2.k(view);
            if (k.length() > 0) {
                return k;
            }
            String join = TextUtils.join(C4500Ve2.b, a.c(view));
            C6562gT0.o(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            SQ.c(th, C6359fh2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void e(@NotNull View view, @NotNull JSONObject jSONObject) {
        if (!SQ.e(C6359fh2.class)) {
            try {
                C6562gT0.p(view, C9698tH2.A);
                C6562gT0.p(jSONObject, com.facebook.S.B);
                try {
                    C9455sH2 c9455sH2 = C9455sH2.a;
                    String k = C9455sH2.k(view);
                    String i = C9455sH2.i(view);
                    jSONObject.put(C9698tH2.c, view.getClass().getSimpleName());
                    jSONObject.put(C9698tH2.d, C9455sH2.c(view));
                    if (k.length() > 0) {
                        jSONObject.put("text", k);
                    }
                    if (i.length() > 0) {
                        jSONObject.put("hint", i);
                    }
                    if (view instanceof EditText) {
                        jSONObject.put(C9698tH2.x, ((EditText) view).getInputType());
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                SQ.c(th, C6359fh2.class);
            }
        }
    }

    public final List<String> c(View view) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            C9455sH2 c9455sH2 = C9455sH2.a;
            for (View view2 : C9455sH2.b(view)) {
                C9455sH2 c9455sH22 = C9455sH2.a;
                String k = C9455sH2.k(view2);
                if (k.length() > 0) {
                    arrayList.add(k);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }
}

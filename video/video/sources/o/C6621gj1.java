package o;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.gj1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6621gj1 {
    @NotNull
    public static final C6621gj1 a = new C6621gj1();
    public static final int b = 100;

    @InterfaceC9511sW0
    @NotNull
    public static final List<String> a(@NotNull View view) {
        if (SQ.e(C6621gj1.class)) {
            return null;
        }
        try {
            C6562gT0.p(view, C9698tH2.A);
            ArrayList arrayList = new ArrayList();
            C9455sH2 c9455sH2 = C9455sH2.a;
            ViewGroup j = C9455sH2.j(view);
            if (j != null) {
                for (View view2 : C9455sH2.b(j)) {
                    if (view != view2) {
                        arrayList.addAll(a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            SQ.c(th, C6621gj1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<String> b(@NotNull View view) {
        if (SQ.e(C6621gj1.class)) {
            return null;
        }
        try {
            C6562gT0.p(view, C9698tH2.A);
            ArrayList<String> arrayList = new ArrayList();
            C9455sH2 c9455sH2 = C9455sH2.a;
            arrayList.add(C9455sH2.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    C6562gT0.o(resourceName, "resourceName");
                    Object[] array = new C10219vQ1(RemoteSettings.i).r(resourceName, 0).toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        if (strArr.length == 2) {
                            arrayList.add(strArr[1]);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            SQ.c(th, C6621gj1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final boolean e(@NotNull List<String> list, @NotNull List<String> list2) {
        if (SQ.e(C6621gj1.class)) {
            return false;
        }
        try {
            C6562gT0.p(list, "indicators");
            C6562gT0.p(list2, "keys");
            for (String str : list) {
                if (a.d(str, list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, C6621gj1.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean f(@NotNull String str, @NotNull String str2) {
        if (SQ.e(C6621gj1.class)) {
            return false;
        }
        try {
            C6562gT0.p(str, "text");
            C6562gT0.p(str2, "rule");
            return new C10219vQ1(str2).m(str);
        } catch (Throwable th) {
            SQ.c(th, C6621gj1.class);
            return false;
        }
    }

    public final List<String> c(View view) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0) {
                    if (obj.length() < 100) {
                        String lowerCase = obj.toLowerCase();
                        C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                        arrayList.add(lowerCase);
                        return arrayList;
                    }
                } else {
                    return arrayList;
                }
            } else {
                C9455sH2 c9455sH2 = C9455sH2.a;
                for (View view2 : C9455sH2.b(view)) {
                    arrayList.addAll(c(view2));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean d(String str, List<String> list) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            for (String str2 : list) {
                if (C10763xf2.n3(str, str2, false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}

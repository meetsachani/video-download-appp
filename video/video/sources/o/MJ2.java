package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.C10408wC0;
import o.C7565kd;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class MJ2 {
    @NotNull
    public static final MJ2 a = new MJ2();

    @InterfaceC9511sW0
    @NotNull
    public static final Bundle a(@NotNull C7565kd c7565kd) {
        String obj;
        C6562gT0.p(c7565kd, "appGroupCreationContent");
        Bundle bundle = new Bundle();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.u0(bundle, "name", c7565kd.c());
        com.facebook.internal.l0.u0(bundle, "description", c7565kd.b());
        C7565kd.a a2 = c7565kd.a();
        String str = null;
        if (a2 != null && (obj = a2.toString()) != null) {
            Locale locale = Locale.ENGLISH;
            C6562gT0.o(locale, C9698tH2.B);
            str = obj.toLowerCase(locale);
            C6562gT0.o(str, "(this as java.lang.String).toLowerCase(locale)");
        }
        com.facebook.internal.l0.u0(bundle, C9642t32.t, str);
        return bundle;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Bundle b(@NotNull C10408wC0 c10408wC0) {
        String obj;
        String lowerCase;
        String obj2;
        C6562gT0.p(c10408wC0, "gameRequestContent");
        Bundle bundle = new Bundle();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.u0(bundle, "message", c10408wC0.e());
        com.facebook.internal.l0.s0(bundle, "to", c10408wC0.g());
        com.facebook.internal.l0.u0(bundle, "title", c10408wC0.k());
        com.facebook.internal.l0.u0(bundle, "data", c10408wC0.c());
        C10408wC0.a a2 = c10408wC0.a();
        String str = null;
        if (a2 == null || (obj = a2.toString()) == null) {
            lowerCase = null;
        } else {
            Locale locale = Locale.ENGLISH;
            C6562gT0.o(locale, C9698tH2.B);
            lowerCase = obj.toLowerCase(locale);
            C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        }
        com.facebook.internal.l0.u0(bundle, C9642t32.b, lowerCase);
        com.facebook.internal.l0.u0(bundle, "object_id", c10408wC0.f());
        C10408wC0.e d = c10408wC0.d();
        if (d != null && (obj2 = d.toString()) != null) {
            Locale locale2 = Locale.ENGLISH;
            C6562gT0.o(locale2, C9698tH2.B);
            str = obj2.toLowerCase(locale2);
            C6562gT0.o(str, "(this as java.lang.String).toLowerCase(locale)");
        }
        com.facebook.internal.l0.u0(bundle, "filters", str);
        com.facebook.internal.l0.s0(bundle, C9642t32.i, c10408wC0.h());
        return bundle;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Bundle c(@NotNull E32 e32) {
        C6562gT0.p(e32, "shareLinkContent");
        Bundle e = e(e32);
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.v0(e, C9642t32.j, e32.a());
        com.facebook.internal.l0.u0(e, C9642t32.l, e32.h());
        return e;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Bundle d(@NotNull M32 m32) {
        C6562gT0.p(m32, "sharePhotoContent");
        Bundle e = e(m32);
        List<L32> h = m32.h();
        if (h == null) {
            h = C8222nF.H();
        }
        List<L32> list = h;
        ArrayList arrayList = new ArrayList(C8466oF.b0(list, 10));
        for (L32 l32 : list) {
            arrayList.add(String.valueOf(l32.f()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            e.putStringArray("media", (String[]) array);
            return e;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Bundle e(@NotNull AbstractC9885u32<?, ?> abstractC9885u32) {
        String a2;
        C6562gT0.p(abstractC9885u32, "shareContent");
        Bundle bundle = new Bundle();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        A32 f = abstractC9885u32.f();
        if (f == null) {
            a2 = null;
        } else {
            a2 = f.a();
        }
        com.facebook.internal.l0.u0(bundle, C9642t32.m, a2);
        return bundle;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Bundle f(@NotNull C11103z32 c11103z32) {
        C6562gT0.p(c11103z32, "shareFeedContent");
        Bundle bundle = new Bundle();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.u0(bundle, "to", c11103z32.s());
        com.facebook.internal.l0.u0(bundle, "link", c11103z32.h());
        com.facebook.internal.l0.u0(bundle, "picture", c11103z32.q());
        com.facebook.internal.l0.u0(bundle, "source", c11103z32.o());
        com.facebook.internal.l0.u0(bundle, "name", c11103z32.n());
        com.facebook.internal.l0.u0(bundle, "caption", c11103z32.k());
        com.facebook.internal.l0.u0(bundle, "description", c11103z32.m());
        return bundle;
    }

    @InterfaceC9511sW0
    @SuppressLint({"DeprecatedMethod"})
    @NotNull
    public static final Bundle g(@NotNull E32 e32) {
        String a2;
        C6562gT0.p(e32, "shareLinkContent");
        Bundle bundle = new Bundle();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.u0(bundle, "link", com.facebook.internal.l0.Q(e32.a()));
        com.facebook.internal.l0.u0(bundle, C9642t32.l, e32.h());
        A32 f = e32.f();
        if (f == null) {
            a2 = null;
        } else {
            a2 = f.a();
        }
        com.facebook.internal.l0.u0(bundle, C9642t32.m, a2);
        return bundle;
    }
}

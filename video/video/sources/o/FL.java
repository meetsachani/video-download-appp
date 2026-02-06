package o;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class FL {
    public static final String c = "TREAT_AS_VIEW_TREE_APPEARING";
    public static final String d = "TREAT_AS_VIEW_TREE_APPEARED";
    public final Object a;
    public final View b;

    /* loaded from: classes.dex */
    public static class a {
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    public FL(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public static FL g(ContentCaptureSession contentCaptureSession, View view) {
        return new FL(contentCaptureSession, view);
    }

    public AutofillId a(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession a2 = EL.a(this.a);
            C3444Kj O = C6516gH2.O(this.b);
            Objects.requireNonNull(O);
            return b.a(a2, O.a(), j);
        }
        return null;
    }

    public C7006iI2 b(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C7006iI2.f(b.c(EL.a(this.a), autofillId, j));
        }
        return null;
    }

    public void c(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(EL.a(this.a), autofillId, charSequence);
        }
    }

    public void d(List<ViewStructure> list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            c.a(EL.a(this.a), list);
        } else if (i >= 29) {
            ViewStructure b2 = b.b(EL.a(this.a), this.b);
            a.a(b2).putBoolean(c, true);
            b.d(EL.a(this.a), b2);
            for (int i2 = 0; i2 < list.size(); i2++) {
                b.d(EL.a(this.a), list.get(i2));
            }
            ViewStructure b3 = b.b(EL.a(this.a), this.b);
            a.a(b3).putBoolean(d, true);
            b.d(EL.a(this.a), b3);
        }
    }

    public void e(long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ContentCaptureSession a2 = EL.a(this.a);
            C3444Kj O = C6516gH2.O(this.b);
            Objects.requireNonNull(O);
            b.f(a2, O.a(), jArr);
        } else if (i >= 29) {
            ViewStructure b2 = b.b(EL.a(this.a), this.b);
            a.a(b2).putBoolean(c, true);
            b.d(EL.a(this.a), b2);
            ContentCaptureSession a3 = EL.a(this.a);
            C3444Kj O2 = C6516gH2.O(this.b);
            Objects.requireNonNull(O2);
            b.f(a3, O2.a(), jArr);
            ViewStructure b3 = b.b(EL.a(this.a), this.b);
            a.a(b3).putBoolean(d, true);
            b.d(EL.a(this.a), b3);
        }
    }

    public ContentCaptureSession f() {
        return EL.a(this.a);
    }
}
